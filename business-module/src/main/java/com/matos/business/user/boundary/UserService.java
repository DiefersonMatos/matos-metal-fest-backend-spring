package com.matos.business.user.boundary;

import com.matos.business.user.entry.UserEntry;
import com.matos.business.user.response.UserResponse;

public interface UserService {
    UserResponse createUser(UserEntry userEntry);
}
