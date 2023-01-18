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

public val LightGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 94.0f, 216.0f)
                close()
                moveTo(184.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 202.0f)
                close()
                moveTo(227.5f, 73.6f)
                lineTo(201.1f, 166.0f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, true, -21.2f, 16.0f)
                lineTo(84.1f, 182.0f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, true, -21.2f, -16.0f)
                lineTo(36.5f, 73.8f)
                verticalLineToRelative(-0.3f)
                lineToRelative(-9.8f, -34.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 24.8f, 38.0f)
                lineTo(8.0f, 38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 26.0f)
                lineTo(24.8f, 26.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 38.3f, 36.2f)
                lineTo(46.8f, 66.0f)
                lineTo(221.7f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.8f, 2.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 227.5f, 73.6f)
                close()
                moveTo(213.8f, 78.0f)
                lineTo(50.2f, 78.0f)
                lineToRelative(24.3f, 84.7f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 9.6f, 7.3f)
                horizontalLineToRelative(95.8f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 9.6f, -7.3f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
