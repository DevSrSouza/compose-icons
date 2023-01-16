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

public val MaterialDesignIcons.SeatLegroomExtra: ImageVector
    get() {
        if (_seatLegroomExtra != null) {
            return _seatLegroomExtra!!
        }
        _seatLegroomExtra = Builder(name = "SeatLegroomExtra", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 12.0f)
                moveTo(22.83f, 17.24f)
                curveTo(22.45f, 16.5f, 21.54f, 16.27f, 20.8f, 16.61f)
                lineTo(19.71f, 17.11f)
                lineTo(16.3f, 10.13f)
                curveTo(15.96f, 9.45f, 15.27f, 9.0f, 14.5f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 14.0f)
                horizontalLineTo(15.0f)
                lineTo(18.41f, 21.0f)
                lineTo(22.13f, 19.3f)
                curveTo(22.9f, 18.94f, 23.23f, 18.0f, 22.83f, 17.24f)
                close()
            }
        }
        .build()
        return _seatLegroomExtra!!
    }

private var _seatLegroomExtra: ImageVector? = null
