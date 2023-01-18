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

public val FillGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 95.8f)
                verticalLineToRelative(-0.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.1f, -0.5f)
                verticalLineToRelative(-0.3f)
                curveToRelative(-0.1f, -0.2f, -0.1f, -0.4f, -0.2f, -0.6f)
                verticalLineToRelative(-0.2f)
                lineTo(217.4f, 43.6f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 202.0f, 32.0f)
                lineTo(54.0f, 32.0f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 38.6f, 43.6f)
                lineTo(24.3f, 93.8f)
                lineTo(24.3f, 94.0f)
                curveToRelative(-0.1f, 0.2f, -0.1f, 0.4f, -0.2f, 0.6f)
                verticalLineToRelative(0.3f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.1f, 0.5f)
                lineTo(24.0f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, 32.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, -32.0f)
                lineTo(232.0f, 95.8f)
                close()
                moveTo(40.0f, 104.0f)
                lineTo(88.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -35.1f, 21.3f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -1.8f, -1.1f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 40.0f, 112.0f)
                close()
                moveTo(152.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(204.9f, 132.2f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -1.8f, 1.1f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(8.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 204.9f, 132.2f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
