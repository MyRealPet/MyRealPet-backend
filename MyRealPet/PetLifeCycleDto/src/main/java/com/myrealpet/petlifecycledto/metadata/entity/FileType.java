package com.myrealpet.petlifecycledto.metadata.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum FileType {
    PROFILE_IMAGE("프로필 이미지",
            Arrays.asList("image/jpeg", "image/jpg", "image/png", "image/gif", "image/webp"),
            5 * 1024 * 1024L),
    REGISTRATION_PDF("등록증",
                Arrays.asList("application/pdf", "image/jpeg", "image/jpg", "image/png", "image/gif", "image/webp"),
            20 * 1024 * 1024L),
    MEDICAL_DOCUMENT("의료 문서",
            Arrays.asList("application/pdf", "image/jpeg", "image/jpg", "image/png", "image/gif", "image/webp"),
            20 * 1024 * 1024L);

    private final String description;
    private final List<String> allowedContentTypes;
    private final Long maxFileSize;
//    private final String s3Prefix;

    public String getFileTypePrefix() {
        if(this.equals(PROFILE_IMAGE)) return "pet/profiles/";
        if(this.equals(REGISTRATION_PDF)) return "pet/profiles/";
        //if(this.equals(MEDICAL_DOCUMENT))
        return "pet/medical/";
    }
}
