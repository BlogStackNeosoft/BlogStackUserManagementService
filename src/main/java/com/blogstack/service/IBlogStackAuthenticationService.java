package com.blogstack.service;

import com.blogstack.beans.redis.BlogStackForgotPasswordBean;
import com.blogstack.beans.request.SignInRequestBean;
import com.blogstack.beans.request.SignUpRequestBean;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface IBlogStackAuthenticationService {

     ResponseEntity<?> signUp(SignUpRequestBean signUpRequestBean) throws IOException;

     ResponseEntity<?> signIn(SignInRequestBean signInRequestBean);

     ResponseEntity<?> refreshTokens(String refreshToken);

     ResponseEntity<?> forgotPasswordEmailGeneration(String blogStackUserEmail, String blogStackUserId);

     ResponseEntity<?> blogStackValidateOtp(BlogStackForgotPasswordBean blogStackForgotPasswordBean);

}
