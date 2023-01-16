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

public val MaterialDesignIcons.ClockFast: ImageVector
    get() {
        if (_clockFast != null) {
            return _clockFast!!
        }
        _clockFast = Builder(name = "ClockFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 4.0f)
                moveTo(15.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 6.0f)
                moveTo(14.0f, 8.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.78f)
                lineTo(17.83f, 14.11f)
                lineTo(16.77f, 15.17f)
                lineTo(14.0f, 12.4f)
                verticalLineTo(8.0f)
                moveTo(2.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 16.0f)
                horizontalLineTo(5.83f)
                curveTo(6.14f, 16.71f, 6.54f, 17.38f, 7.0f, 18.0f)
                horizontalLineTo(2.0f)
                moveTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 11.0f)
                horizontalLineTo(5.05f)
                lineTo(5.0f, 12.0f)
                lineTo(5.05f, 13.0f)
                horizontalLineTo(3.0f)
                moveTo(4.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(6.54f, 6.62f, 6.14f, 7.29f, 5.83f, 8.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _clockFast!!
    }

private var _clockFast: ImageVector? = null