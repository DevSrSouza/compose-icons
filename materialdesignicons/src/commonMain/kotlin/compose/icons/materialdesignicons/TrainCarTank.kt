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

public val MaterialDesignIcons.TrainCarTank: ImageVector
    get() {
        if (_trainCarTank != null) {
            return _trainCarTank!!
        }
        _trainCarTank = Builder(name = "TrainCarTank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 18.11f, 21.11f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(18.0f, 18.11f, 18.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 18.11f, 5.11f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(2.0f, 18.11f, 2.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                moveTo(21.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 8.0f, 1.0f, 8.9f, 1.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 13.11f, 1.9f, 14.0f, 3.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 14.0f, 23.0f, 13.11f, 23.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(23.0f, 8.9f, 22.11f, 8.0f, 21.0f, 8.0f)
                close()
            }
        }
        .build()
        return _trainCarTank!!
    }

private var _trainCarTank: ImageVector? = null
