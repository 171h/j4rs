package org.astonbitecode.j4rs.mpxj;

import net.sf.mpxj.reader.UniversalProjectReader;

import java.io.File;
import org.apache.commons.io.FileUtils;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.json.JsonWriter;

public class Exchange {
  public static String toJson(String inputFilename, String outputFilename) throws Exception {
    UniversalProjectReader reader = new UniversalProjectReader();
    ProjectFile project = reader.read(inputFilename);
    JsonWriter writer = new JsonWriter();
    writer.write(project, outputFilename);
    File jsonFile = new File(outputFilename);
    if (jsonFile.exists()) {
      // 文件为utf-8格式，获取文件文本内容
      String json = FileUtils.readFileToString(jsonFile, "utf-8");
      return json;
    } else {
      throw new Exception("Export failed");
    }
  }
}
