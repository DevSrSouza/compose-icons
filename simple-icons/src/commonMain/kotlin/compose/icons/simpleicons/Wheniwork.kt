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

public val SimpleIcons.Wheniwork: ImageVector
    get() {
        if (_wheniwork != null) {
            return _wheniwork!!
        }
        _wheniwork = Builder(name = "Wheniwork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.342f, 24.0f, 0.0f, 18.582f, 0.0f, 12.0f)
                curveTo(0.0f, 5.342f, 5.342f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.342f, 12.0f, 12.0f)
                curveToRelative(0.0f, 6.582f, -5.342f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.014f)
                curveToRelative(-5.497f, 0.0f, -9.987f, 4.489f, -9.987f, 9.986f)
                curveToRelative(0.0f, 5.498f, 4.49f, 9.988f, 9.987f, 9.988f)
                curveToRelative(5.498f, 0.0f, 9.987f, -4.49f, 9.987f, -9.988f)
                curveToRelative(0.0f, -5.497f, -4.489f, -9.986f, -9.987f, -9.986f)
                close()
                moveTo(17.885f, 13.162f)
                lineTo(9.213f, 13.162f)
                curveToRelative(-0.384f, 0.0f, -0.695f, -0.309f, -0.698f, -0.691f)
                verticalLineToRelative(-1.012f)
                curveToRelative(0.0f, -0.387f, 0.311f, -0.697f, 0.698f, -0.697f)
                horizontalLineToRelative(8.748f)
                curveToRelative(0.387f, 0.0f, 0.697f, 0.311f, 0.697f, 0.697f)
                verticalLineToRelative(1.006f)
                curveToRelative(-0.077f, 0.387f, -0.387f, 0.697f, -0.773f, 0.697f)
                close()
                moveTo(15.639f, 9.291f)
                lineTo(6.891f, 9.291f)
                curveToRelative(-0.383f, 0.002f, -0.697f, -0.307f, -0.698f, -0.691f)
                lineTo(6.193f, 7.59f)
                curveToRelative(0.0f, -0.311f, 0.31f, -0.621f, 0.697f, -0.621f)
                horizontalLineToRelative(8.748f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.311f, 0.62f, 0.619f)
                verticalLineToRelative(1.006f)
                curveToRelative(0.001f, 0.386f, -0.31f, 0.697f, -0.619f, 0.697f)
                close()
                moveTo(6.891f, 14.709f)
                horizontalLineToRelative(8.748f)
                curveToRelative(0.388f, 0.0f, 0.696f, 0.311f, 0.696f, 0.697f)
                verticalLineToRelative(1.006f)
                curveToRelative(0.002f, 0.383f, -0.309f, 0.695f, -0.691f, 0.697f)
                lineTo(6.891f, 17.109f)
                curveToRelative(-0.388f, -0.076f, -0.697f, -0.387f, -0.697f, -0.773f)
                lineTo(6.194f, 15.33f)
                curveToRelative(-0.001f, -0.31f, 0.309f, -0.621f, 0.697f, -0.621f)
                close()
            }
        }
        .build()
        return _wheniwork!!
    }

private var _wheniwork: ImageVector? = null
