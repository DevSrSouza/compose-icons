package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 32.0f)
                curveToRelative(41.7f, 0.0f, 75.9f, 31.8f, 79.7f, 72.5f)
                lineToRelative(85.6f, 26.3f)
                curveToRelative(25.4f, 7.8f, 42.8f, 31.3f, 42.8f, 57.9f)
                curveToRelative(0.0f, 21.8f, -11.7f, 41.9f, -30.7f, 52.7f)
                lineTo(400.8f, 323.5f)
                lineTo(493.3f, 416.0f)
                lineTo(544.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(480.0f, 480.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineTo(346.9f, 360.2f)
                curveToRelative(11.7f, -36.0f, 3.2f, -77.1f, -25.4f, -105.7f)
                curveToRelative(-40.6f, -40.6f, -106.3f, -40.6f, -146.9f, -0.1f)
                lineTo(101.0f, 324.4f)
                curveToRelative(-6.4f, 6.1f, -6.7f, 16.2f, -0.6f, 22.6f)
                reflectiveCurveToRelative(16.2f, 6.6f, 22.6f, 0.6f)
                lineToRelative(73.8f, -70.2f)
                lineToRelative(0.1f, -0.1f)
                lineToRelative(0.1f, -0.1f)
                curveToRelative(3.5f, -3.5f, 7.3f, -6.6f, 11.3f, -9.2f)
                curveToRelative(27.9f, -18.5f, 65.9f, -15.4f, 90.5f, 9.2f)
                curveToRelative(24.7f, 24.7f, 27.7f, 62.9f, 9.0f, 90.9f)
                curveToRelative(-2.6f, 3.8f, -5.6f, 7.5f, -9.0f, 10.9f)
                lineTo(261.8f, 416.0f)
                lineTo(352.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveTo(0.0f, 249.6f, 127.0f, 112.9f, 289.3f, 97.5f)
                curveTo(296.2f, 60.2f, 328.8f, 32.0f, 368.0f, 32.0f)
                close()
                moveTo(368.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null
