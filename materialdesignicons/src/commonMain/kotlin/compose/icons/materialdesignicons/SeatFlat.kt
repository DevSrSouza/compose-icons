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

public val MaterialDesignIcons.SeatFlat: ImageVector
    get() {
        if (_seatFlat != null) {
            return _seatFlat!!
        }
        _seatFlat = Builder(name = "SeatFlat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 11.0f)
                moveTo(2.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                moveTo(7.14f, 12.1f)
                curveTo(8.3f, 10.91f, 8.28f, 9.0f, 7.1f, 7.86f)
                curveTo(5.91f, 6.7f, 4.0f, 6.72f, 2.86f, 7.9f)
                curveTo(1.7f, 9.09f, 1.72f, 11.0f, 2.9f, 12.14f)
                curveTo(4.09f, 13.3f, 6.0f, 13.28f, 7.14f, 12.1f)
                close()
            }
        }
        .build()
        return _seatFlat!!
    }

private var _seatFlat: ImageVector? = null
