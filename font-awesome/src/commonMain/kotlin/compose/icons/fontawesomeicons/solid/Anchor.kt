package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.971f, 352.0f)
                horizontalLineToRelative(32.394f)
                curveTo(67.172f, 454.735f, 181.944f, 512.0f, 288.0f, 512.0f)
                curveToRelative(106.229f, 0.0f, 220.853f, -57.38f, 242.635f, -160.0f)
                horizontalLineToRelative(32.394f)
                curveToRelative(10.691f, 0.0f, 16.045f, -12.926f, 8.485f, -20.485f)
                lineToRelative(-67.029f, -67.029f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineToRelative(-67.029f, 67.029f)
                curveToRelative(-7.56f, 7.56f, -2.206f, 20.485f, 8.485f, 20.485f)
                horizontalLineToRelative(35.146f)
                curveToRelative(-20.29f, 54.317f, -84.963f, 86.588f, -144.117f, 94.015f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(52.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-52.0f)
                verticalLineToRelative(-5.47f)
                curveToRelative(37.281f, -13.178f, 63.995f, -48.725f, 64.0f, -90.518f)
                curveTo(384.005f, 43.772f, 341.605f, 0.738f, 289.37f, 0.01f)
                curveTo(235.723f, -0.739f, 192.0f, 42.525f, 192.0f, 96.0f)
                curveToRelative(0.0f, 41.798f, 26.716f, 77.35f, 64.0f, 90.53f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(-52.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(190.015f)
                curveToRelative(-58.936f, -7.399f, -123.82f, -39.679f, -144.117f, -94.015f)
                horizontalLineToRelative(35.146f)
                curveToRelative(10.691f, 0.0f, 16.045f, -12.926f, 8.485f, -20.485f)
                lineToRelative(-67.029f, -67.029f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineTo(4.485f, 331.515f)
                curveTo(-3.074f, 339.074f, 2.28f, 352.0f, 12.971f, 352.0f)
                close()
                moveTo(288.0f, 64.0f)
                curveToRelative(17.645f, 0.0f, 32.0f, 14.355f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.355f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.355f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.355f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
