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

public val MaterialDesignIcons.OrderBoolDescending: ImageVector
    get() {
        if (_orderBoolDescending != null) {
            return _orderBoolDescending!!
        }
        _orderBoolDescending = Builder(name = "OrderBoolDescending", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                curveTo(3.79f, 13.0f, 2.0f, 14.79f, 2.0f, 17.0f)
                reflectiveCurveTo(3.79f, 21.0f, 6.0f, 21.0f)
                reflectiveCurveTo(10.0f, 19.21f, 10.0f, 17.0f)
                reflectiveCurveTo(8.21f, 13.0f, 6.0f, 13.0f)
                moveTo(6.0f, 19.0f)
                curveTo(4.9f, 19.0f, 4.0f, 18.1f, 4.0f, 17.0f)
                reflectiveCurveTo(4.9f, 15.0f, 6.0f, 15.0f)
                reflectiveCurveTo(8.0f, 15.9f, 8.0f, 17.0f)
                reflectiveCurveTo(7.1f, 19.0f, 6.0f, 19.0f)
                moveTo(6.0f, 3.0f)
                curveTo(3.79f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f)
                reflectiveCurveTo(3.79f, 11.0f, 6.0f, 11.0f)
                reflectiveCurveTo(10.0f, 9.21f, 10.0f, 7.0f)
                reflectiveCurveTo(8.21f, 3.0f, 6.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _orderBoolDescending!!
    }

private var _orderBoolDescending: ImageVector? = null
