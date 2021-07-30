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

public val LineAwesomeIcons.BrailleSolid: ImageVector
    get() {
        if (_brailleSolid != null) {
            return _brailleSolid!!
        }
        _brailleSolid = Builder(name = "BrailleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(10.8945f, 6.0f, 10.0f, 6.8945f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1055f, 10.8945f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1055f, 10.0f, 14.0f, 9.1055f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8945f, 13.1055f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(18.8945f, 6.0f, 18.0f, 6.8945f, 18.0f, 8.0f)
                curveTo(18.0f, 9.1055f, 18.8945f, 10.0f, 20.0f, 10.0f)
                curveTo(21.1055f, 10.0f, 22.0f, 9.1055f, 22.0f, 8.0f)
                curveTo(22.0f, 6.8945f, 21.1055f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.8945f, 14.0f, 10.0f, 14.8945f, 10.0f, 16.0f)
                curveTo(10.0f, 17.1055f, 10.8945f, 18.0f, 12.0f, 18.0f)
                curveTo(13.1055f, 18.0f, 14.0f, 17.1055f, 14.0f, 16.0f)
                curveTo(14.0f, 14.8945f, 13.1055f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveTo(18.8945f, 14.0f, 18.0f, 14.8945f, 18.0f, 16.0f)
                curveTo(18.0f, 17.1055f, 18.8945f, 18.0f, 20.0f, 18.0f)
                curveTo(21.1055f, 18.0f, 22.0f, 17.1055f, 22.0f, 16.0f)
                curveTo(22.0f, 14.8945f, 21.1055f, 14.0f, 20.0f, 14.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(10.8945f, 22.0f, 10.0f, 22.8945f, 10.0f, 24.0f)
                curveTo(10.0f, 25.1055f, 10.8945f, 26.0f, 12.0f, 26.0f)
                curveTo(13.1055f, 26.0f, 14.0f, 25.1055f, 14.0f, 24.0f)
                curveTo(14.0f, 22.8945f, 13.1055f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(20.0f, 22.0f)
                curveTo(18.8945f, 22.0f, 18.0f, 22.8945f, 18.0f, 24.0f)
                curveTo(18.0f, 25.1055f, 18.8945f, 26.0f, 20.0f, 26.0f)
                curveTo(21.1055f, 26.0f, 22.0f, 25.1055f, 22.0f, 24.0f)
                curveTo(22.0f, 22.8945f, 21.1055f, 22.0f, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _brailleSolid!!
    }

private var _brailleSolid: ImageVector? = null
