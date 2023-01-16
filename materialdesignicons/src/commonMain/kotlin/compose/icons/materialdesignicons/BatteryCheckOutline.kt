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

public val MaterialDesignIcons.BatteryCheckOutline: ImageVector
    get() {
        if (_batteryCheckOutline != null) {
            return _batteryCheckOutline!!
        }
        _batteryCheckOutline = Builder(name = "BatteryCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 21.16f)
                lineTo(14.0f, 18.16f)
                lineTo(15.16f, 17.0f)
                lineTo(16.75f, 18.59f)
                lineTo(20.34f, 15.0f)
                lineTo(21.5f, 16.41f)
                lineTo(16.75f, 21.16f)
                moveTo(12.35f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.35f)
                curveTo(16.63f, 12.13f, 17.3f, 12.0f, 18.0f, 12.0f)
                verticalLineTo(5.33f)
                curveTo(18.0f, 4.6f, 17.4f, 4.0f, 16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 4.0f, 6.0f, 4.6f, 6.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6.0f, 21.4f, 6.6f, 22.0f, 7.33f, 22.0f)
                horizontalLineTo(13.54f)
                curveTo(13.0f, 21.42f, 12.61f, 20.75f, 12.35f, 20.0f)
                close()
            }
        }
        .build()
        return _batteryCheckOutline!!
    }

private var _batteryCheckOutline: ImageVector? = null
