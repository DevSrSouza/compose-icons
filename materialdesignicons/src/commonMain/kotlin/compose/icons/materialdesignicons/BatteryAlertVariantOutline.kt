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

public val MaterialDesignIcons.BatteryAlertVariantOutline: ImageVector
    get() {
        if (_batteryAlertVariantOutline != null) {
            return _batteryAlertVariantOutline!!
        }
        _batteryAlertVariantOutline = Builder(name = "BatteryAlertVariantOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(14.67f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.33f)
                curveTo(4.6f, 4.0f, 4.0f, 4.6f, 4.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(4.0f, 21.4f, 4.6f, 22.0f, 5.33f, 22.0f)
                horizontalLineTo(14.67f)
                curveTo(15.4f, 22.0f, 16.0f, 21.4f, 16.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(16.0f, 4.6f, 15.4f, 4.0f, 14.67f, 4.0f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _batteryAlertVariantOutline!!
    }

private var _batteryAlertVariantOutline: ImageVector? = null
