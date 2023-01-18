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

public val RemixIcons.PriceTag3Fill: ImageVector
    get() {
        if (_priceTag3Fill != null) {
            return _priceTag3Fill!!
        }
        _priceTag3Fill = Builder(name = "PriceTag3Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.728f, 10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.828f, -2.829f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 2.829f)
                close()
            }
        }
        .build()
        return _priceTag3Fill!!
    }

private var _priceTag3Fill: ImageVector? = null
