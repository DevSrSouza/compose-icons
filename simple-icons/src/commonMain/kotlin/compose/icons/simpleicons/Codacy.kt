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

public val SimpleIcons.Codacy: ImageVector
    get() {
        if (_codacy != null) {
            return _codacy!!
        }
        _codacy = Builder(name = "Codacy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.883f, 9.825f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, 3.875f, -5.07f)
                lineToRelative(0.04f, -0.021f)
                lineToRelative(-1.803f, -3.113f)
                curveTo(3.276f, 3.212f, 1.268f, 5.769f, 0.427f, 8.81f)
                lineToRelative(-0.02f, 0.084f)
                close()
                moveTo(9.824f, 3.894f)
                arcToRelative(8.246f, 8.246f, 0.0f, false, true, 2.164f, -0.283f)
                horizontalLineToRelative(0.005f)
                verticalLineTo(0.016f)
                horizontalLineToRelative(-0.019f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -3.165f, 0.421f)
                lineToRelative(0.084f, -0.02f)
                close()
                moveTo(14.178f, 3.897f)
                arcToRelative(8.449f, 8.449f, 0.0f, false, true, 5.063f, 3.875f)
                lineToRelative(0.021f, 0.04f)
                lineToRelative(3.117f, -1.799f)
                curveToRelative(-1.591f, -2.718f, -4.146f, -4.726f, -7.186f, -5.568f)
                lineToRelative(-0.084f, -0.02f)
                close()
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.0f, 1.1f, 0.148f, 2.165f, 0.425f, 3.177f)
                lineToRelative(-0.02f, -0.084f)
                lineToRelative(3.476f, -0.929f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, true, -0.284f, -2.161f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(1.605f, 17.995f)
                curveToRelative(0.55f, 0.941f, 1.18f, 1.754f, 1.901f, 2.475f)
                lineToRelative(2.553f, -2.54f)
                arcToRelative(8.56f, 8.56f, 0.0f, false, true, -1.313f, -1.695f)
                lineToRelative(-0.022f, -0.04f)
                close()
                moveTo(5.995f, 22.38f)
                arcToRelative(11.77f, 11.77f, 0.0f, false, false, 5.967f, 1.604f)
                horizontalLineToRelative(0.021f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(-3.595f)
                horizontalLineToRelative(-0.004f)
                arcToRelative(8.308f, 8.308f, 0.0f, false, true, -4.223f, -1.145f)
                lineToRelative(0.039f, 0.021f)
                close()
                moveTo(19.259f, 16.205f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, true, -5.034f, 3.884f)
                lineToRelative(-0.059f, 0.014f)
                lineToRelative(0.931f, 3.476f)
                curveToRelative(3.124f, -0.86f, 5.681f, -2.863f, 7.246f, -5.52f)
                lineToRelative(0.031f, -0.056f)
                close()
                moveTo(23.577f, 15.221f)
                curveToRelative(0.268f, -0.947f, 0.423f, -2.035f, 0.423f, -3.159f)
                curveToRelative(0.0f, -1.087f, -0.144f, -2.14f, -0.415f, -3.142f)
                lineToRelative(0.019f, 0.084f)
                lineToRelative(-3.486f, 0.931f)
                curveToRelative(0.175f, 0.64f, 0.275f, 1.374f, 0.275f, 2.132f)
                curveToRelative(0.0f, 0.79f, -0.109f, 1.555f, -0.313f, 2.28f)
                lineToRelative(0.014f, -0.059f)
                close()
            }
        }
        .build()
        return _codacy!!
    }

private var _codacy: ImageVector? = null
