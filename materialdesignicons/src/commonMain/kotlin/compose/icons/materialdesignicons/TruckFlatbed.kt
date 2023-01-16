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

public val MaterialDesignIcons.TruckFlatbed: ImageVector
    get() {
        if (_truckFlatbed != null) {
            return _truckFlatbed!!
        }
        _truckFlatbed = Builder(name = "TruckFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 17.83f, 3.3f, 18.53f, 3.89f, 19.13f)
                curveTo(4.5f, 19.72f, 5.19f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(7.5f, 19.72f, 8.11f, 19.13f)
                curveTo(8.7f, 18.53f, 9.0f, 17.83f, 9.0f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 17.83f, 14.78f, 18.53f, 15.38f, 19.13f)
                curveTo(15.97f, 19.72f, 16.67f, 20.0f, 17.5f, 20.0f)
                curveTo(18.3f, 20.0f, 19.0f, 19.72f, 19.59f, 19.13f)
                curveTo(20.19f, 18.53f, 20.5f, 17.83f, 20.5f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                lineTo(18.0f, 4.0f)
                moveTo(7.08f, 18.07f)
                curveTo(6.8f, 18.37f, 6.44f, 18.5f, 6.0f, 18.5f)
                reflectiveCurveTo(5.2f, 18.37f, 4.92f, 18.07f)
                curveTo(4.64f, 17.77f, 4.5f, 17.42f, 4.5f, 17.0f)
                curveTo(4.5f, 16.61f, 4.64f, 16.26f, 4.92f, 15.96f)
                curveTo(5.2f, 15.66f, 5.56f, 15.5f, 6.0f, 15.5f)
                reflectiveCurveTo(6.8f, 15.66f, 7.08f, 15.96f)
                curveTo(7.36f, 16.26f, 7.5f, 16.61f, 7.5f, 17.0f)
                curveTo(7.5f, 17.42f, 7.36f, 17.77f, 7.08f, 18.07f)
                moveTo(18.54f, 18.07f)
                curveTo(18.24f, 18.37f, 17.89f, 18.5f, 17.5f, 18.5f)
                curveTo(17.08f, 18.5f, 16.73f, 18.37f, 16.43f, 18.07f)
                reflectiveCurveTo(16.0f, 17.42f, 16.0f, 17.0f)
                curveTo(16.0f, 16.61f, 16.13f, 16.26f, 16.43f, 15.96f)
                curveTo(16.73f, 15.66f, 17.08f, 15.5f, 17.5f, 15.5f)
                curveTo(17.89f, 15.5f, 18.24f, 15.66f, 18.54f, 15.96f)
                curveTo(18.84f, 16.26f, 19.0f, 16.61f, 19.0f, 17.0f)
                curveTo(19.0f, 17.42f, 18.84f, 17.77f, 18.54f, 18.07f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.06f)
                lineTo(20.39f, 10.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _truckFlatbed!!
    }

private var _truckFlatbed: ImageVector? = null
