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

public val LightGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 130.0f)
                horizontalLineTo(214.9f)
                lineToRelative(22.7f, -55.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, true, false, -11.2f, -4.6f)
                lineTo(202.0f, 130.0f)
                horizontalLineTo(158.0f)
                lineTo(133.6f, 69.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -11.2f, 0.0f)
                lineTo(98.0f, 130.0f)
                horizontalLineTo(54.0f)
                lineTo(29.6f, 69.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -7.9f, -3.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -3.3f, 7.9f)
                lineTo(41.1f, 130.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(46.0f)
                lineToRelative(24.4f, 60.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 11.2f, 0.0f)
                lineTo(106.0f, 142.0f)
                horizontalLineToRelative(44.0f)
                lineToRelative(24.4f, 60.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 11.2f, 0.0f)
                lineTo(210.0f, 142.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(76.0f, 184.1f)
                lineTo(58.9f, 142.0f)
                horizontalLineTo(93.1f)
                close()
                moveTo(110.9f, 130.0f)
                lineTo(128.0f, 87.9f)
                lineTo(145.1f, 130.0f)
                close()
                moveTo(180.0f, 184.1f)
                lineTo(162.9f, 142.0f)
                horizontalLineToRelative(34.2f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
