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

public val LineAwesomeIcons.TruckPickupSolid: ImageVector
    get() {
        if (_truckPickupSolid != null) {
            return _truckPickupSolid!!
        }
        _truckPickupSolid = Builder(name = "TruckPickupSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7188f, 6.0f)
                curveTo(9.8633f, 6.0f, 9.082f, 6.5586f, 8.8125f, 7.375f)
                lineTo(7.2813f, 12.0f)
                lineTo(0.0f, 12.0f)
                lineTo(0.0f, 20.2188f)
                curveTo(0.0f, 21.1328f, 0.6133f, 21.9336f, 1.5f, 22.1563f)
                lineTo(4.0938f, 22.8125f)
                curveTo(4.4688f, 24.6289f, 6.0781f, 26.0f, 8.0f, 26.0f)
                curveTo(9.8516f, 26.0f, 11.3984f, 24.7188f, 11.8438f, 23.0f)
                lineTo(21.1563f, 23.0f)
                curveTo(21.6016f, 24.7188f, 23.1484f, 26.0f, 25.0f, 26.0f)
                curveTo(26.8516f, 26.0f, 28.3984f, 24.7188f, 28.8438f, 23.0f)
                lineTo(30.0f, 23.0f)
                curveTo(31.0938f, 23.0f, 32.0f, 22.0938f, 32.0f, 21.0f)
                lineTo(32.0f, 17.25f)
                curveTo(32.0f, 15.4688f, 30.8086f, 13.8945f, 29.0938f, 13.4063f)
                lineTo(24.5625f, 12.125f)
                lineTo(20.6563f, 7.4375f)
                curveTo(19.8945f, 6.5273f, 18.7813f, 6.0f, 17.5938f, 6.0f)
                close()
                moveTo(10.7188f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 12.0f)
                lineTo(9.375f, 12.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(17.5938f, 8.0f)
                curveTo(18.1875f, 8.0f, 18.7461f, 8.2617f, 19.125f, 8.7188f)
                lineTo(21.875f, 12.0f)
                lineTo(16.0f, 12.0f)
                close()
                moveTo(2.0f, 14.0f)
                lineTo(23.8438f, 14.0f)
                lineTo(28.5625f, 15.3438f)
                curveTo(29.4258f, 15.5898f, 30.0f, 16.3516f, 30.0f, 17.25f)
                lineTo(30.0f, 21.0f)
                lineTo(28.8438f, 21.0f)
                curveTo(28.3984f, 19.2813f, 26.8516f, 18.0f, 25.0f, 18.0f)
                curveTo(23.1484f, 18.0f, 21.6016f, 19.2813f, 21.1563f, 21.0f)
                lineTo(11.8438f, 21.0f)
                curveTo(11.3984f, 19.2813f, 9.8516f, 18.0f, 8.0f, 18.0f)
                curveTo(6.2266f, 18.0f, 4.7383f, 19.1719f, 4.2188f, 20.7813f)
                lineTo(2.0f, 20.2188f)
                close()
                moveTo(8.0f, 20.0f)
                curveTo(9.1172f, 20.0f, 10.0f, 20.8828f, 10.0f, 22.0f)
                curveTo(10.0f, 23.1172f, 9.1172f, 24.0f, 8.0f, 24.0f)
                curveTo(6.8828f, 24.0f, 6.0f, 23.1172f, 6.0f, 22.0f)
                curveTo(6.0f, 20.8828f, 6.8828f, 20.0f, 8.0f, 20.0f)
                close()
                moveTo(25.0f, 20.0f)
                curveTo(26.1172f, 20.0f, 27.0f, 20.8828f, 27.0f, 22.0f)
                curveTo(27.0f, 23.1172f, 26.1172f, 24.0f, 25.0f, 24.0f)
                curveTo(23.8828f, 24.0f, 23.0f, 23.1172f, 23.0f, 22.0f)
                curveTo(23.0f, 20.8828f, 23.8828f, 20.0f, 25.0f, 20.0f)
                close()
            }
        }
        .build()
        return _truckPickupSolid!!
    }

private var _truckPickupSolid: ImageVector? = null
