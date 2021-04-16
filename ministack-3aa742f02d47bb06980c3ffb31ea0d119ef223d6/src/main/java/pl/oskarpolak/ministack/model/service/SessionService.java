package pl.oskarpolak.ministack.model.service;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service

//@Scope(scopeName = "sesion",proxyMode = ScopedProxyMode.TARGET_CLASS )
@Data
public class SessionService {
    private int userId;
    private String nickname;
    private boolean isLogin;
}
