package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.9f, 65.4f)
                lineToRelative(-12.2f, 66.9f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 188.1f, 152.0f)
                horizontalLineTo(72.1f)
                lineToRelative(4.4f, 24.0f)
                horizontalLineTo(184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, 1.4f, -8.0f)
                horizontalLineTo(102.6f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, 1.4f, 8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -42.2f, -15.6f)
                lineTo(34.1f, 32.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(34.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 49.8f, 29.1f)
                lineTo(54.7f, 56.0f)
                horizontalLineTo(216.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 6.1f, 2.9f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 223.9f, 65.4f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
