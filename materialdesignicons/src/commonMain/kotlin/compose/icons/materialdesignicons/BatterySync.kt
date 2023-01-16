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

public val MaterialDesignIcons.BatterySync: ImageVector
    get() {
        if (_batterySync != null) {
            return _batterySync!!
        }
        _batterySync = Builder(name = "BatterySync", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.54f, 22.0f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 22.0f, 6.0f, 21.4f, 6.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(6.0f, 4.6f, 6.6f, 4.0f, 7.33f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 4.0f, 18.0f, 4.6f, 18.0f, 5.33f)
                verticalLineTo(12.0f)
                curveTo(14.69f, 12.0f, 12.0f, 14.69f, 12.0f, 18.0f)
                curveTo(12.0f, 19.54f, 12.58f, 20.94f, 13.54f, 22.0f)
                moveTo(18.0f, 13.0f)
                lineTo(20.25f, 15.25f)
                lineTo(18.0f, 17.5f)
                verticalLineTo(16.0f)
                curveTo(16.15f, 16.0f, 14.94f, 17.96f, 15.76f, 19.62f)
                lineTo(14.67f, 20.71f)
                curveTo(12.91f, 18.05f, 14.81f, 14.5f, 18.0f, 14.5f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 24.0f)
                lineTo(15.75f, 21.75f)
                lineTo(18.0f, 19.5f)
                verticalLineTo(21.0f)
                curveTo(19.85f, 21.0f, 21.06f, 19.04f, 20.24f, 17.38f)
                lineTo(21.33f, 16.29f)
                curveTo(23.09f, 18.95f, 21.19f, 22.5f, 18.0f, 22.5f)
                verticalLineTo(24.0f)
            }
        }
        .build()
        return _batterySync!!
    }

private var _batterySync: ImageVector? = null
