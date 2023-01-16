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

public val MaterialDesignIcons.CarSeat: ImageVector
    get() {
        if (_carSeat != null) {
            return _carSeat!!
        }
        _carSeat = Builder(name = "CarSeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveTo(7.0f, 18.0f, 4.0f, 10.0f, 4.0f, 6.0f)
                reflectiveCurveTo(6.0f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 2.0f, 8.0f, 2.0f, 8.0f, 3.0f)
                reflectiveCurveTo(7.0f, 4.0f, 7.0f, 6.0f)
                reflectiveCurveTo(10.0f, 10.0f, 10.0f, 13.0f)
                reflectiveCurveTo(7.0f, 18.0f, 7.0f, 18.0f)
                moveTo(12.0f, 17.0f)
                curveTo(11.0f, 17.0f, 8.0f, 19.5f, 8.0f, 19.5f)
                curveTo(7.7f, 19.7f, 7.8f, 20.0f, 8.0f, 20.3f)
                curveTo(8.0f, 20.3f, 9.0f, 22.1f, 11.0f, 22.1f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 22.1f, 19.0f, 21.2f, 19.0f, 20.1f)
                verticalLineTo(19.1f)
                curveTo(19.0f, 18.0f, 18.1f, 17.1f, 17.0f, 17.1f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _carSeat!!
    }

private var _carSeat: ImageVector? = null
