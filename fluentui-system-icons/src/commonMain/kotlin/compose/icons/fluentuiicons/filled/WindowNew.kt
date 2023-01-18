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

public val FilledGroup.WindowNew: ImageVector
    get() {
        if (_windowNew != null) {
            return _windowNew!!
        }
        _windowNew = Builder(name = "WindowNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.9751f)
                verticalLineTo(17.8392f)
                curveTo(20.1745f, 17.3494f, 21.0f, 16.1902f, 21.0f, 14.8382f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(9.25f)
                curveTo(7.804f, 3.0f, 6.5785f, 3.9444f, 6.1568f, 5.25f)
                horizontalLineTo(5.9559f)
                curveTo(5.0435f, 5.25f, 4.2679f, 5.5714f, 3.734f, 6.2036f)
                curveTo(3.2157f, 6.8172f, 3.0f, 7.6348f, 3.0f, 8.5f)
                verticalLineTo(17.25f)
                curveTo(3.0f, 18.3103f, 3.3829f, 19.2639f, 4.1107f, 19.9496f)
                curveTo(4.8355f, 20.6327f, 5.8433f, 20.9951f, 7.0f, 20.9951f)
                lineTo(10.9191f, 20.9952f)
                lineTo(14.9963f, 20.9999f)
                lineTo(14.9977f, 20.9999f)
                curveTo(15.9737f, 21.0045f, 16.9414f, 20.7995f, 17.6913f, 20.3191f)
                curveTo(18.4705f, 19.82f, 19.0f, 19.0247f, 19.0f, 17.9751f)
                close()
                moveTo(5.9559f, 6.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.8382f)
                curveTo(6.0f, 16.6332f, 7.4551f, 18.0882f, 9.25f, 18.0882f)
                horizontalLineTo(17.4958f)
                curveTo(17.4641f, 18.5061f, 17.254f, 18.8179f, 16.8822f, 19.0561f)
                curveTo(16.4486f, 19.3338f, 15.7919f, 19.5038f, 15.0037f, 19.4999f)
                lineTo(15.0009f, 19.4999f)
                lineTo(10.9191f, 19.4952f)
                lineTo(7.0f, 19.4951f)
                curveTo(6.1567f, 19.4951f, 5.5394f, 19.2349f, 5.1393f, 18.8579f)
                curveTo(4.7421f, 18.4837f, 4.5f, 17.9397f, 4.5f, 17.25f)
                verticalLineTo(8.5f)
                curveTo(4.5f, 7.8652f, 4.6593f, 7.4328f, 4.88f, 7.1714f)
                curveTo(5.085f, 6.9286f, 5.4124f, 6.75f, 5.9559f, 6.75f)
                close()
                moveTo(12.0216f, 6.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 6.5f, 17.5f, 6.8358f, 17.5f, 7.25f)
                verticalLineTo(11.9785f)
                curveTo(17.5f, 12.3927f, 17.1642f, 12.7285f, 16.75f, 12.7285f)
                curveTo(16.3358f, 12.7285f, 16.0f, 12.3927f, 16.0f, 11.9785f)
                verticalLineTo(9.0607f)
                lineTo(10.7803f, 14.2803f)
                curveTo(10.4874f, 14.5732f, 10.0126f, 14.5732f, 9.7197f, 14.2803f)
                curveTo(9.4268f, 13.9874f, 9.4268f, 13.5126f, 9.7197f, 13.2197f)
                lineTo(14.9393f, 8.0f)
                horizontalLineTo(12.0216f)
                curveTo(11.6073f, 8.0f, 11.2716f, 7.6642f, 11.2716f, 7.25f)
                curveTo(11.2716f, 6.8358f, 11.6073f, 6.5f, 12.0216f, 6.5f)
                close()
            }
        }
        .build()
        return _windowNew!!
    }

private var _windowNew: ImageVector? = null
