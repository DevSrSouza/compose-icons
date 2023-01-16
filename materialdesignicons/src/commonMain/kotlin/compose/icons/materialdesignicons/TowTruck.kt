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

public val MaterialDesignIcons.TowTruck: ImageVector
    get() {
        if (_towTruck != null) {
            return _towTruck!!
        }
        _towTruck = Builder(name = "TowTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                horizontalLineTo(20.39f)
                lineTo(17.06f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                moveTo(17.5f, 18.5f)
                curveTo(17.89f, 18.5f, 18.24f, 18.37f, 18.54f, 18.07f)
                curveTo(18.84f, 17.77f, 19.0f, 17.42f, 19.0f, 17.0f)
                curveTo(19.0f, 16.61f, 18.84f, 16.26f, 18.54f, 15.96f)
                curveTo(18.24f, 15.66f, 17.89f, 15.5f, 17.5f, 15.5f)
                curveTo(17.08f, 15.5f, 16.73f, 15.66f, 16.43f, 15.96f)
                curveTo(16.13f, 16.26f, 16.0f, 16.61f, 16.0f, 17.0f)
                curveTo(16.0f, 17.42f, 16.13f, 17.77f, 16.43f, 18.07f)
                curveTo(16.73f, 18.37f, 17.08f, 18.5f, 17.5f, 18.5f)
                moveTo(6.0f, 18.5f)
                curveTo(6.44f, 18.5f, 6.8f, 18.37f, 7.08f, 18.07f)
                curveTo(7.36f, 17.77f, 7.5f, 17.42f, 7.5f, 17.0f)
                curveTo(7.5f, 16.61f, 7.36f, 16.26f, 7.08f, 15.96f)
                curveTo(6.8f, 15.66f, 6.44f, 15.5f, 6.0f, 15.5f)
                curveTo(5.56f, 15.5f, 5.2f, 15.66f, 4.92f, 15.96f)
                curveTo(4.64f, 16.26f, 4.5f, 16.61f, 4.5f, 17.0f)
                curveTo(4.5f, 17.42f, 4.64f, 17.77f, 4.92f, 18.07f)
                curveTo(5.2f, 18.37f, 5.56f, 18.5f, 6.0f, 18.5f)
                moveTo(18.0f, 4.0f)
                lineTo(23.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.5f)
                curveTo(20.5f, 17.83f, 20.19f, 18.53f, 19.59f, 19.13f)
                curveTo(19.0f, 19.72f, 18.3f, 20.0f, 17.5f, 20.0f)
                curveTo(16.67f, 20.0f, 15.97f, 19.72f, 15.38f, 19.13f)
                curveTo(14.78f, 18.53f, 14.5f, 17.83f, 14.5f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 17.83f, 8.7f, 18.53f, 8.11f, 19.13f)
                curveTo(7.5f, 19.72f, 6.81f, 20.0f, 6.0f, 20.0f)
                curveTo(5.19f, 20.0f, 4.5f, 19.72f, 3.89f, 19.13f)
                curveTo(3.3f, 18.53f, 3.0f, 17.83f, 3.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.19f)
                lineTo(3.0f, 8.11f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                lineTo(13.0f, 11.06f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _towTruck!!
    }

private var _towTruck: ImageVector? = null
