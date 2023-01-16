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

public val MaterialDesignIcons.SeatLegroomReduced: ImageVector
    get() {
        if (_seatLegroomReduced != null) {
            return _seatLegroomReduced!!
        }
        _seatLegroomReduced = Builder(name = "SeatLegroomReduced", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.97f, 19.2f)
                curveTo(20.15f, 20.16f, 19.42f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                lineTo(15.0f, 14.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 11.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineTo(18.44f)
                curveTo(19.17f, 18.0f, 19.83f, 18.5f, 19.97f, 19.2f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 12.0f)
                close()
            }
        }
        .build()
        return _seatLegroomReduced!!
    }

private var _seatLegroomReduced: ImageVector? = null
