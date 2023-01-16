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

public val MaterialDesignIcons.TrainCarIntermodal: ImageVector
    get() {
        if (_trainCarIntermodal != null) {
            return _trainCarIntermodal!!
        }
        _trainCarIntermodal = Builder(name = "TrainCarIntermodal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
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
                horizontalLineTo(21.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _trainCarIntermodal!!
    }

private var _trainCarIntermodal: ImageVector? = null
