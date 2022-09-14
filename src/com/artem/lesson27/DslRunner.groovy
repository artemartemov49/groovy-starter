package com.artem.lesson27


import static com.artem.lesson27.DslBuilder.mail

//def email = new Email()
//email.setFrom('from@gmail.com')
//email.setTo('to@gmail.com')
//email.setTitle('title')
//
//def body = new EmailBody()
//body.setTest('text')
//body.setImages(List.of('image.jpg'))
//email.setBody(body)


// builder
mail {
    from 'from@gmail.com'
    to 'to@mail.com'
    title 'title'
    body {
        text 'text of the letters'
        images(['image.jpg', 'image2.jpg'])
    }
}