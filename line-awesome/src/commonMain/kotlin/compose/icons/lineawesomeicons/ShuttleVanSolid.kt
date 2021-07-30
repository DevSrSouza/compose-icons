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

public val LineAwesomeIcons.ShuttleVanSolid: ImageVector
    get() {
        if (_shuttleVanSolid != null) {
            return _shuttleVanSolid!!
        }
        _shuttleVanSolid = Builder(name = "ShuttleVanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveTo(3.3555f, 5.0f, 2.0f, 6.3555f, 2.0f, 8.0f)
                lineTo(2.0f, 25.0f)
                lineTo(5.1563f, 25.0f)
                curveTo(5.6016f, 26.7188f, 7.1484f, 28.0f, 9.0f, 28.0f)
                curveTo(10.8516f, 28.0f, 12.3984f, 26.7188f, 12.8438f, 25.0f)
                lineTo(20.1563f, 25.0f)
                curveTo(20.6016f, 26.7188f, 22.1484f, 28.0f, 24.0f, 28.0f)
                curveTo(25.8516f, 28.0f, 27.3984f, 26.7188f, 27.8438f, 25.0f)
                lineTo(31.0f, 25.0f)
                lineTo(31.0f, 14.5625f)
                curveTo(31.0f, 14.0f, 30.8281f, 13.4453f, 30.5313f, 12.9688f)
                lineTo(26.4375f, 6.4063f)
                curveTo(25.8906f, 5.5313f, 24.9375f, 5.0f, 23.9063f, 5.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                curveTo(4.0f, 7.4375f, 4.4375f, 7.0f, 5.0f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 13.0f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(20.0f, 7.0f)
                lineTo(23.9063f, 7.0f)
                curveTo(24.2539f, 7.0f, 24.5664f, 7.1758f, 24.75f, 7.4688f)
                lineTo(28.1875f, 13.0f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(29.0f, 15.0f)
                lineTo(29.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 19.0f)
                lineTo(29.0f, 19.0f)
                lineTo(29.0f, 23.0f)
                lineTo(27.8438f, 23.0f)
                curveTo(27.3984f, 21.2813f, 25.8516f, 20.0f, 24.0f, 20.0f)
                curveTo(22.1484f, 20.0f, 20.6016f, 21.2813f, 20.1563f, 23.0f)
                lineTo(12.8438f, 23.0f)
                curveTo(12.3984f, 21.2813f, 10.8516f, 20.0f, 9.0f, 20.0f)
                curveTo(7.1484f, 20.0f, 5.6016f, 21.2813f, 5.1563f, 23.0f)
                lineTo(4.0f, 23.0f)
                close()
                moveTo(9.0f, 22.0f)
                curveTo(10.1172f, 22.0f, 11.0f, 22.8828f, 11.0f, 24.0f)
                curveTo(11.0f, 25.1172f, 10.1172f, 26.0f, 9.0f, 26.0f)
                curveTo(7.8828f, 26.0f, 7.0f, 25.1172f, 7.0f, 24.0f)
                curveTo(7.0f, 22.8828f, 7.8828f, 22.0f, 9.0f, 22.0f)
                close()
                moveTo(24.0f, 22.0f)
                curveTo(25.1172f, 22.0f, 26.0f, 22.8828f, 26.0f, 24.0f)
                curveTo(26.0f, 25.1172f, 25.1172f, 26.0f, 24.0f, 26.0f)
                curveTo(22.8828f, 26.0f, 22.0f, 25.1172f, 22.0f, 24.0f)
                curveTo(22.0f, 22.8828f, 22.8828f, 22.0f, 24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shuttleVanSolid!!
    }

private var _shuttleVanSolid: ImageVector? = null
