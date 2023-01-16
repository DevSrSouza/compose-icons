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

public val MaterialDesignIcons.TrainCarFlatbedCar: ImageVector
    get() {
        if (_trainCarFlatbedCar != null) {
            return _trainCarFlatbedCar!!
        }
        _trainCarFlatbedCar = Builder(name = "TrainCarFlatbedCar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(23.0f, 8.89f, 22.11f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(19.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineTo(6.0f)
                lineTo(3.0f, 8.0f)
                curveTo(1.89f, 8.0f, 1.0f, 8.89f, 1.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 13.77f, 3.3f, 14.47f, 3.78f, 15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(6.0f, 18.11f, 6.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 18.11f, 18.9f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(22.0f, 18.11f, 22.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.22f)
                curveTo(20.7f, 14.47f, 21.0f, 13.77f, 21.0f, 13.0f)
                horizontalLineTo(23.0f)
                moveTo(19.5f, 13.0f)
                curveTo(19.5f, 13.83f, 18.83f, 14.5f, 18.0f, 14.5f)
                reflectiveCurveTo(16.5f, 13.83f, 16.5f, 13.0f)
                reflectiveCurveTo(17.17f, 11.5f, 18.0f, 11.5f)
                reflectiveCurveTo(19.5f, 12.17f, 19.5f, 13.0f)
                moveTo(12.0f, 5.5f)
                horizontalLineTo(15.25f)
                lineTo(17.14f, 8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.5f)
                moveTo(15.78f, 15.0f)
                horizontalLineTo(8.22f)
                curveTo(8.7f, 14.47f, 9.0f, 13.77f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.77f, 15.3f, 14.47f, 15.78f, 15.0f)
                moveTo(6.75f, 5.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.86f)
                lineTo(6.75f, 5.5f)
                moveTo(6.0f, 11.5f)
                curveTo(6.83f, 11.5f, 7.5f, 12.17f, 7.5f, 13.0f)
                reflectiveCurveTo(6.83f, 14.5f, 6.0f, 14.5f)
                reflectiveCurveTo(4.5f, 13.83f, 4.5f, 13.0f)
                reflectiveCurveTo(5.17f, 11.5f, 6.0f, 11.5f)
                close()
            }
        }
        .build()
        return _trainCarFlatbedCar!!
    }

private var _trainCarFlatbedCar: ImageVector? = null
