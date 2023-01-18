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

public val ThinGroup.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) {
            return _currencyGbp!!
        }
        _currencyGbp = Builder(name = "CurrencyGbp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(136.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(84.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, 33.9f, 14.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.6f, 5.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 96.0f, 84.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -16.0f, 32.0f)
                horizontalLineTo(184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 208.0f)
                close()
            }
        }
        .build()
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
