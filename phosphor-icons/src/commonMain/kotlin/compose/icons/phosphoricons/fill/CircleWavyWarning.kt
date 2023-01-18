package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CircleWavyWarning: ImageVector
    get() {
        if (_circleWavyWarning != null) {
            return _circleWavyWarning!!
        }
        _circleWavyWarning = Builder(name = "CircleWavyWarning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 102.8f)
                curveToRelative(-3.8f, -3.9f, -7.7f, -8.0f, -9.2f, -11.5f)
                reflectiveCurveToRelative(-1.4f, -8.7f, -1.5f, -14.0f)
                curveToRelative(-0.1f, -9.7f, -0.3f, -20.8f, -8.0f, -28.5f)
                reflectiveCurveToRelative(-18.8f, -7.9f, -28.5f, -8.0f)
                curveToRelative(-5.3f, -0.1f, -10.7f, -0.2f, -14.0f, -1.5f)
                reflectiveCurveToRelative(-7.6f, -5.4f, -11.5f, -9.2f)
                curveTo(146.3f, 23.5f, 138.4f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveToRelative(-18.3f, 7.5f, -25.2f, 14.1f)
                curveToRelative(-3.9f, 3.8f, -8.0f, 7.7f, -11.5f, 9.2f)
                reflectiveCurveToRelative(-8.7f, 1.4f, -14.0f, 1.5f)
                curveToRelative(-9.7f, 0.1f, -20.8f, 0.3f, -28.5f, 8.0f)
                reflectiveCurveToRelative(-7.9f, 18.8f, -8.0f, 28.5f)
                curveToRelative(-0.1f, 5.3f, -0.2f, 10.7f, -1.5f, 14.0f)
                reflectiveCurveToRelative(-5.4f, 7.6f, -9.2f, 11.5f)
                curveTo(23.5f, 109.7f, 16.0f, 117.6f, 16.0f, 128.0f)
                reflectiveCurveToRelative(7.5f, 18.3f, 14.1f, 25.2f)
                curveToRelative(3.8f, 3.9f, 7.7f, 8.0f, 9.2f, 11.5f)
                reflectiveCurveToRelative(1.4f, 8.7f, 1.5f, 14.0f)
                curveToRelative(0.1f, 9.7f, 0.3f, 20.8f, 8.0f, 28.5f)
                reflectiveCurveToRelative(18.8f, 7.9f, 28.5f, 8.0f)
                curveToRelative(5.3f, 0.1f, 10.7f, 0.2f, 14.0f, 1.5f)
                reflectiveCurveToRelative(7.6f, 5.4f, 11.5f, 9.2f)
                curveToRelative(6.9f, 6.6f, 14.8f, 14.1f, 25.2f, 14.1f)
                reflectiveCurveToRelative(18.3f, -7.5f, 25.2f, -14.1f)
                curveToRelative(3.9f, -3.8f, 8.0f, -7.7f, 11.5f, -9.2f)
                reflectiveCurveToRelative(8.7f, -1.4f, 14.0f, -1.5f)
                curveToRelative(9.7f, -0.1f, 20.8f, -0.3f, 28.5f, -8.0f)
                reflectiveCurveToRelative(7.9f, -18.8f, 8.0f, -28.5f)
                curveToRelative(0.1f, -5.3f, 0.2f, -10.7f, 1.5f, -14.0f)
                reflectiveCurveToRelative(5.4f, -7.6f, 9.2f, -11.5f)
                curveToRelative(6.6f, -6.9f, 14.1f, -14.8f, 14.1f, -25.2f)
                reflectiveCurveTo(232.5f, 109.7f, 225.9f, 102.8f)
                close()
                moveTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _circleWavyWarning!!
    }

private var _circleWavyWarning: ImageVector? = null
