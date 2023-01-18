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

public val FilledGroup.SaveArrowRight: ImageVector
    get() {
        if (_saveArrowRight != null) {
            return _saveArrowRight!!
        }
        _saveArrowRight = Builder(name = "SaveArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.7574f, 7.0074f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(13.0629f)
                curveTo(14.2245f, 11.6644f, 15.7847f, 11.0f, 17.5f, 11.0f)
                curveTo(18.7886f, 11.0f, 19.9897f, 11.375f, 21.0f, 12.0218f)
                verticalLineTo(8.2855f)
                curveTo(21.0f, 7.4236f, 20.6576f, 6.5969f, 20.0481f, 5.9874f)
                lineTo(18.0126f, 3.9519f)
                curveTo(17.4114f, 3.3508f, 16.5991f, 3.0095f, 15.75f, 3.0002f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 8.7426f, 14.7426f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(7.7574f, 9.75f, 6.75f, 8.7426f, 6.75f, 7.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.25f, 14.25f)
                horizontalLineTo(11.8696f)
                curveTo(11.3165f, 15.2061f, 11.0f, 16.3161f, 11.0f, 17.5f)
                curveTo(11.0f, 18.7886f, 11.375f, 19.9897f, 12.0218f, 21.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                curveTo(7.5f, 14.5858f, 7.8358f, 14.25f, 8.25f, 14.25f)
                close()
                moveTo(14.25f, 3.0f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.9142f, 13.9142f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 8.25f, 8.25f, 7.9142f, 8.25f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.25f)
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
        return _saveArrowRight!!
    }

private var _saveArrowRight: ImageVector? = null
