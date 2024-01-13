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

public val RegularGroup.FaceSmile: ImageVector
    get() {
        if (_faceSmile != null) {
            return _faceSmile!!
        }
        _faceSmile = Builder(name = "FaceSmile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(177.6f, 318.1f)
                curveTo(192.8f, 334.5f, 218.8f, 352.0f, 256.0f, 352.0f)
                reflectiveCurveToRelative(63.2f, -17.5f, 78.4f, -33.9f)
                curveToRelative(9.0f, -9.7f, 24.2f, -10.4f, 33.9f, -1.4f)
                reflectiveCurveToRelative(10.4f, 24.2f, 1.4f, 33.9f)
                curveToRelative(-22.0f, 23.8f, -60.0f, 49.4f, -113.6f, 49.4f)
                reflectiveCurveToRelative(-91.7f, -25.5f, -113.6f, -49.4f)
                curveToRelative(-9.0f, -9.7f, -8.4f, -24.9f, 1.4f, -33.9f)
                reflectiveCurveToRelative(24.9f, -8.4f, 33.9f, 1.4f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceSmile!!
    }

private var _faceSmile: ImageVector? = null
