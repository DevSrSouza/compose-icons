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

public val RegularGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                lineTo(200.0f, 136.0f)
                lineTo(200.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(200.0f, 104.0f)
                lineTo(200.0f, 46.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(58.0f)
                lineTo(119.4f, 104.0f)
                lineTo(70.3f, 41.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 46.0f)
                verticalLineToRelative(58.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 120.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 152.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 152.0f)
                horizontalLineToRelative(64.6f)
                lineToRelative(49.1f, 62.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 8.9f, 2.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 200.0f, 210.0f)
                lineTo(200.0f, 152.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 120.0f)
                verticalLineToRelative(16.0f)
                lineTo(144.4f, 136.0f)
                lineToRelative(-12.5f, -16.0f)
                close()
                moveTo(72.0f, 69.3f)
                lineTo(99.1f, 104.0f)
                lineTo(72.0f, 104.0f)
                close()
                moveTo(72.0f, 136.0f)
                lineTo(72.0f, 120.0f)
                horizontalLineToRelative(39.6f)
                lineToRelative(12.5f, 16.0f)
                close()
                moveTo(184.0f, 186.7f)
                lineTo(156.9f, 152.0f)
                lineTo(184.0f, 152.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
