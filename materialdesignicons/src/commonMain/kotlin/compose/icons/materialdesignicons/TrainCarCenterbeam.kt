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

public val MaterialDesignIcons.TrainCarCenterbeam: ImageVector
    get() {
        if (_trainCarCenterbeam != null) {
            return _trainCarCenterbeam!!
        }
        _trainCarCenterbeam = Builder(name = "TrainCarCenterbeam", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 18.11f, 21.11f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(18.0f, 18.11f, 18.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 18.11f, 5.11f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(2.0f, 18.11f, 2.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _trainCarCenterbeam!!
    }

private var _trainCarCenterbeam: ImageVector? = null
