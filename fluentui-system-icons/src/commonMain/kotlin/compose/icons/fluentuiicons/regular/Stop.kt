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

public val RegularGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 4.5f)
                curveTo(19.3881f, 4.5f, 19.5f, 4.6119f, 19.5f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(19.5f, 19.3881f, 19.3881f, 19.5f, 19.25f, 19.5f)
                horizontalLineTo(4.75f)
                curveTo(4.6119f, 19.5f, 4.5f, 19.3881f, 4.5f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(4.5f, 4.6119f, 4.6119f, 4.5f, 4.75f, 4.5f)
                horizontalLineTo(19.25f)
                close()
                moveTo(4.75f, 3.0f)
                curveTo(3.7835f, 3.0f, 3.0f, 3.7835f, 3.0f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(3.0f, 20.2165f, 3.7835f, 21.0f, 4.75f, 21.0f)
                horizontalLineTo(19.25f)
                curveTo(20.2165f, 21.0f, 21.0f, 20.2165f, 21.0f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(21.0f, 3.7835f, 20.2165f, 3.0f, 19.25f, 3.0f)
                horizontalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
