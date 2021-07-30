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
                moveTo(5.6563f, 5.4688f)
                curveTo(4.75f, 5.4688f, 4.0f, 6.1875f, 4.0f, 7.0938f)
                lineTo(4.0f, 24.9063f)
                curveTo(4.0f, 25.8125f, 4.75f, 26.5313f, 5.6563f, 26.5313f)
                lineTo(9.375f, 26.5313f)
                curveTo(7.7773f, 24.7852f, 7.0547f, 22.2539f, 7.0f, 22.0313f)
                curveTo(6.7617f, 21.082f, 5.8281f, 16.9297f, 5.5f, 14.9688f)
                curveTo(5.3672f, 14.1797f, 5.2813f, 13.3125f, 5.2813f, 12.1875f)
                curveTo(5.2813f, 8.6055f, 7.1445f, 6.4727f, 8.3438f, 5.4688f)
                close()
                moveTo(22.1563f, 5.4688f)
                curveTo(23.7695f, 6.918f, 24.6563f, 9.4063f, 24.6563f, 9.4063f)
                lineTo(18.25f, 10.75f)
                curveTo(18.25f, 10.75f, 17.3047f, 8.625f, 15.125f, 8.625f)
                curveTo(13.9375f, 8.625f, 11.7813f, 9.457f, 11.7813f, 11.5938f)
                curveTo(11.7813f, 12.9766f, 12.2656f, 15.8672f, 12.9063f, 18.625f)
                curveTo(13.6836f, 21.9648f, 14.5273f, 23.7188f, 16.6875f, 23.7188f)
                curveTo(20.2422f, 23.7188f, 20.2188f, 20.1875f, 20.2188f, 20.1875f)
                lineTo(26.6563f, 18.75f)
                curveTo(26.6563f, 18.75f, 26.6563f, 19.3945f, 26.6563f, 20.3125f)
                curveTo(26.6563f, 23.4219f, 24.6328f, 25.8516f, 24.0f, 26.5313f)
                lineTo(26.3438f, 26.5313f)
                curveTo(27.25f, 26.5313f, 28.0f, 25.8125f, 28.0f, 24.9063f)
                lineTo(28.0f, 7.0938f)
                curveTo(28.0f, 6.1875f, 27.25f, 5.4688f, 26.3438f, 5.4688f)
                close()
            }
        }
        .build()
        return _contao!!
    }

private var _contao: ImageVector? = null
