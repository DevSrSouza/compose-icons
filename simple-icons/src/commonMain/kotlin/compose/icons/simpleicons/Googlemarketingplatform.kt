package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlemarketingplatform: ImageVector
    get() {
        if (_googlemarketingplatform != null) {
            return _googlemarketingplatform!!
        }
        _googlemarketingplatform = Builder(name = "Googlemarketingplatform", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.926f, 0.0f, 5.852f, 1.17f, 3.511f, 3.511f)
                curveToRelative(-4.37f, 4.371f, -4.66f, 11.299f, -0.869f, 16.01f)
                arcToRelative(3.138f, 3.138f, 0.0f, false, true, 0.719f, -3.314f)
                arcToRelative(3.138f, 3.138f, 0.0f, false, true, 3.672f, -0.56f)
                arcToRelative(6.163f, 6.163f, 0.0f, false, true, 9.324f, -8.004f)
                arcToRelative(2.921f, 2.921f, 0.0f, true, false, 4.132f, -4.132f)
                arcTo(11.968f, 11.968f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(21.36f, 4.481f)
                arcToRelative(3.138f, 3.138f, 0.0f, false, true, -0.72f, 3.313f)
                arcToRelative(3.138f, 3.138f, 0.0f, false, true, -3.672f, 0.56f)
                arcToRelative(6.165f, 6.165f, 0.0f, false, true, -0.61f, 8.003f)
                arcToRelative(2.921f, 2.921f, 0.0f, true, false, 4.131f, 4.132f)
                curveToRelative(4.37f, -4.37f, 4.66f, -11.298f, 0.87f, -16.008f)
                close()
                moveTo(5.576f, 15.501f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -2.922f, 2.922f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, 2.922f, 2.922f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, 2.922f, -2.922f)
                arcTo(2.92f, 2.92f, 0.0f, false, false, 5.577f, 15.5f)
                close()
                moveTo(15.646f, 16.968f)
                arcToRelative(6.168f, 6.168f, 0.0f, false, true, -7.293f, 0.0f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, true, -0.56f, 3.672f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, -3.314f, 0.718f)
                curveToRelative(4.376f, 3.523f, 10.665f, 3.523f, 15.04f, 0.0f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, -3.313f, -0.718f)
                arcToRelative(3.138f, 3.138f, 0.0f, false, true, -0.56f, -3.672f)
                close()
            }
        }
        .build()
        return _googlemarketingplatform!!
    }

private var _googlemarketingplatform: ImageVector? = null
