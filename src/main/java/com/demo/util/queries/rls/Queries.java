package com.demo.util.queries.rls;

public class Queries {

    public static final String FIND_ALL_RLS_DATA = "SELECT * FROM rls_data";
    public static final String FIND_RLS_DATA_BY_ID = "SELECT * FROM rls_data WHERE id=?";
    public static final String DELETE_RLS_DATA_BY_ID = "DELETE FROM rls_data WHERE id=?";
    public static final String SAVE_RLS_DATA ="INSERT INTO rls_data (id, name) VALUES (?, ?)";
    public static final String UPDATE_RLS_DATA ="UPDATE rls_data SET name = ? WHERE id = ?";
}
