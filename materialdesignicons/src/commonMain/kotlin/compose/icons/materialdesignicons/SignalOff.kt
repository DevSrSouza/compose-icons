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

public val MaterialDesignIcons.SignalOff: ImageVector
    get() {
        if (_signalOff != null) {
            return _signalOff!!
        }
        _signalOff = Builder(name = "SignalOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                verticalLineTo(16.18f)
                lineTo(21.0f, 19.18f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                moveTo(4.28f, 5.0f)
                lineTo(3.0f, 6.27f)
                lineTo(10.73f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.27f)
                lineTo(13.0f, 16.27f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.27f)
                lineTo(19.73f, 23.0f)
                lineTo(21.0f, 21.72f)
                lineTo(4.28f, 5.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(11.18f)
                lineTo(16.0f, 14.18f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                moveTo(3.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _signalOff!!
    }

private var _signalOff: ImageVector? = null
