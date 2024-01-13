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

public val SolidGroup.FaceSmileWink: ImageVector
    get() {
        if (_faceSmileWink != null) {
            return _faceSmileWink!!
        }
        _faceSmileWink = Builder(name = "FaceSmileWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(164.1f, 325.5f)
                curveTo(182.0f, 346.2f, 212.6f, 368.0f, 256.0f, 368.0f)
                reflectiveCurveToRelative(74.0f, -21.8f, 91.9f, -42.5f)
                curveToRelative(5.8f, -6.7f, 15.9f, -7.4f, 22.6f, -1.6f)
                reflectiveCurveToRelative(7.4f, 15.9f, 1.6f, 22.6f)
                curveTo(349.8f, 372.1f, 311.1f, 400.0f, 256.0f, 400.0f)
                reflectiveCurveToRelative(-93.8f, -27.9f, -116.1f, -53.5f)
                curveToRelative(-5.8f, -6.7f, -5.1f, -16.8f, 1.6f, -22.6f)
                reflectiveCurveToRelative(16.8f, -5.1f, 22.6f, 1.6f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(300.8f, 233.6f)
                curveToRelative(-5.3f, 7.1f, -15.3f, 8.5f, -22.4f, 3.2f)
                reflectiveCurveToRelative(-8.5f, -15.3f, -3.2f, -22.4f)
                curveToRelative(30.4f, -40.5f, 91.2f, -40.5f, 121.6f, 0.0f)
                curveToRelative(5.3f, 7.1f, 3.9f, 17.1f, -3.2f, 22.4f)
                reflectiveCurveToRelative(-17.1f, 3.9f, -22.4f, -3.2f)
                curveToRelative(-17.6f, -23.5f, -52.8f, -23.5f, -70.4f, 0.0f)
                close()
            }
        }
        .build()
        return _faceSmileWink!!
    }

private var _faceSmileWink: ImageVector? = null
