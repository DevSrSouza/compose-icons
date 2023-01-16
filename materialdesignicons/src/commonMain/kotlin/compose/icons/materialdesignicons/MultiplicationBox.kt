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

public val MaterialDesignIcons.MultiplicationBox: ImageVector
    get() {
        if (_multiplicationBox != null) {
            return _multiplicationBox!!
        }
        _multiplicationBox = Builder(name = "MultiplicationBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.73f)
                lineTo(15.83f, 15.36f)
                lineTo(16.83f, 13.63f)
                lineTo(14.0f, 12.0f)
                lineTo(16.83f, 10.36f)
                lineTo(15.83f, 8.63f)
                lineTo(13.0f, 10.27f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.27f)
                lineTo(8.17f, 8.63f)
                lineTo(7.17f, 10.36f)
                lineTo(10.0f, 12.0f)
                lineTo(7.17f, 13.63f)
                lineTo(8.17f, 15.36f)
                lineTo(11.0f, 13.73f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _multiplicationBox!!
    }

private var _multiplicationBox: ImageVector? = null
