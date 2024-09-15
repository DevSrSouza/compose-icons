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

public val CssGgIcons.GitFork: ImageVector
    get() {
        if (_gitFork != null) {
            return _gitFork!!
        }
        _gitFork = Builder(name = "GitFork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 3.895f, 7.895f, 3.0f, 9.0f, 3.0f)
                curveTo(10.105f, 3.0f, 11.0f, 3.895f, 11.0f, 5.0f)
                curveTo(11.0f, 5.74f, 10.598f, 6.387f, 10.0f, 6.732f)
                verticalLineTo(14.04f)
                horizontalLineTo(11.792f)
                curveTo(12.896f, 14.04f, 13.792f, 13.144f, 13.792f, 12.04f)
                verticalLineTo(10.784f)
                curveTo(13.182f, 10.441f, 12.771f, 9.788f, 12.771f, 9.04f)
                curveTo(12.771f, 7.935f, 13.666f, 7.04f, 14.771f, 7.04f)
                curveTo(15.875f, 7.04f, 16.771f, 7.935f, 16.771f, 9.04f)
                curveTo(16.771f, 9.771f, 16.378f, 10.411f, 15.792f, 10.76f)
                verticalLineTo(12.04f)
                curveTo(15.792f, 14.249f, 14.001f, 16.04f, 11.792f, 16.04f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.268f)
                curveTo(10.598f, 17.613f, 11.0f, 18.26f, 11.0f, 19.0f)
                curveTo(11.0f, 20.105f, 10.105f, 21.0f, 9.0f, 21.0f)
                curveTo(7.895f, 21.0f, 7.0f, 20.105f, 7.0f, 19.0f)
                curveTo(7.0f, 18.26f, 7.402f, 17.613f, 8.0f, 17.268f)
                verticalLineTo(6.732f)
                curveTo(7.402f, 6.387f, 7.0f, 5.74f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
