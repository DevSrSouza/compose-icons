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

public val SolidGroup.FaceGrinHearts: ImageVector
    get() {
        if (_faceGrinHearts != null) {
            return _faceGrinHearts!!
        }
        _faceGrinHearts = Builder(name = "FaceGrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 512.0f, 256.0f, 512.0f)
                close()
                moveTo(383.8f, 317.8f)
                curveToRelative(12.3f, -3.7f, 24.3f, 7.0f, 19.2f, 18.7f)
                curveToRelative(-24.5f, 56.9f, -81.1f, 96.7f, -147.0f, 96.7f)
                reflectiveCurveToRelative(-122.5f, -39.8f, -147.0f, -96.7f)
                curveToRelative(-5.1f, -11.8f, 6.9f, -22.4f, 19.2f, -18.7f)
                curveTo(166.7f, 329.4f, 210.1f, 336.0f, 256.0f, 336.0f)
                reflectiveCurveToRelative(89.3f, -6.6f, 127.8f, -18.2f)
                close()
                moveTo(199.3f, 129.1f)
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
                moveTo(353.6f, 152.7f)
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
