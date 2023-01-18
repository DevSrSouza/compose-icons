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

public val ThinGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 132.0f)
                horizontalLineTo(211.9f)
                lineToRelative(23.8f, -58.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.4f, -3.0f)
                lineToRelative(-25.0f, 61.5f)
                horizontalLineTo(156.7f)
                lineToRelative(-25.0f, -61.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.4f, 0.0f)
                lineTo(99.3f, 132.0f)
                horizontalLineTo(52.7f)
                lineToRelative(-25.0f, -61.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.4f, 3.0f)
                lineTo(44.1f, 132.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(47.3f)
                lineToRelative(25.0f, 61.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f)
                lineToRelative(25.0f, -61.5f)
                horizontalLineToRelative(46.6f)
                lineToRelative(25.0f, 61.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f)
                lineToRelative(25.0f, -61.5f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(76.0f, 189.4f)
                lineTo(55.9f, 140.0f)
                horizontalLineTo(96.1f)
                close()
                moveTo(107.9f, 132.0f)
                lineTo(128.0f, 82.6f)
                lineTo(148.1f, 132.0f)
                close()
                moveTo(180.0f, 189.4f)
                lineTo(159.9f, 140.0f)
                horizontalLineToRelative(40.2f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
