package com.huzz.edu.service.impl;

import com.huzz.edu.dao.ResumeDao;
import com.huzz.edu.pojo.Resume;
import com.huzz.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {


    @Autowired
    private ResumeDao resumeDao;

    /**
     * 查询所有
     * @return List
     */
    @Override
    public List<Resume> queryAll() {
        return resumeDao.findAll();
    }

    /**
     * 根据ID更新数据
     * @param resume
     * @return void
     */
    @Override
    public void updateOne(Resume resume) throws Exception{
        resumeDao.save(resume);
    }

    /**
     * 新增数据
     * @param resume
     * @return void
     */
    @Override
    public void insertOne(Resume resume) throws Exception{
        resumeDao.save(resume);
    }
}
