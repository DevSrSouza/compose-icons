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

public val RegularGroup.FaceGrinSquint: ImageVector
    get() {
        if (_faceGrinSquint != null) {
            return _faceGrinSquint!!
        }
        _faceGrinSquint = Builder(name = "FaceGrinSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(349.5f, 308.4f)
                curveToRelative(18.7f, -4.4f, 35.9f, 12.0f, 25.5f, 28.1f)
                curveTo(350.4f, 374.6f, 306.3f, 400.0f, 255.9f, 400.0f)
                reflectiveCurveToRelative(-94.5f, -25.4f, -119.1f, -63.5f)
                curveToRelative(-10.4f, -16.1f, 6.8f, -32.5f, 25.5f, -28.1f)
                curveToRelative(28.9f, 6.8f, 60.5f, 10.5f, 93.6f, 10.5f)
                reflectiveCurveToRelative(64.7f, -3.7f, 93.6f, -10.5f)
                close()
                moveTo(133.5f, 146.7f)
                lineToRelative(89.9f, 47.9f)
                curveToRelative(10.7f, 5.7f, 10.7f, 21.1f, 0.0f, 26.8f)
                lineToRelative(-89.9f, 47.9f)
                curveToRelative(-7.9f, 4.2f, -17.5f, -1.5f, -17.5f, -10.5f)
                curveToRelative(0.0f, -2.8f, 1.0f, -5.5f, 2.8f, -7.6f)
                lineToRelative(36.0f, -43.2f)
                lineToRelative(-36.0f, -43.2f)
                curveToRelative(-1.8f, -2.1f, -2.8f, -4.8f, -2.8f, -7.6f)
                curveToRelative(0.0f, -9.0f, 9.6f, -14.7f, 17.5f, -10.5f)
                close()
                moveTo(396.0f, 157.1f)
                curveToRelative(0.0f, 2.8f, -1.0f, 5.5f, -2.8f, 7.6f)
                lineToRelative(-36.0f, 43.2f)
                lineToRelative(36.0f, 43.2f)
                curveToRelative(1.8f, 2.1f, 2.8f, 4.8f, 2.8f, 7.6f)
                curveToRelative(0.0f, 9.0f, -9.6f, 14.7f, -17.5f, 10.5f)
                lineToRelative(-89.9f, -47.9f)
                curveToRelative(-10.7f, -5.7f, -10.7f, -21.1f, 0.0f, -26.8f)
                lineToRelative(89.9f, -47.9f)
                curveToRelative(7.9f, -4.2f, 17.5f, 1.5f, 17.5f, 10.5f)
                close()
            }
        }
        .build()
        return _faceGrinSquint!!
    }

private var _faceGrinSquint: ImageVector? = null
