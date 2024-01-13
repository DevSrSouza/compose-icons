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

public val SolidGroup.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                curveTo(383.1f, 0.0f, 512.0f, 128.9f, 512.0f, 288.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveTo(448.0f, 164.3f, 347.7f, 64.0f, 224.0f, 64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(60.6f, 220.6f)
                lineTo(164.7f, 324.7f)
                lineToRelative(28.4f, -28.4f)
                curveToRelative(-0.7f, -2.6f, -1.1f, -5.4f, -1.1f, -8.3f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                curveToRelative(-2.9f, 0.0f, -5.6f, -0.4f, -8.3f, -1.1f)
                lineToRelative(-28.4f, 28.4f)
                lineTo(291.4f, 451.4f)
                curveToRelative(14.5f, 14.5f, 11.8f, 38.8f, -7.3f, 46.3f)
                curveTo(260.5f, 506.9f, 234.9f, 512.0f, 208.0f, 512.0f)
                curveTo(93.1f, 512.0f, 0.0f, 418.9f, 0.0f, 304.0f)
                curveToRelative(0.0f, -26.9f, 5.1f, -52.5f, 14.4f, -76.1f)
                curveToRelative(7.5f, -19.0f, 31.8f, -21.8f, 46.3f, -7.3f)
                close()
                moveTo(224.0f, 96.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
