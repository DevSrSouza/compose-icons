package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(336.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(544.0f, 128.0f)
                lineTo(544.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(-32.0f)
                lineTo(480.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 35.76f, 23.62f, 65.69f, 56.0f, 75.93f)
                verticalLineToRelative(118.49f)
                curveToRelative(0.0f, 13.95f, -9.5f, 26.92f, -23.26f, 29.19f)
                curveTo(431.22f, 402.5f, 416.0f, 388.99f, 416.0f, 372.0f)
                verticalLineToRelative(-28.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(320.0f, 64.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                lineTo(96.0f, 0.0f)
                curveTo(60.65f, 0.0f, 32.0f, 28.65f, 32.0f, 64.0f)
                verticalLineToRelative(352.0f)
                horizontalLineToRelative(288.0f)
                lineTo(320.0f, 304.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(22.09f, 0.0f, 40.0f, 17.91f, 40.0f, 40.0f)
                verticalLineToRelative(24.61f)
                curveToRelative(0.0f, 39.67f, 28.92f, 75.16f, 68.41f, 79.01f)
                curveTo(481.71f, 452.05f, 520.0f, 416.41f, 520.0f, 372.0f)
                lineTo(520.0f, 251.93f)
                curveToRelative(32.38f, -10.24f, 56.0f, -40.17f, 56.0f, -75.93f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                close()
                moveTo(260.09f, 175.76f)
                lineToRelative(-93.7f, 139.0f)
                curveToRelative(-2.2f, 3.33f, -6.21f, 5.24f, -10.39f, 5.24f)
                curveToRelative(-7.67f, 0.0f, -13.47f, -6.28f, -11.67f, -12.92f)
                lineTo(167.35f, 224.0f)
                lineTo(108.0f, 224.0f)
                curveToRelative(-7.25f, 0.0f, -12.85f, -5.59f, -11.89f, -11.89f)
                lineToRelative(16.0f, -107.0f)
                curveTo(112.9f, 99.9f, 117.98f, 96.0f, 124.0f, 96.0f)
                horizontalLineToRelative(68.0f)
                curveToRelative(7.88f, 0.0f, 13.62f, 6.54f, 11.6f, 13.21f)
                lineTo(192.0f, 160.0f)
                horizontalLineToRelative(57.7f)
                curveToRelative(9.24f, 0.0f, 15.01f, 8.78f, 10.39f, 15.76f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
