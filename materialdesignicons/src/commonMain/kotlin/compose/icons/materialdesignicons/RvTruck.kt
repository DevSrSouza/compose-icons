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

public val MaterialDesignIcons.RvTruck: ImageVector
    get() {
        if (_rvTruck != null) {
            return _rvTruck!!
        }
        _rvTruck = Builder(name = "RvTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 6.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 17.0f)
                horizontalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 17.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                moveTo(7.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 18.5f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 19.5f, 17.0f)
                arcTo(1.54f, 1.54f, 0.0f, false, true, 18.0f, 18.5f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12.0f)
                close()
            }
        }
        .build()
        return _rvTruck!!
    }

private var _rvTruck: ImageVector? = null
