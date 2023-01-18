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

public val FilledGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0866f, 7.75f)
                curveTo(6.561f, 5.0428f, 8.9246f, 3.0f, 11.75f, 3.0f)
                curveTo(14.5754f, 3.0f, 16.939f, 5.0428f, 17.4134f, 7.75f)
                lineTo(17.5f, 7.75f)
                curveTo(19.7091f, 7.75f, 21.5f, 9.5409f, 21.5f, 11.75f)
                curveTo(21.5f, 11.9371f, 21.4872f, 12.1212f, 21.4623f, 12.3015f)
                curveTo(20.27f, 10.8937f, 18.4894f, 10.0f, 16.5f, 10.0f)
                curveTo(13.1638f, 10.0f, 10.4147f, 12.5134f, 10.0428f, 15.75f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 15.75f, 2.0f, 13.9591f, 2.0f, 11.75f)
                curveTo(2.0f, 9.5409f, 3.7909f, 7.75f, 6.0f, 7.75f)
                lineTo(6.0866f, 7.75f)
                close()
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 13.4624f, 19.5376f, 11.0f, 16.5f, 11.0f)
                curveTo(13.4624f, 11.0f, 11.0f, 13.4624f, 11.0f, 16.5f)
                curveTo(11.0f, 19.5376f, 13.4624f, 22.0f, 16.5f, 22.0f)
                curveTo(19.5376f, 22.0f, 22.0f, 19.5376f, 22.0f, 16.5f)
                close()
                moveTo(16.0f, 13.5f)
                curveTo(16.0f, 13.2239f, 16.2239f, 13.0f, 16.5f, 13.0f)
                curveTo(16.7761f, 13.0f, 17.0f, 13.2239f, 17.0f, 13.5f)
                verticalLineTo(18.2929f)
                lineTo(18.6464f, 16.6464f)
                curveTo(18.8417f, 16.4512f, 19.1583f, 16.4512f, 19.3536f, 16.6464f)
                curveTo(19.5488f, 16.8417f, 19.5488f, 17.1583f, 19.3536f, 17.3536f)
                lineTo(16.8536f, 19.8536f)
                curveTo(16.6583f, 20.0488f, 16.3417f, 20.0488f, 16.1464f, 19.8536f)
                lineTo(13.6464f, 17.3536f)
                curveTo(13.4512f, 17.1583f, 13.4512f, 16.8417f, 13.6464f, 16.6464f)
                curveTo(13.8417f, 16.4512f, 14.1583f, 16.4512f, 14.3536f, 16.6464f)
                lineTo(16.0f, 18.2929f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
