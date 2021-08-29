package com.demo.repository.rls;

import com.demo.model.rls.RlsData;
import com.demo.util.queries.rls.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RlsDataRepositoryImpl implements RlsDataRepository{

    @Autowired
    @Qualifier("rlsJdbcTemplate")
    JdbcTemplate jdbcTemplate;

    @Override
    public List<RlsData> findAll() {
        return jdbcTemplate.query(Queries.FIND_ALL_RLS_DATA, new BeanPropertyRowMapper<RlsData>(RlsData.class));
    }

    @Override
    public RlsData findById(int id) {
        return jdbcTemplate.queryForObject(Queries.FIND_RLS_DATA_BY_ID, new BeanPropertyRowMapper<RlsData>(RlsData.class), id);
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update(Queries.DELETE_RLS_DATA_BY_ID,id);
    }

    @Override
    public int save(RlsData e) {
        return jdbcTemplate.update(Queries.SAVE_RLS_DATA, new Object[] {e.getId(), e.getName()});
    }

    @Override
    public int update(RlsData e, int id) {
        return jdbcTemplate.update(Queries.UPDATE_RLS_DATA, new Object[] {e.getName(), id});
    }
}
