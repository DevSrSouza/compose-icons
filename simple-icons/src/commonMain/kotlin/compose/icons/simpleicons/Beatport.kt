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

public val SimpleIcons.Beatport: ImageVector
    get() {
        if (_beatport != null) {
            return _beatport!!
        }
        _beatport = Builder(name = "Beatport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.68f, 17.97f)
                arcToRelative(9.293f, 9.293f, 0.0f, false, true, -0.888f, -7.527f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.354f, -0.676f)
                lineToRelative(-1.232f, -0.383f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.673f, 0.35f)
                horizontalLineTo(0.531f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, 1.115f, 9.452f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.738f, 0.182f)
                lineToRelative(1.105f, -0.663f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.19f, -0.735f)
                close()
                moveTo(24.0f, 13.22f)
                curveToRelative(0.0f, -1.187f, -0.178f, -2.357f, -0.53f, -3.48f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.001f, -0.003f)
                lineToRelative(-0.001f, -0.004f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.674f, -0.349f)
                lineToRelative(-1.23f, 0.383f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.356f, 0.674f)
                lineToRelative(-0.001f, 0.001f)
                curveToRelative(0.279f, 0.896f, 0.422f, 1.83f, 0.422f, 2.778f)
                arcToRelative(9.25f, 9.25f, 0.0f, false, true, -1.31f, 4.75f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.188f, 0.738f)
                lineToRelative(1.106f, 0.663f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.74f, -0.185f)
                arcTo(11.624f, 11.624f, 0.0f, false, false, 24.0f, 13.22f)
                moveToRelative(-3.29f, 0.042f)
                curveToRelative(0.0f, -4.803f, -3.907f, -8.71f, -8.71f, -8.71f)
                curveToRelative(-4.802f, 0.0f, -8.71f, 3.907f, -8.71f, 8.71f)
                curveToRelative(0.0f, 2.222f, 0.838f, 4.338f, 2.361f, 5.96f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.763f, 0.022f)
                lineToRelative(0.939f, -0.884f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.025f, -0.76f)
                arcToRelative(6.317f, 6.317f, 0.0f, false, true, -1.718f, -4.338f)
                arcTo(6.346f, 6.346f, 0.0f, false, true, 12.0f, 6.922f)
                arcToRelative(6.347f, 6.347f, 0.0f, false, true, 6.34f, 6.34f)
                curveToRelative(0.0f, 1.616f, -0.61f, 3.157f, -1.72f, 4.337f)
                lineToRelative(0.003f, 0.002f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.026f, 0.76f)
                lineToRelative(0.94f, 0.883f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.762f, -0.023f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(8.676f, 8.676f, 0.0f, false, false, 2.36f, -5.96f)
                close()
            }
        }
        .build()
        return _beatport!!
    }

private var _beatport: ImageVector? = null
