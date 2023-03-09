package JsonV2;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class occupation {
    @SerializedName("1")
    String one;
    @SerializedName("2")
    String two;
    @SerializedName("3")
    String three;
    @SerializedName("4")
    String four;
    @SerializedName("5")
    String five;
    @SerializedName("6")
    String six;
}
