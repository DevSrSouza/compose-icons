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

public val MaterialDesignIcons.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 15.0f)
                curveTo(14.0f, 13.89f, 13.1f, 13.0f, 12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 17.0f)
                moveTo(18.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.89f, 4.9f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
