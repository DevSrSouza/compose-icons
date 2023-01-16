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

public val MaterialDesignIcons.BatteryLockOpen: ImageVector
    get() {
        if (_batteryLockOpen != null) {
            return _batteryLockOpen!!
        }
        _batteryLockOpen = Builder(name = "BatteryLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 16.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.5f)
                curveTo(15.5f, 12.7f, 16.2f, 12.2f, 17.0f, 12.2f)
                reflectiveCurveTo(18.5f, 12.7f, 18.5f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.8f)
                verticalLineTo(13.5f)
                curveTo(19.8f, 12.1f, 18.4f, 11.0f, 17.0f, 11.0f)
                reflectiveCurveTo(14.2f, 12.1f, 14.2f, 13.5f)
                verticalLineTo(16.0f)
                curveTo(13.6f, 16.0f, 13.0f, 16.6f, 13.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(13.0f, 21.4f, 13.6f, 22.0f, 14.2f, 22.0f)
                horizontalLineTo(19.7f)
                curveTo(20.4f, 22.0f, 21.0f, 21.4f, 21.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(21.0f, 16.6f, 20.4f, 16.0f, 19.8f, 16.0f)
                moveTo(11.27f, 22.0f)
                horizontalLineTo(5.33f)
                curveTo(4.6f, 22.0f, 4.0f, 21.4f, 4.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(4.0f, 4.6f, 4.6f, 4.0f, 5.33f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.67f)
                curveTo(15.4f, 4.0f, 16.0f, 4.6f, 16.0f, 5.33f)
                verticalLineTo(9.11f)
                curveTo(13.86f, 9.55f, 12.2f, 11.38f, 12.2f, 13.5f)
                verticalLineTo(14.74f)
                curveTo(11.5f, 15.34f, 11.0f, 16.24f, 11.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(11.0f, 20.93f, 11.03f, 21.15f, 11.07f, 21.37f)
                lineTo(11.08f, 21.39f)
                curveTo(11.12f, 21.6f, 11.19f, 21.8f, 11.27f, 22.0f)
                close()
            }
        }
        .build()
        return _batteryLockOpen!!
    }

private var _batteryLockOpen: ImageVector? = null
