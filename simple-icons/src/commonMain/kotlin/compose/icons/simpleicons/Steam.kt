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

public val SimpleIcons.Steam: ImageVector
    get() {
        if (_steam != null) {
            return _steam!!
        }
        _steam = Builder(name = "Steam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.979f, 0.0f)
                curveTo(5.678f, 0.0f, 0.511f, 4.86f, 0.022f, 11.037f)
                lineToRelative(6.432f, 2.658f)
                curveToRelative(0.545f, -0.371f, 1.203f, -0.59f, 1.912f, -0.59f)
                curveToRelative(0.063f, 0.0f, 0.125f, 0.004f, 0.188f, 0.006f)
                lineToRelative(2.861f, -4.142f)
                lineTo(11.415f, 8.91f)
                curveToRelative(0.0f, -2.495f, 2.028f, -4.524f, 4.524f, -4.524f)
                curveToRelative(2.494f, 0.0f, 4.524f, 2.031f, 4.524f, 4.527f)
                reflectiveCurveToRelative(-2.03f, 4.525f, -4.524f, 4.525f)
                horizontalLineToRelative(-0.105f)
                lineToRelative(-4.076f, 2.911f)
                curveToRelative(0.0f, 0.052f, 0.004f, 0.105f, 0.004f, 0.159f)
                curveToRelative(0.0f, 1.875f, -1.515f, 3.396f, -3.39f, 3.396f)
                curveToRelative(-1.635f, 0.0f, -3.016f, -1.173f, -3.331f, -2.727f)
                lineTo(0.436f, 15.27f)
                curveTo(1.862f, 20.307f, 6.486f, 24.0f, 11.979f, 24.0f)
                curveToRelative(6.627f, 0.0f, 11.999f, -5.373f, 11.999f, -12.0f)
                reflectiveCurveTo(18.605f, 0.0f, 11.979f, 0.0f)
                close()
                moveTo(7.54f, 18.21f)
                lineToRelative(-1.473f, -0.61f)
                curveToRelative(0.262f, 0.543f, 0.714f, 0.999f, 1.314f, 1.25f)
                curveToRelative(1.297f, 0.539f, 2.793f, -0.076f, 3.332f, -1.375f)
                curveToRelative(0.263f, -0.63f, 0.264f, -1.319f, 0.005f, -1.949f)
                reflectiveCurveToRelative(-0.75f, -1.121f, -1.377f, -1.383f)
                curveToRelative(-0.624f, -0.26f, -1.29f, -0.249f, -1.878f, -0.03f)
                lineToRelative(1.523f, 0.63f)
                curveToRelative(0.956f, 0.4f, 1.409f, 1.5f, 1.009f, 2.455f)
                curveToRelative(-0.397f, 0.957f, -1.497f, 1.41f, -2.454f, 1.012f)
                lineTo(7.54f, 18.21f)
                close()
                moveTo(18.955f, 8.907f)
                curveToRelative(0.0f, -1.662f, -1.353f, -3.015f, -3.015f, -3.015f)
                curveToRelative(-1.665f, 0.0f, -3.015f, 1.353f, -3.015f, 3.015f)
                curveToRelative(0.0f, 1.665f, 1.35f, 3.015f, 3.015f, 3.015f)
                curveToRelative(1.663f, 0.0f, 3.015f, -1.35f, 3.015f, -3.015f)
                close()
                moveTo(13.682f, 8.902f)
                curveToRelative(0.0f, -1.252f, 1.013f, -2.266f, 2.265f, -2.266f)
                curveToRelative(1.249f, 0.0f, 2.266f, 1.014f, 2.266f, 2.266f)
                curveToRelative(0.0f, 1.251f, -1.017f, 2.265f, -2.266f, 2.265f)
                curveToRelative(-1.253f, 0.0f, -2.265f, -1.014f, -2.265f, -2.265f)
                close()
            }
        }
        .build()
        return _steam!!
    }

private var _steam: ImageVector? = null
