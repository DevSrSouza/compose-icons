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

public val ThinGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 95.9f)
                verticalLineToRelative(-0.3f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.1f, -0.6f)
                horizontalLineToRelative(-0.1f)
                lineTo(213.5f, 44.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 202.0f, 36.0f)
                lineTo(54.0f, 36.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -11.5f, 8.7f)
                lineTo(28.2f, 94.9f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.1f, 0.6f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 16.0f, 29.9f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 141.9f)
                arcTo(35.9f, 35.9f, 0.0f, false, false, 228.0f, 112.0f)
                lineTo(228.0f, 96.0f)
                close()
                moveTo(50.2f, 46.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 54.0f, 44.0f)
                lineTo(202.0f, 44.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.8f, 2.9f)
                lineTo(218.7f, 92.0f)
                lineTo(37.3f, 92.0f)
                close()
                moveTo(100.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(36.0f, 112.0f)
                lineTo(36.0f, 100.0f)
                lineTo(92.0f, 100.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, true, -13.4f, -3.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.3f, -0.8f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 36.0f, 112.0f)
                close()
                moveTo(204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 145.9f)
                arcTo(34.4f, 34.4f, 0.0f, false, false, 64.0f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 32.0f, -19.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 192.0f, 148.0f)
                arcToRelative(34.4f, 34.4f, 0.0f, false, false, 12.0f, -2.1f)
                close()
                moveTo(206.7f, 135.8f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.3f, 0.8f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 192.0f, 140.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(12.0f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 206.7f, 135.8f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
