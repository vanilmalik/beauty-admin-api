package com.beautysalon.beautyadminapi.converter;

import com.beautysalon.beautyadminapi.dto.PageableDto;
import com.google.common.base.CaseFormat;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
public class PageableConverter {

    private static final String OPEN_BRACKET = "(";
    private static final String CLOSE_BRACKET = ")";
    private static final String DELIMITERS_REGEX = "( )|(%20)";

    public Pageable apply(PageableDto pageableDto) {
        if (isNull(pageableDto.getSort()) || pageableDto.getSort().isEmpty()) {
            return PageRequest.of(
                    pageableDto.getPage(),
                    pageableDto.getSize()
            );
        } else {
            return PageRequest.of(
                    pageableDto.getPage(),
                    pageableDto.getSize(),
                    getSorts(pageableDto)
            );
        }
    }

    private JpaSort getSorts(PageableDto pageableDto) {
        List<String> sorts = pageableDto.getSort();
        JpaSort jpaSort = getJpaSortUnsafe(sorts.get(0));
        for (int i = 1; i < sorts.size(); i++) {
            jpaSort = getJpaSortAndUnsafe(sorts.get(i), jpaSort);
        }
        return jpaSort;
    }

    private JpaSort getJpaSortUnsafe(String sort) {
        String[] sortPair = sort.split(DELIMITERS_REGEX);
        sortPair[0] = changeFieldFormat(sortPair[0]);
        return JpaSort.unsafe(Sort.Direction.fromString(sortPair[1]), sortPair[0]);
    }

    private JpaSort getJpaSortAndUnsafe(String sort, JpaSort jpaSort) {
        String[] sortPair = sort.split(DELIMITERS_REGEX);
        sortPair[0] = changeFieldFormat(sortPair[0]);
        return jpaSort.andUnsafe(Sort.Direction.fromString(sortPair[1]), sortPair[0]);
    }

    private String changeFieldFormat(String filedName) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, filedName);
    }

}
