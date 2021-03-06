package cn.sinjinsong.skeleton.security.login;

import cn.sinjinsong.skeleton.domain.dto.user.LoginDTO;
import cn.sinjinsong.skeleton.domain.entity.user.UserDO;

/**
 * Created by SinjinSong on 2017/5/7.
 */
public interface LoginHandler {
    UserDO handle(LoginDTO loginDTO);
}
