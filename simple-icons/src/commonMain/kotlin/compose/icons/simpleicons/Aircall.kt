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

public val SimpleIcons.Aircall: ImageVector
    get() {
        if (_aircall != null) {
            return _aircall!!
        }
        _aircall = Builder(name = "Aircall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.451f, 5.906f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, -5.375f, -5.39f)
                curveTo(16.727f, 0.204f, 14.508f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(7.273f, 0.204f, 5.924f, 0.516f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, -5.375f, 5.39f)
                curveTo(0.237f, 7.26f, 0.034f, 9.485f, 0.034f, 12.0f)
                reflectiveCurveToRelative(0.203f, 4.74f, 0.515f, 6.094f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, 5.375f, 5.39f)
                curveTo(7.273f, 23.796f, 9.492f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(4.727f, -0.204f, 6.076f, -0.516f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, 5.375f, -5.39f)
                curveToRelative(0.311f, -1.354f, 0.515f, -3.578f, 0.515f, -6.094f)
                curveToRelative(0.0f, -2.515f, -0.203f, -4.74f, -0.515f, -6.094f)
                close()
                moveTo(17.578f, 18.302f)
                lineToRelative(-0.003f, 0.001f)
                curveToRelative(-0.428f, 0.152f, -1.165f, 0.283f, -2.102f, 0.377f)
                lineToRelative(-0.147f, 0.014f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, true, -0.45f, -0.271f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, -1.296f, -1.074f)
                curveToRelative(-0.351f, -0.081f, -0.928f, -0.134f, -1.58f, -0.134f)
                reflectiveCurveToRelative(-1.229f, 0.053f, -1.58f, 0.134f)
                arcToRelative(1.817f, 1.817f, 0.0f, false, false, -1.291f, 1.062f)
                arcToRelative(0.466f, 0.466f, 0.0f, false, true, -0.471f, 0.281f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.129f, -0.012f)
                curveToRelative(-0.938f, -0.094f, -1.676f, -0.224f, -2.105f, -0.377f)
                lineToRelative(-0.003f, -0.001f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.492f, -0.713f)
                curveToRelative(0.0f, -0.032f, 0.003f, -0.066f, 0.005f, -0.098f)
                curveToRelative(0.073f, -0.979f, 0.666f, -3.272f, 1.552f, -5.89f)
                curveTo(8.5f, 8.609f, 9.559f, 6.187f, 10.037f, 5.714f)
                arcToRelative(1.029f, 1.029f, 0.0f, false, true, 0.404f, -0.26f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(0.314f, -0.106f, 0.892f, -0.178f, 1.554f, -0.178f)
                curveToRelative(0.663f, 0.0f, 1.241f, 0.071f, 1.554f, 0.178f)
                lineToRelative(0.005f, 0.002f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, true, 0.405f, 0.26f)
                curveToRelative(0.478f, 0.472f, 1.537f, 2.895f, 2.549f, 5.887f)
                curveToRelative(0.886f, 2.617f, 1.479f, 4.91f, 1.552f, 5.89f)
                curveToRelative(0.002f, 0.032f, 0.005f, 0.066f, 0.005f, 0.098f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.491f, 0.713f)
                close()
            }
        }
        .build()
        return _aircall!!
    }

private var _aircall: ImageVector? = null
