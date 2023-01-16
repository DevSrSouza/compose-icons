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

public val MaterialDesignIcons.SeatReclineExtra: ImageVector
    get() {
        if (_seatReclineExtra != null) {
            return _seatReclineExtra!!
        }
        _seatReclineExtra = Builder(name = "SeatReclineExtra", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.35f, 5.64f)
                curveTo(4.45f, 5.0f, 4.23f, 3.76f, 4.86f, 2.85f)
                curveTo(5.5f, 1.95f, 6.74f, 1.73f, 7.65f, 2.36f)
                curveTo(8.55f, 3.0f, 8.77f, 4.24f, 8.14f, 5.15f)
                curveTo(7.5f, 6.05f, 6.26f, 6.27f, 5.35f, 5.64f)
                moveTo(16.0f, 19.0f)
                horizontalLineTo(8.93f)
                curveTo(7.45f, 19.0f, 6.19f, 17.92f, 5.97f, 16.46f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(2.0f)
                lineTo(4.0f, 16.76f)
                curveTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f)
                horizontalLineTo(16.0f)
                moveTo(16.23f, 15.0f)
                horizontalLineTo(11.35f)
                lineTo(10.32f, 10.9f)
                curveTo(11.9f, 11.79f, 13.6f, 12.44f, 15.47f, 12.12f)
                verticalLineTo(10.0f)
                curveTo(13.84f, 10.3f, 12.03f, 9.72f, 10.78f, 8.74f)
                lineTo(9.14f, 7.47f)
                curveTo(8.91f, 7.29f, 8.65f, 7.17f, 8.38f, 7.09f)
                curveTo(8.06f, 7.0f, 7.72f, 6.97f, 7.39f, 7.03f)
                horizontalLineTo(7.37f)
                curveTo(6.14f, 7.25f, 5.32f, 8.42f, 5.53f, 9.64f)
                lineTo(6.88f, 15.56f)
                curveTo(7.16f, 17.0f, 8.39f, 18.0f, 9.83f, 18.0f)
                horizontalLineTo(16.68f)
                lineTo(20.5f, 21.0f)
                lineTo(22.0f, 19.5f)
            }
        }
        .build()
        return _seatReclineExtra!!
    }

private var _seatReclineExtra: ImageVector? = null
