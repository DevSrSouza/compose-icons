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

public val SimpleIcons.Eclipseadoptium: ImageVector
    get() {
        if (_eclipseadoptium != null) {
            return _eclipseadoptium!!
        }
        _eclipseadoptium = Builder(name = "Eclipseadoptium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.98f, 14.013f)
                lineToRelative(-2.632f, 5.729f)
                lineToRelative(6.813f, 3.058f)
                curveToRelative(-1.55f, -2.754f, -2.82f, -5.852f, -4.18f, -8.787f)
                close()
                moveTo(23.013f, 18.658f)
                lineTo(16.277f, 4.064f)
                arcToRelative(3.952f, 3.952f, 0.0f, false, true, -0.387f, 1.471f)
                lineToRelative(-3.6f, 7.82f)
                lineToRelative(3.871f, 8.361f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, 3.445f, 2.245f)
                arcToRelative(3.734f, 3.734f, 0.0f, false, false, 3.755f, -3.755f)
                curveToRelative(0.0f, -0.542f, -0.155f, -1.045f, -0.348f, -1.548f)
                close()
                moveTo(15.735f, 3.755f)
                arcTo(3.734f, 3.734f, 0.0f, false, false, 11.982f, 0.0f)
                curveTo(10.51f, 0.0f, 9.27f, 0.852f, 8.65f, 2.052f)
                curveTo(6.119f, 7.582f, 3.544f, 13.127f, 0.988f, 18.658f)
                curveToRelative(-0.232f, 0.464f, -0.348f, 1.006f, -0.348f, 1.587f)
                arcTo(3.734f, 3.734f, 0.0f, false, false, 4.394f, 24.0f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, 3.445f, -2.245f)
                lineToRelative(7.587f, -16.413f)
                curveToRelative(0.193f, -0.503f, 0.31f, -1.045f, 0.31f, -1.587f)
                close()
            }
        }
        .build()
        return _eclipseadoptium!!
    }

private var _eclipseadoptium: ImageVector? = null
