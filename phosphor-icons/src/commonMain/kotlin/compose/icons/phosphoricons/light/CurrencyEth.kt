package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.7f, 124.3f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.4f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 7.4f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.4f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 220.7f, 124.3f)
                close()
                moveTo(134.0f, 33.3f)
                lineToRelative(72.6f, 92.4f)
                lineToRelative(-72.6f, 33.0f)
                close()
                moveTo(122.0f, 158.7f)
                lineToRelative(-72.6f, -33.0f)
                lineTo(122.0f, 33.3f)
                close()
                moveTo(122.0f, 171.9f)
                verticalLineToRelative(50.8f)
                lineTo(59.9f, 143.6f)
                close()
                moveTo(134.0f, 171.9f)
                lineTo(196.1f, 143.6f)
                lineTo(134.0f, 222.7f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
