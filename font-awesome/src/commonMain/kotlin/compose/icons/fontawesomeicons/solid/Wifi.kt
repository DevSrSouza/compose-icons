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

public val SolidGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.2f, 202.9f)
                curveTo(123.2f, 136.7f, 216.8f, 96.0f, 320.0f, 96.0f)
                reflectiveCurveToRelative(196.8f, 40.7f, 265.8f, 106.9f)
                curveToRelative(12.8f, 12.2f, 33.0f, 11.8f, 45.2f, -0.9f)
                reflectiveCurveToRelative(11.8f, -33.0f, -0.9f, -45.2f)
                curveTo(549.7f, 79.5f, 440.4f, 32.0f, 320.0f, 32.0f)
                reflectiveCurveTo(90.3f, 79.5f, 9.8f, 156.7f)
                curveTo(-2.9f, 169.0f, -3.3f, 189.2f, 8.9f, 202.0f)
                reflectiveCurveToRelative(32.5f, 13.2f, 45.2f, 0.9f)
                close()
                moveTo(320.0f, 256.0f)
                curveToRelative(56.8f, 0.0f, 108.6f, 21.1f, 148.2f, 56.0f)
                curveToRelative(13.3f, 11.7f, 33.5f, 10.4f, 45.2f, -2.8f)
                reflectiveCurveToRelative(10.4f, -33.5f, -2.8f, -45.2f)
                curveTo(459.8f, 219.2f, 393.0f, 192.0f, 320.0f, 192.0f)
                reflectiveCurveToRelative(-139.8f, 27.2f, -190.5f, 72.0f)
                curveToRelative(-13.3f, 11.7f, -14.5f, 31.9f, -2.8f, 45.2f)
                reflectiveCurveToRelative(31.9f, 14.5f, 45.2f, 2.8f)
                curveToRelative(39.5f, -34.9f, 91.3f, -56.0f, 148.2f, -56.0f)
                close()
                moveTo(384.0f, 416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
