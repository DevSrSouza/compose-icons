package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Aventrix: ImageVector
    get() {
        if (_aventrix != null) {
            return _aventrix!!
        }
        _aventrix = Builder(name = "Aventrix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.372f, 24.0f, 0.0f, 18.628f, 0.0f, 12.0f)
                reflectiveCurveTo(5.372f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.372f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.372f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(17.371f, 15.862f)
                curveToRelative(-0.23f, 0.161f, -0.644f, 0.322f, -1.081f, 0.322f)
                curveToRelative(-0.46f, 0.0f, -0.805f, -0.184f, -0.805f, -0.851f)
                verticalLineToRelative(-5.011f)
                curveToRelative(0.0f, -3.149f, -1.403f, -4.321f, -4.139f, -4.321f)
                curveToRelative(-1.517f, 0.0f, -2.875f, 0.367f, -3.656f, 0.827f)
                curveToRelative(-0.322f, 0.529f, -0.391f, 1.425f, -0.23f, 2.0f)
                arcToRelative(6.782f, 6.782f, 0.0f, false, true, 3.518f, -1.012f)
                curveToRelative(1.793f, 0.0f, 2.53f, 0.805f, 2.53f, 2.713f)
                verticalLineToRelative(0.598f)
                curveToRelative(-0.667f, -0.275f, -1.541f, -0.367f, -2.299f, -0.367f)
                curveToRelative(-2.599f, 0.0f, -4.599f, 1.103f, -4.599f, 3.793f)
                curveToRelative(0.0f, 2.506f, 1.724f, 3.448f, 3.702f, 3.448f)
                curveToRelative(1.518f, 0.0f, 2.575f, -0.483f, 3.242f, -1.357f)
                horizontalLineToRelative(0.092f)
                curveToRelative(0.184f, 0.851f, 0.782f, 1.357f, 1.816f, 1.357f)
                horizontalLineToRelative(0.009f)
                curveToRelative(0.557f, 0.0f, 1.077f, -0.154f, 1.522f, -0.421f)
                lineToRelative(-0.013f, 0.007f)
                curveToRelative(0.299f, -0.414f, 0.437f, -1.126f, 0.391f, -1.724f)
                close()
                moveTo(10.817f, 16.183f)
                curveToRelative(-1.241f, 0.0f, -2.207f, -0.529f, -2.207f, -1.724f)
                curveToRelative(0.0f, -1.219f, 0.989f, -2.069f, 2.897f, -2.069f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 2.0f, 0.345f)
                verticalLineToRelative(2.253f)
                curveToRelative(-0.598f, 0.874f, -1.702f, 1.195f, -2.69f, 1.195f)
                close()
            }
        }
        .build()
        return _aventrix!!
    }

private var _aventrix: ImageVector? = null
