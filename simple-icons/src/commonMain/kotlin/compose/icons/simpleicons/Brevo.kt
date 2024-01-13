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

public val SimpleIcons.Brevo: ImageVector
    get() {
        if (_brevo != null) {
            return _brevo!!
        }
        _brevo = Builder(name = "Brevo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(7.2f, 4.8f)
                horizontalLineToRelative(5.747f)
                curveToRelative(2.34f, 0.0f, 3.895f, 1.406f, 3.895f, 3.516f)
                curveToRelative(0.0f, 1.022f, -0.348f, 1.862f, -1.09f, 2.588f)
                curveTo(17.189f, 11.812f, 18.0f, 13.22f, 18.0f, 14.785f)
                curveToRelative(0.0f, 2.86f, -2.64f, 5.016f, -6.164f, 5.016f)
                lineTo(7.199f, 19.801f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(9.285f, 6.752f)
                verticalLineToRelative(5.537f)
                horizontalLineToRelative(0.07f)
                curveToRelative(0.233f, -0.432f, 0.858f, -0.796f, 2.249f, -1.226f)
                curveToRelative(2.039f, -0.659f, 3.037f, -1.52f, 3.037f, -2.655f)
                curveToRelative(0.0f, -0.998f, -0.766f, -1.656f, -1.924f, -1.656f)
                lineTo(9.285f, 6.752f)
                close()
                moveTo(14.155f, 12.018f)
                curveToRelative(-0.766f, 0.385f, -1.67f, 0.748f, -2.76f, 1.11f)
                curveToRelative(-1.229f, 0.387f, -2.11f, 1.386f, -2.11f, 2.407f)
                verticalLineToRelative(2.315f)
                horizontalLineToRelative(2.365f)
                curveToRelative(2.387f, 0.0f, 4.149f, -1.34f, 4.149f, -3.155f)
                curveToRelative(0.0f, -1.067f, -0.625f, -2.087f, -1.645f, -2.677f)
                close()
            }
        }
        .build()
        return _brevo!!
    }

private var _brevo: ImageVector? = null
