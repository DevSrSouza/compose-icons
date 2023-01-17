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

public val RegularGroup.CircleUp: ImageVector
    get() {
        if (_circleUp != null) {
            return _circleUp!!
        }
        _circleUp = Builder(name = "CircleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.9f, 135.7f)
                curveTo(268.3f, 130.8f, 261.9f, 128.0f, 255.2f, 128.0f)
                curveTo(247.5f, 128.3f, 241.1f, 130.9f, 237.5f, 135.8f)
                lineToRelative(-87.25f, 96.0f)
                curveTo(143.8f, 238.9f, 142.2f, 249.0f, 146.1f, 257.7f)
                curveTo(149.9f, 266.4f, 158.5f, 272.0f, 167.1f, 272.0f)
                horizontalLineToRelative(56.0f)
                lineTo(224.0f, 360.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, -10.75f, 23.1f, -24.0f)
                lineTo(287.1f, 272.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(9.531f, 0.0f, 18.16f, -5.656f, 22.0f, -14.38f)
                curveToRelative(3.811f, -8.75f, 2.092f, -18.91f, -4.377f, -25.91f)
                lineTo(272.9f, 135.7f)
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
        return _circleUp!!
    }

private var _circleUp: ImageVector? = null
