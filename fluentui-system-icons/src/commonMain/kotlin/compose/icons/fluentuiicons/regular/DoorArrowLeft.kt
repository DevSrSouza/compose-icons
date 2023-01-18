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

public val RegularGroup.DoorArrowLeft: ImageVector
    get() {
        if (_doorArrowLeft != null) {
            return _doorArrowLeft!!
        }
        _doorArrowLeft = Builder(name = "DoorArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 2.0f)
                curveTo(5.0074f, 2.0f, 4.0f, 3.0074f, 4.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(12.8096f)
                curveTo(12.3832f, 21.5557f, 12.0194f, 21.051f, 11.7322f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 20.5f, 5.5f, 20.1642f, 5.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(5.5f, 3.8358f, 5.8358f, 3.5f, 6.25f, 3.5f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 3.5f, 18.5f, 3.8358f, 18.5f, 4.25f)
                verticalLineTo(11.0764f)
                curveTo(19.0232f, 11.1572f, 19.5258f, 11.3004f, 20.0f, 11.4982f)
                verticalLineTo(4.25f)
                curveTo(20.0f, 3.0074f, 18.9926f, 2.0f, 17.75f, 2.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(21.0f, 17.5f)
                curveTo(21.0f, 17.7761f, 20.7761f, 18.0f, 20.5f, 18.0f)
                horizontalLineTo(15.7071f)
                lineTo(17.3536f, 19.6464f)
                curveTo(17.5488f, 19.8417f, 17.5488f, 20.1583f, 17.3536f, 20.3536f)
                curveTo(17.1583f, 20.5488f, 16.8417f, 20.5488f, 16.6464f, 20.3536f)
                lineTo(14.1464f, 17.8536f)
                curveTo(13.9512f, 17.6583f, 13.9512f, 17.3417f, 14.1464f, 17.1464f)
                lineTo(16.6464f, 14.6464f)
                curveTo(16.8417f, 14.4512f, 17.1583f, 14.4512f, 17.3536f, 14.6464f)
                curveTo(17.5488f, 14.8417f, 17.5488f, 15.1583f, 17.3536f, 15.3536f)
                lineTo(15.7071f, 17.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 17.0f, 21.0f, 17.2239f, 21.0f, 17.5f)
                close()
                moveTo(8.5f, 13.25f)
                curveTo(9.3284f, 13.25f, 10.0f, 12.5784f, 10.0f, 11.75f)
                curveTo(10.0f, 10.9216f, 9.3284f, 10.25f, 8.5f, 10.25f)
                curveTo(7.6716f, 10.25f, 7.0f, 10.9216f, 7.0f, 11.75f)
                curveTo(7.0f, 12.5784f, 7.6716f, 13.25f, 8.5f, 13.25f)
                close()
            }
        }
        .build()
        return _doorArrowLeft!!
    }

private var _doorArrowLeft: ImageVector? = null
