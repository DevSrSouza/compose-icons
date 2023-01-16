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

public val MaterialDesignIcons.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 7.15f, 2.53f, 6.42f, 3.28f, 6.13f)
                lineTo(15.71f, 1.0f)
                lineTo(16.47f, 2.83f)
                lineTo(8.83f, 6.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(7.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
