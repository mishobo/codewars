package com.husseinabdallah.codewars;

public record ApiResult<T>(T data, String msg, boolean success) {}
