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

public val MaterialDesignIcons.MessageOffOutline: ImageVector
    get() {
        if (_messageOffOutline != null) {
            return _messageOffOutline!!
        }
        _messageOffOutline = Builder(name = "MessageOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2f, 4.0f)
                lineTo(5.2f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.76f, 21.57f, 17.41f, 20.95f, 17.75f)
                lineTo(19.2f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.97f, 2.0f, 3.93f, 2.0f, 3.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(6.1f, 5.44f)
                lineTo(16.65f, 16.0f)
                horizontalLineTo(16.66f)
                lineTo(18.66f, 18.0f)
                horizontalLineTo(18.65f)
                lineTo(22.11f, 21.46f)
                moveTo(14.11f, 16.0f)
                lineTo(4.0f, 5.89f)
                verticalLineTo(18.0f)
                lineTo(6.0f, 16.0f)
                horizontalLineTo(14.11f)
                close()
            }
        }
        .build()
        return _messageOffOutline!!
    }

private var _messageOffOutline: ImageVector? = null
