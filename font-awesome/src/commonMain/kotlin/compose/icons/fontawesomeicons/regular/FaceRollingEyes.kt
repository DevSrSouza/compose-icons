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

public val RegularGroup.FaceRollingEyes: ImageVector
    get() {
        if (_faceRollingEyes != null) {
            return _faceRollingEyes!!
        }
        _faceRollingEyes = Builder(name = "FaceRollingEyes", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(168.0f, 376.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(320.0f, 400.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(192.0f, 352.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(160.0f, 272.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -14.3f, 6.3f, -27.2f, 16.2f, -36.0f)
                curveToRelative(-0.2f, 1.3f, -0.2f, 2.6f, -0.2f, 4.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -1.4f, -0.1f, -2.7f, -0.2f, -4.0f)
                curveToRelative(10.0f, 8.8f, 16.2f, 21.7f, 16.2f, 36.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(160.0f, 304.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
                moveTo(352.0f, 272.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -14.3f, 6.3f, -27.2f, 16.2f, -36.0f)
                curveToRelative(-0.2f, 1.3f, -0.2f, 2.6f, -0.2f, 4.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -1.4f, -0.1f, -2.7f, -0.2f, -4.0f)
                curveToRelative(10.0f, 8.8f, 16.2f, 21.7f, 16.2f, 36.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(352.0f, 304.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
            }
        }
        .build()
        return _faceRollingEyes!!
    }

private var _faceRollingEyes: ImageVector? = null
