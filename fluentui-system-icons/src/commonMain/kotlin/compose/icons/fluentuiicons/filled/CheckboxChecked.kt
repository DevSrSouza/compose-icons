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

public val FilledGroup.CheckboxChecked: ImageVector
    get() {
        if (_checkboxChecked != null) {
            return _checkboxChecked!!
        }
        _checkboxChecked = Builder(name = "CheckboxChecked", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.28f, 9.2806f)
                lineTo(10.5263f, 16.0266f)
                curveTo(10.2333f, 16.3192f, 9.7587f, 16.319f, 9.4659f, 16.0262f)
                lineTo(6.7201f, 13.2803f)
                curveTo(6.4273f, 12.9874f, 6.4273f, 12.5125f, 6.7202f, 12.2196f)
                curveTo(7.0131f, 11.9268f, 7.4879f, 11.9268f, 7.7808f, 12.2197f)
                lineTo(9.9966f, 14.4356f)
                lineTo(16.22f, 8.2194f)
                curveTo(16.513f, 7.9266f, 16.9879f, 7.9269f, 17.2806f, 8.22f)
                curveTo(17.5734f, 8.513f, 17.5731f, 8.9879f, 17.28f, 9.2806f)
                close()
            }
        }
        .build()
        return _checkboxChecked!!
    }

private var _checkboxChecked: ImageVector? = null
