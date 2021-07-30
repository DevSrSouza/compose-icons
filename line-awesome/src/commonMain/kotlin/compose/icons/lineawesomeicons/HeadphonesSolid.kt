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

public val LineAwesomeIcons.HeadphonesSolid: ImageVector
    get() {
        if (_headphonesSolid != null) {
            return _headphonesSolid!!
        }
        _headphonesSolid = Builder(name = "HeadphonesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(9.9375f, 5.0f, 5.0f, 9.9375f, 5.0f, 16.0f)
                lineTo(5.0f, 24.0f)
                curveTo(5.0f, 25.6445f, 6.3555f, 27.0f, 8.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 16.0f)
                curveTo(7.0f, 11.0156f, 11.0156f, 7.0f, 16.0f, 7.0f)
                curveTo(20.9844f, 7.0f, 25.0f, 11.0156f, 25.0f, 16.0f)
                lineTo(25.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                curveTo(25.6445f, 27.0f, 27.0f, 25.6445f, 27.0f, 24.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 9.9375f, 22.0625f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                curveTo(7.4336f, 25.0f, 7.0f, 24.5664f, 7.0f, 24.0f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(25.0f, 20.0f)
                lineTo(25.0f, 24.0f)
                curveTo(25.0f, 24.5664f, 24.5664f, 25.0f, 24.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                close()
            }
        }
        .build()
        return _headphonesSolid!!
    }

private var _headphonesSolid: ImageVector? = null
