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

public val LightGroup.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) {
            return _currencyDollarSimple!!
        }
        _currencyDollarSimple = Builder(name = "CurrencyDollarSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 168.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -46.0f, 46.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(214.0f)
                horizontalLineTo(104.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -46.0f, -46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, 34.0f, 34.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, -68.0f)
                horizontalLineTo(108.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 0.0f, -92.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(42.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 46.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, -34.0f, -34.0f)
                horizontalLineTo(108.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, 68.0f)
                horizontalLineToRelative(44.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 198.0f, 168.0f)
                close()
            }
        }
        .build()
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
