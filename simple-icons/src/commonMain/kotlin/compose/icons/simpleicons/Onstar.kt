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

public val SimpleIcons.Onstar: ImageVector
    get() {
        if (_onstar != null) {
            return _onstar!!
        }
        _onstar = Builder(name = "Onstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.951f, 0.763f)
                curveToRelative(6.233f, 0.0f, 11.304f, 5.066f, 11.304f, 11.294f)
                curveToRelative(0.0f, 6.229f, -5.07f, 11.295f, -11.304f, 11.295f)
                curveToRelative(-6.233f, 0.0f, -11.304f, -5.066f, -11.304f, -11.295f)
                curveTo(0.647f, 5.83f, 5.718f, 0.763f, 11.951f, 0.763f)
                close()
                moveTo(11.951f, 1.05f)
                curveTo(5.877f, 1.05f, 0.936f, 5.988f, 0.936f, 12.057f)
                curveToRelative(0.0f, 6.07f, 4.941f, 11.008f, 11.015f, 11.008f)
                curveToRelative(6.074f, 0.0f, 11.016f, -4.938f, 11.016f, -11.008f)
                curveToRelative(0.0f, -6.069f, -4.942f, -11.007f, -11.016f, -11.007f)
                close()
                moveTo(16.681f, 4.3f)
                lineToRelative(0.582f, 1.7f)
                lineToRelative(1.8f, 0.064f)
                lineToRelative(-1.44f, 1.078f)
                lineToRelative(0.495f, 1.729f)
                lineToRelative(-1.472f, -1.034f)
                lineToRelative(-1.494f, 1.004f)
                lineToRelative(0.53f, -1.717f)
                lineToRelative(-1.418f, -1.108f)
                lineToRelative(1.8f, -0.028f)
                close()
                moveTo(7.99f, 7.11f)
                curveToRelative(2.892f, 0.0f, 4.967f, 2.155f, 4.967f, 4.82f)
                verticalLineToRelative(0.027f)
                curveToRelative(0.0f, 2.664f, -2.102f, 4.847f, -4.994f, 4.847f)
                reflectiveCurveToRelative(-4.967f, -2.156f, -4.967f, -4.82f)
                verticalLineToRelative(-0.027f)
                curveToRelative(0.0f, -2.665f, 2.102f, -4.848f, 4.994f, -4.848f)
                close()
                moveTo(7.963f, 9.01f)
                curveToRelative(-1.66f, 0.0f, -2.812f, 1.313f, -2.812f, 2.92f)
                verticalLineToRelative(0.027f)
                curveToRelative(0.0f, 1.606f, 1.179f, 2.945f, 2.839f, 2.945f)
                reflectiveCurveToRelative(2.812f, -1.312f, 2.812f, -2.918f)
                verticalLineToRelative(-0.027f)
                curveToRelative(0.0f, -1.607f, -1.178f, -2.946f, -2.839f, -2.946f)
                close()
                moveTo(17.939f, 9.332f)
                curveToRelative(1.54f, 0.0f, 2.437f, 1.018f, 2.437f, 2.665f)
                verticalLineToRelative(4.646f)
                horizontalLineToRelative(-2.035f)
                lineTo(18.341f, 12.64f)
                curveToRelative(0.0f, -0.964f, -0.455f, -1.46f, -1.232f, -1.46f)
                curveToRelative(-0.776f, 0.0f, -1.272f, 0.496f, -1.272f, 1.46f)
                verticalLineToRelative(4.003f)
                horizontalLineToRelative(-2.035f)
                lineTo(13.802f, 9.466f)
                horizontalLineToRelative(2.035f)
                verticalLineToRelative(1.018f)
                curveToRelative(0.469f, -0.603f, 1.071f, -1.152f, 2.102f, -1.152f)
                close()
            }
        }
        .build()
        return _onstar!!
    }

private var _onstar: ImageVector? = null
