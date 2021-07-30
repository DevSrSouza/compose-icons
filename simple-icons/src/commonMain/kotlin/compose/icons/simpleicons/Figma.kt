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

public val SimpleIcons.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.852f, 8.981f)
                horizontalLineToRelative(-4.588f)
                lineTo(11.264f, 0.0f)
                horizontalLineToRelative(4.588f)
                curveToRelative(2.476f, 0.0f, 4.49f, 2.014f, 4.49f, 4.49f)
                reflectiveCurveToRelative(-2.014f, 4.491f, -4.49f, 4.491f)
                close()
                moveTo(12.735f, 7.51f)
                horizontalLineToRelative(3.117f)
                curveToRelative(1.665f, 0.0f, 3.019f, -1.355f, 3.019f, -3.019f)
                reflectiveCurveToRelative(-1.355f, -3.019f, -3.019f, -3.019f)
                horizontalLineToRelative(-3.117f)
                lineTo(12.735f, 7.51f)
                close()
                moveTo(12.735f, 8.981f)
                lineTo(8.148f, 8.981f)
                curveToRelative(-2.476f, 0.0f, -4.49f, -2.014f, -4.49f, -4.49f)
                reflectiveCurveTo(5.672f, 0.0f, 8.148f, 0.0f)
                horizontalLineToRelative(4.588f)
                verticalLineToRelative(8.981f)
                close()
                moveTo(8.148f, 1.471f)
                curveToRelative(-1.665f, 0.0f, -3.019f, 1.355f, -3.019f, 3.019f)
                reflectiveCurveToRelative(1.354f, 3.02f, 3.019f, 3.02f)
                horizontalLineToRelative(3.117f)
                lineTo(11.265f, 1.471f)
                lineTo(8.148f, 1.471f)
                close()
                moveTo(12.735f, 16.49f)
                lineTo(8.148f, 16.49f)
                curveToRelative(-2.476f, 0.0f, -4.49f, -2.014f, -4.49f, -4.49f)
                reflectiveCurveToRelative(2.014f, -4.49f, 4.49f, -4.49f)
                horizontalLineToRelative(4.588f)
                verticalLineToRelative(8.98f)
                close()
                moveTo(8.148f, 8.981f)
                curveToRelative(-1.665f, 0.0f, -3.019f, 1.355f, -3.019f, 3.019f)
                reflectiveCurveToRelative(1.355f, 3.019f, 3.019f, 3.019f)
                horizontalLineToRelative(3.117f)
                lineTo(11.265f, 8.981f)
                lineTo(8.148f, 8.981f)
                close()
                moveTo(8.172f, 24.0f)
                curveToRelative(-2.489f, 0.0f, -4.515f, -2.014f, -4.515f, -4.49f)
                reflectiveCurveToRelative(2.014f, -4.49f, 4.49f, -4.49f)
                horizontalLineToRelative(4.588f)
                verticalLineToRelative(4.441f)
                curveToRelative(0.0f, 2.503f, -2.047f, 4.539f, -4.563f, 4.539f)
                close()
                moveTo(8.148f, 16.49f)
                arcToRelative(3.023f, 3.023f, 0.0f, false, false, -3.019f, 3.019f)
                curveToRelative(0.0f, 1.665f, 1.365f, 3.019f, 3.044f, 3.019f)
                curveToRelative(1.705f, 0.0f, 3.093f, -1.376f, 3.093f, -3.068f)
                verticalLineToRelative(-2.97f)
                lineTo(8.148f, 16.49f)
                close()
                moveTo(15.852f, 16.49f)
                horizontalLineToRelative(-0.098f)
                curveToRelative(-2.476f, 0.0f, -4.49f, -2.014f, -4.49f, -4.49f)
                reflectiveCurveToRelative(2.014f, -4.49f, 4.49f, -4.49f)
                horizontalLineToRelative(0.098f)
                curveToRelative(2.476f, 0.0f, 4.49f, 2.014f, 4.49f, 4.49f)
                reflectiveCurveToRelative(-2.014f, 4.49f, -4.49f, 4.49f)
                close()
                moveTo(15.755f, 8.981f)
                curveToRelative(-1.665f, 0.0f, -3.019f, 1.355f, -3.019f, 3.019f)
                reflectiveCurveToRelative(1.355f, 3.019f, 3.019f, 3.019f)
                horizontalLineToRelative(0.098f)
                curveToRelative(1.665f, 0.0f, 3.019f, -1.355f, 3.019f, -3.019f)
                reflectiveCurveToRelative(-1.355f, -3.019f, -3.019f, -3.019f)
                horizontalLineToRelative(-0.098f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
