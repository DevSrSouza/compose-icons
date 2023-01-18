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

public val FilledGroup.ReOrder: ImageVector
    get() {
        if (_reOrder != null) {
            return _reOrder!!
        }
        _reOrder = Builder(name = "ReOrder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 13.4477f, 22.0f, 14.0f)
                curveTo(22.0f, 14.5128f, 21.614f, 14.9355f, 21.1166f, 14.9933f)
                lineTo(21.0f, 15.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 15.0f, 2.0f, 14.5523f, 2.0f, 14.0f)
                curveTo(2.0f, 13.4872f, 2.386f, 13.0645f, 2.8834f, 13.0067f)
                lineTo(3.0f, 13.0f)
                horizontalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 9.0f, 22.0f, 9.4477f, 22.0f, 10.0f)
                curveTo(22.0f, 10.5128f, 21.614f, 10.9355f, 21.1166f, 10.9933f)
                lineTo(21.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 10.5523f, 2.0f, 10.0f)
                curveTo(2.0f, 9.4872f, 2.386f, 9.0645f, 2.8834f, 9.0067f)
                lineTo(3.0f, 9.0f)
                horizontalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _reOrder!!
    }

private var _reOrder: ImageVector? = null
