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

public val RegularGroup.CircleDown: ImageVector
    get() {
        if (_circleDown != null) {
            return _circleDown!!
        }
        _circleDown = Builder(name = "CircleDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 240.0f)
                horizontalLineToRelative(-56.0f)
                lineTo(287.1f, 152.0f)
                curveToRelative(0.0f, -13.25f, -10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-16.0f)
                curveTo(234.7f, 128.0f, 223.1f, 138.8f, 223.1f, 152.0f)
                lineTo(224.0f, 240.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-9.531f, 0.0f, -18.16f, 5.656f, -22.0f, 14.38f)
                curveTo(142.2f, 263.1f, 143.9f, 273.3f, 150.4f, 280.3f)
                lineToRelative(88.75f, 96.0f)
                curveTo(243.7f, 381.2f, 250.1f, 384.0f, 256.8f, 384.0f)
                curveToRelative(7.781f, -0.313f, 13.25f, -2.875f, 17.75f, -7.844f)
                lineToRelative(87.25f, -96.0f)
                curveToRelative(6.406f, -7.031f, 8.031f, -17.19f, 4.188f, -25.88f)
                reflectiveCurveTo(353.5f, 240.0f, 344.0f, 240.0f)
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
        return _circleDown!!
    }

private var _circleDown: ImageVector? = null
