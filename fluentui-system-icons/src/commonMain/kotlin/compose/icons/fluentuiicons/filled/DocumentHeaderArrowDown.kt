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

public val FilledGroup.DocumentHeaderArrowDown: ImageVector
    get() {
        if (_documentHeaderArrowDown != null) {
            return _documentHeaderArrowDown!!
        }
        _documentHeaderArrowDown = Builder(name = "DocumentHeaderArrowDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 2.0f)
                curveTo(18.9409f, 2.0f, 19.9156f, 2.9253f, 19.9948f, 4.0961f)
                lineTo(20.0f, 4.2502f)
                verticalLineTo(11.4982f)
                curveTo(19.2304f, 11.1772f, 18.3859f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 19.2465f, 11.6888f, 20.8321f, 12.8096f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 22.0f, 4.0844f, 21.0747f, 4.0052f, 19.9038f)
                lineTo(4.0f, 19.7498f)
                verticalLineTo(4.2502f)
                curveTo(4.0f, 3.0592f, 4.9252f, 2.0844f, 6.096f, 2.0052f)
                lineTo(6.25f, 2.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(8.5052f, 5.0045f)
                curveTo(7.6767f, 5.0045f, 7.0051f, 5.6761f, 7.0051f, 6.5047f)
                curveTo(7.0051f, 7.3331f, 7.6767f, 8.0048f, 8.5052f, 8.0048f)
                horizontalLineTo(15.5052f)
                curveTo(16.3337f, 8.0048f, 17.0052f, 7.3331f, 17.0052f, 6.5047f)
                curveTo(17.0052f, 5.6761f, 16.3337f, 5.0045f, 15.5052f, 5.0045f)
                horizontalLineTo(8.5052f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(18.0f, 14.5f)
                curveTo(18.0f, 14.2239f, 17.7761f, 14.0f, 17.5f, 14.0f)
                curveTo(17.2239f, 14.0f, 17.0f, 14.2239f, 17.0f, 14.5f)
                verticalLineTo(19.2929f)
                lineTo(15.3536f, 17.6464f)
                curveTo(15.1583f, 17.4512f, 14.8417f, 17.4512f, 14.6464f, 17.6464f)
                curveTo(14.4512f, 17.8417f, 14.4512f, 18.1583f, 14.6464f, 18.3536f)
                lineTo(17.1464f, 20.8536f)
                curveTo(17.3417f, 21.0488f, 17.6583f, 21.0488f, 17.8536f, 20.8536f)
                lineTo(20.3536f, 18.3536f)
                curveTo(20.5488f, 18.1583f, 20.5488f, 17.8417f, 20.3536f, 17.6464f)
                curveTo(20.1583f, 17.4512f, 19.8417f, 17.4512f, 19.6464f, 17.6464f)
                lineTo(18.0f, 19.2929f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _documentHeaderArrowDown!!
    }

private var _documentHeaderArrowDown: ImageVector? = null
