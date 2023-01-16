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

public val MaterialDesignIcons.CartCheck: ImageVector
    get() {
        if (_cartCheck != null) {
            return _cartCheck!!
        }
        _cartCheck = Builder(name = "CartCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                curveTo(9.0f, 21.1f, 8.1f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveTo(5.0f, 21.1f, 5.0f, 20.0f)
                reflectiveCurveTo(5.9f, 18.0f, 7.0f, 18.0f)
                reflectiveCurveTo(9.0f, 18.9f, 9.0f, 20.0f)
                moveTo(17.0f, 18.0f)
                curveTo(15.9f, 18.0f, 15.0f, 18.9f, 15.0f, 20.0f)
                reflectiveCurveTo(15.9f, 22.0f, 17.0f, 22.0f)
                reflectiveCurveTo(19.0f, 21.1f, 19.0f, 20.0f)
                reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f)
                moveTo(7.2f, 14.8f)
                verticalLineTo(14.7f)
                lineTo(8.1f, 13.0f)
                horizontalLineTo(15.5f)
                curveTo(16.2f, 13.0f, 16.9f, 12.6f, 17.2f, 12.0f)
                lineTo(21.1f, 5.0f)
                lineTo(19.4f, 4.0f)
                lineTo(15.5f, 11.0f)
                horizontalLineTo(8.5f)
                lineTo(4.3f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                lineTo(6.6f, 11.6f)
                lineTo(5.2f, 14.0f)
                curveTo(5.1f, 14.3f, 5.0f, 14.6f, 5.0f, 15.0f)
                curveTo(5.0f, 16.1f, 5.9f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.4f)
                curveTo(7.3f, 15.0f, 7.2f, 14.9f, 7.2f, 14.8f)
                moveTo(18.0f, 2.8f)
                lineTo(16.6f, 1.4f)
                lineTo(11.8f, 6.2f)
                lineTo(9.2f, 3.6f)
                lineTo(7.8f, 5.0f)
                lineTo(11.8f, 9.0f)
                lineTo(18.0f, 2.8f)
                close()
            }
        }
        .build()
        return _cartCheck!!
    }

private var _cartCheck: ImageVector? = null
