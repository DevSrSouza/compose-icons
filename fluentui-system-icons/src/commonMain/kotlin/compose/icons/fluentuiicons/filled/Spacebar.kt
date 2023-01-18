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

public val FilledGroup.Spacebar: ImageVector
    get() {
        if (_spacebar != null) {
            return _spacebar!!
        }
        _spacebar = Builder(name = "Spacebar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                curveTo(4.0f, 10.4477f, 3.5523f, 10.0f, 3.0f, 10.0f)
                curveTo(2.4477f, 10.0f, 2.0f, 10.4477f, 2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 14.1046f, 2.8954f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 15.0f, 22.0f, 14.1046f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 10.4477f, 21.5523f, 10.0f, 21.0f, 10.0f)
                curveTo(20.4477f, 10.0f, 20.0f, 10.4477f, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _spacebar!!
    }

private var _spacebar: ImageVector? = null
