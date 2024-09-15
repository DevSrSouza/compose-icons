package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Mastodon: ImageVector
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = Builder(name = "Mastodon", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.938f, 4.031f)
                curveTo(12.917f, 4.043f, 9.918f, 4.427f, 8.357f, 5.146f)
                curveTo(8.357f, 5.146f, 5.0f, 6.675f, 5.0f, 11.881f)
                curveTo(5.0f, 18.078f, 4.996f, 25.86f, 10.563f, 27.365f)
                curveTo(12.694f, 27.938f, 14.528f, 28.062f, 16.002f, 27.977f)
                curveTo(18.677f, 27.826f, 20.0f, 27.006f, 20.0f, 27.006f)
                lineTo(19.91f, 25.029f)
                curveTo(19.91f, 25.029f, 18.176f, 25.64f, 16.029f, 25.57f)
                curveTo(13.902f, 25.495f, 11.661f, 25.336f, 11.313f, 22.68f)
                curveTo(11.281f, 22.433f, 11.265f, 22.183f, 11.266f, 21.934f)
                curveTo(15.773f, 23.053f, 19.616f, 22.421f, 20.674f, 22.293f)
                curveTo(23.628f, 21.934f, 26.199f, 20.082f, 26.527f, 18.389f)
                curveTo(27.041f, 15.721f, 26.998f, 11.881f, 26.998f, 11.881f)
                curveTo(26.998f, 6.675f, 23.646f, 5.146f, 23.646f, 5.146f)
                curveTo(22.001f, 4.378f, 18.958f, 4.019f, 15.938f, 4.031f)
                close()
                moveTo(12.705f, 8.002f)
                curveTo(13.74f, 8.03f, 14.763f, 8.493f, 15.393f, 9.471f)
                lineTo(16.002f, 10.506f)
                lineTo(16.609f, 9.471f)
                curveTo(17.874f, 7.504f, 20.71f, 7.626f, 22.059f, 9.148f)
                curveTo(23.303f, 10.596f, 23.025f, 11.531f, 23.025f, 18.0f)
                lineTo(23.025f, 18.002f)
                lineTo(20.578f, 18.002f)
                lineTo(20.578f, 12.373f)
                curveTo(20.578f, 9.738f, 17.219f, 9.636f, 17.219f, 12.738f)
                lineTo(17.219f, 16.0f)
                lineTo(14.787f, 16.0f)
                lineTo(14.787f, 12.738f)
                curveTo(14.787f, 9.636f, 11.43f, 9.736f, 11.43f, 12.371f)
                lineTo(11.43f, 18.0f)
                lineTo(8.977f, 18.0f)
                curveTo(8.977f, 11.526f, 8.704f, 10.585f, 9.943f, 9.148f)
                curveTo(10.623f, 8.382f, 11.67f, 7.974f, 12.705f, 8.002f)
                close()
            }
        }
        .build()
        return _mastodon!!
    }

private var _mastodon: ImageVector? = null
