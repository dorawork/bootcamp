- collection最頂層
可以new arraylis 放collection
左手邊指針list只可以放arraylist , 不能放hashset限制給我們的東西
寬:  LIST 只可以用 LIST METHOD多D 有GET, linkedlist/ arraylist
窄 : collection 比list set 小 指針 List /queue / hashset / arraylist, 可以用method 小了???唔明,set冇得get
Queue: 排隊->第一先買, 買完離開 ,method可以做
list :只可以 add & remove 隊尾, list array ,array 先可以index?? 有可能重複
LinkedList: 
Set :pesend 資料庫上東西datebase, 冇重複 REMOVE DUPLICATED

Map.add put 
Linked list 用複雜既method, 右邊決定底層  ARRAY?LINKEDLIST?  係入面搵野  while loop 
List 使用.add + remove
*****
Thread-safe
concurrent 同時間
*****

Atomicity -> 原子性 安全 慢

stringbuilder - > 捉隻STRING不停放野入去

-「屬性」（attributes）對於一個名為「Person」的類別，它的屬性可以包括「姓名」、「年齡」、「性別」等。
object reference -> object address 空指針


     - type 轉變
    // int -> Integer (autobox)
    // integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast -> overflow)

    // Wrapper Class cannot be coverted between each others
    // Integer -> Long (No auto or direct relationship)
    // Long -> Integer (No auto or direct relationship)

    -常用詞彙
    concat 字串連接
    Object reference = 指針 地址
    
    -Exception
    -IllegalArgumentException //別人傳遞參數是負數 出現問題
    -ArithmeticException //數字運算上 數學運算 除 0 出現問題
    -ArrayIndexOutOfBoundsException // Array陣列出 出現問題
        excaption 幾時 throw try?
        原method try 再throw
        check exception 簽名 throw 出去 comp 成功
        另一個方法
               optional -> find first? 搵唔到?
        
       - 工具
       isEmty 
       queslof

       - Stream
       - .filter(e -> e % 2 == 1 && e > 100) //
       - .collect(Collectors.toList());
       - .count()

       轉換因為要使用Stream
       //arrays -> list
       - Arrays.asList(strings); //fixed size list arrays

       //list -> array
       - String[] arr = startsWitha.stream()//  stream -> 轉array
       - .toArray(s -> new String[s]);

            問題
           //1. filer salary >= 60000 and department = "IT"
           //2. map the name of th result set to a list of String

       -- .filter(e -> e.getAmount() < 1000); //條件 e的amount內是 < 1000
       -- .sorted()
       --  找String 內的詞彙是 "IT".equals  (e.getDepartment()) e 的department裡面
       -- .map(e -> e.getName()) 找MAP裡的名稱
       -- .concat (合拼)
       -- .compareToIgnoreCase 比較英文字次序
       -- .collect (Collectors.toList()); 收尾
-----------------------------------------------------------
       flattendList & Map
       改變結構 e.size
       變 1個
------------------------------------------------------------
       Factory Pattern / Builder Pattern



---------------------------------------------------------------
       Thread (不安全) 快 & 慢 1條KEY 1個人入鎖門再出, 全部人入唔洗鎖門
       ArrayList -> List 
       -- synchronized (保护共享资源) 功能鎖門
       -- try // 有JOIN先行, 最後行MAIN
       -- .join();

       USD 簡寫 更改時唔洗太多

       --------------------------

       non-relational model 

       超市購物車
       信用卡找數後結餘
       客投訴 / 資產損失 -> databases
       快 cookies /mobre
       跨sever update, 儲蓄戶口 -> 信用卡
       另一條team確認後, 再找
       ascending（升序）和descending（降序）
       driver 需要太多時間 會慢

       ----------------------------
       MySQL



