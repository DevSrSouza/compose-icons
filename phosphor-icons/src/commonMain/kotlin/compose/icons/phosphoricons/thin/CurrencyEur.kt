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

public val ThinGroup.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) {
            return _currencyEur!!
        }
        _currencyEur = Builder(name = "CurrencyEur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.7f, 192.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcTo(75.2f, 75.2f, 0.0f, false, true, 136.0f, 220.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -75.9f, -72.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(60.1f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 136.0f, 36.0f)
                arcToRelative(75.2f, 75.2f, 0.0f, false, true, 53.7f, 22.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 5.6f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 68.1f, 108.0f)
                horizontalLineTo(136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(68.1f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 116.0f, 44.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 189.7f, 192.1f)
                close()
            }
        }
        .build()
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
