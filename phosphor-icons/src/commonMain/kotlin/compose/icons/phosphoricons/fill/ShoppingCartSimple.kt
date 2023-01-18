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

public val FillGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 216.0f)
                close()
                moveTo(80.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 200.0f)
                close()
                moveTo(228.1f, 67.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.4f, -3.2f)
                horizontalLineTo(48.3f)
                lineTo(40.2f, 35.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 24.8f, 24.0f)
                horizontalLineTo(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 40.0f)
                horizontalLineTo(24.8f)
                lineToRelative(9.8f, 34.1f)
                verticalLineToRelative(0.2f)
                lineTo(61.0f, 166.6f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 84.1f, 184.0f)
                horizontalLineToRelative(95.8f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 203.0f, 166.6f)
                lineToRelative(26.4f, -92.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.1f, 67.2f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
