package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 32.0f)
                curveTo(50.1f, 32.0f, 0.0f, 82.1f, 0.0f, 144.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                lineTo(224.0f, 144.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                close()
                moveTo(160.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                lineTo(64.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(112.0f)
                close()
                moveTo(299.7f, 226.3f)
                curveToRelative(-3.5f, -3.5f, -9.4f, -3.1f, -12.3f, 0.8f)
                curveToRelative(-45.3f, 62.5f, -40.4f, 150.1f, 15.9f, 206.4f)
                curveToRelative(56.3f, 56.3f, 143.9f, 61.2f, 206.4f, 15.9f)
                curveToRelative(4.0f, -2.9f, 4.3f, -8.8f, 0.8f, -12.3f)
                lineTo(299.7f, 226.3f)
                close()
                moveTo(529.5f, 207.3f)
                curveToRelative(-56.3f, -56.3f, -143.9f, -61.2f, -206.4f, -15.9f)
                curveToRelative(-4.0f, 2.9f, -4.3f, 8.8f, -0.8f, 12.3f)
                lineToRelative(210.8f, 210.8f)
                curveToRelative(3.5f, 3.5f, 9.4f, 3.1f, 12.3f, -0.8f)
                curveToRelative(45.3f, -62.6f, 40.5f, -150.1f, -15.9f, -206.4f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
