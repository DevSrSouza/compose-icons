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

public val MaterialDesignIcons.PointOfSale: ImageVector
    get() {
        if (_pointOfSale != null) {
            return _pointOfSale!!
        }
        _pointOfSale = Builder(name = "PointOfSale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveTo(19.4f, 5.0f, 19.0f, 5.5f, 19.0f, 6.1f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 16.6f, 19.4f, 17.0f, 20.0f, 17.1f)
                curveTo(20.6f, 17.1f, 21.0f, 16.6f, 21.0f, 16.0f)
                verticalLineTo(6.1f)
                curveTo(21.0f, 5.5f, 20.6f, 5.0f, 20.0f, 5.0f)
                moveTo(16.4f, 2.0f)
                horizontalLineTo(4.6f)
                curveTo(3.7f, 2.0f, 3.0f, 2.7f, 3.0f, 3.6f)
                verticalLineTo(17.4f)
                curveTo(3.0f, 18.3f, 3.7f, 19.0f, 4.6f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                curveTo(6.0f, 21.6f, 6.4f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(13.6f, 22.0f, 14.0f, 21.6f, 14.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.4f)
                curveTo(17.3f, 19.0f, 18.0f, 18.3f, 18.0f, 17.4f)
                verticalLineTo(3.6f)
                curveTo(18.0f, 2.7f, 17.3f, 2.0f, 16.4f, 2.0f)
                moveTo(5.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                moveTo(12.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                moveTo(9.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                moveTo(5.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                moveTo(8.0f, 21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                moveTo(13.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                moveTo(16.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                moveTo(16.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _pointOfSale!!
    }

private var _pointOfSale: ImageVector? = null
