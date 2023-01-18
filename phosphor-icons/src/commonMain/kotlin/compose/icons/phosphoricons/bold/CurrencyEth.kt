package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.4f, 120.6f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -18.8f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 0.0f, 14.8f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 18.8f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 225.4f, 120.6f)
                close()
                moveTo(140.0f, 50.7f)
                lineToRelative(57.1f, 72.7f)
                lineToRelative(-57.1f, 26.0f)
                close()
                moveTo(116.0f, 149.4f)
                lineTo(58.9f, 123.4f)
                lineTo(116.0f, 50.7f)
                close()
                moveTo(116.0f, 175.7f)
                verticalLineToRelative(29.6f)
                lineToRelative(-36.1f, -46.0f)
                close()
                moveTo(140.0f, 175.7f)
                lineTo(176.1f, 159.3f)
                lineTo(140.0f, 205.3f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
