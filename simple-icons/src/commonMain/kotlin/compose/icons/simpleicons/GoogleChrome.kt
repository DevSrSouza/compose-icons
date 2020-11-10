package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GoogleChrome: VectorAsset
    get() {
        if (_googleChrome != null) {
            return _googleChrome!!
        }
        _googleChrome = VectorAssetBuilder(name = "GoogleChrome", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.214f, 8.69f)
                lineToRelative(6.715f, -1.679f)
                arcTo(12.027f, 12.027f, 0.0f, false, true, 24.0f, 11.972f)
                curveTo(24.0f, 18.57f, 18.569f, 24.0f, 11.968f, 24.0f)
                curveToRelative(-0.302f, 0.0f, -0.605f, -0.011f, -0.907f, -0.034f)
                lineToRelative(4.905f, -8.347f)
                curveToRelative(0.356f, -0.376f, 0.655f, -0.803f, 0.881f, -1.271f)
                arcToRelative(5.451f, 5.451f, 0.0f, false, false, -0.043f, -4.748f)
                arcToRelative(5.156f, 5.156f, 0.0f, false, false, -0.59f, -0.91f)
                close()
                moveTo(12.974f, 17.265f)
                lineToRelative(-2.121f, 6.682f)
                curveTo(4.738f, 23.345f, 0.0f, 18.14f, 0.0f, 11.977f)
                curveTo(0.0f, 9.592f, 0.709f, 7.26f, 2.038f, 5.279f)
                lineToRelative(4.834f, 8.377f)
                curveToRelative(0.18f, 0.539f, 1.119f, 2.581f, 3.067f, 3.327f)
                curveToRelative(0.998f, 0.382f, 2.041f, 0.481f, 3.035f, 0.282f)
                close()
                moveTo(11.973f, 7.62f)
                curveToRelative(-2.006f, 0.019f, -3.878f, 1.544f, -4.281f, 3.512f)
                arcToRelative(4.478f, 4.478f, 0.0f, false, false, 1.237f, 4.032f)
                curveToRelative(1.214f, 1.186f, 3.14f, 1.578f, 4.734f, 0.927f)
                curveToRelative(1.408f, -0.576f, 2.47f, -1.927f, 2.691f, -3.431f)
                curveToRelative(0.272f, -1.856f, -0.788f, -3.832f, -2.495f, -4.629f)
                arcToRelative(4.413f, 4.413f, 0.0f, false, false, -1.886f, -0.411f)
                close()
                moveTo(7.046f, 9.962f)
                lineTo(2.259f, 4.963f)
                arcTo(12.043f, 12.043f, 0.0f, false, true, 11.997f, 0.0f)
                curveToRelative(4.56f, 0.0f, 8.744f, 2.592f, 10.774f, 6.675f)
                lineTo(12.558f, 6.675f)
                curveToRelative(-1.811f, -0.125f, -3.288f, 0.52f, -4.265f, 1.453f)
                arcToRelative(5.345f, 5.345f, 0.0f, false, false, -1.247f, 1.834f)
                close()
            }
        }
        .build()
        return _googleChrome!!
    }

private var _googleChrome: VectorAsset? = null
