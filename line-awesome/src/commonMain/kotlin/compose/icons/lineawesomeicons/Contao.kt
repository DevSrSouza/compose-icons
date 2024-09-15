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

public val LineAwesomeIcons.Contao: ImageVector
    get() {
        if (_contao != null) {
            return _contao!!
        }
        _contao = Builder(name = "Contao", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.656f, 5.469f)
                curveTo(4.75f, 5.469f, 4.0f, 6.188f, 4.0f, 7.094f)
                lineTo(4.0f, 24.906f)
                curveTo(4.0f, 25.813f, 4.75f, 26.531f, 5.656f, 26.531f)
                lineTo(9.375f, 26.531f)
                curveTo(7.777f, 24.785f, 7.055f, 22.254f, 7.0f, 22.031f)
                curveTo(6.762f, 21.082f, 5.828f, 16.93f, 5.5f, 14.969f)
                curveTo(5.367f, 14.18f, 5.281f, 13.313f, 5.281f, 12.188f)
                curveTo(5.281f, 8.605f, 7.145f, 6.473f, 8.344f, 5.469f)
                close()
                moveTo(22.156f, 5.469f)
                curveTo(23.77f, 6.918f, 24.656f, 9.406f, 24.656f, 9.406f)
                lineTo(18.25f, 10.75f)
                curveTo(18.25f, 10.75f, 17.305f, 8.625f, 15.125f, 8.625f)
                curveTo(13.938f, 8.625f, 11.781f, 9.457f, 11.781f, 11.594f)
                curveTo(11.781f, 12.977f, 12.266f, 15.867f, 12.906f, 18.625f)
                curveTo(13.684f, 21.965f, 14.527f, 23.719f, 16.688f, 23.719f)
                curveTo(20.242f, 23.719f, 20.219f, 20.188f, 20.219f, 20.188f)
                lineTo(26.656f, 18.75f)
                curveTo(26.656f, 18.75f, 26.656f, 19.395f, 26.656f, 20.313f)
                curveTo(26.656f, 23.422f, 24.633f, 25.852f, 24.0f, 26.531f)
                lineTo(26.344f, 26.531f)
                curveTo(27.25f, 26.531f, 28.0f, 25.813f, 28.0f, 24.906f)
                lineTo(28.0f, 7.094f)
                curveTo(28.0f, 6.188f, 27.25f, 5.469f, 26.344f, 5.469f)
                close()
            }
        }
        .build()
        return _contao!!
    }

private var _contao: ImageVector? = null
