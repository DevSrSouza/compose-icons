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

public val RemixIcons.TwitterFill: ImageVector
    get() {
        if (_twitterFill != null) {
            return _twitterFill!!
        }
        _twitterFill = Builder(name = "TwitterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.162f, 5.656f)
                arcToRelative(8.384f, 8.384f, 0.0f, false, true, -2.402f, 0.658f)
                arcTo(4.196f, 4.196f, 0.0f, false, false, 21.6f, 4.0f)
                curveToRelative(-0.82f, 0.488f, -1.719f, 0.83f, -2.656f, 1.015f)
                arcToRelative(4.182f, 4.182f, 0.0f, false, false, -7.126f, 3.814f)
                arcToRelative(11.874f, 11.874f, 0.0f, false, true, -8.62f, -4.37f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, false, -0.566f, 2.103f)
                curveToRelative(0.0f, 1.45f, 0.738f, 2.731f, 1.86f, 3.481f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, true, -1.894f, -0.523f)
                verticalLineToRelative(0.052f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 3.355f, 4.101f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, true, -1.89f, 0.072f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 7.97f, 16.65f)
                arcToRelative(8.394f, 8.394f, 0.0f, false, true, -6.191f, 1.732f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, 6.41f, 1.88f)
                curveToRelative(7.693f, 0.0f, 11.9f, -6.373f, 11.9f, -11.9f)
                curveToRelative(0.0f, -0.18f, -0.005f, -0.362f, -0.013f, -0.54f)
                arcToRelative(8.496f, 8.496f, 0.0f, false, false, 2.087f, -2.165f)
                close()
            }
        }
        .build()
        return _twitterFill!!
    }

private var _twitterFill: ImageVector? = null
