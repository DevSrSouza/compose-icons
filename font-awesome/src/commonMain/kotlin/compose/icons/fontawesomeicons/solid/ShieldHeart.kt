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

public val SolidGroup.ShieldHeart: ImageVector
    get() {
        if (_shieldHeart != null) {
            return _shieldHeart!!
        }
        _shieldHeart = Builder(name = "ShieldHeart", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(144.0f, 221.3f)
                curveToRelative(0.0f, -33.8f, 27.4f, -61.3f, 61.3f, -61.3f)
                curveToRelative(16.2f, 0.0f, 31.8f, 6.5f, 43.3f, 17.9f)
                lineToRelative(7.4f, 7.4f)
                lineToRelative(7.4f, -7.4f)
                curveToRelative(11.5f, -11.5f, 27.1f, -17.9f, 43.3f, -17.9f)
                curveToRelative(33.8f, 0.0f, 61.3f, 27.4f, 61.3f, 61.3f)
                curveToRelative(0.0f, 16.2f, -6.5f, 31.8f, -17.9f, 43.3f)
                lineToRelative(-82.7f, 82.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-82.7f, -82.7f)
                curveToRelative(-11.5f, -11.5f, -17.9f, -27.1f, -17.9f, -43.3f)
                close()
            }
        }
        .build()
        return _shieldHeart!!
    }

private var _shieldHeart: ImageVector? = null
