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

public val LineAwesomeIcons.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.055f, 11.168f)
                lineTo(8.945f, 12.832f)
                lineTo(10.697f, 14.0f)
                lineTo(8.945f, 15.168f)
                lineTo(10.055f, 16.832f)
                lineTo(14.303f, 14.0f)
                lineTo(10.055f, 11.168f)
                close()
                moveTo(21.945f, 11.168f)
                lineTo(17.697f, 14.0f)
                lineTo(21.945f, 16.832f)
                lineTo(23.055f, 15.168f)
                lineTo(21.303f, 14.0f)
                lineTo(23.055f, 12.832f)
                lineTo(21.945f, 11.168f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(13.396f, 19.0f, 11.666f, 21.159f, 11.053f, 22.344f)
                curveTo(10.868f, 22.701f, 11.206f, 23.102f, 11.588f, 22.977f)
                curveTo(12.605f, 22.643f, 14.349f, 22.0f, 16.0f, 22.0f)
                curveTo(17.651f, 22.0f, 19.395f, 22.644f, 20.412f, 22.977f)
                curveTo(20.795f, 23.103f, 21.132f, 22.701f, 20.947f, 22.344f)
                curveTo(20.334f, 21.16f, 18.604f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
