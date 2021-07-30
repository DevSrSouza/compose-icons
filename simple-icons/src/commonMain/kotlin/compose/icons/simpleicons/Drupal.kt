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

public val SimpleIcons.Drupal: ImageVector
    get() {
        if (_drupal != null) {
            return _drupal!!
        }
        _drupal = Builder(name = "Drupal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 5.113f)
                curveTo(14.09f, 3.425f, 12.48f, 1.815f, 11.998f, 0.0f)
                curveToRelative(-0.48f, 1.815f, -2.09f, 3.425f, -3.778f, 5.113f)
                curveToRelative(-2.534f, 2.53f, -5.405f, 5.4f, -5.405f, 9.702f)
                arcToRelative(9.184f, 9.185f, 0.0f, true, false, 18.368f, 0.0f)
                curveToRelative(0.0f, -4.303f, -2.871f, -7.171f, -5.405f, -9.702f)
                moveTo(6.72f, 16.954f)
                curveToRelative(-0.563f, -0.019f, -2.64f, -3.6f, 1.215f, -7.416f)
                lineToRelative(2.55f, 2.788f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, true, -0.016f, 0.325f)
                curveToRelative(-0.61f, 0.625f, -3.204f, 3.227f, -3.527f, 4.126f)
                curveToRelative(-0.066f, 0.186f, -0.164f, 0.18f, -0.222f, 0.177f)
                moveTo(12.0f, 21.677f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, true, -3.158f, -3.159f)
                arcToRelative(3.291f, 3.291f, 0.0f, false, true, 0.787f, -2.087f)
                curveToRelative(0.57f, -0.696f, 2.37f, -2.655f, 2.37f, -2.655f)
                reflectiveCurveToRelative(1.774f, 1.988f, 2.367f, 2.649f)
                arcToRelative(3.09f, 3.09f, 0.0f, false, true, 0.792f, 2.093f)
                arcTo(3.158f, 3.158f, 0.0f, false, true, 12.0f, 21.677f)
                moveToRelative(6.046f, -5.123f)
                curveToRelative(-0.068f, 0.15f, -0.223f, 0.398f, -0.431f, 0.405f)
                curveToRelative(-0.371f, 0.014f, -0.411f, -0.177f, -0.686f, -0.583f)
                curveToRelative(-0.604f, -0.892f, -5.864f, -6.39f, -6.848f, -7.455f)
                curveToRelative(-0.866f, -0.935f, -0.122f, -1.595f, 0.223f, -1.94f)
                curveTo(10.736f, 6.547f, 12.0f, 5.285f, 12.0f, 5.285f)
                reflectiveCurveToRelative(3.766f, 3.574f, 5.336f, 6.016f)
                curveToRelative(1.57f, 2.443f, 1.029f, 4.556f, 0.71f, 5.253f)
            }
        }
        .build()
        return _drupal!!
    }

private var _drupal: ImageVector? = null
