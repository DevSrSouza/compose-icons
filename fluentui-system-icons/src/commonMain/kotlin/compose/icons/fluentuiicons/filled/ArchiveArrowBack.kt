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

public val FilledGroup.ArchiveArrowBack: ImageVector
    get() {
        if (_archiveArrowBack != null) {
            return _archiveArrowBack!!
        }
        _archiveArrowBack = Builder(name = "ArchiveArrowBack", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.6716f, 3.6716f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 3.0f, 21.0f, 3.6716f, 21.0f, 4.5f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 6.8284f, 20.3284f, 7.5f, 19.5f, 7.5f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 7.5f, 3.0f, 6.8284f, 3.0f, 6.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.4982f)
                curveTo(19.2304f, 11.1772f, 18.3859f, 11.0f, 17.5f, 11.0f)
                curveTo(16.4178f, 11.0f, 15.3974f, 11.2645f, 14.4998f, 11.7323f)
                curveTo(14.4904f, 11.3263f, 14.1583f, 11.0f, 13.75f, 11.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 11.0f, 9.5f, 11.3358f, 9.5f, 11.75f)
                curveTo(9.5f, 12.1642f, 9.8358f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(13.3464f)
                curveTo(11.9127f, 13.6923f, 11.0f, 15.4896f, 11.0f, 17.5f)
                curveTo(11.0f, 18.7886f, 11.375f, 19.9897f, 12.0218f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 21.0f, 4.0f, 19.3211f, 4.0f, 17.25f)
                verticalLineTo(9.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(16.3536f, 15.3536f)
                curveTo(16.5488f, 15.1583f, 16.5488f, 14.8417f, 16.3536f, 14.6464f)
                curveTo(16.1583f, 14.4512f, 15.8417f, 14.4512f, 15.6464f, 14.6464f)
                lineTo(14.1464f, 16.1464f)
                curveTo(13.9512f, 16.3417f, 13.9512f, 16.6583f, 14.1464f, 16.8536f)
                lineTo(15.6464f, 18.3536f)
                curveTo(15.8417f, 18.5488f, 16.1583f, 18.5488f, 16.3536f, 18.3536f)
                curveTo(16.5488f, 18.1583f, 16.5488f, 17.8417f, 16.3536f, 17.6464f)
                lineTo(15.7071f, 17.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 17.0f, 20.0f, 18.0074f, 20.0f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(20.0f, 19.7761f, 20.2239f, 20.0f, 20.5f, 20.0f)
                curveTo(20.7761f, 20.0f, 21.0f, 19.7761f, 21.0f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(21.0f, 17.4551f, 19.5449f, 16.0f, 17.75f, 16.0f)
                horizontalLineTo(15.7071f)
                lineTo(16.3536f, 15.3536f)
                close()
            }
        }
        .build()
        return _archiveArrowBack!!
    }

private var _archiveArrowBack: ImageVector? = null
