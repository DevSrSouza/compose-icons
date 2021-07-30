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

public val LineAwesomeIcons.CreativeCommonsZero: ImageVector
    get() {
        if (_creativeCommonsZero != null) {
            return _creativeCommonsZero!!
        }
        _creativeCommonsZero = Builder(name = "CreativeCommonsZero", defaultWidth = 32.0.dp,
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
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.794f, 10.0f, 12.0f, 11.794f, 12.0f, 14.0f)
                lineTo(12.0f, 18.0f)
                curveTo(12.0f, 20.206f, 13.794f, 22.0f, 16.0f, 22.0f)
                curveTo(18.206f, 22.0f, 20.0f, 20.206f, 20.0f, 18.0f)
                lineTo(20.0f, 14.0f)
                curveTo(20.0f, 11.794f, 18.206f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(16.2565f, 12.0f, 16.4991f, 12.0543f, 16.7246f, 12.1426f)
                lineTo(14.0f, 17.875f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.897f, 14.897f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(18.0f, 14.1191f)
                lineTo(18.0f, 18.0f)
                curveTo(18.0f, 19.103f, 17.103f, 20.0f, 16.0f, 20.0f)
                curveTo(15.7422f, 20.0f, 15.4979f, 19.9466f, 15.2715f, 19.8574f)
                lineTo(18.0f, 14.1191f)
                close()
            }
        }
        .build()
        return _creativeCommonsZero!!
    }

private var _creativeCommonsZero: ImageVector? = null
