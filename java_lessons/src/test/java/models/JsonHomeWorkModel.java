package models;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class JsonHomeWorkModel {
    private Map<String, String> occupation;
    private Map<String, String> maritalStatus;
    private Map<String, String> education;
}
