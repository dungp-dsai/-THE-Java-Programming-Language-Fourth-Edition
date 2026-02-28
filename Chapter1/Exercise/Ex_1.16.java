import java.io.IOException;
import java.io.FileInputStream;

class BadDataSetException extends Exception { 
    String set_name;
    String error_detail;
    public BadDataSetException(String set_name, String error_detail) {
        super(set_name + error_detail);
        this.set_name = set_name;
        this.error_detail = error_detail;
    }
}


class MyUtilities {
public double[] getDataSet(String setName)
    throws BadDataSetException
{
    String file = setName + ".dset";
    FileInputStream in = null;
    try {
        in = new FileInputStream(file);
        return readDataSet(in);
    } catch (IOException e) {
        throw new BadDataSetException(setName, e.toString());
    } finally {
        try {
            if (in != null)
                in.close();
        } catch (IOException e) {
            ;    // ignore: we either read the data OK
                    // or we're throwing BadDataSetException
        }
    }
}

public double[] readDataSet(FileInputStream in) {
    double [] aa = {1,2,3};
    return aa;
}
}