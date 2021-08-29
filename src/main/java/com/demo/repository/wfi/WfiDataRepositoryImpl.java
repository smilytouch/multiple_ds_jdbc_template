package com.demo.repository.wfi;

import com.demo.model.wfi.WfiData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WfiDataRepositoryImpl implements WfiDataRepository{

    @Autowired
    @Qualifier("wfiJdbcTemplate")
    JdbcTemplate jdbcTemplate;
    
    @Override
    public List<WfiData> findAll() {
        return jdbcTemplate.query("SELECT * FROM wfi_data", new BeanPropertyRowMapper<WfiData>(WfiData.class));
    }

    @Override
    public WfiData findById(int id) {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public int save(WfiData e) {
        return 0;
    }

    @Override
    public int update(WfiData e, int id) {
        return 0;
    }
}
