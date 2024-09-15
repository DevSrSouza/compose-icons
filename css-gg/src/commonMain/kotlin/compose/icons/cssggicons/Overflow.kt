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

public val CssGgIcons.Overflow: ImageVector
    get() {
        if (_overflow != null) {
            return _overflow!!
        }
        _overflow = Builder(name = "Overflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                curveTo(22.0f, 13.652f, 20.946f, 16.196f, 19.071f, 18.071f)
                curveTo(17.196f, 19.946f, 14.652f, 21.0f, 12.0f, 21.0f)
                curveTo(9.348f, 21.0f, 6.804f, 19.946f, 4.929f, 18.071f)
                curveTo(3.054f, 16.196f, 2.0f, 13.652f, 2.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 13.122f, 19.157f, 15.157f, 17.657f, 16.657f)
                curveTo(16.157f, 18.157f, 14.122f, 19.0f, 12.0f, 19.0f)
                curveTo(9.878f, 19.0f, 7.843f, 18.157f, 6.343f, 16.657f)
                curveTo(4.843f, 15.157f, 4.0f, 13.122f, 4.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 8.878f, 19.157f, 6.843f, 17.657f, 5.343f)
                curveTo(16.157f, 3.843f, 14.122f, 3.0f, 12.0f, 3.0f)
                curveTo(9.878f, 3.0f, 7.843f, 3.843f, 6.343f, 5.343f)
                curveTo(4.843f, 6.843f, 4.0f, 8.878f, 4.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _overflow!!
    }

private var _overflow: ImageVector? = null
