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

public val SimpleIcons.Pearson: ImageVector
    get() {
        if (_pearson != null) {
            return _pearson!!
        }
        _pearson = Builder(name = "Pearson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.22f, 1.546f)
                curveTo(12.596f, -1.648f, 5.258f, 0.088f, 2.096f, 6.928f)
                curveToRelative(-2.176f, 4.71f, -1.188f, 12.896f, 3.88f, 15.83f)
                curveToRelative(5.066f, 2.934f, 11.866f, 0.472f, 14.98f, -5.29f)
                curveToRelative(3.542f, -6.554f, 2.356f, -13.034f, -2.736f, -15.922f)
                close()
                moveTo(11.976f, 20.072f)
                arcToRelative(1.212f, 1.212f, 0.0f, false, true, -0.76f, 0.248f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.4f, -0.054f)
                arcToRelative(1.078f, 1.078f, 0.0f, false, true, -0.528f, -0.306f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, true, -0.21f, -0.474f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, true, 0.208f, -0.854f)
                curveToRelative(0.2f, -0.298f, 0.532f, -0.48f, 0.89f, -0.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.186f, 0.018f)
                curveToRelative(0.188f, 0.04f, 0.366f, 0.12f, 0.518f, 0.24f)
                curveToRelative(0.286f, 0.217f, 0.456f, 0.553f, 0.462f, 0.912f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.366f, 0.76f)
                close()
                moveTo(19.632f, 10.238f)
                curveToRelative(-0.202f, 1.514f, -1.14f, 2.914f, -2.7f, 3.84f)
                curveToRelative(-1.236f, 0.738f, -2.86f, 1.032f, -4.46f, 1.046f)
                curveToRelative(-0.012f, 0.248f, -0.062f, 1.1f, -0.088f, 1.236f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.196f, 0.42f)
                curveToRelative(-0.172f, 0.218f, -0.47f, 0.36f, -0.766f, 0.44f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, -0.632f, 0.096f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.568f, -0.234f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.204f, -0.482f)
                lineToRelative(-0.012f, -0.17f)
                curveToRelative(-0.034f, -0.144f, -0.22f, -7.496f, -0.184f, -7.366f)
                curveToRelative(0.028f, -0.88f, 1.48f, -1.034f, 2.27f, -0.88f)
                curveToRelative(0.79f, 0.158f, 0.59f, 1.098f, 0.57f, 2.252f)
                curveToRelative(0.0f, 0.0f, -0.04f, 1.52f, -0.112f, 3.124f)
                arcToRelative(6.178f, 6.178f, 0.0f, false, false, 2.556f, -0.684f)
                curveToRelative(1.512f, -0.732f, 2.312f, -1.856f, 2.312f, -3.512f)
                reflectiveCurveToRelative(-1.648f, -3.51f, -4.688f, -3.51f)
                reflectiveCurveToRelative(-4.346f, 0.75f, -5.818f, 1.94f)
                curveToRelative(-0.332f, 0.27f, -0.588f, 0.54f, -0.83f, 0.72f)
                curveToRelative(-0.24f, 0.178f, -0.882f, 0.204f, -1.054f, -0.212f)
                curveToRelative(-0.208f, -0.504f, 0.18f, -1.064f, 0.406f, -1.334f)
                curveToRelative(0.36f, -0.426f, 1.24f, -1.284f, 2.218f, -1.78f)
                curveTo(8.772f, 4.616f, 10.14f, 4.0f, 12.048f, 3.954f)
                curveToRelative(1.724f, -0.044f, 4.448f, 0.094f, 6.41f, 2.26f)
                lineToRelative(0.014f, 0.014f)
                curveToRelative(1.02f, 1.066f, 1.34f, 2.684f, 1.16f, 4.01f)
                close()
            }
        }
        .build()
        return _pearson!!
    }

private var _pearson: ImageVector? = null
