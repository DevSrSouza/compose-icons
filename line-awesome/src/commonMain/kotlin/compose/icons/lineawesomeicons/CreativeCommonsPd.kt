package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CreativeCommonsPd: ImageVector
    get() {
        if (_creativeCommonsPd != null) {
            return _creativeCommonsPd!!
        }
        _creativeCommonsPd = Builder(name = "CreativeCommonsPd", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 17.2385f, 26.7835f, 18.4253f, 26.4043f, 19.5371f)
                lineTo(14.0f, 14.0156f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.897f, 14.897f, 12.0f, 16.0f, 12.0f)
                curveTo(17.103f, 12.0f, 18.0f, 12.897f, 18.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                curveTo(20.0f, 11.794f, 18.206f, 10.0f, 16.0f, 10.0f)
                curveTo(14.0812f, 10.0f, 12.4778f, 11.359f, 12.0918f, 13.1641f)
                lineTo(6.4082f, 10.6348f)
                curveTo(8.2939f, 7.2776f, 11.8835f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.5957f, 12.4629f)
                lineTo(12.0f, 15.3145f)
                lineTo(12.0f, 18.0f)
                curveTo(12.0f, 20.206f, 13.794f, 22.0f, 16.0f, 22.0f)
                curveTo(17.9188f, 22.0f, 19.5222f, 20.641f, 19.9082f, 18.8359f)
                lineTo(25.5918f, 21.3652f)
                curveTo(23.7061f, 24.7224f, 20.1165f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 14.7615f, 5.2165f, 13.5747f, 5.5957f, 12.4629f)
                close()
                moveTo(14.0f, 16.2051f)
                lineTo(18.0332f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveTo(18.0f, 19.103f, 17.103f, 20.0f, 16.0f, 20.0f)
                curveTo(14.897f, 20.0f, 14.0f, 19.103f, 14.0f, 18.0f)
                lineTo(14.0f, 16.2051f)
                close()
            }
        }
        .build()
        return _creativeCommonsPd!!
    }

private var _creativeCommonsPd: ImageVector? = null
