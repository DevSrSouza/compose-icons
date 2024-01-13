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

public val SolidGroup.ShieldVirus: ImageVector
    get() {
        if (_shieldVirus != null) {
            return _shieldVirus!!
        }
        _shieldVirus = Builder(name = "ShieldVirus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.4f, 2.9f)
                curveTo(265.2f, 1.0f, 260.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-9.2f, 1.0f, -13.4f, 2.9f)
                lineTo(54.3f, 82.8f)
                curveToRelative(-22.0f, 9.3f, -38.4f, 31.0f, -38.3f, 57.2f)
                curveToRelative(0.5f, 99.2f, 41.3f, 280.7f, 213.6f, 363.2f)
                curveToRelative(16.7f, 8.0f, 36.1f, 8.0f, 52.8f, 0.0f)
                curveTo(454.7f, 420.7f, 495.5f, 239.2f, 496.0f, 140.0f)
                curveToRelative(0.1f, -26.2f, -16.3f, -47.9f, -38.3f, -57.2f)
                lineTo(269.4f, 2.9f)
                close()
                moveTo(256.0f, 112.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                curveToRelative(0.0f, 33.0f, 39.9f, 49.5f, 63.2f, 26.2f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                curveTo(334.5f, 200.1f, 351.0f, 240.0f, 384.0f, 240.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-33.0f, 0.0f, -49.5f, 39.9f, -26.2f, 63.2f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                curveTo(311.9f, 334.5f, 272.0f, 351.0f, 272.0f, 384.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -33.0f, -39.9f, -49.5f, -63.2f, -26.2f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                curveTo(177.5f, 311.9f, 161.0f, 272.0f, 128.0f, 272.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                curveToRelative(33.0f, 0.0f, 49.5f, -39.9f, 26.2f, -63.2f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                curveTo(200.1f, 177.5f, 240.0f, 161.0f, 240.0f, 128.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(232.0f, 256.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(304.0f, 288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldVirus!!
    }

private var _shieldVirus: ImageVector? = null
