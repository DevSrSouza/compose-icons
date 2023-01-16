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

public val MaterialDesignIcons.SeatReclineNormal: ImageVector
    get() {
        if (_seatReclineNormal != null) {
            return _seatReclineNormal!!
        }
        _seatReclineNormal = Builder(name = "SeatReclineNormal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.59f, 5.41f)
                curveTo(6.81f, 4.63f, 6.81f, 3.36f, 7.59f, 2.58f)
                curveTo(8.37f, 1.8f, 9.64f, 1.8f, 10.42f, 2.58f)
                curveTo(11.2f, 3.36f, 11.2f, 4.63f, 10.42f, 5.41f)
                curveTo(9.63f, 6.2f, 8.37f, 6.2f, 7.59f, 5.41f)
                moveTo(6.0f, 16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 16.0f)
                moveTo(20.0f, 20.07f)
                lineTo(14.93f, 15.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(11.32f)
                curveTo(12.9f, 12.47f, 15.1f, 13.5f, 17.0f, 13.5f)
                verticalLineTo(11.32f)
                curveTo(15.34f, 11.34f, 13.39f, 10.45f, 12.33f, 9.28f)
                lineTo(10.93f, 7.73f)
                curveTo(10.74f, 7.5f, 10.5f, 7.35f, 10.24f, 7.23f)
                curveTo(9.95f, 7.09f, 9.62f, 7.0f, 9.28f, 7.0f)
                horizontalLineTo(9.25f)
                curveTo(8.0f, 7.0f, 7.0f, 8.0f, 7.0f, 9.25f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 18.0f)
                horizontalLineTo(15.07f)
                lineTo(18.57f, 21.5f)
            }
        }
        .build()
        return _seatReclineNormal!!
    }

private var _seatReclineNormal: ImageVector? = null
