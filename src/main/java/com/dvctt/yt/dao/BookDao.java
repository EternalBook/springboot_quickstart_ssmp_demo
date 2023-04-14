package com.dvctt.yt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dvctt.yt.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author etern
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
    /**
     * fetch data by rule id
     *
     * @param id rule id
     * @return Result<XxxxDO>
     */
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);
}
