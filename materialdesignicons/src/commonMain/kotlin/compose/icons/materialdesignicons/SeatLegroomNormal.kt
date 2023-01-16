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

public val MaterialDesignIcons.SeatLegroomNormal: ImageVector
    get() {
        if (_seatLegroomNormal != null) {
            return _seatLegroomNormal!!
        }
        _seatLegroomNormal = Builder(name = "SeatLegroomNormal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 12.0f)
                moveTo(20.5f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 18.0f)
                close()
            }
        }
        .build()
        return _seatLegroomNormal!!
    }

private var _seatLegroomNormal: ImageVector? = null
