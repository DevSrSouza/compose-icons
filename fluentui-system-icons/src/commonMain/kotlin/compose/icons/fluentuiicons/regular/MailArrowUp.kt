package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.MailArrowUp: ImageVector
    get() {
        if (_mailArrowUp != null) {
            return _mailArrowUp!!
        }
        _mailArrowUp = Builder(name = "MailArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(17.0f, 4.7071f)
                verticalLineTo(9.5f)
                curveTo(17.0f, 9.7761f, 17.2239f, 10.0f, 17.5f, 10.0f)
                curveTo(17.7761f, 10.0f, 18.0f, 9.7761f, 18.0f, 9.5f)
                verticalLineTo(4.7071f)
                lineTo(19.6464f, 6.3535f)
                curveTo(19.8417f, 6.5488f, 20.1583f, 6.5488f, 20.3536f, 6.3535f)
                curveTo(20.5488f, 6.1583f, 20.5488f, 5.8417f, 20.3536f, 5.6465f)
                lineTo(17.8536f, 3.1465f)
                curveTo(17.6583f, 2.9512f, 17.3417f, 2.9512f, 17.1464f, 3.1465f)
                lineTo(14.6464f, 5.6465f)
                curveTo(14.4512f, 5.8417f, 14.4512f, 6.1583f, 14.6464f, 6.3535f)
                curveTo(14.8417f, 6.5488f, 15.1583f, 6.5488f, 15.3536f, 6.3535f)
                lineTo(17.0f, 4.7071f)
                close()
                moveTo(20.5f, 16.75f)
                verticalLineTo(12.2678f)
                curveTo(21.051f, 11.9806f, 21.5557f, 11.6168f, 22.0f, 11.1904f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.3565f, 4.1007f, 5.0656f, 4.0051f)
                lineTo(5.25f, 4.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.3004f, 4.4742f, 11.1572f, 4.9768f, 11.0764f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.3318f, 5.5f, 3.5788f, 6.2071f, 3.5058f, 7.1065f)
                lineTo(3.5f, 7.25f)
                verticalLineTo(7.679f)
                lineTo(12.0f, 12.1525f)
                lineTo(13.3052f, 11.4654f)
                curveTo(13.7437f, 11.8363f, 14.232f, 12.1501f, 14.7587f, 12.3954f)
                lineTo(12.3493f, 13.6637f)
                curveTo(12.1619f, 13.7623f, 11.9431f, 13.7764f, 11.7468f, 13.706f)
                lineTo(11.6507f, 13.6637f)
                lineTo(3.5f, 9.374f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.6682f, 4.2071f, 18.4212f, 5.1065f, 18.4942f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 18.5f, 20.4212f, 17.7929f, 20.4942f, 16.8935f)
                lineTo(20.5f, 16.75f)
                close()
            }
        }
        .build()
        return _mailArrowUp!!
    }

private var _mailArrowUp: ImageVector? = null