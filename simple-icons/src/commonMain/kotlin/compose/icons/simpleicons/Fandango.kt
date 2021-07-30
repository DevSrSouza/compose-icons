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

public val SimpleIcons.Fandango: ImageVector
    get() {
        if (_fandango != null) {
            return _fandango!!
        }
        _fandango = Builder(name = "Fandango", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.664f, 6.956f)
                lineTo(8.05f, 8.496f)
                lineTo(9.19f, 12.72f)
                lineToRelative(5.615f, -1.54f)
                lineTo(15.95f, 15.4f)
                lineToRelative(-5.615f, 1.49f)
                lineToRelative(1.093f, 4.224f)
                lineToRelative(-5.615f, 1.49f)
                lineTo(4.42f, 17.54f)
                curveToRelative(0.846f, -0.995f, 1.194f, -2.386f, 0.846f, -3.728f)
                curveToRelative(-0.398f, -1.342f, -1.392f, -2.385f, -2.584f, -2.832f)
                lineTo(1.29f, 5.763f)
                lineTo(12.57f, 2.78f)
                close()
                moveTo(20.77f, 6.758f)
                lineTo(18.932f, 0.05f)
                lineTo(0.0f, 5.068f)
                lineToRelative(1.838f, 6.758f)
                curveToRelative(1.093f, 0.2f, 2.087f, 1.043f, 2.385f, 2.236f)
                curveToRelative(0.348f, 1.193f, -0.1f, 2.385f, -0.944f, 3.18f)
                lineToRelative(1.788f, 6.708f)
                lineTo(24.0f, 18.882f)
                lineToRelative(-1.79f, -6.708f)
                curveToRelative(-1.142f, -0.2f, -2.086f, -1.043f, -2.434f, -2.236f)
                curveToRelative(-0.298f, -1.193f, 0.1f, -2.435f, 0.994f, -3.18f)
                close()
            }
        }
        .build()
        return _fandango!!
    }

private var _fandango: ImageVector? = null
