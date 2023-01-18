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

public val RemixIcons.DingdingFill: ImageVector
    get() {
        if (_dingdingFill != null) {
            return _dingdingFill!!
        }
        _dingdingFill = Builder(name = "DingdingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.49f, 11.04f)
                lineToRelative(-0.006f, 0.014f)
                curveToRelative(-0.42f, 0.898f, -1.516f, 2.66f, -1.516f, 2.66f)
                lineToRelative(-0.005f, -0.012f)
                lineToRelative(-0.32f, 0.558f)
                horizontalLineToRelative(1.543f)
                lineToRelative(-2.948f, 3.919f)
                lineToRelative(0.67f, -2.666f)
                horizontalLineToRelative(-1.215f)
                lineToRelative(0.422f, -1.763f)
                curveToRelative(-0.341f, 0.082f, -0.745f, 0.195f, -1.223f, 0.349f)
                curveToRelative(0.0f, 0.0f, -0.646f, 0.378f, -1.862f, -0.729f)
                curveToRelative(0.0f, 0.0f, -0.82f, -0.722f, -0.344f, -0.902f)
                curveToRelative(0.202f, -0.077f, 0.981f, -0.175f, 1.594f, -0.257f)
                curveToRelative(0.83f, -0.112f, 1.339f, -0.172f, 1.339f, -0.172f)
                reflectiveCurveToRelative(-2.555f, 0.038f, -3.161f, -0.057f)
                curveToRelative(-0.606f, -0.095f, -1.375f, -1.107f, -1.539f, -1.996f)
                curveToRelative(0.0f, 0.0f, -0.253f, -0.488f, 0.545f, -0.257f)
                curveToRelative(0.798f, 0.231f, 4.101f, 0.9f, 4.101f, 0.9f)
                reflectiveCurveTo(8.27f, 9.312f, 7.983f, 8.99f)
                curveToRelative(-0.286f, -0.32f, -0.841f, -1.754f, -0.769f, -2.634f)
                curveToRelative(0.0f, 0.0f, 0.031f, -0.22f, 0.257f, -0.16f)
                curveToRelative(0.0f, 0.0f, 3.176f, 1.45f, 5.347f, 2.245f)
                curveToRelative(2.172f, 0.795f, 4.06f, 1.199f, 3.816f, 2.228f)
                curveToRelative(-0.02f, 0.087f, -0.072f, 0.216f, -0.144f, 0.37f)
                close()
            }
        }
        .build()
        return _dingdingFill!!
    }

private var _dingdingFill: ImageVector? = null
