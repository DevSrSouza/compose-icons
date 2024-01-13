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

public val SolidGroup.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) {
            return _chargingStation!!
        }
        _chargingStation = Builder(name = "ChargingStation", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(60.7f, 0.0f, 32.0f, 28.7f, 32.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                verticalLineTo(304.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                verticalLineTo(252.3f)
                curveToRelative(32.5f, -10.2f, 56.0f, -40.5f, 56.0f, -76.3f)
                verticalLineTo(144.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(544.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 35.8f, 23.5f, 66.1f, 56.0f, 76.3f)
                verticalLineTo(376.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(96.0f)
                close()
                moveTo(216.9f, 82.7f)
                curveToRelative(6.0f, 4.0f, 8.5f, 11.5f, 6.3f, 18.3f)
                lineToRelative(-25.0f, 74.9f)
                horizontalLineTo(256.0f)
                curveToRelative(6.7f, 0.0f, 12.7f, 4.2f, 15.0f, 10.4f)
                reflectiveCurveToRelative(0.5f, 13.3f, -4.6f, 17.7f)
                lineToRelative(-112.0f, 96.0f)
                curveToRelative(-5.5f, 4.7f, -13.4f, 5.1f, -19.3f, 1.1f)
                reflectiveCurveToRelative(-8.5f, -11.5f, -6.3f, -18.3f)
                lineToRelative(25.0f, -74.9f)
                horizontalLineTo(96.0f)
                curveToRelative(-6.7f, 0.0f, -12.7f, -4.2f, -15.0f, -10.4f)
                reflectiveCurveToRelative(-0.5f, -13.3f, 4.6f, -17.7f)
                lineToRelative(112.0f, -96.0f)
                curveToRelative(5.5f, -4.7f, 13.4f, -5.1f, 19.3f, -1.1f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
