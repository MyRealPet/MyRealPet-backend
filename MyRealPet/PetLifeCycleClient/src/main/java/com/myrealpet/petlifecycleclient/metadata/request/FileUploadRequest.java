package com.myrealpet.petlifecycleclient.metadata.request;

import com.myrealpet.petlifecycledto.metadata.entity.AccessType;
import com.myrealpet.petlifecycledto.metadata.entity.FileType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class FileUploadRequest {
    private MultipartFile file;
    private FileType fileType;
    private AccessType accessType;
    private String relatedEntityType;
    private Long relatedEntityId;

    public FileUploadRequest(MultipartFile file, FileType fileType, AccessType accessType, String relatedEntityType, Long relatedEntityId) {
        this.file = file;
        this.fileType = fileType;
        this.accessType = accessType;
        this.relatedEntityType = relatedEntityType;
        this.relatedEntityId = relatedEntityId;
    }

}
