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

public val LineAwesomeIcons.Shopware: ImageVector
    get() {
        if (_shopware != null) {
            return _shopware!!
        }
        _shopware = Builder(name = "Shopware", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.83f, 3.0f, 3.0f, 8.83f, 3.0f, 16.0f)
                curveTo(3.0f, 23.17f, 8.83f, 29.0f, 16.0f, 29.0f)
                curveTo(18.9f, 29.0f, 21.58f, 28.04f, 23.75f, 26.43f)
                curveTo(23.72f, 26.41f, 23.681f, 26.389f, 23.631f, 26.359f)
                curveTo(22.511f, 25.519f, 20.871f, 24.881f, 19.131f, 24.221f)
                curveTo(14.761f, 22.521f, 10.0f, 20.61f, 10.0f, 15.0f)
                curveTo(10.0f, 9.76f, 14.8f, 7.0f, 21.49f, 7.0f)
                curveTo(22.46f, 7.0f, 23.45f, 7.059f, 24.42f, 7.189f)
                curveTo(24.56f, 7.209f, 24.571f, 7.21f, 24.711f, 7.23f)
                curveTo(25.081f, 7.31f, 25.451f, 7.39f, 25.811f, 7.48f)
                curveTo(23.431f, 4.74f, 19.91f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(16.81f, 12.0f, 17.0f, 14.94f, 17.0f, 15.01f)
                curveTo(17.0f, 17.41f, 19.749f, 18.5f, 22.949f, 19.77f)
                curveTo(24.499f, 20.39f, 26.11f, 21.019f, 27.6f, 21.869f)
                curveTo(28.49f, 20.109f, 29.0f, 18.11f, 29.0f, 16.0f)
                curveTo(29.0f, 15.82f, 29.0f, 15.641f, 28.98f, 15.461f)
                curveTo(28.95f, 15.441f, 28.911f, 15.421f, 28.881f, 15.391f)
                curveTo(26.141f, 12.981f, 23.94f, 12.0f, 21.25f, 12.0f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
