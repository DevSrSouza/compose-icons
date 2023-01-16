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

public val MaterialDesignIcons.BookOff: ImageVector
    get() {
        if (_bookOff != null) {
            return _bookOff!!
        }
        _bookOff = Builder(name = "BookOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.68f, 2.12f)
                lineTo(12.0f, 8.8f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.24f, 2.0f, 18.46f, 2.05f, 18.68f, 2.12f)
                moveTo(9.5f, 7.5f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(16.8f)
                lineTo(11.88f, 8.93f)
                lineTo(9.5f, 7.5f)
                moveTo(21.61f, 1.73f)
                lineTo(1.89f, 21.46f)
                lineTo(3.16f, 22.73f)
                lineTo(4.54f, 21.35f)
                curveTo(4.9f, 21.75f, 5.42f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(5.89f)
                lineTo(22.89f, 3.0f)
                lineTo(21.61f, 1.73f)
                close()
            }
        }
        .build()
        return _bookOff!!
    }

private var _bookOff: ImageVector? = null
