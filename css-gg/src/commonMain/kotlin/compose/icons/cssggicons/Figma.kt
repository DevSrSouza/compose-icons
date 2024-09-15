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

public val CssGgIcons.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(6.843f, 2.0f, 5.5f, 3.343f, 5.5f, 5.0f)
                curveTo(5.5f, 6.657f, 6.843f, 8.0f, 8.5f, 8.0f)
                horizontalLineTo(15.5f)
                curveTo(17.157f, 8.0f, 18.5f, 6.657f, 18.5f, 5.0f)
                curveTo(18.5f, 3.343f, 17.157f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                curveTo(13.843f, 9.0f, 12.5f, 10.343f, 12.5f, 12.0f)
                curveTo(12.5f, 13.657f, 13.843f, 15.0f, 15.5f, 15.0f)
                curveTo(17.157f, 15.0f, 18.5f, 13.657f, 18.5f, 12.0f)
                curveTo(18.5f, 10.343f, 17.157f, 9.0f, 15.5f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                curveTo(5.5f, 10.343f, 6.843f, 9.0f, 8.5f, 9.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.5f)
                curveTo(6.843f, 15.0f, 5.5f, 13.657f, 5.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.0f)
                curveTo(6.843f, 16.0f, 5.5f, 17.343f, 5.5f, 19.0f)
                curveTo(5.5f, 20.657f, 6.843f, 22.0f, 8.5f, 22.0f)
                curveTo(10.157f, 22.0f, 11.5f, 20.657f, 11.5f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
