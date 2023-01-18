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

public val RemixIcons.XboxFill: ImageVector
    get() {
        if (_xboxFill != null) {
            return _xboxFill!!
        }
        _xboxFill = Builder(name = "XboxFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.418f, 19.527f)
                arcTo(9.956f, 9.956f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(9.967f, 9.967f, 0.0f, false, false, 6.585f, -2.473f)
                curveToRelative(1.564f, -1.593f, -3.597f, -7.257f, -6.585f, -9.514f)
                curveToRelative(-2.985f, 2.257f, -8.15f, 7.921f, -6.582f, 9.514f)
                close()
                moveTo(14.718f, 7.522f)
                curveToRelative(2.084f, 2.468f, 6.237f, 8.595f, 5.064f, 10.76f)
                arcTo(9.952f, 9.952f, 0.0f, false, false, 22.0f, 12.003f)
                arcToRelative(9.958f, 9.958f, 0.0f, false, false, -2.975f, -7.113f)
                reflectiveCurveToRelative(-0.022f, -0.018f, -0.068f, -0.035f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, false, -0.235f, -0.038f)
                curveToRelative(-0.493f, 0.0f, -1.654f, 0.362f, -4.004f, 2.705f)
                close()
                moveTo(5.045f, 4.856f)
                curveToRelative(-0.048f, 0.017f, -0.068f, 0.034f, -0.072f, 0.035f)
                arcTo(9.963f, 9.963f, 0.0f, false, false, 2.0f, 12.003f)
                curveToRelative(0.0f, 2.379f, 0.832f, 4.561f, 2.218f, 6.278f)
                curveTo(3.05f, 16.11f, 7.2f, 9.988f, 9.284f, 7.523f)
                curveTo(6.934f, 5.178f, 5.771f, 4.818f, 5.28f, 4.818f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.234f, 0.039f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(12.0f, 4.959f)
                reflectiveCurveTo(9.546f, 3.523f, 7.63f, 3.455f)
                curveToRelative(-0.753f, -0.027f, -1.212f, 0.246f, -1.268f, 0.282f)
                curveTo(8.149f, 2.538f, 10.049f, 2.0f, 11.987f, 2.0f)
                lineTo(12.0f, 2.0f)
                curveToRelative(1.945f, 0.0f, 3.838f, 0.538f, 5.638f, 1.737f)
                curveToRelative(-0.056f, -0.038f, -0.512f, -0.31f, -1.266f, -0.282f)
                curveToRelative(-1.917f, 0.068f, -4.372f, 1.5f, -4.372f, 1.5f)
                verticalLineToRelative(0.004f)
                close()
            }
        }
        .build()
        return _xboxFill!!
    }

private var _xboxFill: ImageVector? = null
