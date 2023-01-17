package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hetzner: ImageVector
    get() {
        if (_hetzner != null) {
            return _hetzner!!
        }
        _hetzner = Builder(name = "Hetzner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(4.602f, 4.025f)
                horizontalLineToRelative(2.244f)
                curveToRelative(0.509f, 0.0f, 0.716f, 0.215f, 0.716f, 0.717f)
                verticalLineToRelative(5.64f)
                horizontalLineToRelative(8.883f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0.0f, -0.509f, 0.215f, -0.717f, 0.717f, -0.717f)
                horizontalLineToRelative(2.229f)
                curveToRelative(0.5f, 0.0f, 0.71f, 0.23f, 0.724f, 0.717f)
                verticalLineToRelative(14.516f)
                curveToRelative(0.0f, 0.509f, -0.215f, 0.717f, -0.717f, 0.717f)
                horizontalLineToRelative(-2.23f)
                curveToRelative(-0.51f, 0.0f, -0.717f, -0.215f, -0.717f, -0.717f)
                verticalLineToRelative(-5.735f)
                lineTo(7.562f, 13.523f)
                verticalLineToRelative(5.735f)
                curveToRelative(0.0f, 0.516f, -0.215f, 0.717f, -0.716f, 0.717f)
                lineTo(4.602f, 19.975f)
                curveToRelative(-0.51f, 0.0f, -0.717f, -0.208f, -0.717f, -0.717f)
                lineTo(3.885f, 4.742f)
                curveToRelative(0.0f, -0.509f, 0.207f, -0.717f, 0.717f, -0.717f)
                close()
            }
        }
        .build()
        return _hetzner!!
    }

private var _hetzner: ImageVector? = null
