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

public val RemixIcons.ZcoolLine: ImageVector
    get() {
        if (_zcoolLine != null) {
            return _zcoolLine!!
        }
        _zcoolLine = Builder(name = "ZcoolLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.26f, 8.26f)
                curveTo(5.838f, 8.803f, 4.0f, 11.208f, 4.0f, 13.935f)
                arcToRelative(5.903f, 5.903f, 0.0f, false, false, 11.703f, 1.098f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.129f, -1.448f)
                curveToRelative(0.482f, -0.222f, 0.91f, -0.473f, 1.284f, -0.743f)
                curveToRelative(-0.863f, -0.603f, -1.186f, -1.862f, -0.47f, -2.834f)
                arcToRelative(9.796f, 9.796f, 0.0f, false, false, 1.391f, -2.651f)
                arcToRelative(19.04f, 19.04f, 0.0f, false, true, -3.668f, 1.265f)
                curveToRelative(-1.261f, 0.303f, -2.392f, -0.638f, -2.466f, -1.814f)
                curveToRelative(-1.18f, 0.572f, -2.67f, 1.01f, -4.642f, 1.452f)
                close()
                moveTo(19.256f, 11.194f)
                curveToRelative(1.166f, 0.0f, 1.917f, -0.424f, 2.744f, -0.587f)
                curveToRelative(-0.325f, 1.448f, -1.5f, 3.49f, -4.33f, 4.795f)
                arcTo(7.903f, 7.903f, 0.0f, false, true, 2.0f, 13.936f)
                curveTo(2.0f, 10.29f, 4.467f, 7.06f, 7.824f, 6.308f)
                curveTo(11.745f, 5.43f, 13.528f, 4.742f, 14.9f, 2.0f)
                curveToRelative(0.689f, 1.333f, 0.689f, 2.892f, 0.0f, 4.677f)
                curveToRelative(2.816f, -0.67f, 5.074f, -1.852f, 6.774f, -3.548f)
                curveToRelative(0.0f, 4.802f, -1.822f, 7.186f, -2.419f, 8.065f)
                close()
                moveTo(13.416f, 15.126f)
                curveToRelative(0.584f, 0.145f, 0.584f, 0.832f, 0.584f, 1.02f)
                verticalLineToRelative(1.022f)
                curveToRelative(0.0f, 0.561f, -0.342f, 0.773f, -0.844f, 0.773f)
                lineTo(7.742f, 17.941f)
                curveToRelative(-0.475f, -0.087f, -0.734f, -0.346f, -0.734f, -0.778f)
                verticalLineToRelative(-0.95f)
                curveToRelative(0.0f, -0.475f, 0.216f, -0.82f, 0.432f, -1.08f)
                lineToRelative(3.152f, -3.369f)
                lineTo(7.526f, 11.764f)
                curveToRelative(-0.302f, 0.0f, -0.518f, -0.216f, -0.518f, -0.604f)
                curveToRelative(-0.044f, -0.735f, 0.086f, -1.9f, 0.647f, -2.16f)
                curveToRelative(0.087f, 0.0f, 0.087f, 0.13f, 0.087f, 0.173f)
                curveToRelative(-0.087f, 0.173f, 0.0f, 0.302f, 0.216f, 0.302f)
                horizontalLineToRelative(3.887f)
                curveToRelative(0.863f, 0.0f, 1.381f, 0.0f, 1.684f, -0.086f)
                curveToRelative(0.13f, -0.043f, 0.216f, 0.0f, 0.173f, 0.13f)
                curveToRelative(-0.087f, 0.302f, -0.044f, 0.647f, -0.044f, 0.95f)
                curveToRelative(0.0f, 0.993f, 0.0f, 1.382f, -0.777f, 2.159f)
                lineToRelative(-2.678f, 2.937f)
                lineToRelative(2.85f, -0.002f)
                curveToRelative(0.316f, 0.0f, 0.364f, -0.146f, 0.364f, -0.437f)
                close()
            }
        }
        .build()
        return _zcoolLine!!
    }

private var _zcoolLine: ImageVector? = null
