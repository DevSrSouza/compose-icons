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

public val MaterialDesignIcons.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) {
            return _fireTruck!!
        }
        _fireTruck = Builder(name = "FireTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.04f, 2.0f)
                curveTo(16.85f, 2.0f, 16.66f, 2.04f, 16.5f, 2.14f)
                lineTo(5.59f, 8.5f)
                horizontalLineTo(9.55f)
                lineTo(17.5f, 3.86f)
                curveTo(18.0f, 3.58f, 18.13f, 2.97f, 17.85f, 2.5f)
                curveTo(17.68f, 2.2f, 17.38f, 2.0f, 17.04f, 2.0f)
                moveTo(16.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 19.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.5f)
                lineTo(19.5f, 8.0f)
                horizontalLineTo(16.0f)
                moveTo(18.0f, 9.5f)
                horizontalLineTo(19.0f)
                lineTo(21.5f, 12.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.5f)
                moveTo(4.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                moveTo(14.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 17.5f)
                moveTo(18.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 17.5f)
                close()
            }
        }
        .build()
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
