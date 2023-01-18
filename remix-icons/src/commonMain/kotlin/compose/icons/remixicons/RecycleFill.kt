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

public val RemixIcons.RecycleFill: ImageVector
    get() {
        if (_recycleFill != null) {
            return _recycleFill!!
        }
        _recycleFill = Builder(name = "RecycleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.562f, 12.098f)
                lineToRelative(1.531f, 2.652f)
                curveToRelative(0.967f, 1.674f, 0.393f, 3.815f, -1.28f, 4.781f)
                curveToRelative(-0.533f, 0.307f, -1.136f, 0.469f, -1.75f, 0.469f)
                lineTo(16.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-5.0f, -3.5f)
                lineToRelative(5.0f, -3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.062f)
                curveToRelative(0.088f, 0.0f, 0.174f, -0.023f, 0.25f, -0.067f)
                curveToRelative(0.213f, -0.123f, 0.301f, -0.378f, 0.221f, -0.601f)
                lineToRelative(-0.038f, -0.082f)
                lineToRelative(-1.531f, -2.652f)
                lineToRelative(2.598f, -1.5f)
                close()
                moveTo(7.737f, 9.384f)
                lineToRelative(0.53f, 6.08f)
                lineToRelative(-1.73f, -1.0f)
                lineToRelative(-1.032f, 1.786f)
                curveToRelative(-0.044f, 0.076f, -0.067f, 0.162f, -0.067f, 0.25f)
                curveToRelative(0.0f, 0.245f, 0.177f, 0.45f, 0.41f, 0.492f)
                lineToRelative(0.09f, 0.008f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.938f, 20.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.614f, 0.162f, -1.218f, 0.469f, -1.75f)
                lineToRelative(1.031f, -1.786f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(5.53f, -2.58f)
                close()
                moveTo(13.75f, 2.969f)
                curveToRelative(0.532f, 0.307f, 0.974f, 0.749f, 1.281f, 1.281f)
                lineToRelative(1.03f, 1.786f)
                lineToRelative(1.733f, -1.0f)
                lineToRelative(-0.53f, 6.08f)
                lineToRelative(-5.532f, -2.58f)
                lineToRelative(1.732f, -1.0f)
                lineToRelative(-1.031f, -1.786f)
                curveToRelative(-0.044f, -0.076f, -0.107f, -0.14f, -0.183f, -0.183f)
                curveToRelative(-0.213f, -0.123f, -0.478f, -0.072f, -0.631f, 0.11f)
                lineToRelative(-0.052f, 0.073f)
                lineToRelative(-1.53f, 2.652f)
                lineToRelative(-2.599f, -1.5f)
                lineToRelative(1.53f, -2.652f)
                curveToRelative(0.967f, -1.674f, 3.108f, -2.248f, 4.782f, -1.281f)
                close()
            }
        }
        .build()
        return _recycleFill!!
    }

private var _recycleFill: ImageVector? = null
