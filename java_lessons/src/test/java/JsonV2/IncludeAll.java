package JsonV2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IncludeAll {
    private education education;
    private maritalStatus maritalStatus;
    private occupation occupation;
}
