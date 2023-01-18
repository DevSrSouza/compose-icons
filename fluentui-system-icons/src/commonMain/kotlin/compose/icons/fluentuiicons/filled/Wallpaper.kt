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

public val FilledGroup.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) {
            return _wallpaper!!
        }
        _wallpaper = Builder(name = "Wallpaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 3.0f, 11.0f, 3.4477f, 11.0f, 4.0f)
                curveTo(11.0f, 4.5523f, 10.5523f, 5.0f, 10.0f, 5.0f)
                horizontalLineTo(6.25f)
                curveTo(5.5596f, 5.0f, 5.0f, 5.5596f, 5.0f, 6.25f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 10.5523f, 4.5523f, 11.0f, 4.0f, 11.0f)
                curveTo(3.4477f, 11.0f, 3.0f, 10.5523f, 3.0f, 10.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.0f, 3.4477f, 13.4477f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 10.5523f, 20.5523f, 11.0f, 20.0f, 11.0f)
                curveTo(19.4477f, 11.0f, 19.0f, 10.5523f, 19.0f, 10.0f)
                verticalLineTo(6.25f)
                curveTo(19.0f, 5.5596f, 18.4404f, 5.0f, 17.75f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 5.0f, 13.0f, 4.5523f, 13.0f, 4.0f)
                close()
                moveTo(4.0f, 13.0f)
                curveTo(4.5523f, 13.0f, 5.0f, 13.4477f, 5.0f, 14.0f)
                verticalLineTo(17.5858f)
                lineTo(9.5251f, 13.0607f)
                curveTo(10.892f, 11.6938f, 13.108f, 11.6938f, 14.4749f, 13.0607f)
                lineTo(19.0f, 17.5858f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 13.4477f, 19.4477f, 13.0f, 20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 13.4477f, 21.0f, 14.0f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 21.0f, 13.0f, 20.5523f, 13.0f, 20.0f)
                curveTo(13.0f, 19.4477f, 13.4477f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(17.5858f)
                lineTo(13.0607f, 14.4749f)
                curveTo(12.4749f, 13.8891f, 11.5251f, 13.8891f, 10.9393f, 14.4749f)
                lineTo(6.4142f, 19.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 19.0f, 11.0f, 19.4477f, 11.0f, 20.0f)
                curveTo(11.0f, 20.5523f, 10.5523f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 13.4477f, 3.4477f, 13.0f, 4.0f, 13.0f)
                close()
                moveTo(17.5f, 8.75f)
                curveTo(17.5f, 9.9926f, 16.4926f, 11.0f, 15.25f, 11.0f)
                curveTo(14.0074f, 11.0f, 13.0f, 9.9926f, 13.0f, 8.75f)
                curveTo(13.0f, 7.5074f, 14.0074f, 6.5f, 15.25f, 6.5f)
                curveTo(16.4926f, 6.5f, 17.5f, 7.5074f, 17.5f, 8.75f)
                close()
            }
        }
        .build()
        return _wallpaper!!
    }

private var _wallpaper: ImageVector? = null
