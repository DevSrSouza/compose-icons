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

public val SimpleIcons.Wire: ImageVector
    get() {
        if (_wire != null) {
            return _wire!!
        }
        _wire = Builder(name = "Wire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.475f)
                curveToRelative(0.009f, 4.084f, -3.296f, 7.401f, -7.38f, 7.41f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-1.637f, -0.015f, -3.222f, -0.58f, -4.5f, -1.605f)
                curveToRelative(-3.269f, 2.544f, -7.981f, 1.957f, -10.524f, -1.313f)
                curveToRelative(-1.0f, -1.286f, -1.555f, -2.862f, -1.58f, -4.492f)
                lineTo(-0.0f, 2.82f)
                horizontalLineToRelative(1.41f)
                verticalLineToRelative(11.655f)
                curveToRelative(-0.002f, 3.314f, 2.683f, 6.002f, 5.996f, 6.004f)
                curveToRelative(1.293f, 0.001f, 2.552f, -0.416f, 3.589f, -1.189f)
                curveToRelative(-1.163f, -1.335f, -1.806f, -3.043f, -1.815f, -4.814f)
                verticalLineToRelative(-9.54f)
                curveToRelative(0.0f, -1.557f, 1.263f, -2.82f, 2.82f, -2.82f)
                reflectiveCurveToRelative(2.82f, 1.263f, 2.82f, 2.82f)
                verticalLineToRelative(9.54f)
                curveToRelative(0.006f, 1.766f, -0.623f, 3.474f, -1.77f, 4.814f)
                curveToRelative(2.674f, 1.957f, 6.429f, 1.371f, 8.383f, -1.304f)
                curveToRelative(0.745f, -1.019f, 1.149f, -2.248f, 1.157f, -3.511f)
                lineTo(22.59f, 2.82f)
                lineTo(24.0f, 2.82f)
                verticalLineToRelative(11.655f)
                close()
                moveTo(13.41f, 4.935f)
                curveToRelative(0.0f, -0.778f, -0.632f, -1.41f, -1.41f, -1.41f)
                curveToRelative(-0.779f, 0.0f, -1.41f, 0.631f, -1.41f, 1.41f)
                verticalLineToRelative(9.54f)
                curveToRelative(0.002f, 1.41f, 0.501f, 2.776f, 1.41f, 3.855f)
                curveToRelative(0.908f, -1.079f, 1.408f, -2.445f, 1.41f, -3.855f)
                verticalLineToRelative(-9.54f)
                close()
            }
        }
        .build()
        return _wire!!
    }

private var _wire: ImageVector? = null
