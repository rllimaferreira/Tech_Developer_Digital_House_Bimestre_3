resource "aws_instance" "**********" {
    count = 2
    ami = "ami-**********"
    instance_type = "t2.micro"
    tags = {
        Name = "**********${count.index}"
    }
    key_name = "**********"
    vpc_security_group_ids = ["${aws_security_group.acesso-ssh.id}", "${aws_security_group.acesso-web.id}"]
}