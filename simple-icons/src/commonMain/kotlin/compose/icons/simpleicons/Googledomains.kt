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

public val SimpleIcons.Googledomains: ImageVector
    get() {
        if (_googledomains != null) {
            return _googledomains!!
        }
        _googledomains = Builder(name = "Googledomains", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.29f, 0.817f)
                curveToRelative(-0.811f, 0.0f, -1.388f, 0.469f, -1.713f, 1.208f)
                lineTo(13.491f, 7.01f)
                curveToRelative(-3.121f, -3.072f, -8.145f, -3.015f, -11.207f, 0.102f)
                curveToRelative(-3.066f, 3.12f, -3.048f, 8.134f, 0.072f, 11.218f)
                arcToRelative(7.991f, 7.991f, 0.0f, false, false, 5.467f, 2.29f)
                lineToRelative(-0.597f, 1.444f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -0.054f, 0.325f)
                curveToRelative(0.0f, 0.45f, 0.379f, 0.811f, 0.83f, 0.793f)
                horizontalLineToRelative(5.717f)
                curveToRelative(0.794f, 0.0f, 1.515f, -0.468f, 1.84f, -1.208f)
                lineToRelative(8.369f, -20.003f)
                arcTo(0.708f, 0.708f, 0.0f, false, false, 24.0f, 1.647f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, false, -0.83f, -0.83f)
                close()
                moveTo(13.503f, 7.022f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 2.399f, 5.609f)
                curveToRelative(0.018f, 4.365f, -3.5f, 7.936f, -7.864f, 7.972f)
                horizontalLineToRelative(-0.199f)
                close()
            }
        }
        .build()
        return _googledomains!!
    }

private var _googledomains: ImageVector? = null
