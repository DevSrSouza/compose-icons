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

public val SolidGroup.ShieldCat: ImageVector
    get() {
        if (_shieldCat != null) {
            return _shieldCat!!
        }
        _shieldCat = Builder(name = "ShieldCat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(160.0f, 154.4f)
                curveToRelative(0.0f, -5.8f, 4.7f, -10.4f, 10.4f, -10.4f)
                horizontalLineToRelative(0.2f)
                curveToRelative(3.4f, 0.0f, 6.5f, 1.6f, 8.5f, 4.3f)
                lineToRelative(40.0f, 53.3f)
                curveToRelative(3.0f, 4.0f, 7.8f, 6.4f, 12.8f, 6.4f)
                horizontalLineToRelative(48.0f)
                curveToRelative(5.0f, 0.0f, 9.8f, -2.4f, 12.8f, -6.4f)
                lineToRelative(40.0f, -53.3f)
                curveToRelative(2.0f, -2.7f, 5.2f, -4.3f, 8.5f, -4.3f)
                horizontalLineToRelative(0.2f)
                curveToRelative(5.8f, 0.0f, 10.4f, 4.7f, 10.4f, 10.4f)
                lineTo(351.8f, 272.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(159.8f, 154.4f)
                close()
                moveTo(216.0f, 288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(312.0f, 272.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldCat!!
    }

private var _shieldCat: ImageVector? = null
