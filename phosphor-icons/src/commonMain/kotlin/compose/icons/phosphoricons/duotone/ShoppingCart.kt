package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 64.0f)
                lineToRelative(-12.2f, 66.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 188.1f, 144.0f)
                horizontalLineTo(62.5f)
                lineTo(48.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.7f, 132.3f)
                lineToRelative(12.2f, -66.9f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -1.8f, -6.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 216.0f, 56.0f)
                lineTo(54.7f, 56.0f)
                lineTo(49.8f, 29.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 34.1f, 16.0f)
                lineTo(16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(34.1f, 32.0f)
                lineTo(61.5f, 183.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 43.8f, 9.0f)
                horizontalLineToRelative(53.4f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 184.0f, 176.0f)
                lineTo(76.5f, 176.0f)
                lineToRelative(-4.4f, -24.0f)
                horizontalLineToRelative(116.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 211.7f, 132.3f)
                close()
                moveTo(92.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 204.0f)
                close()
                moveTo(196.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 204.0f)
                close()
                moveTo(57.6f, 72.0f)
                lineTo(206.4f, 72.0f)
                lineTo(196.0f, 129.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, 6.6f)
                lineTo(69.2f, 136.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
