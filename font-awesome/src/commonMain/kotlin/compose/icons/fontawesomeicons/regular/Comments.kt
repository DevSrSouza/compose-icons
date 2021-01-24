package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(532.0f, 386.2f)
                curveToRelative(27.5f, -27.1f, 44.0f, -61.1f, 44.0f, -98.2f)
                curveToRelative(0.0f, -80.0f, -76.5f, -146.1f, -176.2f, -157.9f)
                curveTo(368.3f, 72.5f, 294.3f, 32.0f, 208.0f, 32.0f)
                curveTo(93.1f, 32.0f, 0.0f, 103.6f, 0.0f, 192.0f)
                curveToRelative(0.0f, 37.0f, 16.5f, 71.0f, 44.0f, 98.2f)
                curveToRelative(-15.3f, 30.7f, -37.3f, 54.5f, -37.7f, 54.9f)
                curveToRelative(-6.3f, 6.7f, -8.1f, 16.5f, -4.4f, 25.0f)
                curveToRelative(3.6f, 8.5f, 12.0f, 14.0f, 21.2f, 14.0f)
                curveToRelative(53.5f, 0.0f, 96.7f, -20.2f, 125.2f, -38.8f)
                curveToRelative(9.2f, 2.1f, 18.7f, 3.7f, 28.4f, 4.9f)
                curveTo(208.1f, 407.6f, 281.8f, 448.0f, 368.0f, 448.0f)
                curveToRelative(20.8f, 0.0f, 40.8f, -2.4f, 59.8f, -6.8f)
                curveTo(456.3f, 459.7f, 499.4f, 480.0f, 553.0f, 480.0f)
                curveToRelative(9.2f, 0.0f, 17.5f, -5.5f, 21.2f, -14.0f)
                curveToRelative(3.6f, -8.5f, 1.9f, -18.3f, -4.4f, -25.0f)
                curveToRelative(-0.4f, -0.3f, -22.5f, -24.1f, -37.8f, -54.8f)
                close()
                moveTo(139.2f, 293.9f)
                lineTo(122.1f, 305.0f)
                curveToRelative(-14.1f, 9.1f, -28.5f, 16.3f, -43.1f, 21.4f)
                curveToRelative(2.7f, -4.7f, 5.4f, -9.7f, 8.0f, -14.8f)
                lineToRelative(15.5f, -31.1f)
                lineTo(77.7f, 256.0f)
                curveTo(64.2f, 242.6f, 48.0f, 220.7f, 48.0f, 192.0f)
                curveToRelative(0.0f, -60.7f, 73.3f, -112.0f, 160.0f, -112.0f)
                reflectiveCurveToRelative(160.0f, 51.3f, 160.0f, 112.0f)
                reflectiveCurveToRelative(-73.3f, 112.0f, -160.0f, 112.0f)
                curveToRelative(-16.5f, 0.0f, -33.0f, -1.9f, -49.0f, -5.6f)
                lineToRelative(-19.8f, -4.5f)
                close()
                moveTo(498.3f, 352.0f)
                lineToRelative(-24.7f, 24.4f)
                lineToRelative(15.5f, 31.1f)
                curveToRelative(2.6f, 5.1f, 5.3f, 10.1f, 8.0f, 14.8f)
                curveToRelative(-14.6f, -5.1f, -29.0f, -12.3f, -43.1f, -21.4f)
                lineToRelative(-17.1f, -11.1f)
                lineToRelative(-19.9f, 4.6f)
                curveToRelative(-16.0f, 3.7f, -32.5f, 5.6f, -49.0f, 5.6f)
                curveToRelative(-54.0f, 0.0f, -102.2f, -20.1f, -131.3f, -49.7f)
                curveTo(338.0f, 339.5f, 416.0f, 272.9f, 416.0f, 192.0f)
                curveToRelative(0.0f, -3.4f, -0.4f, -6.7f, -0.7f, -10.0f)
                curveTo(479.7f, 196.5f, 528.0f, 238.8f, 528.0f, 288.0f)
                curveToRelative(0.0f, 28.7f, -16.2f, 50.6f, -29.7f, 64.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
