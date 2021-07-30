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

public val LineAwesomeIcons.StethoscopeSolid: ImageVector
    get() {
        if (_stethoscopeSolid != null) {
            return _stethoscopeSolid!!
        }
        _stethoscopeSolid = Builder(name = "StethoscopeSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                curveTo(6.2109f, 4.0f, 5.543f, 4.4609f, 5.2188f, 5.125f)
                curveTo(3.9531f, 5.4766f, 3.0f, 6.6289f, 3.0f, 8.0f)
                lineTo(3.0f, 17.375f)
                lineTo(3.25f, 17.6563f)
                curveTo(3.25f, 17.6563f, 5.6055f, 20.4141f, 9.0f, 20.9063f)
                lineTo(9.0f, 23.0f)
                curveTo(9.0f, 26.3008f, 11.6992f, 29.0f, 15.0f, 29.0f)
                curveTo(18.3008f, 29.0f, 21.0f, 26.3008f, 21.0f, 23.0f)
                lineTo(21.0f, 18.0f)
                curveTo(21.0f, 16.8828f, 21.8828f, 16.0f, 23.0f, 16.0f)
                curveTo(24.1172f, 16.0f, 25.0f, 16.8828f, 25.0f, 18.0f)
                lineTo(25.0f, 18.1875f)
                curveTo(23.8438f, 18.6055f, 23.0f, 19.707f, 23.0f, 21.0f)
                curveTo(23.0f, 22.6445f, 24.3555f, 24.0f, 26.0f, 24.0f)
                curveTo(27.6445f, 24.0f, 29.0f, 22.6445f, 29.0f, 21.0f)
                curveTo(29.0f, 19.707f, 28.1563f, 18.6055f, 27.0f, 18.1875f)
                lineTo(27.0f, 18.0f)
                curveTo(27.0f, 15.8008f, 25.1992f, 14.0f, 23.0f, 14.0f)
                curveTo(20.8008f, 14.0f, 19.0f, 15.8008f, 19.0f, 18.0f)
                lineTo(19.0f, 23.0f)
                curveTo(19.0f, 25.2188f, 17.2188f, 27.0f, 15.0f, 27.0f)
                curveTo(12.7813f, 27.0f, 11.0f, 25.2188f, 11.0f, 23.0f)
                lineTo(11.0f, 20.9063f)
                curveTo(14.3945f, 20.4141f, 16.75f, 17.6563f, 16.75f, 17.6563f)
                lineTo(17.0f, 17.375f)
                lineTo(17.0f, 8.0f)
                curveTo(17.0f, 6.6289f, 16.0469f, 5.4766f, 14.7813f, 5.125f)
                curveTo(14.457f, 4.4609f, 13.7891f, 4.0f, 13.0f, 4.0f)
                curveTo(11.8945f, 4.0f, 11.0f, 4.8945f, 11.0f, 6.0f)
                curveTo(11.0f, 7.1055f, 11.8945f, 8.0f, 13.0f, 8.0f)
                curveTo(13.6563f, 8.0f, 14.2305f, 7.6797f, 14.5938f, 7.1875f)
                curveTo(14.8438f, 7.3672f, 15.0f, 7.6602f, 15.0f, 8.0f)
                lineTo(15.0f, 16.5625f)
                curveTo(14.6406f, 16.9258f, 12.5117f, 19.0f, 10.0f, 19.0f)
                curveTo(7.4883f, 19.0f, 5.3594f, 16.9258f, 5.0f, 16.5625f)
                lineTo(5.0f, 8.0f)
                curveTo(5.0f, 7.6602f, 5.1563f, 7.3672f, 5.4063f, 7.1875f)
                curveTo(5.7695f, 7.6797f, 6.3438f, 8.0f, 7.0f, 8.0f)
                curveTo(8.1055f, 8.0f, 9.0f, 7.1055f, 9.0f, 6.0f)
                curveTo(9.0f, 4.8945f, 8.1055f, 4.0f, 7.0f, 4.0f)
                close()
                moveTo(26.0f, 20.0f)
                curveTo(26.5625f, 20.0f, 27.0f, 20.4375f, 27.0f, 21.0f)
                curveTo(27.0f, 21.5625f, 26.5625f, 22.0f, 26.0f, 22.0f)
                curveTo(25.4375f, 22.0f, 25.0f, 21.5625f, 25.0f, 21.0f)
                curveTo(25.0f, 20.4375f, 25.4375f, 20.0f, 26.0f, 20.0f)
                close()
            }
        }
        .build()
        return _stethoscopeSolid!!
    }

private var _stethoscopeSolid: ImageVector? = null
