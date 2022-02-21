package com.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ClientInput {

    private String input;

    private SearchCriteria criteria;

    public enum SearchCriteria {username, nickname, email, ranking}

    private boolean isMatchHistory;


}
