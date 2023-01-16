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

public val MaterialDesignIcons.FruitCherries: ImageVector
    get() {
        if (_fruitCherries != null) {
            return _fruitCherries!!
        }
        _fruitCherries = Builder(name = "FruitCherries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                horizontalLineTo(15.5f)
                curveTo(14.8f, 11.7f, 14.3f, 10.0f, 13.8f, 8.3f)
                lineTo(14.7f, 9.2f)
                curveTo(17.4f, 11.3f, 19.8f, 10.9f, 19.8f, 10.9f)
                reflectiveCurveTo(20.5f, 7.1f, 17.8f, 5.1f)
                curveTo(15.5f, 3.3f, 13.4f, 3.3f, 12.8f, 3.4f)
                curveTo(12.7f, 2.8f, 12.7f, 2.3f, 12.6f, 1.9f)
                lineTo(11.2f, 2.0f)
                curveTo(11.2f, 5.2f, 8.5f, 11.1f, 7.6f, 13.0f)
                curveTo(5.6f, 13.2f, 4.0f, 14.9f, 4.0f, 17.0f)
                curveTo(4.0f, 19.2f, 5.8f, 21.0f, 8.0f, 21.0f)
                curveTo(9.1f, 21.0f, 10.0f, 20.6f, 10.7f, 19.9f)
                curveTo(10.3f, 19.0f, 10.0f, 18.0f, 10.0f, 17.0f)
                reflectiveCurveTo(10.3f, 15.0f, 10.7f, 14.1f)
                curveTo(10.3f, 13.7f, 9.7f, 13.4f, 9.2f, 13.2f)
                curveTo(9.9f, 11.7f, 11.1f, 9.0f, 11.9f, 6.4f)
                curveTo(12.3f, 8.7f, 13.1f, 11.4f, 14.1f, 13.5f)
                curveTo(12.9f, 14.2f, 12.0f, 15.5f, 12.0f, 17.0f)
                curveTo(12.0f, 19.2f, 13.8f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(20.0f, 19.2f, 20.0f, 17.0f)
                reflectiveCurveTo(18.2f, 13.0f, 16.0f, 13.0f)
                moveTo(8.0f, 15.5f)
                curveTo(7.2f, 15.5f, 6.5f, 16.2f, 6.5f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 15.6f, 6.6f, 14.5f, 8.0f, 14.5f)
                verticalLineTo(15.5f)
                moveTo(16.0f, 15.5f)
                curveTo(15.2f, 15.5f, 14.5f, 16.2f, 14.5f, 17.0f)
                horizontalLineTo(13.5f)
                curveTo(13.5f, 15.6f, 14.6f, 14.5f, 16.0f, 14.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _fruitCherries!!
    }

private var _fruitCherries: ImageVector? = null
