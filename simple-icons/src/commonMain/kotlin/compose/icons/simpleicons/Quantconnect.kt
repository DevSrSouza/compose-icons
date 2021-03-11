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

public val SimpleIcons.Quantconnect: ImageVector
    get() {
        if (_quantconnect != null) {
            return _quantconnect!!
        }
        _quantconnect = Builder(name = "Quantconnect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.6274f, -5.3726f, 12.0f, -12.0f, 12.0f)
                verticalLineToRelative(-2.8065f)
                curveToRelative(5.0774f, 0.0f, 9.1935f, -4.116f, 9.1935f, -9.1934f)
                curveToRelative(0.0f, -5.0775f, -4.1161f, -9.1935f, -9.1935f, -9.1935f)
                reflectiveCurveTo(2.8065f, 6.9226f, 2.8065f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.3726f, 5.3726f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.3726f, 12.0f, 12.0f)
                close()
                moveTo(20.4554f, 12.0f)
                curveToRelative(0.0f, -4.6698f, -3.7856f, -8.4554f, -8.4554f, -8.4554f)
                verticalLineToRelative(2.7973f)
                curveToRelative(3.1249f, 0.0f, 5.6581f, 2.5332f, 5.6581f, 5.6581f)
                curveToRelative(0.0f, 3.1249f, -2.5332f, 5.6581f, -5.6581f, 5.6581f)
                curveToRelative(-3.1249f, 0.0f, -5.6581f, -2.5333f, -5.6581f, -5.6581f)
                lineTo(3.5446f, 12.0f)
                curveToRelative(0.0f, 4.6698f, 3.7856f, 8.4554f, 8.4554f, 8.4554f)
                reflectiveCurveTo(20.4554f, 16.6698f, 20.4554f, 12.0f)
                close()
                moveTo(12.0f, 9.8819f)
                lineTo(12.0f, 7.0487f)
                curveToRelative(-2.7436f, 0.0f, -4.9677f, 2.2167f, -4.9677f, 4.9513f)
                curveToRelative(0.0f, 2.7345f, 2.2241f, 4.9513f, 4.9677f, 4.9513f)
                reflectiveCurveTo(16.9677f, 14.7345f, 16.9677f, 12.0f)
                horizontalLineToRelative(-2.8425f)
                curveToRelative(0.0f, 1.1698f, -0.9515f, 2.1182f, -2.1252f, 2.1182f)
                reflectiveCurveTo(9.8748f, 13.1698f, 9.8748f, 12.0f)
                reflectiveCurveTo(10.8263f, 9.8819f, 12.0f, 9.8819f)
                close()
            }
        }
        .build()
        return _quantconnect!!
    }

private var _quantconnect: ImageVector? = null
