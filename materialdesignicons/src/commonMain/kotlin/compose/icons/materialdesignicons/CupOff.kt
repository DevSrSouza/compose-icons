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

public val MaterialDesignIcons.CupOff: ImageVector
    get() {
        if (_cupOff != null) {
            return _cupOff!!
        }
        _cupOff = Builder(name = "CupOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(18.27f, 21.54f)
                curveTo(17.93f, 21.83f, 17.5f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.97f, 22.0f, 5.13f, 21.23f, 5.0f, 20.23f)
                lineTo(3.53f, 6.8f)
                lineTo(1.0f, 4.27f)
                moveTo(18.32f, 8.0f)
                lineTo(18.77f, 4.0f)
                horizontalLineTo(5.82f)
                lineTo(3.82f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(19.29f, 17.47f)
                lineTo(9.82f, 8.0f)
                horizontalLineTo(18.32f)
                close()
            }
        }
        .build()
        return _cupOff!!
    }

private var _cupOff: ImageVector? = null
