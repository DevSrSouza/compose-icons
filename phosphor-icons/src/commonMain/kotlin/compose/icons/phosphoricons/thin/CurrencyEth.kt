package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) {
            return _currencyEth!!
        }
        _currencyEth = Builder(name = "CurrencyEth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.1f, 125.5f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.2f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.0f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.2f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 219.1f, 125.5f)
                close()
                moveTo(132.0f, 27.6f)
                lineToRelative(77.7f, 98.9f)
                lineTo(132.0f, 161.8f)
                close()
                moveTo(124.0f, 161.8f)
                lineTo(46.3f, 126.5f)
                lineTo(124.0f, 27.6f)
                close()
                moveTo(124.0f, 170.6f)
                verticalLineToRelative(57.8f)
                lineToRelative(-70.7f, -90.0f)
                close()
                moveTo(132.0f, 170.6f)
                lineTo(202.7f, 138.4f)
                lineTo(132.0f, 228.4f)
                close()
            }
        }
        .build()
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
