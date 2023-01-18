package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PricetagsSharp: ImageVector
    get() {
        if (_pricetagsSharp != null) {
            return _pricetagsSharp!!
        }
        _pricetagsSharp = Builder(name = "PricetagsSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 16.0f)
                lineTo(0.0f, 304.0f)
                lineTo(176.0f, 480.0f)
                lineTo(464.0f, 192.0f)
                lineTo(464.0f, 16.0f)
                close()
                moveTo(368.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 64.0f)
                lineToRelative(0.0f, 144.0f)
                lineToRelative(-263.1f, 263.1f)
                lineToRelative(25.1f, 24.9f)
                lineToRelative(270.0f, -272.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(-32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pricetagsSharp!!
    }

private var _pricetagsSharp: ImageVector? = null
