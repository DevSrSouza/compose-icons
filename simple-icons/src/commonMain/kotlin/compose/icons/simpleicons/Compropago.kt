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

public val SimpleIcons.Compropago: ImageVector
    get() {
        if (_compropago != null) {
            return _compropago!!
        }
        _compropago = Builder(name = "Compropago", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.104f, 3.07f)
                arcToRelative(5.896f, 5.896f, 0.0f, false, false, -4.183f, 1.738f)
                lineToRelative(-9.247f, 9.247f)
                curveToRelative(-0.587f, 0.587f, -0.587f, 1.526f, 0.0f, 2.084f)
                curveToRelative(0.588f, 0.587f, 1.527f, 0.587f, 2.084f, 0.0f)
                lineToRelative(0.089f, -0.088f)
                lineToRelative(0.822f, -0.822f)
                lineToRelative(6.956f, -6.957f)
                lineToRelative(1.35f, -1.35f)
                lineToRelative(0.089f, -0.088f)
                arcToRelative(2.905f, 2.905f, 0.0f, false, true, 2.084f, -0.852f)
                arcToRelative(2.905f, 2.905f, 0.0f, false, true, 2.935f, 2.936f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, -0.851f, 2.084f)
                lineToRelative(-8.894f, 8.923f)
                curveToRelative(1.145f, 1.145f, 2.994f, 1.145f, 4.168f, 0.03f)
                lineToRelative(6.751f, -6.752f)
                curveToRelative(2.32f, -2.348f, 2.319f, -6.076f, 0.03f, -8.395f)
                arcToRelative(5.896f, 5.896f, 0.0f, false, false, -4.183f, -1.739f)
                close()
                moveTo(10.615f, 3.212f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, false, -2.095f, 0.833f)
                lineToRelative(-6.78f, 6.78f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.366f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.365f, 0.0f)
                lineToRelative(9.246f, -9.246f)
                curveToRelative(0.587f, -0.587f, 0.587f, -1.526f, 0.0f, -2.084f)
                curveToRelative(-0.587f, -0.587f, -1.526f, -0.587f, -2.084f, 0.0f)
                lineToRelative(-0.088f, 0.088f)
                lineToRelative(-0.822f, 0.822f)
                lineToRelative(-6.986f, 6.957f)
                lineToRelative(-1.438f, 1.438f)
                arcToRelative(2.905f, 2.905f, 0.0f, false, true, -2.084f, 0.851f)
                arcToRelative(2.905f, 2.905f, 0.0f, false, true, -2.936f, -2.935f)
                curveToRelative(0.0f, -0.793f, 0.294f, -1.526f, 0.852f, -2.084f)
                lineToRelative(8.923f, -8.924f)
                arcToRelative(2.939f, 2.939f, 0.0f, false, false, -2.073f, -0.862f)
                close()
            }
        }
        .build()
        return _compropago!!
    }

private var _compropago: ImageVector? = null
