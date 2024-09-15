package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.708f, 15.44f)
                curveTo(5.927f, 16.293f, 7.322f, 16.704f, 8.705f, 16.706f)
                curveTo(9.18f, 18.004f, 10.043f, 19.175f, 11.262f, 20.028f)
                curveTo(14.428f, 22.246f, 18.793f, 21.476f, 21.011f, 18.309f)
                curveTo(23.228f, 15.142f, 22.458f, 10.778f, 19.292f, 8.56f)
                curveTo(18.073f, 7.707f, 16.678f, 7.296f, 15.295f, 7.294f)
                curveTo(14.82f, 5.996f, 13.957f, 4.825f, 12.738f, 3.972f)
                curveTo(9.572f, 1.754f, 5.207f, 2.524f, 2.989f, 5.691f)
                curveTo(0.772f, 8.857f, 1.542f, 13.222f, 4.708f, 15.44f)
                close()
                moveTo(5.856f, 13.801f)
                curveTo(6.602f, 14.324f, 7.441f, 14.614f, 8.287f, 14.688f)
                curveTo(8.201f, 13.172f, 8.605f, 11.619f, 9.543f, 10.279f)
                curveTo(10.48f, 8.94f, 11.802f, 8.029f, 13.256f, 7.592f)
                curveTo(12.897f, 6.822f, 12.337f, 6.132f, 11.591f, 5.61f)
                curveTo(9.329f, 4.026f, 6.212f, 4.576f, 4.628f, 6.838f)
                curveTo(3.044f, 9.1f, 3.593f, 12.218f, 5.856f, 13.801f)
                close()
                moveTo(18.145f, 10.198f)
                curveTo(17.398f, 9.676f, 16.559f, 9.386f, 15.713f, 9.313f)
                curveTo(15.799f, 10.828f, 15.395f, 12.381f, 14.457f, 13.721f)
                curveTo(13.519f, 15.06f, 12.198f, 15.971f, 10.744f, 16.408f)
                curveTo(11.103f, 17.178f, 11.663f, 17.868f, 12.409f, 18.39f)
                curveTo(14.671f, 19.974f, 17.788f, 19.424f, 19.372f, 17.162f)
                curveTo(20.956f, 14.9f, 20.406f, 11.782f, 18.145f, 10.198f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
