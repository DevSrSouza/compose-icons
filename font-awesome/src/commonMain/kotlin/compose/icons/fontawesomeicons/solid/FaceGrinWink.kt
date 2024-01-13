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

public val SolidGroup.FaceGrinWink: ImageVector
    get() {
        if (_faceGrinWink != null) {
            return _faceGrinWink!!
        }
        _faceGrinWink = Builder(name = "FaceGrinWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(388.1f, 312.8f)
                curveToRelative(12.3f, -3.8f, 24.3f, 6.9f, 19.3f, 18.7f)
                curveTo(382.4f, 390.6f, 324.2f, 432.0f, 256.3f, 432.0f)
                reflectiveCurveToRelative(-126.2f, -41.4f, -151.1f, -100.5f)
                curveToRelative(-5.0f, -11.8f, 7.0f, -22.5f, 19.3f, -18.7f)
                curveToRelative(39.7f, 12.2f, 84.5f, 19.0f, 131.8f, 19.0f)
                reflectiveCurveToRelative(92.1f, -6.8f, 131.8f, -19.0f)
                close()
                moveTo(371.2f, 233.6f)
                curveToRelative(-17.6f, -23.5f, -52.8f, -23.5f, -70.4f, 0.0f)
                curveToRelative(-5.3f, 7.1f, -15.3f, 8.5f, -22.4f, 3.2f)
                reflectiveCurveToRelative(-8.5f, -15.3f, -3.2f, -22.4f)
                curveToRelative(30.4f, -40.5f, 91.2f, -40.5f, 121.6f, 0.0f)
                curveToRelative(5.3f, 7.1f, 3.9f, 17.1f, -3.2f, 22.4f)
                reflectiveCurveToRelative(-17.1f, 3.9f, -22.4f, -3.2f)
                close()
                moveTo(176.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrinWink!!
    }

private var _faceGrinWink: ImageVector? = null
