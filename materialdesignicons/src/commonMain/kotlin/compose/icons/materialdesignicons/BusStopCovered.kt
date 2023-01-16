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

public val MaterialDesignIcons.BusStopCovered: ImageVector
    get() {
        if (_busStopCovered != null) {
            return _busStopCovered!!
        }
        _busStopCovered = Builder(name = "BusStopCovered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                arcTo(1.78f, 1.78f, 0.0f, false, false, 4.59f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.73f)
                curveTo(2.0f, 10.58f, 2.0f, 22.0f, 2.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                moveTo(22.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 8.5f)
                moveTo(15.0f, 11.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 10.0f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 11.5f)
                moveTo(12.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _busStopCovered!!
    }

private var _busStopCovered: ImageVector? = null
