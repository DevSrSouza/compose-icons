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

public val MaterialDesignIcons.BatteryHeartVariant: ImageVector
    get() {
        if (_batteryHeartVariant != null) {
            return _batteryHeartVariant!!
        }
        _batteryHeartVariant = Builder(name = "BatteryHeartVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.33f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 6.0f, 5.33f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 7.33f, 22.0f)
                horizontalLineTo(16.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 18.0f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 16.67f, 4.0f)
                moveTo(12.58f, 15.64f)
                lineTo(12.0f, 16.17f)
                lineTo(11.42f, 15.64f)
                curveTo(9.36f, 13.77f, 8.0f, 12.54f, 8.0f, 11.0f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 10.2f, 8.8f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 12.0f, 9.63f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 13.8f, 8.8f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 16.0f, 11.0f)
                curveTo(16.0f, 12.54f, 14.64f, 13.77f, 12.58f, 15.64f)
                close()
            }
        }
        .build()
        return _batteryHeartVariant!!
    }

private var _batteryHeartVariant: ImageVector? = null
