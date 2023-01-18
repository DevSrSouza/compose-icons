package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RedditLine: ImageVector
    get() {
        if (_redditLine != null) {
            return _redditLine!!
        }
        _redditLine = Builder(name = "RedditLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.102f, 7.815f)
                lineToRelative(0.751f, -3.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.373f, -1.54f)
                lineToRelative(3.196f, 0.68f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.416f, 1.956f)
                lineToRelative(-3.196f, -0.68f)
                lineToRelative(-0.666f, 3.135f)
                curveToRelative(1.784f, 0.137f, 3.557f, 0.73f, 5.163f, 1.7f)
                arcToRelative(3.192f, 3.192f, 0.0f, false, true, 4.741f, 2.673f)
                verticalLineToRelative(0.021f)
                arcToRelative(3.192f, 3.192f, 0.0f, false, true, -1.207f, 2.55f)
                arcToRelative(2.855f, 2.855f, 0.0f, false, true, -0.008f, 0.123f)
                curveToRelative(0.0f, 3.998f, -4.45f, 7.03f, -9.799f, 7.03f)
                curveToRelative(-5.332f, 0.0f, -9.708f, -3.024f, -9.705f, -6.953f)
                arcToRelative(5.31f, 5.31f, 0.0f, false, true, -0.01f, -0.181f)
                arcToRelative(3.192f, 3.192f, 0.0f, false, true, 3.454f, -5.35f)
                arcToRelative(11.446f, 11.446f, 0.0f, false, true, 5.329f, -1.628f)
                close()
                moveTo(20.388f, 13.341f)
                curveToRelative(0.408f, -0.203f, 0.664f, -0.62f, 0.661f, -1.075f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -2.016f, -0.806f)
                lineToRelative(-0.585f, 0.56f)
                lineToRelative(-0.67f, -0.455f)
                curveToRelative(-1.615f, -1.098f, -3.452f, -1.725f, -5.23f, -1.764f)
                horizontalLineToRelative(-1.006f)
                curveToRelative(-1.875f, 0.029f, -3.651f, 0.6f, -5.237f, 1.675f)
                lineToRelative(-0.663f, 0.45f)
                lineToRelative(-0.584f, -0.55f)
                arcToRelative(1.192f, 1.192f, 0.0f, true, false, -1.314f, 1.952f)
                lineToRelative(0.633f, 0.29f)
                lineToRelative(-0.054f, 0.695f)
                curveToRelative(-0.013f, 0.17f, -0.013f, 0.339f, 0.003f, 0.584f)
                curveToRelative(0.0f, 2.71f, 3.356f, 5.03f, 7.708f, 5.03f)
                curveToRelative(4.371f, 0.0f, 7.799f, -2.336f, 7.802f, -5.106f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, false, 0.0f, -0.508f)
                lineToRelative(-0.052f, -0.672f)
                lineToRelative(0.604f, -0.3f)
                close()
                moveTo(7.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(14.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(12.016f, 18.603f)
                curveToRelative(-1.397f, 0.0f, -2.767f, -0.37f, -3.882f, -1.21f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, true, 0.597f, -0.597f)
                curveToRelative(0.945f, 0.693f, 2.123f, 0.99f, 3.269f, 0.99f)
                reflectiveCurveToRelative(2.33f, -0.275f, 3.284f, -0.959f)
                arcToRelative(0.439f, 0.439f, 0.0f, false, true, 0.732f, 0.206f)
                arcToRelative(0.469f, 0.469f, 0.0f, false, true, -0.119f, 0.423f)
                curveToRelative(-0.684f, 0.797f, -2.484f, 1.147f, -3.881f, 1.147f)
                close()
            }
        }
        .build()
        return _redditLine!!
    }

private var _redditLine: ImageVector? = null
