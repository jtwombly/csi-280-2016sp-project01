package com.kevinthorley.csi280.project01;

import java.util.List;

import sun.swing.SwingUtilities2.Section;

import java.util.ArrayList;

public class ClassRepo {

  private List<Section> sections;

  public ClassRepo() {
    this.sections = new ArrayList<Section>();

    this.sections.add(new Section("csi-280-51", "Open Source Software Development", "2016SP"));
    this.sections.add(new Section("csi-280-52", "Open Source Software Development", "2016SP"));
  }

  public Section findById(String id) {
    for (int i = 0; i < sections.size(); i++)
    {
    	if (sections[i].getId() == id)
    	{
    		return sections[i];
    	}
    }
    return null;
  }

  public void addSection(Section section) {
    sections.add(section);
  }
}
