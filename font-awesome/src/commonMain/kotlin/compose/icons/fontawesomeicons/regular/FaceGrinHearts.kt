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

public val RegularGroup.FaceGrinHearts: ImageVector
    get() {
        if (_faceGrinHearts != null) {
            return _faceGrinHearts!!
        }
        _faceGrinHearts = Builder(name = "FaceGrinHearts", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(215.3f, 137.1f)
                curveToRelative(17.8f, 4.8f, 28.4f, 23.1f, 23.6f, 40.8f)
                lineToRelative(-17.4f, 65.0f)
                curveToRelative(-2.3f, 8.5f, -11.1f, 13.6f, -19.6f, 11.3f)
                lineToRelative(-65.1f, -17.4f)
                curveToRelative(-17.8f, -4.8f, -28.4f, -23.1f, -23.6f, -40.8f)
                reflectiveCurveToRelative(23.1f, -28.4f, 40.8f, -23.6f)
                lineToRelative(16.1f, 4.3f)
                lineToRelative(4.3f, -16.1f)
                curveToRelative(4.8f, -17.8f, 23.1f, -28.4f, 40.8f, -23.6f)
                close()
                moveTo(337.6f, 160.7f)
                lineToRelative(4.3f, 16.1f)
                lineToRelative(16.1f, -4.3f)
                curveToRelative(17.8f, -4.8f, 36.1f, 5.8f, 40.8f, 23.6f)
                reflectiveCurveToRelative(-5.8f, 36.1f, -23.6f, 40.8f)
                lineToRelative(-65.1f, 17.4f)
                curveToRelative(-8.5f, 2.3f, -17.3f, -2.8f, -19.6f, -11.3f)
                lineToRelative(-17.4f, -65.0f)
                curveToRelative(-4.8f, -17.8f, 5.8f, -36.1f, 23.6f, -40.8f)
                reflectiveCurveToRelative(36.1f, 5.8f, 40.9f, 23.6f)
                close()
            }
        }
        .build()
        return _faceGrinHearts!!
    }

private var _faceGrinHearts: ImageVector? = null
