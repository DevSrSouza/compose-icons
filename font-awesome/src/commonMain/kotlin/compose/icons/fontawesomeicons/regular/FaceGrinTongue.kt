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

public val RegularGroup.FaceGrinTongue: ImageVector
    get() {
        if (_faceGrinTongue != null) {
            return _faceGrinTongue!!
        }
        _faceGrinTongue = Builder(name = "FaceGrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.9f, -93.1f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.1f, 48.0f, 256.0f)
                curveToRelative(0.0f, 81.7f, 47.1f, 152.4f, 115.7f, 186.4f)
                curveToRelative(-2.4f, -8.4f, -3.7f, -17.3f, -3.7f, -26.4f)
                lineTo(160.0f, 363.6f)
                curveToRelative(-8.9f, -8.0f, -16.7f, -17.1f, -23.1f, -27.1f)
                curveToRelative(-10.4f, -16.1f, 6.8f, -32.5f, 25.5f, -28.1f)
                curveToRelative(28.9f, 6.8f, 60.5f, 10.5f, 93.6f, 10.5f)
                reflectiveCurveToRelative(64.7f, -3.7f, 93.6f, -10.5f)
                curveToRelative(18.7f, -4.4f, 35.9f, 12.0f, 25.5f, 28.1f)
                curveToRelative(-6.4f, 9.9f, -14.2f, 19.0f, -23.0f, 27.0f)
                lineTo(352.1f, 416.0f)
                curveToRelative(0.0f, 9.2f, -1.3f, 18.0f, -3.7f, 26.4f)
                curveTo(416.9f, 408.4f, 464.0f, 337.7f, 464.0f, 256.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(176.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 416.0f)
                lineTo(320.0f, 378.6f)
                curveToRelative(0.0f, -14.7f, -11.9f, -26.6f, -26.6f, -26.6f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-11.3f, 0.0f, -21.1f, 7.9f, -23.6f, 18.9f)
                curveToRelative(-2.8f, 12.6f, -20.8f, 12.6f, -23.6f, 0.0f)
                curveToRelative(-2.5f, -11.1f, -12.3f, -18.9f, -23.6f, -18.9f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-14.7f, 0.0f, -26.6f, 11.9f, -26.6f, 26.6f)
                lineTo(192.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrinTongue!!
    }

private var _faceGrinTongue: ImageVector? = null
