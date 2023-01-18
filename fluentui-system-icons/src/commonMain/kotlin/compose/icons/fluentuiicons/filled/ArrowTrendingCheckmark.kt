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

public val FilledGroup.ArrowTrendingCheckmark: ImageVector
    get() {
        if (_arrowTrendingCheckmark != null) {
            return _arrowTrendingCheckmark!!
        }
        _arrowTrendingCheckmark = Builder(name = "ArrowTrendingCheckmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                lineTo(21.0f, 9.0f)
                curveTo(21.0f, 9.5523f, 20.5523f, 10.0f, 20.0f, 10.0f)
                curveTo(19.4477f, 10.0f, 19.0f, 9.5523f, 19.0f, 9.0f)
                lineTo(19.0f, 6.4142f)
                lineTo(13.2071f, 12.2071f)
                curveTo(13.0196f, 12.3946f, 12.7652f, 12.5f, 12.5f, 12.5f)
                curveTo(12.2348f, 12.5f, 11.9804f, 12.3946f, 11.7929f, 12.2071f)
                lineTo(10.0f, 10.4142f)
                lineTo(4.7071f, 15.7071f)
                curveTo(4.3166f, 16.0976f, 3.6834f, 16.0976f, 3.2929f, 15.7071f)
                curveTo(2.9024f, 15.3166f, 2.9024f, 14.6834f, 3.2929f, 14.2929f)
                lineTo(9.2929f, 8.2929f)
                curveTo(9.4804f, 8.1053f, 9.7348f, 8.0f, 10.0f, 8.0f)
                curveTo(10.2652f, 8.0f, 10.5196f, 8.1053f, 10.7071f, 8.2929f)
                lineTo(12.5f, 10.0858f)
                lineTo(17.5858f, 5.0f)
                lineTo(15.0f, 5.0f)
                curveTo(14.4477f, 5.0f, 14.0f, 4.5523f, 14.0f, 4.0f)
                curveTo(14.0f, 3.4477f, 14.4477f, 3.0f, 15.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(20.6583f, 14.9512f, 20.3417f, 14.9512f, 20.1464f, 15.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(14.8536f, 17.1464f)
                curveTo(14.6583f, 16.9512f, 14.3417f, 16.9512f, 14.1464f, 17.1464f)
                curveTo(13.9512f, 17.3417f, 13.9512f, 17.6583f, 14.1464f, 17.8536f)
                lineTo(16.1464f, 19.8536f)
                curveTo(16.3417f, 20.0488f, 16.6583f, 20.0488f, 16.8536f, 19.8536f)
                lineTo(20.8536f, 15.8536f)
                curveTo(21.0488f, 15.6583f, 21.0488f, 15.3417f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _arrowTrendingCheckmark!!
    }

private var _arrowTrendingCheckmark: ImageVector? = null
