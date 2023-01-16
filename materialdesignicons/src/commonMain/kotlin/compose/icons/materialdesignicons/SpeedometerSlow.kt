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

public val MaterialDesignIcons.SpeedometerSlow: ImageVector
    get() {
        if (_speedometerSlow != null) {
            return _speedometerSlow!!
        }
        _speedometerSlow = Builder(name = "SpeedometerSlow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(13.66f, 16.0f, 15.0f, 14.66f, 15.0f, 13.0f)
                curveTo(15.0f, 11.88f, 14.39f, 10.9f, 13.5f, 10.39f)
                lineTo(3.79f, 4.77f)
                lineTo(9.32f, 14.35f)
                curveTo(9.82f, 15.33f, 10.83f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 3.0f)
                curveTo(10.19f, 3.0f, 8.5f, 3.5f, 7.03f, 4.32f)
                lineTo(9.13f, 5.53f)
                curveTo(10.0f, 5.19f, 11.0f, 5.0f, 12.0f, 5.0f)
                curveTo(16.42f, 5.0f, 20.0f, 8.58f, 20.0f, 13.0f)
                curveTo(20.0f, 15.21f, 19.11f, 17.21f, 17.66f, 18.65f)
                horizontalLineTo(17.65f)
                curveTo(17.26f, 19.04f, 17.26f, 19.67f, 17.65f, 20.06f)
                curveTo(18.04f, 20.45f, 18.68f, 20.45f, 19.07f, 20.07f)
                curveTo(20.88f, 18.26f, 22.0f, 15.76f, 22.0f, 13.0f)
                curveTo(22.0f, 7.5f, 17.5f, 3.0f, 12.0f, 3.0f)
                moveTo(2.0f, 13.0f)
                curveTo(2.0f, 15.76f, 3.12f, 18.26f, 4.93f, 20.07f)
                curveTo(5.32f, 20.45f, 5.95f, 20.45f, 6.34f, 20.06f)
                curveTo(6.73f, 19.67f, 6.73f, 19.04f, 6.34f, 18.65f)
                curveTo(4.89f, 17.2f, 4.0f, 15.21f, 4.0f, 13.0f)
                curveTo(4.0f, 12.0f, 4.19f, 11.0f, 4.54f, 10.1f)
                lineTo(3.33f, 8.0f)
                curveTo(2.5f, 9.5f, 2.0f, 11.18f, 2.0f, 13.0f)
                close()
            }
        }
        .build()
        return _speedometerSlow!!
    }

private var _speedometerSlow: ImageVector? = null
