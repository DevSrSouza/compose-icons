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

public val MaterialDesignIcons.SeatPassenger: ImageVector
    get() {
        if (_seatPassenger != null) {
            return _seatPassenger!!
        }
        _seatPassenger = Builder(name = "SeatPassenger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                curveTo(6.24f, 21.0f, 4.0f, 18.76f, 4.0f, 16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.66f, 7.34f, 19.0f, 9.0f, 19.0f)
                moveTo(10.42f, 5.41f)
                curveTo(11.2f, 4.63f, 11.2f, 3.36f, 10.42f, 2.58f)
                curveTo(9.64f, 1.8f, 8.37f, 1.8f, 7.59f, 2.58f)
                curveTo(6.81f, 3.36f, 6.81f, 4.63f, 7.59f, 5.41f)
                curveTo(8.37f, 6.2f, 9.63f, 6.2f, 10.42f, 5.41f)
                moveTo(11.5f, 9.0f)
                curveTo(11.5f, 7.9f, 10.6f, 7.0f, 9.5f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 7.0f, 7.0f, 7.9f, 7.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 16.66f, 8.34f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(15.07f)
                lineTo(18.57f, 21.5f)
                lineTo(20.0f, 20.07f)
                lineTo(14.93f, 15.0f)
                horizontalLineTo(11.5f)
                lineTo(11.5f, 9.0f)
                close()
            }
        }
        .build()
        return _seatPassenger!!
    }

private var _seatPassenger: ImageVector? = null
