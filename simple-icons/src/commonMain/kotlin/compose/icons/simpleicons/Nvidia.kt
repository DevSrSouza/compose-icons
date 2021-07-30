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

public val SimpleIcons.Nvidia: ImageVector
    get() {
        if (_nvidia != null) {
            return _nvidia!!
        }
        _nvidia = Builder(name = "Nvidia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.948f, 8.798f)
                verticalLineToRelative(-1.43f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, 0.424f, -0.018f)
                curveToRelative(3.922f, -0.124f, 6.493f, 3.374f, 6.493f, 3.374f)
                reflectiveCurveToRelative(-2.774f, 3.851f, -5.75f, 3.851f)
                curveToRelative(-0.398f, 0.0f, -0.787f, -0.062f, -1.158f, -0.185f)
                verticalLineToRelative(-4.346f)
                curveToRelative(1.528f, 0.185f, 1.837f, 0.857f, 2.747f, 2.385f)
                lineToRelative(2.04f, -1.714f)
                reflectiveCurveToRelative(-1.492f, -1.952f, -4.0f, -1.952f)
                arcToRelative(6.016f, 6.016f, 0.0f, false, false, -0.796f, 0.035f)
                moveToRelative(0.0f, -4.735f)
                verticalLineToRelative(2.138f)
                lineToRelative(0.424f, -0.027f)
                curveToRelative(5.45f, -0.185f, 9.01f, 4.47f, 9.01f, 4.47f)
                reflectiveCurveToRelative(-4.08f, 4.964f, -8.33f, 4.964f)
                curveToRelative(-0.37f, 0.0f, -0.733f, -0.035f, -1.095f, -0.097f)
                verticalLineToRelative(1.325f)
                curveToRelative(0.3f, 0.035f, 0.61f, 0.062f, 0.91f, 0.062f)
                curveToRelative(3.957f, 0.0f, 6.82f, -2.023f, 9.593f, -4.408f)
                curveToRelative(0.459f, 0.371f, 2.34f, 1.263f, 2.73f, 1.652f)
                curveToRelative(-2.633f, 2.208f, -8.772f, 3.984f, -12.253f, 3.984f)
                curveToRelative(-0.335f, 0.0f, -0.653f, -0.018f, -0.971f, -0.053f)
                verticalLineToRelative(1.864f)
                lineTo(24.0f, 19.937f)
                lineTo(24.0f, 4.063f)
                close()
                moveTo(8.948f, 14.389f)
                verticalLineToRelative(1.131f)
                curveToRelative(-3.657f, -0.654f, -4.673f, -4.46f, -4.673f, -4.46f)
                reflectiveCurveToRelative(1.758f, -1.944f, 4.673f, -2.262f)
                verticalLineToRelative(1.237f)
                lineTo(8.94f, 10.035f)
                curveToRelative(-1.528f, -0.186f, -2.73f, 1.245f, -2.73f, 1.245f)
                reflectiveCurveToRelative(0.68f, 2.412f, 2.739f, 3.11f)
                moveTo(2.456f, 10.9f)
                reflectiveCurveToRelative(2.164f, -3.197f, 6.5f, -3.533f)
                lineTo(8.956f, 6.201f)
                curveTo(4.153f, 6.59f, 0.0f, 10.653f, 0.0f, 10.653f)
                reflectiveCurveToRelative(2.35f, 6.802f, 8.948f, 7.42f)
                verticalLineToRelative(-1.237f)
                curveToRelative(-4.84f, -0.6f, -6.492f, -5.936f, -6.492f, -5.936f)
                close()
            }
        }
        .build()
        return _nvidia!!
    }

private var _nvidia: ImageVector? = null
