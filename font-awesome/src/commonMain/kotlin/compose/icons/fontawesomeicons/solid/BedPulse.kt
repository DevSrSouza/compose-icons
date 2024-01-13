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

public val SolidGroup.BedPulse: ImageVector
    get() {
        if (_bedPulse != null) {
            return _bedPulse!!
        }
        _bedPulse = Builder(name = "BedPulse", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.2f, 9.6f)
                lineTo(524.0f, 64.0f)
                horizontalLineToRelative(92.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(512.0f, 112.0f)
                curveToRelative(-7.6f, 0.0f, -14.7f, -3.6f, -19.2f, -9.6f)
                lineTo(468.7f, 70.3f)
                lineToRelative(-47.0f, 99.9f)
                curveToRelative(-3.7f, 7.8f, -11.3f, 13.1f, -19.9f, 13.7f)
                reflectiveCurveToRelative(-16.9f, -3.4f, -21.7f, -10.6f)
                lineTo(339.2f, 112.0f)
                lineTo(216.0f, 112.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineTo(352.0f, 64.0f)
                curveToRelative(8.0f, 0.0f, 15.5f, 4.0f, 20.0f, 10.7f)
                lineToRelative(24.4f, 36.6f)
                lineToRelative(45.9f, -97.5f)
                curveTo(445.9f, 6.2f, 453.2f, 1.0f, 461.6f, 0.1f)
                reflectiveCurveToRelative(16.6f, 2.7f, 21.6f, 9.5f)
                close()
                moveTo(320.0f, 160.0f)
                horizontalLineToRelative(12.7f)
                lineToRelative(20.7f, 31.1f)
                curveToRelative(11.2f, 16.8f, 30.6f, 26.3f, 50.7f, 24.8f)
                reflectiveCurveToRelative(37.9f, -13.7f, 46.5f, -32.0f)
                lineTo(461.9f, 160.0f)
                lineTo(544.0f, 160.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineTo(640.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(576.0f, 448.0f)
                lineTo(352.0f, 448.0f)
                lineTo(320.0f, 448.0f)
                lineTo(64.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 78.3f, 14.3f, 64.0f, 32.0f, 64.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(64.0f, 352.0f)
                lineTo(288.0f, 352.0f)
                lineTo(288.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(176.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _bedPulse!!
    }

private var _bedPulse: ImageVector? = null
