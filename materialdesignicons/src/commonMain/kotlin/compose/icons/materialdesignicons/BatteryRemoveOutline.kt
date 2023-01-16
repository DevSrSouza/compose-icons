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

public val MaterialDesignIcons.BatteryRemoveOutline: ImageVector
    get() {
        if (_batteryRemoveOutline != null) {
            return _batteryRemoveOutline!!
        }
        _batteryRemoveOutline = Builder(name = "BatteryRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(17.3f, 12.0f, 16.63f, 12.13f, 16.0f, 12.35f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.35f)
                curveTo(12.61f, 20.75f, 13.0f, 21.42f, 13.54f, 22.0f)
                moveTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.47f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.47f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                close()
            }
        }
        .build()
        return _batteryRemoveOutline!!
    }

private var _batteryRemoveOutline: ImageVector? = null
