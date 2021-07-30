package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.82f, 458.1f)
                lineTo(494.97f, 350.78f)
                curveToRelative(0.52f, -5.57f, 1.03f, -11.16f, 1.03f, -16.87f)
                curveToRelative(0.0f, -111.76f, -99.79f, -153.34f, -146.78f, -311.82f)
                curveToRelative(-7.94f, -28.78f, -49.44f, -30.12f, -58.44f, 0.0f)
                curveToRelative(-15.52f, 52.34f, -36.87f, 91.96f, -58.49f, 125.68f)
                lineTo(45.47f, 3.37f)
                curveTo(38.49f, -2.05f, 28.43f, -0.8f, 23.01f, 6.18f)
                lineTo(3.37f, 31.45f)
                curveTo(-2.05f, 38.42f, -0.8f, 48.47f, 6.18f, 53.9f)
                lineToRelative(588.36f, 454.73f)
                curveToRelative(6.98f, 5.43f, 17.03f, 4.17f, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                curveToRelative(5.41f, -6.97f, 4.16f, -17.02f, -2.82f, -22.45f)
                close()
                moveTo(144.0f, 333.91f)
                curveTo(144.0f, 432.35f, 222.72f, 512.0f, 320.0f, 512.0f)
                curveToRelative(44.71f, 0.0f, 85.37f, -16.96f, 116.4f, -44.7f)
                lineTo(162.72f, 255.78f)
                curveToRelative(-11.41f, 23.5f, -18.72f, 48.35f, -18.72f, 78.13f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
