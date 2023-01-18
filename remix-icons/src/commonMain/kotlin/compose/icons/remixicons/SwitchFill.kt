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

public val RemixIcons.SwitchFill: ImageVector
    get() {
        if (_switchFill != null) {
            return _switchFill!!
        }
        _switchFill = Builder(name = "SwitchFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.619f, 21.0f)
                curveToRelative(-0.085f, 0.0f, -0.141f, -0.057f, -0.127f, -0.127f)
                lineTo(13.492f, 3.127f)
                curveToRelative(0.0f, -0.056f, 0.042f, -0.113f, 0.113f, -0.113f)
                horizontalLineToRelative(2.785f)
                arcTo(4.61f, 4.61f, 0.0f, false, true, 21.0f, 7.624f)
                verticalLineToRelative(8.766f)
                arcTo(4.61f, 4.61f, 0.0f, false, true, 16.39f, 21.0f)
                lineTo(13.62f, 21.0f)
                close()
                moveTo(17.041f, 11.074f)
                curveToRelative(-1.004f, 0.0f, -1.824f, 0.82f, -1.824f, 1.824f)
                reflectiveCurveToRelative(0.82f, 1.824f, 1.824f, 1.824f)
                reflectiveCurveToRelative(1.824f, -0.82f, 1.824f, -1.824f)
                reflectiveCurveToRelative(-0.82f, -1.824f, -1.824f, -1.824f)
                close()
                moveTo(5.8f, 8.4f)
                curveToRelative(0.0f, -0.933f, 0.763f, -1.696f, 1.696f, -1.696f)
                curveToRelative(0.934f, 0.0f, 1.697f, 0.763f, 1.697f, 1.696f)
                curveToRelative(0.0f, 0.934f, -0.763f, 1.697f, -1.697f, 1.697f)
                arcTo(1.702f, 1.702f, 0.0f, false, true, 5.8f, 8.401f)
                close()
                moveTo(11.54f, 3.0f)
                curveToRelative(0.085f, 0.0f, 0.142f, 0.057f, 0.128f, 0.127f)
                lineTo(11.668f, 20.86f)
                curveToRelative(0.0f, 0.07f, -0.057f, 0.127f, -0.128f, 0.127f)
                lineTo(7.61f, 20.987f)
                arcTo(4.61f, 4.61f, 0.0f, false, true, 3.0f, 16.376f)
                lineTo(3.0f, 7.61f)
                arcTo(4.61f, 4.61f, 0.0f, false, true, 7.61f, 3.0f)
                horizontalLineToRelative(3.93f)
                close()
                moveTo(10.225f, 19.544f)
                lineTo(10.225f, 4.442f)
                lineTo(7.61f, 4.442f)
                curveToRelative(-0.849f, 0.0f, -1.64f, 0.34f, -2.235f, 0.933f)
                arcToRelative(3.088f, 3.088f, 0.0f, false, false, -0.933f, 2.235f)
                verticalLineToRelative(8.766f)
                curveToRelative(0.0f, 0.849f, 0.34f, 1.64f, 0.933f, 2.234f)
                arcToRelative(3.088f, 3.088f, 0.0f, false, false, 2.235f, 0.934f)
                horizontalLineToRelative(2.615f)
                close()
            }
        }
        .build()
        return _switchFill!!
    }

private var _switchFill: ImageVector? = null
