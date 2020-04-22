package com.huzz.edu.service;

import com.huzz.edu.pojo.Resume;

import java.util.List;

public interface ResumeService {

    /**
     * 查询所有
     * @return List
     */
    List<Resume> queryAll();

    /**
     * 根据ID更新数据
     * @param resume
     * @return void
     */
    void updateOne(Resume resume) throws Exception;

    /**
     * 新增数据
     * @param resume
     * @return void
     */
    void insertOne(Resume resume) throws Exception;
}
