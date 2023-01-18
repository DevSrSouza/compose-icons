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

public val FilledGroup.SlideMultipleArrowRight: ImageVector
    get() {
        if (_slideMultipleArrowRight != null) {
            return _slideMultipleArrowRight!!
        }
        _slideMultipleArrowRight = Builder(name = "SlideMultipleArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.1266f, 4.1266f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 3.0f, 19.0f, 4.0074f, 19.0f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(7.75f)
                curveTo(5.9551f, 5.5f, 4.5f, 6.9551f, 4.5f, 8.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 17.0f, 2.0f, 15.9926f, 2.0f, 14.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(6.5074f, 6.5f, 5.5f, 7.5074f, 5.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(5.5f, 19.4926f, 6.5074f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(11.7322f)
                curveTo(11.2644f, 19.6025f, 11.0f, 18.5821f, 11.0f, 17.5f)
                curveTo(11.0f, 13.9101f, 13.9101f, 11.0f, 17.5f, 11.0f)
                curveTo(19.2465f, 11.0f, 20.8321f, 11.6888f, 22.0f, 12.8096f)
                verticalLineTo(8.75f)
                curveTo(22.0f, 7.5074f, 20.9926f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(14.5f, 17.0f)
                curveTo(14.2239f, 17.0f, 14.0f, 17.2239f, 14.0f, 17.5f)
                curveTo(14.0f, 17.7761f, 14.2239f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(19.2929f)
                lineTo(17.6464f, 19.6464f)
                curveTo(17.4512f, 19.8417f, 17.4512f, 20.1583f, 17.6464f, 20.3536f)
                curveTo(17.8417f, 20.5488f, 18.1583f, 20.5488f, 18.3536f, 20.3536f)
                lineTo(20.8536f, 17.8536f)
                curveTo(21.0488f, 17.6583f, 21.0488f, 17.3417f, 20.8536f, 17.1464f)
                lineTo(18.3536f, 14.6464f)
                curveTo(18.1583f, 14.4512f, 17.8417f, 14.4512f, 17.6464f, 14.6464f)
                curveTo(17.4512f, 14.8417f, 17.4512f, 15.1583f, 17.6464f, 15.3536f)
                lineTo(19.2929f, 17.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _slideMultipleArrowRight!!
    }

private var _slideMultipleArrowRight: ImageVector? = null
