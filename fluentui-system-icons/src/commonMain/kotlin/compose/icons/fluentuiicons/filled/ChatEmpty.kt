package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ChatEmpty: ImageVector
    get() {
        if (_chatEmpty != null) {
            return _chatEmpty!!
        }
        _chatEmpty = Builder(name = "ChatEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.6428f, 2.3972f, 15.2294f, 3.1449f, 16.6502f)
                lineTo(2.0285f, 20.9386f)
                curveTo(1.992f, 21.0791f, 1.992f, 21.2266f, 2.0286f, 21.367f)
                curveTo(2.1469f, 21.8213f, 2.6111f, 22.0937f, 3.0654f, 21.9753f)
                lineTo(7.3558f, 20.8583f)
                curveTo(8.7752f, 21.6039f, 10.3596f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chatEmpty!!
    }

private var _chatEmpty: ImageVector? = null
