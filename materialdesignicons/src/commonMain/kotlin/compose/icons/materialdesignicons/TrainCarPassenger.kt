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

public val MaterialDesignIcons.TrainCarPassenger: ImageVector
    get() {
        if (_trainCarPassenger != null) {
            return _trainCarPassenger!!
        }
        _trainCarPassenger = Builder(name = "TrainCarPassenger", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 7.0f, 1.0f, 7.9f, 1.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(6.0f, 18.11f, 6.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 18.11f, 18.9f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(22.0f, 18.11f, 22.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                curveTo(23.0f, 7.9f, 22.11f, 7.0f, 21.0f, 7.0f)
                moveTo(7.0f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                moveTo(15.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                moveTo(21.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _trainCarPassenger!!
    }

private var _trainCarPassenger: ImageVector? = null
