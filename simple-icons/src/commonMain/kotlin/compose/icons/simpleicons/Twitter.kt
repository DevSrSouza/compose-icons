package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.953f, 4.57f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.825f, 0.775f)
                arcToRelative(4.958f, 4.958f, 0.0f, false, false, 2.163f, -2.723f)
                curveToRelative(-0.951f, 0.555f, -2.005f, 0.959f, -3.127f, 1.184f)
                arcToRelative(4.92f, 4.92f, 0.0f, false, false, -8.384f, 4.482f)
                curveTo(7.69f, 8.095f, 4.067f, 6.13f, 1.64f, 3.162f)
                arcToRelative(4.822f, 4.822f, 0.0f, false, false, -0.666f, 2.475f)
                curveToRelative(0.0f, 1.71f, 0.87f, 3.213f, 2.188f, 4.096f)
                arcToRelative(4.904f, 4.904f, 0.0f, false, true, -2.228f, -0.616f)
                verticalLineToRelative(0.06f)
                arcToRelative(4.923f, 4.923f, 0.0f, false, false, 3.946f, 4.827f)
                arcToRelative(4.996f, 4.996f, 0.0f, false, true, -2.212f, 0.085f)
                arcToRelative(4.936f, 4.936f, 0.0f, false, false, 4.604f, 3.417f)
                arcToRelative(9.867f, 9.867f, 0.0f, false, true, -6.102f, 2.105f)
                curveToRelative(-0.39f, 0.0f, -0.779f, -0.023f, -1.17f, -0.067f)
                arcToRelative(13.995f, 13.995f, 0.0f, false, false, 7.557f, 2.209f)
                curveToRelative(9.053f, 0.0f, 13.998f, -7.496f, 13.998f, -13.985f)
                curveToRelative(0.0f, -0.21f, 0.0f, -0.42f, -0.015f, -0.63f)
                arcTo(9.935f, 9.935f, 0.0f, false, false, 24.0f, 4.59f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
