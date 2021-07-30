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
                curveTo(7.0f, 3.8954f, 7.8954f, 3.0f, 9.0f, 3.0f)
                curveTo(10.1046f, 3.0f, 11.0f, 3.8954f, 11.0f, 5.0f)
                curveTo(11.0f, 5.7403f, 10.5978f, 6.3866f, 10.0f, 6.7324f)
                verticalLineTo(14.0396f)
                horizontalLineTo(11.7915f)
                curveTo(12.8961f, 14.0396f, 13.7915f, 13.1441f, 13.7915f, 12.0396f)
                verticalLineTo(10.7838f)
                curveTo(13.1823f, 10.4411f, 12.7708f, 9.7884f, 12.7708f, 9.0395f)
                curveTo(12.7708f, 7.935f, 13.6662f, 7.0395f, 14.7708f, 7.0395f)
                curveTo(15.8753f, 7.0395f, 16.7708f, 7.935f, 16.7708f, 9.0395f)
                curveTo(16.7708f, 9.7712f, 16.3778f, 10.4111f, 15.7915f, 10.7598f)
                verticalLineTo(12.0396f)
                curveTo(15.7915f, 14.2487f, 14.0006f, 16.0396f, 11.7915f, 16.0396f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.2676f)
                curveTo(10.5978f, 17.6134f, 11.0f, 18.2597f, 11.0f, 19.0f)
                curveTo(11.0f, 20.1046f, 10.1046f, 21.0f, 9.0f, 21.0f)
                curveTo(7.8954f, 21.0f, 7.0f, 20.1046f, 7.0f, 19.0f)
                curveTo(7.0f, 18.2597f, 7.4022f, 17.6134f, 8.0f, 17.2676f)
                verticalLineTo(6.7324f)
                curveTo(7.4022f, 6.3866f, 7.0f, 5.7403f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
