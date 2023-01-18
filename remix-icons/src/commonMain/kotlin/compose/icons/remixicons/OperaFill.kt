package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.OperaFill: ImageVector
    get() {
        if (_operaFill != null) {
            return _operaFill!!
        }
        _operaFill = Builder(name = "OperaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.71f, 6.365f)
                curveToRelative(-1.108f, 1.305f, -1.823f, 3.236f, -1.873f, 5.4f)
                verticalLineToRelative(0.47f)
                curveToRelative(0.051f, 2.165f, 0.766f, 4.093f, 1.872f, 5.4f)
                curveToRelative(1.434f, 1.862f, 3.566f, 3.044f, 5.95f, 3.044f)
                arcToRelative(7.208f, 7.208f, 0.0f, false, false, 4.005f, -1.226f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, true, -7.139f, 2.535f)
                arcTo(9.998f, 9.998f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.476f, 6.478f, 2.0f, 12.0f, 2.0f)
                horizontalLineToRelative(0.037f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, true, 6.628f, 2.546f)
                arcToRelative(7.239f, 7.239f, 0.0f, false, false, -4.008f, -1.226f)
                curveToRelative(-2.382f, 0.0f, -4.514f, 1.183f, -5.95f, 3.045f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(9.969f, 9.969f, 0.0f, false, true, -3.335f, 7.454f)
                curveToRelative(-2.565f, 1.25f, -4.955f, 0.376f, -5.747f, -0.17f)
                curveToRelative(2.52f, -0.554f, 4.423f, -3.6f, 4.423f, -7.284f)
                curveToRelative(0.0f, -3.685f, -1.903f, -6.73f, -4.423f, -7.283f)
                curveToRelative(0.791f, -0.545f, 3.182f, -1.42f, 5.747f, -0.171f)
                arcTo(9.967f, 9.967f, 0.0f, false, true, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _operaFill!!
    }

private var _operaFill: ImageVector? = null
