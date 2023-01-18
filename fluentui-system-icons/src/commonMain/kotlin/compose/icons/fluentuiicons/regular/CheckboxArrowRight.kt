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

public val RegularGroup.CheckboxArrowRight: ImageVector
    get() {
        if (_checkboxArrowRight != null) {
            return _checkboxArrowRight!!
        }
        _checkboxArrowRight = Builder(name = "CheckboxArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.3004f, 19.5258f, 11.1572f, 19.0232f, 11.0764f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 18.5f, 3.5f, 17.7165f, 3.5f, 16.75f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(17.7165f, 3.5f, 18.5f, 4.2835f, 18.5f, 5.25f)
                verticalLineTo(11.0764f)
                curveTo(19.0232f, 11.1572f, 19.5258f, 11.3004f, 20.0f, 11.4982f)
                verticalLineTo(5.25f)
                curveTo(20.0f, 3.4551f, 18.5449f, 2.0f, 16.75f, 2.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(16.28f, 8.2806f)
                curveTo(16.5731f, 7.9879f, 16.5734f, 7.513f, 16.2806f, 7.22f)
                curveTo(15.9879f, 6.9269f, 15.513f, 6.9266f, 15.22f, 7.2194f)
                lineTo(8.9966f, 13.4356f)
                lineTo(6.7808f, 11.2197f)
                curveTo(6.4879f, 10.9268f, 6.0131f, 10.9268f, 5.7202f, 11.2196f)
                curveTo(5.4273f, 11.5125f, 5.4273f, 11.9874f, 5.7201f, 12.2803f)
                lineTo(8.4659f, 15.0262f)
                curveTo(8.7587f, 15.319f, 9.2333f, 15.3192f, 9.5263f, 15.0266f)
                lineTo(16.28f, 8.2806f)
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
        return _checkboxArrowRight!!
    }

private var _checkboxArrowRight: ImageVector? = null
