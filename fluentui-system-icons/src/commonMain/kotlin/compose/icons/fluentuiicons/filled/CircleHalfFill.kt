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

public val FilledGroup.CircleHalfFill: ImageVector
    get() {
        if (_circleHalfFill != null) {
            return _circleHalfFill!!
        }
        _circleHalfFill = Builder(name = "CircleHalfFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0277f, 11.25f)
                curveTo(2.4112f, 6.0774f, 6.7294f, 2.0f, 12.0f, 2.0f)
                curveTo(17.2706f, 2.0f, 21.5888f, 6.0774f, 21.9723f, 11.25f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.0277f)
                close()
                moveTo(4.0347f, 11.25f)
                horizontalLineTo(19.9653f)
                curveTo(19.5872f, 7.1834f, 16.1654f, 4.0f, 12.0f, 4.0f)
                curveTo(7.8346f, 4.0f, 4.4128f, 7.1834f, 4.0347f, 11.25f)
                close()
            }
        }
        .build()
        return _circleHalfFill!!
    }

private var _circleHalfFill: ImageVector? = null
