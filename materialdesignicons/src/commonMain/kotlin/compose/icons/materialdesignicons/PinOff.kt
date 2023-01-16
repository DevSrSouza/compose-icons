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

public val MaterialDesignIcons.PinOff: ImageVector
    get() {
        if (_pinOff != null) {
            return _pinOff!!
        }
        _pinOff = Builder(name = "PinOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(12.8f, 16.07f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.2f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(11.27f)
                lineTo(2.0f, 5.27f)
                moveTo(16.0f, 12.0f)
                lineTo(18.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.82f)
                lineTo(8.0f, 6.18f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _pinOff!!
    }

private var _pinOff: ImageVector? = null
