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

public val MaterialDesignIcons.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 1.0f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 9.0f, 6.0f)
                curveTo(10.06f, 6.0f, 11.07f, 6.21f, 12.0f, 6.58f)
                curveTo(12.93f, 6.21f, 13.94f, 6.0f, 15.0f, 6.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 23.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 18.0f)
                moveTo(3.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 14.0f)
                curveTo(7.0f, 11.63f, 8.03f, 9.5f, 9.67f, 8.04f)
                lineTo(9.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 3.0f, 14.0f)
                moveTo(19.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 9.0f, 14.0f)
                curveTo(9.0f, 14.73f, 8.81f, 15.41f, 8.46f, 16.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
