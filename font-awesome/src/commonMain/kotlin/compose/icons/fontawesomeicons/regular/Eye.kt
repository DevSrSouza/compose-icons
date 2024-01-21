package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 80.0f)
                curveToRelative(-65.2f, 0.0f, -118.8f, 29.6f, -159.9f, 67.7f)
                curveTo(89.6f, 183.5f, 63.0f, 226.0f, 49.4f, 256.0f)
                curveToRelative(13.6f, 30.0f, 40.2f, 72.5f, 78.6f, 108.3f)
                curveTo(169.2f, 402.4f, 222.8f, 432.0f, 288.0f, 432.0f)
                reflectiveCurveToRelative(118.8f, -29.6f, 159.9f, -67.7f)
                curveTo(486.4f, 328.5f, 513.0f, 286.0f, 526.6f, 256.0f)
                curveToRelative(-13.6f, -30.0f, -40.2f, -72.5f, -78.6f, -108.3f)
                curveTo(406.8f, 109.6f, 353.2f, 80.0f, 288.0f, 80.0f)
                close()
                moveTo(95.4f, 112.6f)
                curveTo(142.5f, 68.8f, 207.2f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveToRelative(145.5f, 36.8f, 192.6f, 80.6f)
                curveToRelative(46.8f, 43.5f, 78.1f, 95.4f, 93.0f, 131.1f)
                curveToRelative(3.3f, 7.9f, 3.3f, 16.7f, 0.0f, 24.6f)
                curveToRelative(-14.9f, 35.7f, -46.2f, 87.7f, -93.0f, 131.1f)
                curveTo(433.5f, 443.2f, 368.8f, 480.0f, 288.0f, 480.0f)
                reflectiveCurveToRelative(-145.5f, -36.8f, -192.6f, -80.6f)
                curveTo(48.6f, 356.0f, 17.3f, 304.0f, 2.5f, 268.3f)
                curveToRelative(-3.3f, -7.9f, -3.3f, -16.7f, 0.0f, -24.6f)
                curveTo(17.3f, 208.0f, 48.6f, 156.0f, 95.4f, 112.6f)
                close()
                moveTo(288.0f, 336.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, 0.0f, -2.0f, 0.0f)
                curveToRelative(1.3f, 5.1f, 2.0f, 10.5f, 2.0f, 16.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-5.5f, 0.0f, -10.9f, -0.7f, -16.0f, -2.0f)
                curveToRelative(0.0f, 0.7f, 0.0f, 1.3f, 0.0f, 2.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                close()
                moveTo(288.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, -256.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
