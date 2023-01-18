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

public val BoldGroup.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) {
            return _currencyDollarSimple!!
        }
        _currencyDollarSimple = Builder(name = "CurrencyDollarSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 168.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                horizontalLineTo(140.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(220.0f)
                horizontalLineTo(104.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                horizontalLineTo(108.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -104.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                horizontalLineTo(108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 56.0f)
                horizontalLineToRelative(44.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 204.0f, 168.0f)
                close()
            }
        }
        .build()
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
