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

public val SimpleIcons.Redis: ImageVector
    get() {
        if (_redis != null) {
            return _redis!!
        }
        _redis = Builder(name = "Redis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 2.661f)
                lineToRelative(0.54f, 0.997f)
                lineToRelative(-1.797f, 0.644f)
                lineToRelative(2.409f, 0.218f)
                lineToRelative(0.748f, 1.246f)
                lineToRelative(0.467f, -1.121f)
                lineToRelative(2.077f, -0.208f)
                lineToRelative(-1.61f, -0.613f)
                lineToRelative(0.426f, -1.017f)
                lineToRelative(-1.578f, 0.519f)
                close()
                moveTo(17.405f, 4.738f)
                lineTo(13.76f, 6.182f)
                lineToRelative(3.292f, 1.298f)
                lineToRelative(0.353f, -0.146f)
                lineToRelative(3.293f, -1.298f)
                close()
                moveTo(6.895f, 5.05f)
                arcToRelative(2.97f, 1.153f, 0.0f, false, false, -2.97f, 1.152f)
                arcToRelative(2.97f, 1.153f, 0.0f, false, false, 2.97f, 1.153f)
                arcToRelative(2.97f, 1.153f, 0.0f, false, false, 2.97f, -1.153f)
                arcToRelative(2.97f, 1.153f, 0.0f, false, false, -2.97f, -1.152f)
                close()
                moveTo(24.0f, 6.805f)
                reflectiveCurveToRelative(-8.983f, 4.278f, -10.395f, 4.953f)
                curveToRelative(-1.226f, 0.561f, -1.901f, 0.561f, -3.261f, 0.094f)
                curveTo(8.318f, 11.022f, 0.0f, 7.241f, 0.0f, 7.241f)
                verticalLineToRelative(1.038f)
                curveToRelative(0.0f, 0.24f, 0.332f, 0.499f, 0.966f, 0.8f)
                curveToRelative(1.277f, 0.613f, 8.34f, 3.677f, 9.45f, 4.206f)
                curveToRelative(1.112f, 0.53f, 1.9f, 0.54f, 3.313f, -0.197f)
                curveToRelative(1.412f, -0.738f, 8.049f, -3.905f, 9.326f, -4.57f)
                curveToRelative(0.654f, -0.342f, 0.945f, -0.602f, 0.945f, -0.84f)
                close()
                moveTo(13.958f, 7.407f)
                lineTo(8.39f, 8.26f)
                lineToRelative(3.884f, 1.61f)
                close()
                moveTo(24.0f, 10.637f)
                reflectiveCurveToRelative(-8.983f, 4.279f, -10.395f, 4.954f)
                curveToRelative(-1.226f, 0.56f, -1.901f, 0.56f, -3.261f, 0.093f)
                curveTo(8.318f, 14.854f, 0.0f, 11.074f, 0.0f, 11.074f)
                verticalLineToRelative(1.038f)
                curveToRelative(0.0f, 0.238f, 0.332f, 0.498f, 0.966f, 0.8f)
                curveToRelative(1.277f, 0.612f, 8.34f, 3.676f, 9.45f, 4.205f)
                curveToRelative(1.112f, 0.53f, 1.9f, 0.54f, 3.313f, -0.197f)
                curveToRelative(1.412f, -0.737f, 8.049f, -3.905f, 9.326f, -4.57f)
                curveToRelative(0.654f, -0.332f, 0.945f, -0.602f, 0.945f, -0.84f)
                close()
                moveTo(24.0f, 14.479f)
                lineToRelative(-10.395f, 4.954f)
                curveToRelative(-1.226f, 0.56f, -1.901f, 0.56f, -3.261f, 0.094f)
                curveTo(8.318f, 18.696f, 0.0f, 14.916f, 0.0f, 14.916f)
                verticalLineToRelative(1.038f)
                curveToRelative(0.0f, 0.239f, 0.332f, 0.499f, 0.966f, 0.8f)
                curveToRelative(1.277f, 0.613f, 8.34f, 3.676f, 9.45f, 4.206f)
                curveToRelative(1.112f, 0.53f, 1.9f, 0.54f, 3.313f, -0.198f)
                curveToRelative(1.412f, -0.737f, 8.049f, -3.904f, 9.326f, -4.569f)
                curveToRelative(0.654f, -0.343f, 0.945f, -0.613f, 0.945f, -0.841f)
                close()
            }
        }
        .build()
        return _redis!!
    }

private var _redis: ImageVector? = null
