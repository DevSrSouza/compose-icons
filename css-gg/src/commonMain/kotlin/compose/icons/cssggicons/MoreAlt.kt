package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MoreAlt: ImageVector
    get() {
        if (_moreAlt != null) {
            return _moreAlt!!
        }
        _moreAlt = Builder(name = "MoreAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 13.105f, 7.105f, 14.0f, 6.0f, 14.0f)
                curveTo(4.895f, 14.0f, 4.0f, 13.105f, 4.0f, 12.0f)
                curveTo(4.0f, 10.895f, 4.895f, 10.0f, 6.0f, 10.0f)
                curveTo(7.105f, 10.0f, 8.0f, 10.895f, 8.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                curveTo(19.105f, 14.0f, 20.0f, 13.105f, 20.0f, 12.0f)
                curveTo(20.0f, 10.895f, 19.105f, 10.0f, 18.0f, 10.0f)
                curveTo(16.895f, 10.0f, 16.0f, 10.895f, 16.0f, 12.0f)
                curveTo(16.0f, 13.105f, 16.895f, 14.0f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _moreAlt!!
    }

private var _moreAlt: ImageVector? = null
