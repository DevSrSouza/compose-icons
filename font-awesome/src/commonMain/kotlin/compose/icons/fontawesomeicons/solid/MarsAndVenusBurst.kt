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

public val SolidGroup.MarsAndVenusBurst: ImageVector
    get() {
        if (_marsAndVenusBurst != null) {
            return _marsAndVenusBurst!!
        }
        _marsAndVenusBurst = Builder(name = "MarsAndVenusBurst", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 0.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, 5.8f, -22.2f, 14.8f)
                reflectiveCurveToRelative(-1.7f, 19.3f, 5.2f, 26.2f)
                lineToRelative(39.0f, 39.0f)
                lineToRelative(-22.2f, 22.2f)
                curveTo(475.9f, 78.4f, 439.6f, 64.0f, 400.0f, 64.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, 71.6f, -160.0f, 160.0f)
                curveToRelative(0.0f, 80.2f, 59.0f, 146.6f, 136.0f, 158.2f)
                verticalLineTo(408.0f)
                horizontalLineTo(352.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(456.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(424.0f)
                verticalLineTo(382.2f)
                curveToRelative(77.0f, -11.6f, 136.0f, -78.0f, 136.0f, -158.2f)
                curveToRelative(0.0f, -31.4f, -9.0f, -60.7f, -24.7f, -85.4f)
                lineTo(560.0f, 113.9f)
                lineToRelative(39.0f, 39.0f)
                curveToRelative(6.9f, 6.9f, 17.2f, 8.9f, 26.2f, 5.2f)
                reflectiveCurveToRelative(14.8f, -12.5f, 14.8f, -22.2f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(504.0f)
                close()
                moveTo(400.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(190.9f, 18.1f)
                curveTo(188.4f, 12.0f, 182.6f, 8.0f, 176.0f, 8.0f)
                reflectiveCurveToRelative(-12.4f, 4.0f, -14.9f, 10.1f)
                lineToRelative(-29.4f, 74.0f)
                lineTo(55.6f, 68.9f)
                curveToRelative(-6.3f, -1.9f, -13.1f, 0.2f, -17.2f, 5.3f)
                reflectiveCurveToRelative(-4.6f, 12.2f, -1.4f, 17.9f)
                lineToRelative(39.5f, 69.1f)
                lineTo(10.9f, 206.4f)
                curveToRelative(-5.4f, 3.7f, -8.0f, 10.3f, -6.5f, 16.7f)
                reflectiveCurveToRelative(6.7f, 11.2f, 13.1f, 12.2f)
                lineToRelative(78.7f, 12.2f)
                lineTo(90.6f, 327.0f)
                curveToRelative(-0.5f, 6.5f, 3.1f, 12.7f, 9.0f, 15.5f)
                reflectiveCurveToRelative(12.9f, 1.8f, 17.8f, -2.6f)
                lineTo(176.0f, 286.1f)
                lineToRelative(58.6f, 53.9f)
                curveToRelative(4.1f, 3.8f, 9.9f, 5.1f, 15.2f, 3.6f)
                curveTo(223.6f, 310.8f, 208.0f, 269.2f, 208.0f, 224.0f)
                curveToRelative(0.0f, -60.8f, 28.3f, -115.0f, 72.4f, -150.2f)
                lineTo(220.3f, 92.1f)
                lineToRelative(-29.4f, -74.0f)
                close()
            }
        }
        .build()
        return _marsAndVenusBurst!!
    }

private var _marsAndVenusBurst: ImageVector? = null
