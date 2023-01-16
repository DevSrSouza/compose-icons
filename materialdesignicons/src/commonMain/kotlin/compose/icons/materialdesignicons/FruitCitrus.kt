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

public val MaterialDesignIcons.FruitCitrus: ImageVector
    get() {
        if (_fruitCitrus != null) {
            return _fruitCitrus!!
        }
        _fruitCitrus = Builder(name = "FruitCitrus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.9f)
                curveTo(6.9f, 15.7f, 5.1f, 14.9f, 4.0f, 13.6f)
                curveTo(3.2f, 13.6f, 2.4f, 13.1f, 2.1f, 12.3f)
                curveTo(1.8f, 11.5f, 2.1f, 10.7f, 2.8f, 10.2f)
                curveTo(2.9f, 7.2f, 5.6f, 4.1f, 9.7f, 2.7f)
                curveTo(13.8f, 1.3f, 18.0f, 2.1f, 20.0f, 4.4f)
                curveTo(20.8f, 4.4f, 21.6f, 4.9f, 21.9f, 5.7f)
                curveTo(22.2f, 6.5f, 21.9f, 7.3f, 21.2f, 7.8f)
                curveTo(21.2f, 8.6f, 21.0f, 9.4f, 20.6f, 10.2f)
                curveTo(19.4f, 9.5f, 18.0f, 9.0f, 16.5f, 9.0f)
                curveTo(12.6f, 9.0f, 9.3f, 12.0f, 9.0f, 15.9f)
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 19.5f, 19.5f, 22.0f, 16.5f, 22.0f)
                reflectiveCurveTo(11.0f, 19.5f, 11.0f, 16.5f)
                reflectiveCurveTo(13.5f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(22.0f, 13.5f, 22.0f, 16.5f)
                moveTo(13.3f, 18.0f)
                lineTo(15.6f, 16.5f)
                lineTo(13.3f, 15.0f)
                curveTo(13.1f, 15.5f, 13.0f, 16.0f, 13.0f, 16.5f)
                reflectiveCurveTo(13.1f, 17.5f, 13.3f, 18.0f)
                moveTo(16.0f, 17.4f)
                lineTo(13.9f, 18.8f)
                curveTo(14.4f, 19.4f, 15.2f, 19.8f, 16.0f, 20.0f)
                verticalLineTo(17.4f)
                moveTo(16.0f, 13.1f)
                curveTo(15.2f, 13.2f, 14.4f, 13.6f, 13.9f, 14.3f)
                lineTo(16.0f, 15.7f)
                verticalLineTo(13.1f)
                moveTo(17.0f, 15.6f)
                lineTo(19.1f, 14.2f)
                curveTo(18.6f, 13.6f, 17.8f, 13.2f, 17.0f, 13.0f)
                verticalLineTo(15.6f)
                moveTo(19.1f, 18.8f)
                lineTo(17.0f, 17.4f)
                verticalLineTo(19.9f)
                curveTo(17.8f, 19.8f, 18.6f, 19.4f, 19.1f, 18.8f)
                moveTo(20.0f, 16.5f)
                curveTo(20.0f, 16.0f, 19.9f, 15.5f, 19.7f, 15.0f)
                lineTo(17.4f, 16.5f)
                lineTo(19.7f, 18.0f)
                curveTo(19.9f, 17.5f, 20.0f, 17.0f, 20.0f, 16.5f)
                close()
            }
        }
        .build()
        return _fruitCitrus!!
    }

private var _fruitCitrus: ImageVector? = null
