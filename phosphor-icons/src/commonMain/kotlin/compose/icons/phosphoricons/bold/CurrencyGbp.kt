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

public val BoldGroup.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) {
            return _currencyGbp!!
        }
        _currencyGbp = Builder(name = "CurrencyGbp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(144.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(84.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 95.6f, -39.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 136.0f, 52.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(104.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, -6.5f, 24.0f)
                horizontalLineTo(184.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 208.0f)
                close()
            }
        }
        .build()
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
