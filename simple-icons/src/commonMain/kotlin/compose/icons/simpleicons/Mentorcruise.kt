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

public val SimpleIcons.Mentorcruise: ImageVector
    get() {
        if (_mentorcruise != null) {
            return _mentorcruise!!
        }
        _mentorcruise = Builder(name = "Mentorcruise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.613f, 3.791f)
                verticalLineToRelative(8.08f)
                lineTo(6.947f, 11.871f)
                curveToRelative(1.557f, -2.693f, 3.111f, -5.386f, 4.666f, -8.08f)
                close()
                moveTo(12.387f, 3.791f)
                curveToRelative(1.554f, 2.694f, 3.11f, 5.387f, 4.666f, 8.08f)
                horizontalLineToRelative(-4.666f)
                close()
                moveTo(3.143f, 12.645f)
                horizontalLineToRelative(17.714f)
                lineToRelative(-1.68f, 2.91f)
                lineTo(4.823f, 15.555f)
                close()
                moveTo(5.268f, 16.328f)
                horizontalLineToRelative(13.464f)
                lineToRelative(-1.68f, 2.908f)
                lineTo(6.948f, 19.236f)
                close()
            }
        }
        .build()
        return _mentorcruise!!
    }

private var _mentorcruise: ImageVector? = null
