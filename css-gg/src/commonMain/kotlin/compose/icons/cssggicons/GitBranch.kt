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

public val CssGgIcons.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveTo(7.895f, 3.0f, 7.0f, 3.895f, 7.0f, 5.0f)
                curveTo(7.0f, 5.74f, 7.402f, 6.387f, 8.0f, 6.732f)
                verticalLineTo(17.268f)
                curveTo(7.402f, 17.613f, 7.0f, 18.26f, 7.0f, 19.0f)
                curveTo(7.0f, 20.105f, 7.895f, 21.0f, 9.0f, 21.0f)
                curveTo(9.74f, 21.0f, 10.387f, 20.598f, 10.732f, 20.0f)
                horizontalLineTo(11.958f)
                curveTo(14.168f, 20.0f, 15.958f, 18.209f, 15.958f, 16.0f)
                verticalLineTo(14.732f)
                curveTo(16.556f, 14.387f, 16.958f, 13.74f, 16.958f, 13.0f)
                curveTo(16.958f, 11.895f, 16.063f, 11.0f, 14.958f, 11.0f)
                curveTo(13.854f, 11.0f, 12.958f, 11.895f, 12.958f, 13.0f)
                curveTo(12.958f, 13.74f, 13.361f, 14.387f, 13.958f, 14.732f)
                verticalLineTo(16.0f)
                curveTo(13.958f, 17.105f, 13.063f, 18.0f, 11.958f, 18.0f)
                horizontalLineTo(10.732f)
                curveTo(10.557f, 17.696f, 10.304f, 17.443f, 10.0f, 17.268f)
                verticalLineTo(6.732f)
                curveTo(10.598f, 6.387f, 11.0f, 5.74f, 11.0f, 5.0f)
                curveTo(11.0f, 3.895f, 10.105f, 3.0f, 9.0f, 3.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
