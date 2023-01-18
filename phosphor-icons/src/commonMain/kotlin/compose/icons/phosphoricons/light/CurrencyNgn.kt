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

public val LightGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 138.0f)
                lineTo(198.0f, 138.0f)
                lineTo(198.0f, 118.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(198.0f, 106.0f)
                lineTo(198.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(60.0f)
                lineTo(118.4f, 106.0f)
                lineTo(68.7f, 42.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 58.0f, 46.0f)
                verticalLineToRelative(60.0f)
                lineTo(40.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 118.0f)
                verticalLineToRelative(20.0f)
                lineTo(40.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(58.0f, 150.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 150.0f)
                horizontalLineToRelative(67.6f)
                lineToRelative(49.7f, 63.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 192.0f, 216.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 2.0f, -0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -5.7f)
                lineTo(198.0f, 150.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(186.0f, 118.0f)
                verticalLineToRelative(20.0f)
                lineTo(143.4f, 138.0f)
                lineToRelative(-15.6f, -20.0f)
                close()
                moveTo(70.0f, 63.4f)
                lineTo(103.2f, 106.0f)
                lineTo(70.0f, 106.0f)
                close()
                moveTo(70.0f, 138.0f)
                lineTo(70.0f, 118.0f)
                horizontalLineToRelative(42.6f)
                lineToRelative(15.6f, 20.0f)
                close()
                moveTo(186.0f, 192.6f)
                lineTo(152.8f, 150.0f)
                lineTo(186.0f, 150.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
