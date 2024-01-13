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

public val SolidGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(192.0f, 51.2f)
                curveTo(119.0f, 66.0f, 64.0f, 130.6f, 64.0f, 208.0f)
                verticalLineToRelative(18.8f)
                curveToRelative(0.0f, 47.0f, -17.3f, 92.4f, -48.5f, 127.6f)
                lineToRelative(-7.4f, 8.3f)
                curveToRelative(-8.4f, 9.4f, -10.4f, 22.9f, -5.3f, 34.4f)
                reflectiveCurveTo(19.4f, 416.0f, 32.0f, 416.0f)
                lineTo(416.0f, 416.0f)
                curveToRelative(12.6f, 0.0f, 24.0f, -7.4f, 29.2f, -18.9f)
                reflectiveCurveToRelative(3.1f, -25.0f, -5.3f, -34.4f)
                lineToRelative(-7.4f, -8.3f)
                curveTo(401.3f, 319.2f, 384.0f, 273.9f, 384.0f, 226.8f)
                lineTo(384.0f, 208.0f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                lineTo(256.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(269.3f, 493.3f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineTo(224.0f, 448.0f)
                lineTo(160.0f, 448.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
