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

public val SimpleIcons.Qgis: ImageVector
    get() {
        if (_qgis != null) {
            return _qgis!!
        }
        _qgis = Builder(name = "Qgis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.879f, 13.006f)
                verticalLineToRelative(3.65f)
                lineToRelative(-3.004f, -3.048f)
                verticalLineToRelative(-3.495f)
                horizontalLineToRelative(3.582f)
                lineToRelative(2.852f, 2.893f)
                horizontalLineToRelative(-3.43f)
                close()
                moveTo(23.765f, 20.612f)
                lineTo(23.765f, 24.0f)
                horizontalLineToRelative(-3.654f)
                lineToRelative(-5.73f, -5.9f)
                verticalLineToRelative(-3.55f)
                horizontalLineToRelative(3.354f)
                lineToRelative(6.03f, 6.062f)
                close()
                moveTo(12.937f, 19.164f)
                lineToRelative(3.372f, 3.371f)
                curveToRelative(-1.309f, 0.442f, -2.557f, 0.726f, -4.325f, 0.726f)
                curveTo(5.136f, 23.26f, 0.0f, 18.243f, 0.0f, 11.565f)
                curveTo(0.0f, 4.92f, 5.136f, 0.0f, 11.984f, 0.0f)
                curveTo(18.864f, 0.0f, 24.0f, 4.952f, 24.0f, 11.565f)
                curveToRelative(0.0f, 2.12f, -0.523f, 4.076f, -1.457f, 5.759f)
                lineToRelative(-3.625f, -3.725f)
                arcToRelative(8.393f, 8.393f, 0.0f, false, false, 0.24f, -2.005f)
                curveToRelative(0.0f, -4.291f, -3.148f, -7.527f, -7.1f, -7.527f)
                curveToRelative(-3.954f, 0.0f, -7.248f, 3.236f, -7.248f, 7.527f)
                reflectiveCurveToRelative(3.33f, 7.6f, 7.247f, 7.6f)
                curveToRelative(0.548f, 0.0f, 0.661f, 0.017f, 0.88f, -0.03f)
                close()
            }
        }
        .build()
        return _qgis!!
    }

private var _qgis: ImageVector? = null
