package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.2f, 58.0f)
                curveToRelative(-6.4f, -11.1f, -23.3f, -21.4f, -67.5f, -9.5f)
                arcTo(95.9f, 95.9f, 0.0f, false, false, 32.0f, 128.0f)
                curveToRelative(0.0f, 2.3f, 0.1f, 4.6f, 0.2f, 6.8f)
                curveTo(-0.1f, 167.1f, 0.4f, 186.9f, 6.8f, 198.0f)
                reflectiveCurveToRelative(19.3f, 14.7f, 33.3f, 14.7f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, false, 26.3f, -3.2f)
                lineToRelative(7.8f, -2.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 128.0f)
                curveToRelative(0.0f, -2.3f, -0.1f, -4.6f, -0.2f, -6.8f)
                lineToRelative(5.6f, -5.8f)
                curveTo(244.2f, 99.2f, 259.7f, 76.2f, 249.2f, 58.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, true, 70.3f, 56.3f)
                curveTo(183.0f, 126.0f, 163.6f, 139.8f, 142.0f, 152.2f)
                reflectiveCurveTo(98.8f, 174.6f, 79.3f, 181.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 56.0f)
                close()
                moveTo(27.5f, 186.0f)
                curveToRelative(-1.0f, -1.8f, 0.7f, -9.6f, 11.2f, -22.7f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, false, 14.1f, 24.3f)
                curveTo(34.8f, 190.5f, 28.2f, 187.2f, 27.5f, 186.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(71.5f, 71.5f, 0.0f, false, true, -21.8f, -3.4f)
                arcTo(390.9f, 390.9f, 0.0f, false, false, 154.0f, 173.0f)
                arcToRelative(387.6f, 387.6f, 0.0f, false, false, 44.3f, -29.6f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(217.3f, 92.7f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, false, -14.1f, -24.3f)
                curveToRelative(16.6f, -2.7f, 24.2f, -0.2f, 25.3f, 1.6f)
                reflectiveCurveTo(228.8f, 78.5f, 217.3f, 92.7f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
