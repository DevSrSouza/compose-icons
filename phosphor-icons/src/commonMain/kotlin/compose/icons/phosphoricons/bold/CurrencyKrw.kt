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

public val BoldGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                horizontalLineTo(223.8f)
                lineToRelative(19.3f, -47.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.2f, -9.0f)
                lineToRelative(-23.0f, 56.5f)
                horizontalLineTo(162.1f)
                lineToRelative(-23.0f, -56.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.2f, 0.0f)
                lineTo(93.9f, 124.0f)
                horizontalLineTo(58.1f)
                lineToRelative(-23.0f, -56.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.2f, 9.0f)
                lineTo(32.2f, 124.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(41.9f)
                lineToRelative(23.0f, 56.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.2f, 0.0f)
                lineToRelative(23.0f, -56.5f)
                horizontalLineToRelative(35.8f)
                lineToRelative(23.0f, 56.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.2f, 0.0f)
                lineToRelative(23.0f, -56.5f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 168.1f)
                lineTo(67.8f, 148.0f)
                horizontalLineTo(84.2f)
                close()
                moveTo(119.8f, 124.0f)
                lineToRelative(8.2f, -20.1f)
                lineToRelative(8.2f, 20.1f)
                close()
                moveTo(180.0f, 168.1f)
                lineTo(171.8f, 148.0f)
                horizontalLineToRelative(16.4f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
