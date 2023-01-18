package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) {
            return _currencyInr!!
        }
        _currencyInr = Builder(name = "CurrencyInr", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(167.9f)
                curveToRelative(0.0f, 1.3f, 0.1f, 2.7f, 0.1f, 4.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, 60.0f)
                horizontalLineTo(92.7f)
                lineToRelative(72.7f, 66.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.5f, 11.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 232.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.4f, -2.1f)
                lineToRelative(-88.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 136.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                curveToRelative(0.0f, -1.3f, -0.1f, -2.7f, -0.2f, -4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(75.2f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 108.0f, 48.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(148.7f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, true, 15.9f, 24.0f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 80.0f)
                close()
            }
        }
        .build()
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
