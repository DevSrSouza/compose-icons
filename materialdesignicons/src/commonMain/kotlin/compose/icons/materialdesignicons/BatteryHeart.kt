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

public val MaterialDesignIcons.BatteryHeart: ImageVector
    get() {
        if (_batteryHeart != null) {
            return _batteryHeart!!
        }
        _batteryHeart = Builder(name = "BatteryHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.67f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.33f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 2.0f, 5.33f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 3.33f, 22.0f)
                horizontalLineTo(12.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 14.0f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 12.67f, 4.0f)
                moveTo(19.0f, 16.17f)
                lineTo(18.42f, 15.64f)
                curveTo(16.36f, 13.77f, 15.0f, 12.54f, 15.0f, 11.0f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 17.2f, 8.8f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 19.0f, 9.63f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 20.8f, 8.8f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 23.0f, 11.0f)
                curveTo(23.0f, 12.5f, 21.64f, 13.74f, 19.58f, 15.61f)
                close()
            }
        }
        .build()
        return _batteryHeart!!
    }

private var _batteryHeart: ImageVector? = null
