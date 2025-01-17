package org.tlh.profile.mapper;

import org.tlh.profile.entity.TbMergeTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.tlh.profile.vo.MergeTagListVo;

import java.util.List;

/**
 * <p>
 * 组合标签 Mapper 接口
 * </p>
 *
 * @author 离歌笑
 * @since 2021-03-20
 */
public interface TbMergeTagMapper extends BaseMapper<TbMergeTag> {

    MergeTagListVo queryDetailById(long id);

    List<TbMergeTag> queryMergeTagsByBasicTagId(long basicTagId);
}
