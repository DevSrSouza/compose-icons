package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.3f, 123.1f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.6f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, 9.8f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.6f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 222.3f, 123.1f)
                close()
                moveTo(136.0f, 39.1f)
                lineToRelative(67.4f, 85.8f)
                lineTo(136.0f, 155.6f)
                close()
                moveTo(120.0f, 155.6f)
                lineTo(52.6f, 124.9f)
                lineTo(120.0f, 39.1f)
                close()
                moveTo(120.0f, 173.2f)
                verticalLineToRelative(43.7f)
                lineToRelative(-53.4f, -68.0f)
                close()
                moveTo(136.0f, 173.2f)
                lineTo(189.4f, 148.9f)
                lineTo(136.0f, 216.9f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
