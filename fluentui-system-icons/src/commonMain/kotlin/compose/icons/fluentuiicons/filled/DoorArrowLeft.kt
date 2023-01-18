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

public val FilledGroup.DoorArrowLeft: ImageVector
    get() {
        if (_doorArrowLeft != null) {
            return _doorArrowLeft!!
        }
        _doorArrowLeft = Builder(name = "DoorArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 2.75f)
                curveTo(5.4216f, 2.75f, 4.75f, 3.4216f, 4.75f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(4.75f, 20.5784f, 5.4216f, 21.25f, 6.25f, 21.25f)
                horizontalLineTo(12.1902f)
                curveTo(11.4405f, 20.1905f, 11.0f, 18.8967f, 11.0f, 17.5f)
                curveTo(11.0f, 13.9101f, 13.9101f, 11.0f, 17.5f, 11.0f)
                curveTo(18.1063f, 11.0f, 18.6932f, 11.083f, 19.25f, 11.2383f)
                verticalLineTo(4.25f)
                curveTo(19.25f, 3.4216f, 18.5784f, 2.75f, 17.75f, 2.75f)
                horizontalLineTo(6.25f)
                close()
                moveTo(8.5f, 13.25f)
                curveTo(7.6716f, 13.25f, 7.0f, 12.5784f, 7.0f, 11.75f)
                curveTo(7.0f, 10.9216f, 7.6716f, 10.25f, 8.5f, 10.25f)
                curveTo(9.3284f, 10.25f, 10.0f, 10.9216f, 10.0f, 11.75f)
                curveTo(10.0f, 12.5784f, 9.3284f, 13.25f, 8.5f, 13.25f)
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
            }
        }
        .build()
        return _doorArrowLeft!!
    }

private var _doorArrowLeft: ImageVector? = null
