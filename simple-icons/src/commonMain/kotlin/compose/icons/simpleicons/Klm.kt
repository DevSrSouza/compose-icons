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

public val SimpleIcons.Klm: ImageVector
    get() {
        if (_klm != null) {
            return _klm!!
        }
        _klm = Builder(name = "Klm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 13.034f)
                lineTo(4.5f, 13.034f)
                lineToRelative(-2.25f, 2.257f)
                verticalLineToRelative(-2.257f)
                lineTo(0.0f, 13.034f)
                verticalLineToRelative(6.018f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(-2.257f)
                lineToRelative(2.25f, 2.257f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.375f, -3.385f)
                close()
                moveTo(9.75f, 13.034f)
                lineTo(7.5f, 13.034f)
                verticalLineToRelative(6.018f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.518f)
                lineTo(9.75f, 17.534f)
                close()
                moveTo(20.25f, 13.034f)
                lineToRelative(-1.125f, 3.385f)
                lineTo(18.0f, 13.034f)
                horizontalLineToRelative(-3.75f)
                verticalLineToRelative(6.018f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(-4.514f)
                lineToRelative(1.5f, 4.514f)
                horizontalLineToRelative(2.25f)
                lineToRelative(1.5f, -4.514f)
                verticalLineToRelative(4.514f)
                lineTo(24.0f, 19.052f)
                verticalLineToRelative(-6.018f)
                close()
                moveTo(10.5f, 9.649f)
                curveToRelative(0.725f, 0.0f, 1.313f, -0.589f, 1.313f, -1.316f)
                reflectiveCurveToRelative(-0.588f, -1.317f, -1.313f, -1.317f)
                reflectiveCurveToRelative(-1.312f, 0.589f, -1.312f, 1.317f)
                reflectiveCurveToRelative(0.587f, 1.316f, 1.312f, 1.316f)
                close()
                moveTo(12.188f, 8.333f)
                curveToRelative(0.0f, 0.727f, 0.588f, 1.316f, 1.312f, 1.316f)
                curveToRelative(0.725f, 0.0f, 1.313f, -0.589f, 1.313f, -1.316f)
                reflectiveCurveToRelative(-0.588f, -1.317f, -1.313f, -1.317f)
                reflectiveCurveToRelative(-1.312f, 0.589f, -1.312f, 1.317f)
                close()
                moveTo(15.187f, 8.333f)
                curveToRelative(0.0f, 0.727f, 0.588f, 1.316f, 1.312f, 1.316f)
                curveToRelative(0.725f, 0.0f, 1.313f, -0.589f, 1.313f, -1.316f)
                reflectiveCurveToRelative(-0.588f, -1.317f, -1.313f, -1.317f)
                reflectiveCurveToRelative(-1.312f, 0.589f, -1.312f, 1.317f)
                close()
                moveTo(8.812f, 8.333f)
                curveToRelative(0.0f, -0.727f, -0.588f, -1.317f, -1.313f, -1.317f)
                reflectiveCurveToRelative(-1.312f, 0.589f, -1.312f, 1.317f)
                reflectiveCurveToRelative(0.588f, 1.316f, 1.313f, 1.316f)
                reflectiveCurveToRelative(1.312f, -0.589f, 1.312f, -1.316f)
                close()
                moveTo(7.5f, 10.025f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.505f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(11.625f, 7.204f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.752f)
                horizontalLineToRelative(0.75f)
                lineTo(13.125f, 5.7f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.753f)
                horizontalLineToRelative(-0.75f)
                lineTo(11.625f, 5.7f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(0.752f)
                horizontalLineToRelative(0.75f)
                close()
            }
        }
        .build()
        return _klm!!
    }

private var _klm: ImageVector? = null
