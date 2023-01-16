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

public val MaterialDesignIcons.BusStopUncovered: ImageVector
    get() {
        if (_busStopUncovered != null) {
            return _busStopUncovered!!
        }
        _busStopUncovered = Builder(name = "BusStopUncovered", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 18.0f)
                verticalLineTo(22.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 20.0f, 11.0f)
                moveTo(15.0f, 11.55f)
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
                moveTo(12.0f, 6.55f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _busStopUncovered!!
    }

private var _busStopUncovered: ImageVector? = null
