package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.3f, 131.3f)
                curveToRelative(-0.4f, 0.9f, -10.5f, 23.3f, -33.3f, 43.8f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -5.4f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineTo(101.4f, 63.1f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 106.0f, 49.8f)
                arcTo(132.4f, 132.4f, 0.0f, false, true, 128.0f, 48.0f)
                curveToRelative(34.9f, 0.0f, 66.6f, 13.3f, 91.7f, 38.3f)
                curveToRelative(18.8f, 18.9f, 27.3f, 37.7f, 27.6f, 38.5f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 247.3f, 131.3f)
                close()
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-22.0f, -24.2f)
                arcTo(128.6f, 128.6f, 0.0f, false, true, 128.0f, 208.0f)
                curveToRelative(-34.9f, 0.0f, -66.6f, -13.3f, -91.7f, -38.3f)
                curveTo(17.5f, 150.8f, 9.0f, 132.0f, 8.7f, 131.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, -6.5f)
                curveToRelative(0.7f, -1.6f, 16.3f, -36.0f, 52.6f, -58.3f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                close()
                moveTo(145.7f, 159.3f)
                lineTo(98.5f, 107.4f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 47.2f, 51.9f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
