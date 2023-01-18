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

public val RegularGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                horizontalLineTo(217.9f)
                lineToRelative(21.5f, -53.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.8f, -6.0f)
                lineToRelative(-24.0f, 59.0f)
                horizontalLineTo(159.4f)
                lineToRelative(-24.0f, -59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.8f, 0.0f)
                lineToRelative(-24.0f, 59.0f)
                horizontalLineTo(55.4f)
                lineToRelative(-24.0f, -59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.8f, 6.0f)
                lineToRelative(21.5f, 53.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(44.6f)
                lineToRelative(24.0f, 59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                lineToRelative(24.0f, -59.0f)
                horizontalLineToRelative(41.2f)
                lineToRelative(24.0f, 59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                lineToRelative(24.0f, -59.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(76.0f, 178.7f)
                lineTo(61.9f, 144.0f)
                horizontalLineTo(90.1f)
                close()
                moveTo(113.9f, 128.0f)
                lineTo(128.0f, 93.3f)
                lineTo(142.1f, 128.0f)
                close()
                moveTo(180.0f, 178.7f)
                lineTo(165.9f, 144.0f)
                horizontalLineToRelative(28.2f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
