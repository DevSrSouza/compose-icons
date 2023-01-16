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

public val MaterialDesignIcons.SunThermometer: ImageVector
    get() {
        if (_sunThermometer != null) {
            return _sunThermometer!!
        }
        _sunThermometer = Builder(name = "SunThermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(7.6f, 5.4f)
                curveTo(8.4f, 5.2f, 9.2f, 5.0f, 10.0f, 5.0f)
                curveTo(10.8f, 5.0f, 11.6f, 5.2f, 12.4f, 5.4f)
                moveTo(19.0f, 5.0f)
                curveTo(17.89f, 5.0f, 17.0f, 5.89f, 17.0f, 7.0f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16.0f, 15.15f, 16.0f, 16.0f)
                curveTo(16.0f, 17.66f, 17.34f, 19.0f, 19.0f, 19.0f)
                curveTo(20.66f, 19.0f, 22.0f, 17.66f, 22.0f, 16.0f)
                curveTo(22.0f, 15.15f, 21.64f, 14.33f, 21.0f, 13.77f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.89f, 20.11f, 5.0f, 19.0f, 5.0f)
                moveTo(19.0f, 6.0f)
                curveTo(19.55f, 6.0f, 20.0f, 6.45f, 20.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 6.45f, 18.45f, 6.0f, 19.0f, 6.0f)
                moveTo(5.5f, 6.7f)
                lineTo(1.3f, 7.0f)
                lineTo(3.1f, 10.8f)
                curveTo(3.2f, 10.0f, 3.5f, 9.2f, 3.9f, 8.5f)
                curveTo(4.4f, 7.8f, 4.9f, 7.2f, 5.5f, 6.7f)
                moveTo(10.0f, 7.0f)
                curveTo(7.2f, 7.0f, 5.0f, 9.2f, 5.0f, 12.0f)
                curveTo(5.0f, 14.8f, 7.2f, 17.0f, 10.0f, 17.0f)
                curveTo(12.8f, 17.0f, 15.0f, 14.8f, 15.0f, 12.0f)
                curveTo(15.0f, 9.2f, 12.8f, 7.0f, 10.0f, 7.0f)
                moveTo(3.2f, 13.2f)
                lineTo(1.4f, 17.0f)
                lineTo(5.5f, 17.4f)
                curveTo(5.0f, 16.9f, 4.4f, 16.2f, 4.0f, 15.5f)
                curveTo(3.5f, 14.8f, 3.3f, 14.0f, 3.2f, 13.2f)
                moveTo(7.6f, 18.6f)
                lineTo(10.0f, 22.0f)
                lineTo(12.4f, 18.6f)
                curveTo(11.6f, 18.8f, 10.8f, 19.0f, 10.0f, 19.0f)
                curveTo(9.1f, 19.0f, 8.3f, 18.8f, 7.6f, 18.6f)
                close()
            }
        }
        .build()
        return _sunThermometer!!
    }

private var _sunThermometer: ImageVector? = null
