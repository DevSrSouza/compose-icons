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

public val BoldGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 116.0f)
                lineTo(204.0f, 116.0f)
                lineTo(204.0f, 46.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(70.0f)
                lineTo(133.9f, 116.0f)
                lineTo(73.5f, 38.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 52.0f, 46.0f)
                verticalLineToRelative(70.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(70.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(76.0f, 140.0f)
                horizontalLineToRelative(46.1f)
                lineToRelative(60.4f, 77.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 192.0f, 222.0f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, 3.9f, -0.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 210.0f)
                lineTo(204.0f, 140.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 116.0f)
                lineTo(76.0f, 80.9f)
                lineTo(103.4f, 116.0f)
                close()
                moveTo(180.0f, 175.1f)
                lineTo(152.6f, 140.0f)
                lineTo(180.0f, 140.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
