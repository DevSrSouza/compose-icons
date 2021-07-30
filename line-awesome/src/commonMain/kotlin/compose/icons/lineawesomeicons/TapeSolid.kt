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

public val LineAwesomeIcons.TapeSolid: ImageVector
    get() {
        if (_tapeSolid != null) {
            return _tapeSolid!!
        }
        _tapeSolid = Builder(name = "TapeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(5.935f, 5.0f, 1.0f, 9.935f, 1.0f, 16.0f)
                curveTo(1.0f, 22.065f, 5.935f, 27.0f, 12.0f, 27.0f)
                lineTo(31.0f, 27.0f)
                lineTo(31.0f, 25.0f)
                lineTo(18.3047f, 25.0f)
                curveTo(21.1394f, 23.0082f, 23.0f, 19.7196f, 23.0f, 16.0f)
                curveTo(23.0f, 9.935f, 18.065f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(16.962f, 7.0f, 21.0f, 11.037f, 21.0f, 16.0f)
                curveTo(21.0f, 20.963f, 16.962f, 25.0f, 12.0f, 25.0f)
                curveTo(7.038f, 25.0f, 3.0f, 20.963f, 3.0f, 16.0f)
                curveTo(3.0f, 11.037f, 7.038f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(9.794f, 12.0f, 8.0f, 13.794f, 8.0f, 16.0f)
                curveTo(8.0f, 18.206f, 9.794f, 20.0f, 12.0f, 20.0f)
                curveTo(14.206f, 20.0f, 16.0f, 18.206f, 16.0f, 16.0f)
                curveTo(16.0f, 13.794f, 14.206f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.103f, 14.0f, 14.0f, 14.897f, 14.0f, 16.0f)
                curveTo(14.0f, 17.103f, 13.103f, 18.0f, 12.0f, 18.0f)
                curveTo(10.897f, 18.0f, 10.0f, 17.103f, 10.0f, 16.0f)
                curveTo(10.0f, 14.897f, 10.897f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _tapeSolid!!
    }

private var _tapeSolid: ImageVector? = null
