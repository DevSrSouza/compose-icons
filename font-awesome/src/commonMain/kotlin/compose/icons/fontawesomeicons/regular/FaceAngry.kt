package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceAngry: ImageVector
    get() {
        if (_faceAngry != null) {
            return _faceAngry!!
        }
        _faceAngry = Builder(name = "FaceAngry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(328.4f, 393.5f)
                curveToRelative(9.7f, -9.0f, 10.2f, -24.2f, 1.2f, -33.9f)
                curveTo(315.3f, 344.3f, 290.6f, 328.0f, 256.0f, 328.0f)
                reflectiveCurveToRelative(-59.3f, 16.3f, -73.5f, 31.6f)
                curveToRelative(-9.0f, 9.7f, -8.5f, 24.9f, 1.2f, 33.9f)
                reflectiveCurveToRelative(24.9f, 8.5f, 33.9f, -1.2f)
                curveToRelative(7.4f, -7.9f, 20.0f, -16.4f, 38.5f, -16.4f)
                reflectiveCurveToRelative(31.1f, 8.5f, 38.5f, 16.4f)
                curveToRelative(9.0f, 9.7f, 24.2f, 10.2f, 33.9f, 1.2f)
                close()
                moveTo(176.4f, 272.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -1.5f, -0.1f, -3.0f, -0.3f, -4.4f)
                lineToRelative(10.9f, 3.6f)
                curveToRelative(8.4f, 2.8f, 17.4f, -1.7f, 20.2f, -10.1f)
                reflectiveCurveToRelative(-1.7f, -17.4f, -10.1f, -20.2f)
                lineToRelative(-96.0f, -32.0f)
                curveToRelative(-8.4f, -2.8f, -17.4f, 1.7f, -20.2f, 10.1f)
                reflectiveCurveToRelative(1.7f, 17.4f, 10.1f, 20.2f)
                lineToRelative(30.7f, 10.2f)
                curveToRelative(-5.8f, 5.8f, -9.3f, 13.8f, -9.3f, 22.6f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(368.4f, 240.0f)
                curveToRelative(0.0f, -8.9f, -3.6f, -17.0f, -9.5f, -22.8f)
                lineToRelative(30.2f, -10.1f)
                curveToRelative(8.4f, -2.8f, 12.9f, -11.9f, 10.1f, -20.2f)
                reflectiveCurveToRelative(-11.9f, -12.9f, -20.2f, -10.1f)
                lineToRelative(-96.0f, 32.0f)
                curveToRelative(-8.4f, 2.8f, -12.9f, 11.9f, -10.1f, 20.2f)
                reflectiveCurveToRelative(11.9f, 12.9f, 20.2f, 10.1f)
                lineToRelative(11.7f, -3.9f)
                curveToRelative(-0.2f, 1.5f, -0.3f, 3.1f, -0.3f, 4.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _faceAngry!!
    }

private var _faceAngry: ImageVector? = null
