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

public val SimpleIcons.Afterpay: ImageVector
    get() {
        if (_afterpay != null) {
            return _afterpay!!
        }
        _afterpay = Builder(name = "Afterpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(13.236f, 4.924f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, true, 1.15f, 0.299f)
                lineToRelative(4.457f, 2.557f)
                curveToRelative(1.495f, 0.857f, 1.495f, 3.013f, 0.0f, 3.87f)
                lineToRelative(-4.457f, 2.558f)
                curveToRelative(-1.488f, 0.854f, -3.342f, -0.22f, -3.342f, -1.935f)
                verticalLineToRelative(-0.34f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, false, -0.66f, -0.383f)
                lineTo(6.287f, 13.9f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, false, 0.0f, 0.765f)
                lineToRelative(4.096f, 2.35f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, 0.661f, -0.382f)
                verticalLineToRelative(-0.685f)
                curveToRelative(0.0f, -0.333f, 0.36f, -0.542f, 0.649f, -0.376f)
                lineToRelative(1.041f, 0.597f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, true, 0.222f, 0.383f)
                verticalLineToRelative(0.29f)
                curveToRelative(0.0f, 1.715f, -1.854f, 2.789f, -3.342f, 1.935f)
                lineTo(5.157f, 16.22f)
                curveToRelative(-1.495f, -0.857f, -1.495f, -3.013f, 0.0f, -3.87f)
                lineToRelative(4.457f, -2.558f)
                curveToRelative(1.488f, -0.854f, 3.342f, 0.22f, 3.342f, 1.935f)
                verticalLineToRelative(0.34f)
                curveToRelative(0.0f, 0.34f, 0.366f, 0.551f, 0.66f, 0.383f)
                lineToRelative(4.097f, -2.35f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, false, 0.0f, -0.765f)
                lineToRelative(-4.096f, -2.351f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, false, -0.661f, 0.382f)
                verticalLineToRelative(0.685f)
                curveToRelative(0.0f, 0.333f, -0.36f, 0.541f, -0.649f, 0.375f)
                lineToRelative(-1.041f, -0.597f)
                arcToRelative(0.442f, 0.442f, 0.0f, false, true, -0.222f, -0.383f)
                verticalLineToRelative(-0.29f)
                curveToRelative(0.0f, -1.285f, 1.043f, -2.21f, 2.192f, -2.233f)
                close()
            }
        }
        .build()
        return _afterpay!!
    }

private var _afterpay: ImageVector? = null
