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

public val MaterialDesignIcons.LaptopOff: ImageVector
    get() {
        if (_laptopOff != null) {
            return _laptopOff!!
        }
        _laptopOff = Builder(name = "LaptopOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.73f, 20.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 18.0f, 2.0f, 17.1f, 2.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.78f, 2.04f, 5.57f, 2.1f, 5.37f)
                lineTo(1.0f, 4.27f)
                moveTo(4.0f, 16.0f)
                horizontalLineTo(12.73f)
                lineTo(4.0f, 7.27f)
                verticalLineTo(16.0f)
                moveTo(20.0f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.82f)
                lineTo(17.82f, 16.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _laptopOff!!
    }

private var _laptopOff: ImageVector? = null
