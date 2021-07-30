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

public val LineAwesomeIcons.Atlassian: ImageVector
    get() {
        if (_atlassian != null) {
            return _atlassian!!
        }
        _atlassian = Builder(name = "Atlassian", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9316f, 4.0f)
                curveTo(15.7176f, 4.0f, 15.4975f, 4.1193f, 15.3535f, 4.3633f)
                curveTo(10.1265f, 12.9783f, 14.9817f, 20.024f, 18.1777f, 26.627f)
                curveTo(18.2887f, 26.848f, 18.5117f, 27.0f, 18.7617f, 27.0f)
                lineTo(26.3516f, 27.0f)
                curveTo(26.8346f, 27.0f, 27.1507f, 26.4725f, 26.9277f, 26.0215f)
                curveTo(26.9277f, 26.0215f, 16.7197f, 4.8805f, 16.4688f, 4.3535f)
                curveTo(16.3528f, 4.1195f, 16.1446f, 4.0f, 15.9316f, 4.0f)
                close()
                moveTo(15.8828f, 7.7441f)
                curveTo(18.0028f, 12.1381f, 22.3119f, 21.064f, 24.2129f, 25.0f)
                lineTo(19.6074f, 25.0f)
                curveTo(19.3174f, 24.419f, 19.0188f, 23.835f, 18.7168f, 23.248f)
                curveTo(16.1188f, 18.188f, 13.6478f, 13.3761f, 15.8828f, 7.7441f)
                close()
                moveTo(10.3164f, 14.0f)
                curveTo(10.0894f, 14.0f, 9.874f, 14.1257f, 9.748f, 14.3887f)
                lineTo(4.0703f, 26.0039f)
                curveTo(3.8493f, 26.4679f, 4.1867f, 27.0f, 4.6777f, 27.0f)
                lineTo(12.5762f, 27.0f)
                lineTo(12.5996f, 27.0f)
                curveTo(12.8496f, 27.0f, 13.0708f, 26.8442f, 13.1738f, 26.6152f)
                curveTo(14.8868f, 23.0132f, 13.8572f, 17.5377f, 10.8652f, 14.2617f)
                curveTo(10.7062f, 14.0897f, 10.5074f, 14.0f, 10.3164f, 14.0f)
                close()
                moveTo(10.5703f, 17.2598f)
                curveTo(11.9083f, 19.6338f, 12.3682f, 22.695f, 11.6563f, 25.0f)
                lineTo(6.7871f, 25.0f)
                lineTo(10.5703f, 17.2598f)
                close()
            }
        }
        .build()
        return _atlassian!!
    }

private var _atlassian: ImageVector? = null
