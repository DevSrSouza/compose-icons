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

public val LineAwesomeIcons.CreativeCommonsNcJp: ImageVector
    get() {
        if (_creativeCommonsNcJp != null) {
            return _creativeCommonsNcJp!!
        }
        _creativeCommonsNcJp = Builder(name = "CreativeCommonsNcJp", defaultWidth = 32.0.dp,
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
                lineTo(17.5527f, 15.5957f)
                lineTo(21.0f, 11.0f)
                lineTo(18.625f, 11.0f)
                lineTo(16.0f, 14.3125f)
                lineTo(13.5313f, 11.0f)
                lineTo(11.1563f, 11.0f)
                lineTo(13.125f, 13.625f)
                lineTo(6.4082f, 10.6348f)
                curveTo(8.2939f, 7.2776f, 11.8835f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.5957f, 12.4629f)
                lineTo(13.0f, 15.7598f)
                lineTo(13.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 21.0f)
                lineTo(15.0f, 21.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 18.0f)
                lineTo(18.0332f, 18.0f)
                lineTo(25.5918f, 21.3652f)
                curveTo(23.7061f, 24.7224f, 20.1165f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 14.7615f, 5.2165f, 13.5747f, 5.5957f, 12.4629f)
                close()
            }
        }
        .build()
        return _creativeCommonsNcJp!!
    }

private var _creativeCommonsNcJp: ImageVector? = null
