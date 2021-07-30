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

public val LineAwesomeIcons.CrownSolid: ImageVector
    get() {
        if (_crownSolid != null) {
            return _crownSolid!!
        }
        _crownSolid = Builder(name = "CrownSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.3555f, 3.0f, 13.0f, 4.3555f, 13.0f, 6.0f)
                curveTo(13.0f, 7.125f, 13.6328f, 8.1133f, 14.5625f, 8.625f)
                lineTo(11.625f, 14.5f)
                lineTo(7.0313f, 11.2188f)
                curveTo(7.6328f, 10.668f, 8.0f, 9.8711f, 8.0f, 9.0f)
                curveTo(8.0f, 7.3555f, 6.6445f, 6.0f, 5.0f, 6.0f)
                curveTo(3.3555f, 6.0f, 2.0f, 7.3555f, 2.0f, 9.0f)
                curveTo(2.0f, 10.3477f, 2.9258f, 11.4688f, 4.1563f, 11.8438f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 22.0f)
                lineTo(27.8438f, 11.8438f)
                curveTo(29.0742f, 11.4688f, 30.0f, 10.3477f, 30.0f, 9.0f)
                curveTo(30.0f, 7.3555f, 28.6445f, 6.0f, 27.0f, 6.0f)
                curveTo(25.3555f, 6.0f, 24.0f, 7.3555f, 24.0f, 9.0f)
                curveTo(24.0f, 9.8711f, 24.3672f, 10.668f, 24.9688f, 11.2188f)
                lineTo(20.375f, 14.5f)
                lineTo(17.4375f, 8.625f)
                curveTo(18.3672f, 8.1133f, 19.0f, 7.125f, 19.0f, 6.0f)
                curveTo(19.0f, 4.3555f, 17.6445f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.5625f, 5.0f, 17.0f, 5.4375f, 17.0f, 6.0f)
                curveTo(17.0f, 6.5625f, 16.5625f, 7.0f, 16.0f, 7.0f)
                curveTo(15.4375f, 7.0f, 15.0f, 6.5625f, 15.0f, 6.0f)
                curveTo(15.0f, 5.4375f, 15.4375f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveTo(5.5625f, 8.0f, 6.0f, 8.4375f, 6.0f, 9.0f)
                curveTo(6.0f, 9.5625f, 5.5625f, 10.0f, 5.0f, 10.0f)
                curveTo(4.4375f, 10.0f, 4.0f, 9.5625f, 4.0f, 9.0f)
                curveTo(4.0f, 8.4375f, 4.4375f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(27.0f, 8.0f)
                curveTo(27.5625f, 8.0f, 28.0f, 8.4375f, 28.0f, 9.0f)
                curveTo(28.0f, 9.5625f, 27.5625f, 10.0f, 27.0f, 10.0f)
                curveTo(26.4375f, 10.0f, 26.0f, 9.5625f, 26.0f, 9.0f)
                curveTo(26.0f, 8.4375f, 26.4375f, 8.0f, 27.0f, 8.0f)
                close()
                moveTo(16.0f, 10.25f)
                lineTo(19.0938f, 16.4375f)
                lineTo(20.5938f, 16.8125f)
                lineTo(25.5938f, 13.25f)
                lineTo(24.1875f, 21.0f)
                lineTo(7.8125f, 21.0f)
                lineTo(6.4063f, 13.25f)
                lineTo(11.4063f, 16.8125f)
                lineTo(12.9063f, 16.4375f)
                close()
                moveTo(8.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                close()
            }
        }
        .build()
        return _crownSolid!!
    }

private var _crownSolid: ImageVector? = null
