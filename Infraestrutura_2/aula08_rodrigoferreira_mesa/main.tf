provider "aws" {
    region = "us-west-1"
}

# resource "aws_instance" "rllimaferreira-dev" {
#     count = 2
#     ami = "ami-052efd3df9dad4825"
#     instance_type = "t2.micro"
#     tags = {
#         Name = "rllimaferreira${count.index}"
#     }
#     key_name = "rodrigo-terraform-aws"
#     vpc_security_group_ids = ["${aws_security_group.acesso-ssh.id}", "${aws_security_group.acesso-web.id}"]
# }

# resource "aws_security_group" "acesso-ssh" {
#     name = "acesso-ssh"
#     description = "acesso ssh"
#     ingress {
#       description = "SSH"
#       from_port = 22
#       to_port = 22
#       protocol = "tcp"
#       cidr_blocks = ["0.0.0.0/0"]
#       ipv6_cidr_blocks = ["::/0"]
#     }
  
# }

# resource "aws_security_group" "acesso-web" {
#   name = "acesso-web"
#   description = "acesso web"
#   ingress {
#     description      = "HTTP"
#     from_port        = 80
#     to_port          = 80
#     protocol         = "tcp"
#     cidr_blocks      = ["0.0.0.0/0"]
#     ipv6_cidr_blocks = ["::/0"]
#   }
#   tags = {
#     "Name" = "web"
#   }
# }

#   resource "aws_key_pair" "chave-SSH" {
#   key_name = "rodrigo-terraform-aws"
#   public_key = file("terraform-aws.pub")
# }




