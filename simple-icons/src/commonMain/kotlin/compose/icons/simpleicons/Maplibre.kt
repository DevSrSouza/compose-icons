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

public val SimpleIcons.Maplibre: ImageVector
    get() {
        if (_maplibre != null) {
            return _maplibre!!
        }
        _maplibre = Builder(name = "Maplibre", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 3.19f)
                curveToRelative(2.937f, 0.0f, 5.371f, 2.265f, 5.371f, 5.035f)
                curveToRelative(0.0f, 4.111f, -4.364f, 7.635f, -5.035f, 8.138f)
                curveToRelative(-0.084f, 0.0f, -0.084f, 0.084f, -0.084f, 0.084f)
                curveToRelative(-0.084f, 0.084f, -0.168f, 0.084f, -0.168f, 0.084f)
                reflectiveCurveToRelative(-0.168f, 0.0f, -0.168f, -0.084f)
                lineToRelative(-0.084f, -0.084f)
                curveToRelative(-0.84f, -0.503f, -5.203f, -3.943f, -5.203f, -8.138f)
                curveToRelative(0.0f, -2.77f, 2.434f, -5.036f, 5.371f, -5.036f)
                close()
                moveTo(12.0f, 5.791f)
                curveToRelative(-1.427f, 0.0f, -2.602f, 1.173f, -2.602f, 2.684f)
                curveToRelative(0.0f, 1.51f, 1.175f, 2.685f, 2.602f, 2.685f)
                curveToRelative(1.427f, 0.0f, 2.602f, -1.175f, 2.602f, -2.685f)
                reflectiveCurveTo(13.427f, 5.79f, 12.0f, 5.79f)
                close()
                moveTo(8.979f, 17.287f)
                horizontalLineToRelative(6.042f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.67f, 0.672f)
                verticalLineToRelative(2.014f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.67f, 0.67f)
                lineTo(8.98f, 20.643f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.67f, -0.67f)
                verticalLineToRelative(-2.014f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.67f, -0.672f)
                close()
                moveTo(9.734f, 18.545f)
                verticalLineToRelative(0.924f)
                horizontalLineToRelative(4.448f)
                verticalLineToRelative(-0.924f)
                lineTo(9.734f, 18.545f)
                close()
            }
        }
        .build()
        return _maplibre!!
    }

private var _maplibre: ImageVector? = null
