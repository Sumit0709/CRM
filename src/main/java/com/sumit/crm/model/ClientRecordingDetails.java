package com.sumit.crm.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(
        name = "client_recording_details"
)
public class ClientRecordingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @MapsId
    private Client client;

    @Column(name = "call_recordings_bucket_url")
    private String callRecordingsBucketURL;

    @Column(name = "screenshots_bucket_url")
    private String screenshotsBucketURL;

    @Column(name = "other_media_bucket_url")
    private String otherMediaBucketURL;

}
