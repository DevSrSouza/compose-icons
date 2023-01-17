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

public val SimpleIcons.Pix: ImageVector
    get() {
        if (_pix != null) {
            return _pix!!
        }
        _pix = Builder(name = "Pix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.283f, 18.36f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 2.493f, -1.032f)
                lineToRelative(3.6f, -3.6f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, true, 0.946f, 0.0f)
                lineToRelative(3.613f, 3.613f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 2.493f, 1.032f)
                horizontalLineToRelative(0.71f)
                lineToRelative(-4.56f, 4.56f)
                arcToRelative(3.647f, 3.647f, 0.0f, false, true, -5.156f, 0.0f)
                lineTo(4.85f, 18.36f)
                close()
                moveTo(18.428f, 5.627f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -2.493f, 1.032f)
                lineToRelative(-3.613f, 3.614f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, -0.946f, 0.0f)
                lineToRelative(-3.6f, -3.6f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 5.283f, 5.64f)
                horizontalLineToRelative(-0.434f)
                lineToRelative(4.573f, -4.572f)
                arcToRelative(3.646f, 3.646f, 0.0f, false, true, 5.156f, 0.0f)
                lineToRelative(4.559f, 4.559f)
                close()
                moveTo(1.068f, 9.422f)
                lineTo(3.79f, 6.699f)
                horizontalLineToRelative(1.492f)
                arcToRelative(2.483f, 2.483f, 0.0f, false, true, 1.744f, 0.722f)
                lineToRelative(3.6f, 3.6f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 2.443f, 0.0f)
                lineToRelative(3.614f, -3.613f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, true, 1.744f, -0.723f)
                horizontalLineToRelative(1.767f)
                lineToRelative(2.737f, 2.737f)
                arcToRelative(3.646f, 3.646f, 0.0f, false, true, 0.0f, 5.156f)
                lineToRelative(-2.736f, 2.736f)
                horizontalLineToRelative(-1.768f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, true, -1.744f, -0.722f)
                lineToRelative(-3.613f, -3.613f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, -2.444f, 0.0f)
                lineToRelative(-3.6f, 3.6f)
                arcToRelative(2.483f, 2.483f, 0.0f, false, true, -1.744f, 0.722f)
                horizontalLineTo(3.791f)
                lineToRelative(-2.723f, -2.723f)
                arcToRelative(3.646f, 3.646f, 0.0f, false, true, 0.0f, -5.156f)
            }
        }
        .build()
        return _pix!!
    }

private var _pix: ImageVector? = null
