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

public val SimpleIcons.Zazzle: ImageVector
    get() {
        if (_zazzle != null) {
            return _zazzle!!
        }
        _zazzle = Builder(name = "Zazzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.382f, 5.382f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.382f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.382f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.618f, 0.0f, 12.0f)
                close()
                moveTo(5.936f, 18.179f)
                curveToRelative(0.134f, 0.177f, 0.422f, 0.155f, 0.665f, -0.045f)
                curveToRelative(0.532f, -0.42f, 1.042f, -0.753f, 2.016f, -0.753f)
                curveToRelative(1.839f, 0.0f, 3.301f, 1.152f, 5.495f, 1.152f)
                curveToRelative(1.684f, 0.021f, 2.747f, -0.62f, 3.346f, -1.485f)
                curveToRelative(0.465f, -0.664f, 0.686f, -1.573f, 0.686f, -2.282f)
                curveToRelative(0.0f, -0.997f, -0.576f, -1.662f, -1.573f, -1.662f)
                curveToRelative(-0.953f, 0.0f, -1.373f, 0.487f, -1.419f, 1.196f)
                curveToRelative(-0.021f, 0.288f, -0.021f, 0.843f, -0.199f, 1.108f)
                curveToRelative(-0.177f, 0.288f, -0.51f, 0.377f, -0.908f, 0.377f)
                curveToRelative(-1.042f, 0.0f, -2.283f, -0.841f, -3.655f, -0.841f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(8.928f, -7.223f)
                curveToRelative(0.155f, -0.112f, 0.222f, -0.377f, 0.045f, -0.51f)
                lineToRelative(-1.374f, -1.618f)
                curveToRelative(-0.244f, -0.222f, -0.421f, -0.199f, -0.665f, 0.0f)
                curveToRelative(-0.466f, 0.377f, -0.908f, 0.754f, -1.861f, 0.754f)
                curveToRelative(-1.552f, 0.0f, -3.213f, -0.975f, -5.383f, -0.975f)
                curveToRelative(-1.55f, 0.0f, -2.416f, 0.576f, -3.014f, 1.197f)
                curveToRelative(-0.576f, 0.62f, -0.974f, 1.617f, -0.974f, 2.57f)
                curveToRelative(0.0f, 0.975f, 0.576f, 1.595f, 1.529f, 1.595f)
                curveToRelative(0.864f, 0.0f, 1.374f, -0.487f, 1.374f, -1.174f)
                curveToRelative(0.0f, -0.398f, 0.021f, -0.753f, 0.199f, -1.018f)
                curveToRelative(0.155f, -0.266f, 0.554f, -0.51f, 1.108f, -0.51f)
                curveToRelative(0.864f, 0.0f, 2.503f, 0.597f, 3.523f, 0.597f)
                horizontalLineToRelative(0.066f)
                lineToRelative(-9.04f, 7.179f)
                curveToRelative(-0.177f, 0.133f, -0.177f, 0.442f, -0.066f, 0.597f)
                close()
            }
        }
        .build()
        return _zazzle!!
    }

private var _zazzle: ImageVector? = null
