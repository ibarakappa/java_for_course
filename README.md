# java_for_test

postman測試輸入sample

#選課
/choose_Course

{
    "學號":1002,
    "課程代碼":[
        "En1"
    ]
}
====================================
#加退選
/pickAndDrop_Course

{
    "學號":1002,
    "加選或退選":"退選",
    "課程代碼":[
        "En1"
    ]
}
====================================
#新增課程
/add_New_Course

{
"課程內容":[{
        "courseCode":"",
        "courseName":"",
        "week":"",
        "startTime":"",
        "endTime":"",
        "credit":""
    }]
}
    
====================================
#刪除課程
/delete_Course

{
    "課程代碼":[
        "En3"
    ]
}


