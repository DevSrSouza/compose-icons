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

public val MaterialDesignIcons.MessageCheck: ImageVector
    get() {
        if (_messageCheck != null) {
            return _messageCheck!!
        }
        _messageCheck = Builder(name = "MessageCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 18.0f, 22.0f, 17.11f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(10.47f, 14.0f)
                lineTo(7.0f, 10.5f)
                lineTo(8.4f, 9.09f)
                lineTo(10.47f, 11.17f)
                lineTo(15.6f, 6.0f)
                lineTo(17.0f, 7.41f)
                lineTo(10.47f, 14.0f)
                close()
            }
        }
        .build()
        return _messageCheck!!
    }

private var _messageCheck: ImageVector? = null
