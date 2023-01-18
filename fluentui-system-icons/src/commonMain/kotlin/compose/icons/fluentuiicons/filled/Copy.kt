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

public val FilledGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5028f, 4.627f)
                lineTo(5.5f, 6.75f)
                verticalLineTo(17.2542f)
                curveTo(5.5f, 19.0491f, 6.9551f, 20.5042f, 8.75f, 20.5042f)
                lineTo(17.3663f, 20.5045f)
                curveTo(17.0573f, 21.3782f, 16.224f, 22.0042f, 15.2444f, 22.0042f)
                horizontalLineTo(8.75f)
                curveTo(6.1266f, 22.0042f, 4.0f, 19.8776f, 4.0f, 17.2542f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 5.7693f, 4.6274f, 4.9351f, 5.5028f, 4.627f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(18.9926f, 2.0f, 20.0f, 3.0074f, 20.0f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(20.0f, 18.4926f, 18.9926f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(7.5074f, 19.5f, 6.5f, 18.4926f, 6.5f, 17.25f)
                verticalLineTo(4.25f)
                curveTo(6.5f, 3.0074f, 7.5074f, 2.0f, 8.75f, 2.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
