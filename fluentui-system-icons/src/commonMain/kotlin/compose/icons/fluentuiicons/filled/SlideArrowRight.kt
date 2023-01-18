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

public val FilledGroup.SlideArrowRight: ImageVector
    get() {
        if (_slideArrowRight != null) {
            return _slideArrowRight!!
        }
        _slideArrowRight = Builder(name = "SlideArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(12.8096f)
                curveTo(20.8321f, 11.6888f, 19.2465f, 11.0f, 17.5f, 11.0f)
                curveTo(16.9076f, 11.0f, 16.3337f, 11.0793f, 15.7883f, 11.2277f)
                curveTo(15.652f, 11.0873f, 15.4612f, 11.0f, 15.25f, 11.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 11.0f, 6.0f, 11.3358f, 6.0f, 11.75f)
                curveTo(6.0f, 12.1642f, 6.3358f, 12.5f, 6.75f, 12.5f)
                horizontalLineTo(13.3464f)
                curveTo(12.8317f, 12.9281f, 12.3841f, 13.4341f, 12.0218f, 14.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 14.0f, 6.0f, 14.3358f, 6.0f, 14.75f)
                curveTo(6.0f, 15.1642f, 6.3358f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.11f, 16.1301f, 11.0f, 16.8022f, 11.0f, 17.5f)
                curveTo(11.0f, 18.3859f, 11.1772f, 19.2304f, 11.4982f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(6.3358f, 8.0f, 6.0f, 8.3358f, 6.0f, 8.75f)
                curveTo(6.0f, 9.1642f, 6.3358f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 9.5f, 12.0f, 9.1642f, 12.0f, 8.75f)
                curveTo(12.0f, 8.3358f, 11.6642f, 8.0f, 11.25f, 8.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
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
        return _slideArrowRight!!
    }

private var _slideArrowRight: ImageVector? = null
