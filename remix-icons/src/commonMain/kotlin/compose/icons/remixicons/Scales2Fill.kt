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

public val RemixIcons.Scales2Fill: ImageVector
    get() {
        if (_scales2Fill != null) {
            return _scales2Fill!!
        }
        _scales2Fill = Builder(name = "Scales2Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 11.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.742f, -0.202f, -1.436f, -0.554f, -2.032f)
                lineToRelative(-2.739f, 2.74f)
                lineToRelative(-0.094f, 0.082f)
                curveToRelative(-0.392f, 0.305f, -0.96f, 0.278f, -1.32f, -0.083f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.739f, -2.74f)
                curveTo(13.436f, 11.203f, 12.742f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _scales2Fill!!
    }

private var _scales2Fill: ImageVector? = null
