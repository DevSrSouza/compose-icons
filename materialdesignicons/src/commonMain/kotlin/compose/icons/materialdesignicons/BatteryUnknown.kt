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

public val MaterialDesignIcons.BatteryUnknown: ImageVector
    get() {
        if (_batteryUnknown != null) {
            return _batteryUnknown!!
        }
        _batteryUnknown = Builder(name = "BatteryUnknown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.07f, 12.25f)
                lineTo(14.17f, 13.17f)
                curveTo(13.63f, 13.71f, 13.25f, 14.18f, 13.09f, 15.0f)
                horizontalLineTo(11.05f)
                curveTo(11.16f, 14.1f, 11.56f, 13.28f, 12.17f, 12.67f)
                lineTo(13.41f, 11.41f)
                curveTo(13.78f, 11.05f, 14.0f, 10.55f, 14.0f, 10.0f)
                curveTo(14.0f, 8.89f, 13.1f, 8.0f, 12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 10.0f)
                horizontalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 10.0f)
                curveTo(16.0f, 10.88f, 15.64f, 11.68f, 15.07f, 12.25f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 6.0f, 5.33f)
                verticalLineTo(20.66f)
                curveTo(6.0f, 21.4f, 6.6f, 22.0f, 7.33f, 22.0f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 22.0f, 18.0f, 21.4f, 18.0f, 20.66f)
                verticalLineTo(5.33f)
                curveTo(18.0f, 4.59f, 17.4f, 4.0f, 16.67f, 4.0f)
                close()
            }
        }
        .build()
        return _batteryUnknown!!
    }

private var _batteryUnknown: ImageVector? = null
