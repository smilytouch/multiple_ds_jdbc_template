package com.demo.repository.rls;

import com.demo.model.rls.RlsData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RlsDataRepository {

    public List<RlsData> findAll();

    public RlsData findById(int id);

    public int deleteById(int id);

    public int save(RlsData e);

    public int update(RlsData e, int id);
    
}
