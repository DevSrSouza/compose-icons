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

public val DuotoneGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(221.7f, 72.0f)
                lineToRelative(-26.4f, 92.4f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 179.9f, 176.0f)
                horizontalLineTo(84.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -15.4f, -11.6f)
                lineTo(42.3f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 216.0f)
                close()
                moveTo(184.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 200.0f)
                close()
                moveTo(229.4f, 74.2f)
                lineTo(203.0f, 166.6f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 179.9f, 184.0f)
                lineTo(84.1f, 184.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 61.0f, 166.6f)
                lineTo(34.6f, 74.3f)
                verticalLineToRelative(-0.2f)
                lineTo(24.8f, 40.0f)
                lineTo(8.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 24.0f)
                lineTo(24.8f, 24.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 40.2f, 35.6f)
                lineTo(48.3f, 64.0f)
                lineTo(221.7f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.7f, 10.2f)
                close()
                moveTo(211.1f, 80.0f)
                lineTo(52.9f, 80.0f)
                lineToRelative(23.5f, 82.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.7f, 5.8f)
                horizontalLineToRelative(95.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.7f, -5.8f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
