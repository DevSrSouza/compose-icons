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

public val SimpleIcons.Whitesource: ImageVector
    get() {
        if (_whitesource != null) {
            return _whitesource!!
        }
        _whitesource = Builder(name = "Whitesource", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(10.42f, 4.916f)
                horizontalLineToRelative(3.167f)
                verticalLineToRelative(5.268f)
                horizontalLineToRelative(0.657f)
                lineTo(14.244f, 5.818f)
                curveToRelative(2.971f, 1.432f, 2.554f, 5.28f, 2.586f, 5.136f)
                horizontalLineToRelative(0.718f)
                verticalLineToRelative(1.014f)
                lineTo(6.452f, 11.968f)
                verticalLineToRelative(-1.014f)
                horizontalLineToRelative(0.718f)
                reflectiveCurveToRelative(-0.687f, -3.559f, 2.587f, -5.136f)
                verticalLineToRelative(4.366f)
                horizontalLineToRelative(0.662f)
                close()
                moveTo(6.452f, 12.918f)
                horizontalLineToRelative(3.18f)
                lineTo(9.632f, 13.464f)
                arcTo(2.376f, 2.376f, 0.0f, false, false, 12.0f, 15.833f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, false, 2.369f, -2.369f)
                lineTo(14.369f, 12.918f)
                horizontalLineToRelative(3.18f)
                verticalLineToRelative(2.066f)
                horizontalLineToRelative(-1.292f)
                lineToRelative(-0.416f, 0.928f)
                lineToRelative(0.872f, 0.768f)
                lineToRelative(-1.596f, 1.697f)
                lineToRelative(-0.911f, -0.919f)
                lineToRelative(-0.988f, 0.424f)
                verticalLineToRelative(1.202f)
                horizontalLineToRelative(-2.436f)
                verticalLineToRelative(-1.202f)
                lineToRelative(-0.987f, -0.424f)
                lineToRelative(-0.912f, 0.919f)
                lineToRelative(-1.595f, -1.697f)
                lineToRelative(0.871f, -0.768f)
                lineToRelative(-0.415f, -0.928f)
                lineTo(6.452f, 14.984f)
                close()
            }
        }
        .build()
        return _whitesource!!
    }

private var _whitesource: ImageVector? = null
