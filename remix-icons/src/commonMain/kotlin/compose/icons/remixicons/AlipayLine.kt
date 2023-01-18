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

public val RemixIcons.AlipayLine: ImageVector
    get() {
        if (_alipayLine != null) {
            return _alipayLine!!
        }
        _alipayLine = Builder(name = "AlipayLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.408f, 16.79f)
                curveToRelative(-2.173f, -0.95f, -3.72f, -1.646f, -4.64f, -2.086f)
                curveToRelative(-1.4f, 1.696f, -2.872f, 2.72f, -5.08f, 2.72f)
                reflectiveCurveTo(5.0f, 16.064f, 5.176f, 14.392f)
                curveToRelative(0.12f, -1.096f, 0.872f, -2.888f, 4.128f, -2.576f)
                curveToRelative(1.72f, 0.16f, 2.504f, 0.48f, 3.912f, 0.944f)
                curveToRelative(0.36f, -0.664f, 0.664f, -1.4f, 0.888f, -2.176f)
                lineTo(7.88f, 10.584f)
                verticalLineToRelative(-0.616f)
                horizontalLineToRelative(3.072f)
                lineTo(10.952f, 8.864f)
                lineTo(7.2f, 8.864f)
                verticalLineToRelative(-0.68f)
                horizontalLineToRelative(3.752f)
                lineTo(10.952f, 6.592f)
                reflectiveCurveToRelative(0.032f, -0.248f, 0.312f, -0.248f)
                lineTo(12.8f, 6.344f)
                verticalLineToRelative(1.848f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.68f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.104f)
                horizontalLineToRelative(3.264f)
                arcToRelative(12.41f, 12.41f, 0.0f, false, true, -1.32f, 3.32f)
                curveToRelative(0.51f, 0.182f, 2.097f, 0.676f, 4.76f, 1.483f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -1.096f, 2.012f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.432f, 16.368f)
                curveToRelative(1.44f, 0.0f, 2.824f, -0.872f, 3.96f, -2.352f)
                curveToRelative(-1.608f, -0.776f, -2.944f, -1.16f, -4.44f, -1.16f)
                curveToRelative(-1.304f, 0.0f, -1.984f, 0.8f, -2.104f, 1.416f)
                curveToRelative(-0.12f, 0.616f, 0.248f, 2.096f, 2.584f, 2.096f)
                close()
            }
        }
        .build()
        return _alipayLine!!
    }

private var _alipayLine: ImageVector? = null
