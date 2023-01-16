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

public val MaterialDesignIcons.TruckMinus: ImageVector
    get() {
        if (_truckMinus != null) {
            return _truckMinus!!
        }
        _truckMinus = Builder(name = "TruckMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 4.0f, 1.0f, 4.89f, 1.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 18.66f, 4.34f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(9.0f, 18.66f, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.66f, 16.34f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(21.0f, 18.66f, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 8.0f)
                moveTo(6.0f, 18.5f)
                curveTo(5.17f, 18.5f, 4.5f, 17.83f, 4.5f, 17.0f)
                reflectiveCurveTo(5.17f, 15.5f, 6.0f, 15.5f)
                reflectiveCurveTo(7.5f, 16.17f, 7.5f, 17.0f)
                reflectiveCurveTo(6.83f, 18.5f, 6.0f, 18.5f)
                moveTo(13.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 18.5f)
                curveTo(17.17f, 18.5f, 16.5f, 17.83f, 16.5f, 17.0f)
                reflectiveCurveTo(17.17f, 15.5f, 18.0f, 15.5f)
                reflectiveCurveTo(19.5f, 16.17f, 19.5f, 17.0f)
                reflectiveCurveTo(18.83f, 18.5f, 18.0f, 18.5f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.46f, 12.0f)
                horizontalLineTo(17.0f)
            }
        }
        .build()
        return _truckMinus!!
    }

private var _truckMinus: ImageVector? = null
