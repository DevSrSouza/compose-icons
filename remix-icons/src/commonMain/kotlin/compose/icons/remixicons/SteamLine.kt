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

public val RemixIcons.SteamLine: ImageVector
    get() {
        if (_steamLine != null) {
            return _steamLine!!
        }
        _steamLine = Builder(name = "SteamLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                curveToRelative(-0.304f, 0.0f, -0.603f, -0.027f, -0.892f, -0.08f)
                lineToRelative(-2.651f, 1.989f)
                curveToRelative(0.028f, 0.193f, 0.043f, 0.39f, 0.043f, 0.591f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.177f, 0.012f, -0.352f, 0.034f, -0.524f)
                lineTo(1.708f, 14.43f)
                lineToRelative(0.75f, -1.854f)
                lineToRelative(3.826f, 1.545f)
                curveTo(7.013f, 13.138f, 8.182f, 12.5f, 9.5f, 12.5f)
                curveToRelative(0.163f, 0.0f, 0.323f, 0.01f, 0.48f, 0.029f)
                lineToRelative(2.042f, -3.061f)
                curveTo(12.007f, 9.314f, 12.0f, 9.158f, 12.0f, 9.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(9.5f, 14.5f)
                curveToRelative(-0.464f, 0.0f, -0.892f, 0.158f, -1.231f, 0.424f)
                lineToRelative(1.606f, 0.649f)
                curveToRelative(0.512f, 0.207f, 0.76f, 0.79f, 0.552f, 1.302f)
                curveToRelative(-0.207f, 0.512f, -0.79f, 0.76f, -1.302f, 0.552f)
                lineTo(7.52f, 16.78f)
                curveToRelative(0.136f, 0.972f, 0.971f, 1.721f, 1.981f, 1.721f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.864f, 11.81f)
                lineToRelative(-0.983f, 1.476f)
                curveToRelative(0.284f, 0.21f, 0.54f, 0.458f, 0.758f, 0.735f)
                lineToRelative(1.36f, -1.02f)
                curveToRelative(-0.44f, -0.332f, -0.825f, -0.735f, -1.135f, -1.191f)
                close()
                moveTo(17.0f, 6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _steamLine!!
    }

private var _steamLine: ImageVector? = null
