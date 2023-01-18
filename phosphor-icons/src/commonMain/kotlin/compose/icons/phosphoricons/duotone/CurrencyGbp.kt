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

public val DuotoneGroup.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) {
            return _currencyGbp!!
        }
        _currencyGbp = Builder(name = "CurrencyGbp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(140.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(84.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 88.8f, -36.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 100.0f, 84.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(100.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, true, -10.1f, 28.0f)
                horizontalLineTo(184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 208.0f)
                close()
            }
        }
        .build()
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
