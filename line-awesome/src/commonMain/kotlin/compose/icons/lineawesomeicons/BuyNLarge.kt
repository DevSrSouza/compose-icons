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

public val LineAwesomeIcons.BuyNLarge: ImageVector
    get() {
        if (_buyNLarge != null) {
            return _buyNLarge!!
        }
        _buyNLarge = Builder(name = "BuyNLarge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.2109f)
                curveTo(7.72f, 4.2109f, 1.0f, 9.49f, 1.0f, 16.0f)
                curveTo(1.0f, 22.51f, 7.72f, 27.7891f, 16.0f, 27.7891f)
                curveTo(24.28f, 27.7891f, 31.0f, 22.51f, 31.0f, 16.0f)
                curveTo(31.0f, 9.49f, 24.28f, 4.2109f, 16.0f, 4.2109f)
                close()
                moveTo(8.8398f, 8.0f)
                lineTo(15.3496f, 8.0f)
                curveTo(18.4996f, 8.0f, 19.5902f, 9.4798f, 19.2402f, 11.7598f)
                curveTo(19.2302f, 11.8398f, 19.1806f, 12.0197f, 19.1406f, 12.1797f)
                curveTo(18.7906f, 12.0697f, 18.4193f, 12.0f, 18.0293f, 12.0f)
                curveTo(15.8193f, 12.0f, 14.0293f, 13.79f, 14.0293f, 16.0f)
                curveTo(14.0293f, 18.03f, 15.5498f, 19.6892f, 17.5098f, 19.9492f)
                curveTo(17.4998f, 19.9492f, 17.5f, 19.9607f, 17.5f, 19.9707f)
                curveTo(16.56f, 21.7607f, 14.7f, 22.97f, 11.75f, 23.0f)
                curveTo(11.75f, 23.0f, 5.01f, 23.01f, 5.0f, 23.0f)
                lineTo(8.8398f, 8.0f)
                close()
                moveTo(21.3496f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(23.2109f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(27.0f, 23.0f)
                lineTo(17.6094f, 23.0f)
                lineTo(18.3594f, 19.9707f)
                curveTo(20.4194f, 19.8007f, 22.0293f, 18.1f, 22.0293f, 16.0f)
                curveTo(22.0293f, 14.59f, 21.2995f, 13.3506f, 20.1895f, 12.6406f)
                lineTo(21.3496f, 8.0f)
                close()
                moveTo(11.9902f, 11.0f)
                lineTo(11.3398f, 13.7598f)
                lineTo(12.5293f, 13.7598f)
                curveTo(13.5393f, 13.7598f, 14.5109f, 12.9703f, 14.7109f, 12.0703f)
                curveTo(14.9309f, 11.0803f, 14.2397f, 11.0f, 13.1797f, 11.0f)
                lineTo(11.9902f, 11.0f)
                close()
                moveTo(16.4297f, 13.4199f)
                lineTo(18.0703f, 13.4199f)
                lineTo(18.8496f, 15.4102f)
                lineTo(19.3496f, 13.4199f)
                lineTo(21.0293f, 13.4199f)
                lineTo(19.8691f, 18.3203f)
                lineTo(18.0098f, 18.3203f)
                lineTo(17.4297f, 16.3809f)
                lineTo(17.0195f, 18.3203f)
                lineTo(15.0293f, 18.3203f)
                lineTo(16.4297f, 13.4199f)
                close()
                moveTo(10.6094f, 16.7402f)
                lineTo(9.8398f, 20.0f)
                lineTo(11.2207f, 20.0f)
                curveTo(12.1207f, 20.0f, 13.0098f, 19.8209f, 13.3398f, 18.4609f)
                curveTo(13.6498f, 17.1709f, 12.8902f, 16.7402f, 11.9902f, 16.7402f)
                lineTo(10.6094f, 16.7402f)
                close()
            }
        }
        .build()
        return _buyNLarge!!
    }

private var _buyNLarge: ImageVector? = null
