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

public val LineAwesomeIcons.CircleNotchSolid: ImageVector
    get() {
        if (_circleNotchSolid != null) {
            return _circleNotchSolid!!
        }
        _circleNotchSolid = Builder(name = "CircleNotchSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.1797f)
                lineTo(18.0f, 6.2031f)
                curveTo(22.5586f, 7.1328f, 26.0f, 11.1719f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5156f, 21.5156f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4844f, 26.0f, 6.0f, 21.5156f, 6.0f, 16.0f)
                curveTo(6.0f, 11.1719f, 9.4414f, 7.1328f, 14.0f, 6.2031f)
                lineTo(14.0f, 4.1797f)
                curveTo(8.3359f, 5.1367f, 4.0f, 10.0664f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 10.0664f, 23.6641f, 5.1367f, 18.0f, 4.1797f)
                close()
            }
        }
        .build()
        return _circleNotchSolid!!
    }

private var _circleNotchSolid: ImageVector? = null
