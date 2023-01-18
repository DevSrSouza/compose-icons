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

public val FilledGroup.SlideMultiple: ImageVector
    get() {
        if (_slideMultiple != null) {
            return _slideMultiple!!
        }
        _slideMultiple = Builder(name = "SlideMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.1266f, 4.1266f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 3.0f, 19.0f, 4.0074f, 19.0f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(7.75f)
                curveTo(5.9551f, 5.5f, 4.5f, 6.9551f, 4.5f, 8.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 17.0f, 2.0f, 15.9926f, 2.0f, 14.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(6.5074f, 6.5f, 5.5f, 7.5074f, 5.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(5.5f, 19.4926f, 6.5074f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.5f, 22.0f, 19.4926f, 22.0f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(22.0f, 7.5074f, 20.9926f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                close()
            }
        }
        .build()
        return _slideMultiple!!
    }

private var _slideMultiple: ImageVector? = null
