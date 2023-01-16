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

public val MaterialDesignIcons.BatteryHeartOutline: ImageVector
    get() {
        if (_batteryHeartOutline != null) {
            return _batteryHeartOutline!!
        }
        _batteryHeartOutline = Builder(name = "BatteryHeartOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.2f)
                lineTo(18.4f, 15.7f)
                curveTo(16.4f, 13.8f, 15.0f, 12.5f, 15.0f, 11.0f)
                curveTo(15.0f, 9.8f, 16.0f, 8.8f, 17.2f, 8.8f)
                curveTo(17.9f, 8.8f, 18.5f, 9.1f, 19.0f, 9.6f)
                curveTo(19.5f, 9.1f, 20.1f, 8.8f, 20.8f, 8.8f)
                curveTo(22.0f, 8.8f, 23.0f, 9.8f, 23.0f, 11.0f)
                curveTo(23.0f, 12.5f, 21.6f, 13.7f, 19.6f, 15.6f)
                lineTo(19.0f, 16.2f)
                moveTo(12.7f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.3f)
                curveTo(2.6f, 4.0f, 2.0f, 4.6f, 2.0f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.3f, 22.0f)
                horizontalLineTo(12.6f)
                curveTo(13.3f, 22.0f, 13.9f, 21.4f, 13.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(14.0f, 4.6f, 13.4f, 4.0f, 12.7f, 4.0f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _batteryHeartOutline!!
    }

private var _batteryHeartOutline: ImageVector? = null
