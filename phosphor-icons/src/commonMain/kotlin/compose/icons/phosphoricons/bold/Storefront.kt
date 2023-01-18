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

public val BoldGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 95.7f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.1f, -0.9f)
                verticalLineToRelative(-0.4f)
                curveToRelative(-0.1f, -0.3f, -0.1f, -0.7f, -0.2f, -1.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.1f, -0.2f)
                verticalLineToRelative(-0.3f)
                horizontalLineToRelative(0.0f)
                lineTo(221.2f, 42.5f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 202.0f, 28.0f)
                horizontalLineTo(54.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 34.8f, 42.5f)
                lineTo(20.5f, 92.4f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.3f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.1f, 0.2f)
                curveToRelative(-0.1f, 0.3f, -0.1f, 0.7f, -0.2f, 1.0f)
                verticalLineToRelative(0.4f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.1f, 0.9f)
                verticalLineTo(112.0f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 16.0f, 33.9f)
                verticalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(145.9f)
                arcTo(43.9f, 43.9f, 0.0f, false, false, 236.0f, 112.0f)
                verticalLineTo(95.7f)
                close()
                moveTo(212.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.0f, 16.7f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -1.9f, 1.1f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 192.0f, 132.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(54.9f, 129.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -1.9f, -1.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 112.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(84.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -29.1f, 17.8f)
                close()
                moveTo(108.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                close()
                moveTo(57.1f, 52.0f)
                horizontalLineTo(198.9f)
                lineToRelative(9.2f, 32.0f)
                horizontalLineTo(47.9f)
                close()
                moveTo(196.0f, 204.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(155.8f)
                lineToRelative(4.0f, 0.2f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 32.0f, -13.8f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcTo(43.8f, 43.8f, 0.0f, false, false, 192.0f, 156.0f)
                lineToRelative(4.0f, -0.2f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
