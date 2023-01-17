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

public val RegularGroup.CircleQuestion: ImageVector
    get() {
        if (_circleQuestion != null) {
            return _circleQuestion!!
        }
        _circleQuestion = Builder(name = "CircleQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(256.0f, 336.0f)
                curveToRelative(-18.0f, 0.0f, -32.0f, 14.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(13.1f, 32.0f, 32.0f, 32.0f)
                curveToRelative(17.1f, 0.0f, 32.0f, -14.0f, 32.0f, -32.0f)
                reflectiveCurveTo(273.1f, 336.0f, 256.0f, 336.0f)
                close()
                moveTo(289.1f, 128.0f)
                horizontalLineToRelative(-51.1f)
                curveTo(199.0f, 128.0f, 168.0f, 159.0f, 168.0f, 198.0f)
                curveToRelative(0.0f, 13.0f, 11.0f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -11.0f, 24.0f, -24.0f)
                curveTo(216.0f, 186.0f, 225.1f, 176.0f, 237.1f, 176.0f)
                horizontalLineToRelative(51.1f)
                curveTo(301.1f, 176.0f, 312.0f, 186.0f, 312.0f, 198.0f)
                curveToRelative(0.0f, 8.0f, -4.0f, 14.1f, -11.0f, 18.1f)
                lineTo(244.0f, 251.0f)
                curveTo(236.0f, 256.0f, 232.0f, 264.0f, 232.0f, 272.0f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, 13.0f, 11.0f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveTo(280.0f, 301.0f, 280.0f, 288.0f)
                verticalLineTo(286.0f)
                lineToRelative(45.1f, -28.0f)
                curveToRelative(21.0f, -13.0f, 34.0f, -36.0f, 34.0f, -60.0f)
                curveTo(360.0f, 159.0f, 329.0f, 128.0f, 289.1f, 128.0f)
                close()
            }
        }
        .build()
        return _circleQuestion!!
    }

private var _circleQuestion: ImageVector? = null
