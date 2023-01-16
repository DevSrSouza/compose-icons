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

public val MaterialDesignIcons.TankerTruck: ImageVector
    get() {
        if (_tankerTruck != null) {
            return _tankerTruck!!
        }
        _tankerTruck = Builder(name = "TankerTruck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 18.7f, 4.3f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(9.0f, 18.7f, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.7f, 16.3f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(21.0f, 18.7f, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 8.0f)
                moveTo(6.0f, 18.5f)
                curveTo(5.2f, 18.5f, 4.5f, 17.8f, 4.5f, 17.0f)
                reflectiveCurveTo(5.2f, 15.5f, 6.0f, 15.5f)
                reflectiveCurveTo(7.5f, 16.2f, 7.5f, 17.0f)
                reflectiveCurveTo(6.8f, 18.5f, 6.0f, 18.5f)
                moveTo(18.0f, 18.5f)
                curveTo(17.2f, 18.5f, 16.5f, 17.8f, 16.5f, 17.0f)
                reflectiveCurveTo(17.2f, 15.5f, 18.0f, 15.5f)
                reflectiveCurveTo(19.5f, 16.2f, 19.5f, 17.0f)
                reflectiveCurveTo(18.8f, 18.5f, 18.0f, 18.5f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12.0f)
                horizontalLineTo(17.0f)
                moveTo(14.0f, 9.5f)
                curveTo(14.0f, 11.4f, 12.4f, 13.0f, 10.5f, 13.0f)
                horizontalLineTo(4.5f)
                curveTo(2.6f, 13.0f, 1.0f, 11.4f, 1.0f, 9.5f)
                reflectiveCurveTo(2.6f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                curveTo(12.4f, 6.0f, 14.0f, 7.6f, 14.0f, 9.5f)
                close()
            }
        }
        .build()
        return _tankerTruck!!
    }

private var _tankerTruck: ImageVector? = null
