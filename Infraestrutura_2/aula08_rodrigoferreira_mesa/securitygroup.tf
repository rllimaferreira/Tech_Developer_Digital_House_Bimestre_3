resource "aws_security_group" "acesso-ssh" {
    name = "acesso-ssh"
    description = "acesso ssh"
    ingress {
      description = "SSH"
      from_port = 22
      to_port = 22
      protocol = "tcp"
      cidr_blocks = ["0.0.0.0/0"]
      ipv6_cidr_blocks = ["::/0"]
    }
}