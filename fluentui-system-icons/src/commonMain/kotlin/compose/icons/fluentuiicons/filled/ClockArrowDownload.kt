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

public val FilledGroup.ClockArrowDownload: ImageVector
    get() {
        if (_clockArrowDownload != null) {
            return _clockArrowDownload!!
        }
        _clockArrowDownload = Builder(name = "ClockArrowDownload", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.478f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.478f, 2.0f, 12.0f)
                curveTo(2.0f, 12.2628f, 2.0101f, 12.5232f, 2.0301f, 12.7809f)
                curveTo(3.195f, 11.6771f, 4.7684f, 11.0f, 6.5f, 11.0f)
                curveTo(8.2486f, 11.0f, 9.836f, 11.6905f, 11.0043f, 12.8137f)
                lineTo(11.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 6.336f, 11.336f, 6.0f, 11.75f, 6.0f)
                curveTo(12.1295f, 6.0f, 12.4435f, 6.2823f, 12.4931f, 6.6483f)
                lineTo(12.5f, 6.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 12.0f, 16.5f, 12.336f, 16.5f, 12.75f)
                curveTo(16.5f, 13.1295f, 16.2177f, 13.4435f, 15.8517f, 13.4931f)
                lineTo(15.75f, 13.5f)
                horizontalLineTo(11.75f)
                curveTo(11.7036f, 13.5f, 11.6583f, 13.4958f, 11.6142f, 13.4877f)
                curveTo(12.4823f, 14.5927f, 13.0f, 15.9859f, 13.0f, 17.5f)
                curveTo(13.0f, 19.2316f, 12.3229f, 20.805f, 11.2191f, 21.97f)
                curveTo(11.4768f, 21.9899f, 11.7372f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                close()
                moveTo(1.0f, 17.5f)
                curveTo(1.0f, 14.631f, 3.1967f, 12.2751f, 6.0f, 12.0225f)
                verticalLineTo(17.7929f)
                lineTo(4.3535f, 16.1464f)
                curveTo(4.1583f, 15.9512f, 3.8417f, 15.9512f, 3.6465f, 16.1464f)
                curveTo(3.4512f, 16.3417f, 3.4512f, 16.6583f, 3.6465f, 16.8536f)
                lineTo(6.1465f, 19.3536f)
                curveTo(6.3417f, 19.5488f, 6.6583f, 19.5488f, 6.8535f, 19.3536f)
                lineTo(9.3535f, 16.8536f)
                curveTo(9.5488f, 16.6583f, 9.5488f, 16.3417f, 9.3535f, 16.1464f)
                curveTo(9.1583f, 15.9512f, 8.8417f, 15.9512f, 8.6465f, 16.1464f)
                lineTo(7.0f, 17.7929f)
                verticalLineTo(12.0225f)
                curveTo(9.8033f, 12.2751f, 12.0f, 14.631f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                close()
                moveTo(3.5f, 20.5f)
                curveTo(3.5f, 20.7761f, 3.7239f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.2761f, 21.0f, 9.5f, 20.7761f, 9.5f, 20.5f)
                curveTo(9.5f, 20.2239f, 9.2761f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7239f, 20.0f, 3.5f, 20.2239f, 3.5f, 20.5f)
                close()
            }
        }
        .build()
        return _clockArrowDownload!!
    }

private var _clockArrowDownload: ImageVector? = null
