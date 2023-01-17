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

public val SimpleIcons.Dynamics365: ImageVector
    get() {
        if (_dynamics365 != null) {
            return _dynamics365!!
        }
        _dynamics365 = Builder(name = "Dynamics365", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.805f, 11.322f)
                verticalLineToRelative(4.889f)
                arcToRelative(2.536f, 2.536f, 0.0f, false, true, -1.643f, 2.374f)
                lineToRelative(-1.732f, 0.652f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, true, -0.686f, -0.475f)
                verticalLineToRelative(-5.956f)
                lineToRelative(-3.392f, 1.239f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, false, -0.664f, 0.953f)
                verticalLineToRelative(7.986f)
                curveToRelative(0.0f, 0.705f, 0.7f, 1.195f, 1.363f, 0.953f)
                lineToRelative(10.161f, -3.713f)
                arcToRelative(2.535f, 2.535f, 0.0f, false, false, 1.666f, -2.382f)
                lineTo(20.878f, 7.696f)
                arcToRelative(2.537f, 2.537f, 0.0f, false, true, -1.666f, 2.381f)
                lineToRelative(-3.407f, 1.245f)
                close()
                moveTo(15.805f, 10.79f)
                lineTo(15.805f, 9.323f)
                arcToRelative(2.537f, 2.537f, 0.0f, false, false, -1.645f, -2.375f)
                lineToRelative(-1.728f, -0.65f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, false, -0.686f, 0.475f)
                verticalLineToRelative(4.59f)
                curveToRelative(0.0f, 0.701f, -0.695f, 1.191f, -1.355f, 0.956f)
                lineTo(3.795f, 9.963f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, -0.674f, -0.956f)
                lineTo(3.121f, 1.015f)
                curveToRelative(0.0f, -0.701f, 0.695f, -1.191f, 1.356f, -0.955f)
                lineToRelative(14.718f, 5.256f)
                arcTo(2.538f, 2.538f, 0.0f, false, true, 20.83f, 7.21f)
                curveToRelative(-0.136f, 0.861f, -1.05f, 2.128f, -1.79f, 2.398f)
                lineToRelative(-3.235f, 1.182f)
                close()
            }
        }
        .build()
        return _dynamics365!!
    }

private var _dynamics365: ImageVector? = null
