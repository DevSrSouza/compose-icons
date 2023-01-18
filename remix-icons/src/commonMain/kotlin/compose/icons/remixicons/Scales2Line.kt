package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Scales2Line: ImageVector
    get() {
        if (_scales2Line != null) {
            return _scales2Line!!
        }
        _scales2Line = Builder(name = "Scales2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveToRelative(0.0f, 0.513f, 0.49f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.513f, 0.0f, 1.0f, -0.49f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(0.001f, 2.062f)
                curveTo(16.947f, 7.555f, 20.0f, 10.921f, 20.0f, 15.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -4.08f, 3.054f, -7.446f, 7.0f, -7.938f)
                lineTo(11.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveTo(5.34f, 5.0f, 4.0f, 3.66f, 4.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-3.238f, 0.0f, -6.0f, 2.76f, -6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.238f, -2.762f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(0.742f, 0.0f, 1.436f, 0.202f, 2.032f, 0.554f)
                lineToRelative(-2.74f, 2.739f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.414f)
                curveToRelative(0.361f, 0.36f, 0.929f, 0.388f, 1.32f, 0.083f)
                lineToRelative(0.095f, -0.083f)
                lineToRelative(2.74f, -2.739f)
                curveToRelative(0.351f, 0.596f, 0.553f, 1.29f, 0.553f, 2.032f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _scales2Line!!
    }

private var _scales2Line: ImageVector? = null
