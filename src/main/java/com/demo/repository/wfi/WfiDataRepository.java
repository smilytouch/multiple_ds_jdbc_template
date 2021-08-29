package com.demo.repository.wfi;

import com.demo.model.wfi.WfiData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WfiDataRepository {
    
    public List<WfiData> findAll();

    public WfiData findById(int id);

    public int deleteById(int id);

    public int save(WfiData e);

    public int update(WfiData e, int id);
}
