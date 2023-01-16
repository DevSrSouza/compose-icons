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

public val MaterialDesignIcons.CarChildSeat: ImageVector
    get() {
        if (_carChildSeat != null) {
            return _carChildSeat!!
        }
        _carChildSeat = Builder(name = "CarChildSeat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.5f)
                curveTo(17.0f, 5.9f, 15.9f, 7.0f, 14.5f, 7.0f)
                reflectiveCurveTo(12.0f, 5.9f, 12.0f, 4.5f)
                reflectiveCurveTo(13.1f, 2.0f, 14.5f, 2.0f)
                reflectiveCurveTo(17.0f, 3.1f, 17.0f, 4.5f)
                moveTo(15.0f, 8.0f)
                horizontalLineTo(14.2f)
                curveTo(12.1f, 8.0f, 10.1f, 6.8f, 9.1f, 4.9f)
                curveTo(9.0f, 4.8f, 8.9f, 4.7f, 8.9f, 4.6f)
                lineTo(7.1f, 5.4f)
                curveTo(7.6f, 6.8f, 9.2f, 8.6f, 11.5f, 9.5f)
                lineTo(9.7f, 14.5f)
                lineTo(5.8f, 13.4f)
                lineTo(3.0f, 18.9f)
                lineTo(5.0f, 19.4f)
                lineTo(6.8f, 15.8f)
                lineTo(11.3f, 17.0f)
                curveTo(12.3f, 17.2f, 13.3f, 16.7f, 13.7f, 15.8f)
                lineTo(16.0f, 9.4f)
                curveTo(16.2f, 8.7f, 15.7f, 8.0f, 15.0f, 8.0f)
                moveTo(18.9f, 7.0f)
                lineTo(15.5f, 16.4f)
                curveTo(14.9f, 18.0f, 13.4f, 19.0f, 11.8f, 19.0f)
                curveTo(11.5f, 19.0f, 11.1f, 19.0f, 10.8f, 18.9f)
                lineTo(7.9f, 18.1f)
                lineTo(7.0f, 19.9f)
                lineTo(9.0f, 20.4f)
                lineTo(10.4f, 20.8f)
                curveTo(10.9f, 20.9f, 11.4f, 21.0f, 11.9f, 21.0f)
                curveTo(14.4f, 21.0f, 16.6f, 19.5f, 17.5f, 17.1f)
                lineTo(21.0f, 7.0f)
                horizontalLineTo(18.9f)
                close()
            }
        }
        .build()
        return _carChildSeat!!
    }

private var _carChildSeat: ImageVector? = null
