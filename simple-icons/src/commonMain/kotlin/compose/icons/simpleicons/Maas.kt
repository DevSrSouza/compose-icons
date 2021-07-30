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

public val SimpleIcons.Maas: ImageVector
    get() {
        if (_maas != null) {
            return _maas!!
        }
        _maas = Builder(name = "Maas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.384f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.384f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(6.343f, 6.257f)
                horizontalLineToRelative(11.314f)
                curveToRelative(0.284f, 0.0f, 0.514f, 0.23f, 0.514f, 0.515f)
                verticalLineToRelative(0.685f)
                curveToRelative(0.0f, 0.285f, -0.23f, 0.515f, -0.514f, 0.515f)
                lineTo(6.343f, 7.972f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.515f, -0.515f)
                verticalLineToRelative(-0.685f)
                curveToRelative(0.0f, -0.284f, 0.23f, -0.515f, 0.515f, -0.515f)
                close()
                moveTo(6.343f, 9.514f)
                horizontalLineToRelative(11.314f)
                curveToRelative(0.284f, 0.0f, 0.514f, 0.23f, 0.514f, 0.515f)
                verticalLineToRelative(0.685f)
                curveToRelative(0.0f, 0.285f, -0.23f, 0.515f, -0.514f, 0.515f)
                lineTo(6.343f, 11.229f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.515f, -0.515f)
                verticalLineToRelative(-0.685f)
                curveToRelative(0.0f, -0.284f, 0.23f, -0.515f, 0.515f, -0.515f)
                close()
                moveTo(6.343f, 12.771f)
                horizontalLineToRelative(11.314f)
                curveToRelative(0.284f, 0.0f, 0.514f, 0.23f, 0.514f, 0.515f)
                verticalLineToRelative(0.685f)
                curveToRelative(0.0f, 0.285f, -0.23f, 0.515f, -0.514f, 0.515f)
                lineTo(6.343f, 14.486f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.514f, -0.515f)
                verticalLineToRelative(-0.685f)
                curveToRelative(0.0f, -0.284f, 0.23f, -0.515f, 0.514f, -0.515f)
                close()
                moveTo(6.343f, 16.029f)
                horizontalLineToRelative(11.314f)
                curveToRelative(0.284f, 0.0f, 0.514f, 0.23f, 0.514f, 0.513f)
                verticalLineToRelative(0.687f)
                curveToRelative(0.0f, 0.284f, -0.23f, 0.515f, -0.514f, 0.515f)
                lineTo(6.343f, 17.744f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.514f, -0.515f)
                verticalLineToRelative(-0.687f)
                curveToRelative(0.0f, -0.284f, 0.23f, -0.513f, 0.514f, -0.513f)
                close()
            }
        }
        .build()
        return _maas!!
    }

private var _maas: ImageVector? = null
