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

public val FilledGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(5.0074f, 3.0f, 4.0f, 4.0074f, 4.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4.0f, 19.9926f, 5.0074f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.75f)
                curveTo(9.9926f, 21.0f, 11.0f, 19.9926f, 11.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(11.0f, 4.0074f, 9.9926f, 3.0f, 8.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(15.25f, 3.0f)
                curveTo(14.0074f, 3.0f, 13.0f, 4.0074f, 13.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(13.0f, 19.9926f, 14.0074f, 21.0f, 15.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 21.0f, 20.0f, 19.9926f, 20.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(20.0f, 4.0074f, 18.9926f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
