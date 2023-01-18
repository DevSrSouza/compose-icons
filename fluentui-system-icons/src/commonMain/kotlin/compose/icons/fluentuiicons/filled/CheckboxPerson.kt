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

public val FilledGroup.CheckboxPerson: ImageVector
    get() {
        if (_checkboxPerson != null) {
            return _checkboxPerson!!
        }
        _checkboxPerson = Builder(name = "CheckboxPerson", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(13.1718f)
                curveTo(13.0562f, 20.6334f, 13.0f, 20.2541f, 13.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13.0f, 18.2401f, 14.2419f, 17.0f, 15.7727f, 17.0f)
                horizontalLineTo(16.0505f)
                curveTo(15.4022f, 16.3647f, 15.0f, 15.4793f, 15.0f, 14.5f)
                curveTo(15.0f, 12.567f, 16.567f, 11.0f, 18.5f, 11.0f)
                curveTo(19.4793f, 11.0f, 20.3647f, 11.4022f, 21.0f, 12.0505f)
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
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _checkboxPerson!!
    }

private var _checkboxPerson: ImageVector? = null
