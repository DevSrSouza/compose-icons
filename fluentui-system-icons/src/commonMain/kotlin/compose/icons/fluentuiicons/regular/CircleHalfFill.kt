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

public val RegularGroup.CircleHalfFill: ImageVector
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
                moveTo(12.0f, 3.5f)
                curveTo(7.5583f, 3.5f, 3.9123f, 6.9069f, 3.5326f, 11.25f)
                horizontalLineTo(20.4674f)
                curveTo(20.0877f, 6.9069f, 16.4417f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _circleHalfFill!!
    }

private var _circleHalfFill: ImageVector? = null
