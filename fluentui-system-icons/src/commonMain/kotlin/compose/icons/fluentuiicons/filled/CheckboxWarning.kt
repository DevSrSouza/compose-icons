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

public val FilledGroup.CheckboxWarning: ImageVector
    get() {
        if (_checkboxWarning != null) {
            return _checkboxWarning!!
        }
        _checkboxWarning = Builder(name = "CheckboxWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(11.054f)
                curveTo(11.0972f, 20.792f, 11.1683f, 20.5843f, 11.2699f, 20.3809f)
                lineTo(15.2655f, 12.3833f)
                curveTo(16.187f, 10.5389f, 18.8189f, 10.5389f, 19.7404f, 12.3833f)
                lineTo(21.0f, 14.9045f)
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
                moveTo(16.1615f, 12.8301f)
                lineTo(12.1646f, 20.8284f)
                curveTo(11.6659f, 21.8262f, 12.3918f, 23.0f, 13.5075f, 23.0f)
                horizontalLineTo(21.5013f)
                curveTo(22.617f, 23.0f, 23.3428f, 21.8263f, 22.8442f, 20.8284f)
                lineTo(18.8473f, 12.8301f)
                curveTo(18.2943f, 11.7233f, 16.7146f, 11.7233f, 16.1615f, 12.8301f)
                close()
                moveTo(18.0048f, 15.4956f)
                verticalLineTo(18.4974f)
                curveTo(18.0048f, 18.7737f, 17.7808f, 18.9976f, 17.5044f, 18.9976f)
                curveTo(17.228f, 18.9976f, 17.004f, 18.7737f, 17.004f, 18.4974f)
                verticalLineTo(15.4956f)
                curveTo(17.004f, 15.2193f, 17.228f, 14.9954f, 17.5044f, 14.9954f)
                curveTo(17.7808f, 14.9954f, 18.0048f, 15.2193f, 18.0048f, 15.4956f)
                close()
                moveTo(17.5044f, 20.9988f)
                curveTo(17.228f, 20.9988f, 17.004f, 20.7748f, 17.004f, 20.4985f)
                curveTo(17.004f, 20.2222f, 17.228f, 19.9982f, 17.5044f, 19.9982f)
                curveTo(17.7808f, 19.9982f, 18.0048f, 20.2222f, 18.0048f, 20.4985f)
                curveTo(18.0048f, 20.7748f, 17.7808f, 20.9988f, 17.5044f, 20.9988f)
                close()
            }
        }
        .build()
        return _checkboxWarning!!
    }

private var _checkboxWarning: ImageVector? = null
