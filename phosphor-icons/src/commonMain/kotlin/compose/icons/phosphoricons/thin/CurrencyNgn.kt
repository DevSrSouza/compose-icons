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

public val ThinGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                lineTo(196.0f, 140.0f)
                lineTo(196.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(196.0f, 108.0f)
                lineTo(196.0f, 46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(62.0f)
                lineTo(117.5f, 108.0f)
                lineTo(67.2f, 43.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -4.5f, -1.3f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 60.0f, 46.0f)
                verticalLineToRelative(62.0f)
                lineTo(40.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(60.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(60.0f, 148.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 148.0f)
                horizontalLineToRelative(70.5f)
                lineToRelative(50.3f, 64.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 192.0f, 214.0f)
                lineToRelative(1.3f, -0.2f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 196.0f, 210.0f)
                lineTo(196.0f, 148.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(188.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(142.4f, 140.0f)
                lineToRelative(-18.7f, -24.0f)
                close()
                moveTo(68.0f, 57.6f)
                lineTo(107.3f, 108.0f)
                lineTo(68.0f, 108.0f)
                close()
                moveTo(68.0f, 140.0f)
                lineTo(68.0f, 116.0f)
                horizontalLineToRelative(45.6f)
                lineToRelative(18.7f, 24.0f)
                close()
                moveTo(188.0f, 198.4f)
                lineTo(148.7f, 148.0f)
                lineTo(188.0f, 148.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
