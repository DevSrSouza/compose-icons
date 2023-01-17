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

public val SimpleIcons.Precommit: ImageVector
    get() {
        if (_precommit != null) {
            return _precommit!!
        }
        _precommit = Builder(name = "Precommit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.563f, 0.0f, -1.127f, 0.215f, -1.557f, 0.645f)
                lineTo(0.645f, 10.443f)
                curveToRelative(-0.86f, 0.86f, -0.86f, 2.254f, 0.0f, 3.114f)
                lineToRelative(9.798f, 9.798f)
                curveToRelative(0.86f, 0.86f, 2.254f, 0.86f, 3.114f, 0.0f)
                lineToRelative(9.798f, -9.798f)
                curveToRelative(0.86f, -0.86f, 0.86f, -2.254f, 0.0f, -3.114f)
                lineTo(13.557f, 0.645f)
                arcTo(2.195f, 2.195f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.74f)
                curveToRelative(0.493f, 0.0f, 0.987f, 0.186f, 1.361f, 0.56f)
                lineTo(21.7f, 10.64f)
                curveToRelative(0.75f, 0.75f, 0.75f, 1.973f, 0.0f, 2.722f)
                lineTo(13.361f, 21.7f)
                curveToRelative(-0.374f, 0.375f, -0.868f, 0.56f, -1.361f, 0.56f)
                reflectiveCurveToRelative(-0.987f, -0.185f, -1.361f, -0.56f)
                lineTo(2.3f, 13.361f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 0.0f, -2.722f)
                lineTo(10.639f, 2.3f)
                curveToRelative(0.374f, -0.375f, 0.868f, -0.56f, 1.361f, -0.56f)
                close()
                moveTo(12.0f, 2.36f)
                curveToRelative(-0.333f, 0.0f, -0.664f, 0.127f, -0.92f, 0.382f)
                lineTo(2.742f, 11.08f)
                arcToRelative(1.295f, 1.295f, 0.0f, false, false, 0.0f, 1.84f)
                lineToRelative(8.338f, 8.338f)
                arcToRelative(1.296f, 1.296f, 0.0f, false, false, 1.84f, 0.0f)
                lineToRelative(8.338f, -8.338f)
                arcToRelative(1.295f, 1.295f, 0.0f, false, false, 0.0f, -1.84f)
                lineTo(12.92f, 2.742f)
                arcTo(1.296f, 1.296f, 0.0f, false, false, 12.0f, 2.36f)
                close()
                moveTo(9.207f, 7.624f)
                horizontalLineToRelative(3.959f)
                curveToRelative(0.55f, 0.0f, 1.015f, 0.079f, 1.4f, 0.238f)
                curveToRelative(0.385f, 0.16f, 0.7f, 0.371f, 0.942f, 0.633f)
                curveToRelative(0.241f, 0.262f, 0.417f, 0.561f, 0.527f, 0.897f)
                arcToRelative(3.34f, 3.34f, 0.0f, false, true, 0.0f, 2.084f)
                curveToRelative(-0.11f, 0.34f, -0.286f, 0.64f, -0.527f, 0.902f)
                arcToRelative(2.628f, 2.628f, 0.0f, false, true, -0.942f, 0.633f)
                curveToRelative(-0.385f, 0.16f, -0.85f, 0.238f, -1.4f, 0.238f)
                horizontalLineToRelative(-2.043f)
                verticalLineToRelative(3.156f)
                lineTo(9.207f, 16.405f)
                close()
                moveTo(11.123f, 9.108f)
                verticalLineToRelative(2.657f)
                horizontalLineToRelative(1.514f)
                curveToRelative(0.222f, 0.0f, 0.434f, -0.016f, 0.64f, -0.05f)
                curveToRelative(0.207f, -0.032f, 0.39f, -0.097f, 0.547f, -0.193f)
                curveToRelative(0.158f, -0.095f, 0.284f, -0.23f, 0.38f, -0.404f)
                curveToRelative(0.094f, -0.174f, 0.142f, -0.401f, 0.142f, -0.682f)
                curveToRelative(0.0f, -0.28f, -0.048f, -0.507f, -0.143f, -0.681f)
                arcToRelative(1.053f, 1.053f, 0.0f, false, false, -0.379f, -0.404f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, false, -0.547f, -0.194f)
                arcToRelative(4.056f, 4.056f, 0.0f, false, false, -0.64f, -0.049f)
                close()
            }
        }
        .build()
        return _precommit!!
    }

private var _precommit: ImageVector? = null
