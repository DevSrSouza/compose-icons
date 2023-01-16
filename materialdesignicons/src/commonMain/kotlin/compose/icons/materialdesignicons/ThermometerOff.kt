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

public val MaterialDesignIcons.ThermometerOff: ImageVector
    get() {
        if (_thermometerOff != null) {
            return _thermometerOff!!
        }
        _thermometerOff = Builder(name = "ThermometerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.8f)
                lineTo(9.0f, 5.8f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.34f, 10.34f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(15.0f, 3.34f, 15.0f, 5.0f)
                verticalLineTo(11.8f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 4.45f, 12.55f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(11.0f, 4.45f, 11.0f, 5.0f)
                verticalLineTo(7.8f)
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(9.0f, 10.89f)
                verticalLineTo(13.0f)
                curveTo(6.79f, 14.66f, 6.34f, 17.79f, 8.0f, 20.0f)
                curveTo(9.66f, 22.21f, 12.79f, 22.66f, 15.0f, 21.0f)
                curveTo(15.84f, 20.37f, 16.4f, 19.5f, 16.71f, 18.6f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                close()
            }
        }
        .build()
        return _thermometerOff!!
    }

private var _thermometerOff: ImageVector? = null
