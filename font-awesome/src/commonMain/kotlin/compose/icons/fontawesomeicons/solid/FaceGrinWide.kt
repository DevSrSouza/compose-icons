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

public val SolidGroup.FaceGrinWide: ImageVector
    get() {
        if (_faceGrinWide != null) {
            return _faceGrinWide!!
        }
        _faceGrinWide = Builder(name = "FaceGrinWide", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(208.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -14.3f, 64.0f, -32.0f, 64.0f)
                reflectiveCurveToRelative(-32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                close()
                moveTo(336.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                reflectiveCurveToRelative(-14.3f, 64.0f, -32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _faceGrinWide!!
    }

private var _faceGrinWide: ImageVector? = null
