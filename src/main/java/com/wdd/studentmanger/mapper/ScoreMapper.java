package com.wdd.studentmanger.mapper;

import com.wdd.studentmanger.domain.Score;
import com.wdd.studentmanger.domain.ScoreStats;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Classname ScoreMapper
 * @Description None
 * @Date 2019/7/3 11:47
 * @Created by WDD
 */
@Mapper
public interface ScoreMapper {
    List<Score> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addScore(Score score);

    Score isScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
