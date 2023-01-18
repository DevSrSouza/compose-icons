package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PriceTag3Line: ImageVector
    get() {
        if (_priceTag3Line != null) {
            return _priceTag3Line!!
        }
        _priceTag3Line = Builder(name = "PriceTag3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9f, 2.1f)
                lineToRelative(9.899f, 1.415f)
                lineToRelative(1.414f, 9.9f)
                lineToRelative(-9.192f, 9.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-9.9f, -9.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineTo(10.9f, 2.1f)
                close()
                moveTo(11.607f, 4.222f)
                lineTo(3.828f, 12.0f)
                lineToRelative(8.486f, 8.485f)
                lineToRelative(7.778f, -7.778f)
                lineToRelative(-1.06f, -7.425f)
                lineToRelative(-7.425f, -1.06f)
                close()
                moveTo(13.727f, 10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.83f, -2.829f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 2.829f)
                close()
            }
        }
        .build()
        return _priceTag3Line!!
    }

private var _priceTag3Line: ImageVector? = null
