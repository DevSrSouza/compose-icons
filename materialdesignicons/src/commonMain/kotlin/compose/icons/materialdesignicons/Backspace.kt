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

public val MaterialDesignIcons.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.31f, 3.0f, 5.77f, 3.35f, 5.41f, 3.88f)
                lineTo(0.0f, 12.0f)
                lineTo(5.41f, 20.11f)
                curveTo(5.77f, 20.64f, 6.31f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 3.0f)
                moveTo(19.0f, 15.59f)
                lineTo(17.59f, 17.0f)
                lineTo(14.0f, 13.41f)
                lineTo(10.41f, 17.0f)
                lineTo(9.0f, 15.59f)
                lineTo(12.59f, 12.0f)
                lineTo(9.0f, 8.41f)
                lineTo(10.41f, 7.0f)
                lineTo(14.0f, 10.59f)
                lineTo(17.59f, 7.0f)
                lineTo(19.0f, 8.41f)
                lineTo(15.41f, 12.0f)
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
