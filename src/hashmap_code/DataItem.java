package hashmap_code;

 
//hash.java
//demonstrates hash table with linear probing
//to run this program: C:>java HashTableApp

////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
private int iData;               // data item (key)
//--------------------------------------------------------------
public DataItem(int ii)          // constructor
 { iData = ii; }
//--------------------------------------------------------------
public int getKey()
 { return iData; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////