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

public val RegularGroup.CircleRight: ImageVector
    get() {
        if (_circleRight != null) {
            return _circleRight!!
        }
        _circleRight = Builder(name = "CircleRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.2f, 150.2f)
                curveTo(273.1f, 143.8f, 262.1f, 142.2f, 254.3f, 146.1f)
                reflectiveCurveTo(239.1f, 158.5f, 239.1f, 167.1f)
                lineToRelative(0.002f, 56.0f)
                lineTo(152.0f, 224.0f)
                curveTo(138.8f, 224.0f, 128.0f, 234.8f, 128.0f, 248.0f)
                verticalLineToRelative(16.0f)
                curveTo(128.0f, 277.3f, 138.8f, 288.0f, 152.0f, 288.0f)
                lineTo(240.0f, 287.1f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 9.531f, 5.656f, 18.16f, 14.38f, 22.0f)
                curveToRelative(8.75f, 3.812f, 18.91f, 2.094f, 25.91f, -4.375f)
                lineToRelative(96.0f, -88.75f)
                curveTo(381.2f, 268.3f, 384.0f, 261.9f, 384.0f, 255.2f)
                curveToRelative(-0.313f, -7.781f, -2.875f, -13.25f, -7.844f, -17.75f)
                lineTo(280.2f, 150.2f)
                close()
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.6f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 464.0f)
                curveToRelative(-114.7f, 0.0f, -208.0f, -93.31f, -208.0f, -208.0f)
                reflectiveCurveTo(141.3f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.31f, 208.0f, 208.0f)
                reflectiveCurveTo(370.7f, 464.0f, 256.0f, 464.0f)
                close()
            }
        }
        .build()
        return _circleRight!!
    }

private var _circleRight: ImageVector? = null
