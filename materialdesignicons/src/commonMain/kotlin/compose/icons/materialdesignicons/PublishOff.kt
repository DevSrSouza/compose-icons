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

public val MaterialDesignIcons.PublishOff: ImageVector
    get() {
        if (_publishOff != null) {
            return _publishOff!!
        }
        _publishOff = Builder(name = "PublishOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(15.0f, 16.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                lineTo(8.6f, 10.4f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(19.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(19.0f)
                moveTo(17.2f, 14.0f)
                horizontalLineTo(19.0f)
                lineTo(12.0f, 7.0f)
                lineTo(11.1f, 7.9f)
                lineTo(17.2f, 14.0f)
                close()
            }
        }
        .build()
        return _publishOff!!
    }

private var _publishOff: ImageVector? = null
