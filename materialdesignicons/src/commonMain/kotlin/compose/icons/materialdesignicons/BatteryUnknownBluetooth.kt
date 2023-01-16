package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BatteryUnknownBluetooth: ImageVector
    get() {
        if (_batteryUnknownBluetooth != null) {
            return _batteryUnknownBluetooth!!
        }
        _batteryUnknownBluetooth = Builder(name = "BatteryUnknownBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 2.0f, 5.33f)
                verticalLineTo(20.66f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.33f, 22.0f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22.0f, 14.0f, 21.4f, 14.0f, 20.66f)
                verticalLineTo(5.33f)
                curveTo(14.0f, 4.59f, 13.4f, 4.0f, 12.67f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                moveTo(8.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 10.0f)
                curveTo(12.0f, 10.88f, 11.64f, 11.68f, 11.07f, 12.25f)
                lineTo(10.17f, 13.17f)
                curveTo(9.63f, 13.71f, 9.25f, 14.18f, 9.09f, 15.0f)
                horizontalLineTo(7.05f)
                curveTo(7.16f, 14.1f, 7.56f, 13.28f, 8.17f, 12.67f)
                lineTo(9.41f, 11.41f)
                curveTo(9.78f, 11.05f, 10.0f, 10.55f, 10.0f, 10.0f)
                curveTo(10.0f, 8.89f, 9.1f, 8.0f, 8.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 10.0f)
                horizontalLineTo(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 6.0f)
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.79f)
                lineTo(16.71f, 9.5f)
                lineTo(16.0f, 10.21f)
                lineTo(18.79f, 13.0f)
                lineTo(16.0f, 15.79f)
                lineTo(16.71f, 16.5f)
                lineTo(19.0f, 14.21f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 15.14f)
                lineTo(20.21f, 13.0f)
                lineTo(22.35f, 10.85f)
                lineTo(19.5f, 8.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 9.91f)
                lineTo(20.94f, 10.85f)
                lineTo(20.0f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(20.0f, 14.21f)
                lineTo(20.94f, 15.14f)
                lineTo(20.0f, 16.08f)
                verticalLineTo(14.21f)
                moveTo(7.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _batteryUnknownBluetooth!!
    }

private var _batteryUnknownBluetooth: ImageVector? = null
