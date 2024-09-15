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

public val LineAwesomeIcons.MobileSolid: ImageVector
    get() {
        if (_mobileSolid != null) {
            return _mobileSolid!!
        }
        _mobileSolid = Builder(name = "MobileSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                curveTo(9.355f, 4.0f, 8.0f, 5.355f, 8.0f, 7.0f)
                lineTo(8.0f, 25.0f)
                curveTo(8.0f, 26.645f, 9.355f, 28.0f, 11.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                curveTo(22.645f, 28.0f, 24.0f, 26.645f, 24.0f, 25.0f)
                lineTo(24.0f, 7.0f)
                curveTo(24.0f, 5.355f, 22.645f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.555f, 6.0f, 22.0f, 6.445f, 22.0f, 7.0f)
                lineTo(22.0f, 25.0f)
                curveTo(22.0f, 25.555f, 21.555f, 26.0f, 21.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                curveTo(10.445f, 26.0f, 10.0f, 25.555f, 10.0f, 25.0f)
                lineTo(10.0f, 7.0f)
                curveTo(10.0f, 6.445f, 10.445f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(16.0f, 23.0f)
                curveTo(15.449f, 23.0f, 15.0f, 23.449f, 15.0f, 24.0f)
                curveTo(15.0f, 24.551f, 15.449f, 25.0f, 16.0f, 25.0f)
                curveTo(16.551f, 25.0f, 17.0f, 24.551f, 17.0f, 24.0f)
                curveTo(17.0f, 23.449f, 16.551f, 23.0f, 16.0f, 23.0f)
                close()
            }
        }
        .build()
        return _mobileSolid!!
    }

private var _mobileSolid: ImageVector? = null
