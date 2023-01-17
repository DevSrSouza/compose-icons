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

public val RegularGroup.CircleLeft: ImageVector
    get() {
        if (_circleLeft != null) {
            return _circleLeft!!
        }
        _circleLeft = Builder(name = "CircleLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 224.0f)
                lineTo(272.0f, 224.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -9.531f, -5.656f, -18.16f, -14.38f, -22.0f)
                curveTo(248.9f, 142.2f, 238.7f, 143.9f, 231.7f, 150.4f)
                lineToRelative(-96.0f, 88.75f)
                curveTo(130.8f, 243.7f, 128.0f, 250.1f, 128.0f, 256.8f)
                curveToRelative(0.313f, 7.781f, 2.875f, 13.25f, 7.844f, 17.75f)
                lineToRelative(96.0f, 87.25f)
                curveToRelative(7.031f, 6.406f, 17.19f, 8.031f, 25.88f, 4.188f)
                reflectiveCurveToRelative(14.28f, -12.44f, 14.28f, -21.94f)
                lineToRelative(-0.002f, -56.0f)
                lineTo(360.0f, 288.0f)
                curveTo(373.3f, 288.0f, 384.0f, 277.3f, 384.0f, 264.0f)
                verticalLineToRelative(-16.0f)
                curveTo(384.0f, 234.8f, 373.3f, 224.0f, 360.0f, 224.0f)
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
        return _circleLeft!!
    }

private var _circleLeft: ImageVector? = null
