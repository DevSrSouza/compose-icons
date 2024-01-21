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

public val SimpleIcons.Paddle: ImageVector
    get() {
        if (_paddle != null) {
            return _paddle!!
        }
        _paddle = Builder(name = "Paddle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.363f, 7.904f)
                verticalLineToRelative(0.849f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, 3.65f, 2.425f)
                curveToRelative(0.198f, 0.476f, 0.3f, 0.987f, 0.299f, 1.502f)
                horizontalLineToRelative(0.791f)
                curveToRelative(0.0f, -1.04f, 0.416f, -2.037f, 1.157f, -2.772f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, true, 2.792f, -1.149f)
                verticalLineTo(7.91f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, true, -3.65f, -2.425f)
                arcToRelative(3.893f, 3.893f, 0.0f, false, true, -0.299f, -1.502f)
                horizontalLineToRelative(-0.791f)
                curveToRelative(0.0f, 1.04f, -0.416f, 2.037f, -1.157f, 2.772f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, true, -2.792f, 1.149f)
                moveTo(13.105f, 2.51f)
                horizontalLineTo(6.312f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(6.793f)
                curveToRelative(4.772f, 0.0f, 8.532f, 3.735f, 8.532f, 8.314f)
                curveToRelative(0.0f, 4.58f, -3.76f, 8.314f, -8.532f, 8.314f)
                horizontalLineTo(9.156f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.312f)
                verticalLineToRelative(-9.882f)
                horizontalLineToRelative(6.793f)
                curveToRelative(3.319f, 0.0f, 5.688f, -2.352f, 5.688f, -5.804f)
                curveToRelative(0.0f, -3.451f, -2.37f, -5.804f, -5.688f, -5.804f)
            }
        }
        .build()
        return _paddle!!
    }

private var _paddle: ImageVector? = null
