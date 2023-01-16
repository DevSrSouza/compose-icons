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

public val MaterialDesignIcons.TrainCar: ImageVector
    get() {
        if (_trainCar != null) {
            return _trainCar!!
        }
        _trainCar = Builder(name = "TrainCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 18.0f)
                lineTo(4.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                lineTo(7.0f, 17.97f)
                lineTo(9.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(5.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 14.0f)
                moveTo(20.57f, 9.66f)
                curveTo(20.43f, 9.26f, 20.05f, 9.0f, 19.6f, 9.0f)
                horizontalLineTo(12.41f)
                curveTo(11.95f, 9.0f, 11.58f, 9.26f, 11.43f, 9.66f)
                lineTo(10.0f, 13.77f)
                verticalLineTo(19.28f)
                curveTo(10.0f, 19.66f, 10.32f, 20.0f, 10.7f, 20.0f)
                horizontalLineTo(11.32f)
                curveTo(11.7f, 20.0f, 12.0f, 19.62f, 12.0f, 19.24f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.24f)
                curveTo(20.0f, 19.62f, 20.31f, 20.0f, 20.69f, 20.0f)
                horizontalLineTo(21.3f)
                curveTo(21.68f, 20.0f, 22.0f, 19.66f, 22.0f, 19.28f)
                verticalLineTo(17.91f)
                lineTo(22.0f, 13.77f)
                lineTo(20.57f, 9.66f)
                moveTo(12.41f, 10.0f)
                horizontalLineTo(19.6f)
                lineTo(20.63f, 13.0f)
                horizontalLineTo(11.38f)
                lineTo(12.41f, 10.0f)
                moveTo(12.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveTo(20.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _trainCar!!
    }

private var _trainCar: ImageVector? = null
