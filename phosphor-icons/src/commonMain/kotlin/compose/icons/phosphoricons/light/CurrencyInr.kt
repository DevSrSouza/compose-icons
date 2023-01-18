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

public val LightGroup.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) {
            return _currencyInr!!
        }
        _currencyInr = Builder(name = "CurrencyInr", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(165.7f)
                quadToRelative(0.3f, 3.0f, 0.3f, 6.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -58.0f, 58.0f)
                horizontalLineTo(87.5f)
                lineTo(164.0f, 219.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, 10.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.0f, -1.6f)
                lineToRelative(-88.0f, -80.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.6f, -6.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 72.0f, 138.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 46.0f, -46.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, false, -0.4f, -6.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(78.3f)
                arcTo(46.1f, 46.1f, 0.0f, false, false, 108.0f, 46.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(143.3f)
                arcToRelative(58.4f, 58.4f, 0.0f, false, true, 19.8f, 28.0f)
                horizontalLineTo(200.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 80.0f)
                close()
            }
        }
        .build()
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
