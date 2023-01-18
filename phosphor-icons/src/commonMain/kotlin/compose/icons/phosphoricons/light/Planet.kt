package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 61.0f)
                curveToRelative(-7.2f, -12.6f, -27.9f, -15.1f, -58.5f, -7.3f)
                arcTo(93.9f, 93.9f, 0.0f, false, false, 34.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, false, 0.9f, 12.7f)
                curveTo(12.8f, 163.2f, 4.7f, 182.4f, 12.0f, 195.0f)
                curveToRelative(4.5f, 7.8f, 14.0f, 11.8f, 27.9f, 11.8f)
                arcToRelative(118.8f, 118.8f, 0.0f, false, false, 25.2f, -3.2f)
                lineToRelative(5.4f, -1.3f)
                arcTo(93.9f, 93.9f, 0.0f, false, false, 222.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, false, -0.9f, -12.7f)
                lineToRelative(3.8f, -4.0f)
                curveTo(244.3f, 90.3f, 250.9f, 72.9f, 244.0f, 61.0f)
                close()
                moveTo(128.0f, 46.0f)
                arcToRelative(82.2f, 82.2f, 0.0f, false, true, 80.3f, 65.2f)
                curveToRelative(-16.4f, 15.7f, -38.4f, 31.9f, -63.3f, 46.2f)
                reflectiveCurveToRelative(-49.8f, 25.4f, -71.6f, 31.7f)
                arcTo(81.9f, 81.9f, 0.0f, false, true, 128.0f, 46.0f)
                close()
                moveTo(22.3f, 189.0f)
                curveToRelative(-4.2f, -7.3f, 4.7f, -21.5f, 15.7f, -34.0f)
                arcToRelative(93.5f, 93.5f, 0.0f, false, false, 21.7f, 37.5f)
                curveTo(36.5f, 197.3f, 25.2f, 193.9f, 22.3f, 189.0f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(81.7f, 81.7f, 0.0f, false, true, -42.7f, -12.0f)
                curveToRelative(20.5f, -6.8f, 43.2f, -17.2f, 65.7f, -30.2f)
                reflectiveCurveToRelative(42.8f, -27.4f, 58.9f, -41.8f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, 0.1f, 2.0f)
                arcTo(82.1f, 82.1f, 0.0f, false, true, 128.0f, 210.0f)
                close()
                moveTo(196.3f, 63.5f)
                curveToRelative(23.1f, -4.7f, 34.5f, -1.4f, 37.4f, 3.5f)
                reflectiveCurveToRelative(0.0f, 16.3f, -15.6f, 34.0f)
                arcTo(93.7f, 93.7f, 0.0f, false, false, 196.3f, 63.5f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
