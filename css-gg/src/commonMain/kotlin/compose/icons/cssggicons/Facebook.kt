package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.198f, 21.5f)
                horizontalLineTo(13.198f)
                verticalLineTo(13.4901f)
                horizontalLineTo(16.8021f)
                lineTo(17.198f, 9.5098f)
                horizontalLineTo(13.198f)
                verticalLineTo(7.5f)
                curveTo(13.198f, 6.9477f, 13.6457f, 6.5f, 14.198f, 6.5f)
                horizontalLineTo(17.198f)
                verticalLineTo(2.5f)
                horizontalLineTo(14.198f)
                curveTo(11.4365f, 2.5f, 9.198f, 4.7386f, 9.198f, 7.5f)
                verticalLineTo(9.5098f)
                horizontalLineTo(7.1979f)
                lineTo(6.8021f, 13.4901f)
                horizontalLineTo(9.198f)
                verticalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
