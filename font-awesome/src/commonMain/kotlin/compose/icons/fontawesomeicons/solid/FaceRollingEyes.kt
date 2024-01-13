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

public val SolidGroup.FaceRollingEyes: ImageVector
    get() {
        if (_faceRollingEyes != null) {
            return _faceRollingEyes!!
        }
        _faceRollingEyes = Builder(name = "FaceRollingEyes", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(192.0f, 368.0f)
                lineTo(320.0f, 368.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(192.0f, 400.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(224.0f, 224.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -26.0f, 15.5f, -48.4f, 37.8f, -58.4f)
                curveToRelative(-3.7f, 5.2f, -5.8f, 11.6f, -5.8f, 18.4f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -6.9f, -2.2f, -13.2f, -5.8f, -18.4f)
                curveTo(208.5f, 175.6f, 224.0f, 198.0f, 224.0f, 224.0f)
                close()
                moveTo(352.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -26.0f, 15.5f, -48.4f, 37.8f, -58.4f)
                curveToRelative(-3.7f, 5.2f, -5.8f, 11.6f, -5.8f, 18.4f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -6.9f, -2.2f, -13.2f, -5.8f, -18.4f)
                curveTo(400.5f, 175.6f, 416.0f, 198.0f, 416.0f, 224.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _faceRollingEyes!!
    }

private var _faceRollingEyes: ImageVector? = null
