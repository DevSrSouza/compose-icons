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

public val RegularGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.9f, 0.0f)
                curveToRelative(9.2f, 0.0f, 17.6f, 5.2f, 21.6f, 13.5f)
                lineToRelative(68.6f, 141.3f)
                lineToRelative(153.2f, 22.6f)
                curveToRelative(9.0f, 1.3f, 16.5f, 7.6f, 19.3f, 16.3f)
                reflectiveCurveToRelative(0.5f, 18.1f, -5.9f, 24.5f)
                lineTo(433.6f, 328.4f)
                lineToRelative(26.2f, 155.6f)
                curveToRelative(1.5f, 9.0f, -2.2f, 18.1f, -9.7f, 23.5f)
                reflectiveCurveToRelative(-17.3f, 6.0f, -25.3f, 1.7f)
                lineToRelative(-137.0f, -73.2f)
                lineTo(151.0f, 509.1f)
                curveToRelative(-8.1f, 4.3f, -17.9f, 3.7f, -25.3f, -1.7f)
                reflectiveCurveToRelative(-11.2f, -14.5f, -9.7f, -23.5f)
                lineToRelative(26.2f, -155.6f)
                lineTo(31.1f, 218.2f)
                curveToRelative(-6.5f, -6.4f, -8.7f, -15.9f, -5.9f, -24.5f)
                reflectiveCurveToRelative(10.3f, -14.9f, 19.3f, -16.3f)
                lineToRelative(153.2f, -22.6f)
                lineTo(266.3f, 13.5f)
                curveTo(270.4f, 5.2f, 278.7f, 0.0f, 287.9f, 0.0f)
                close()
                moveTo(287.9f, 79.0f)
                lineTo(235.4f, 187.2f)
                curveToRelative(-3.5f, 7.1f, -10.2f, 12.1f, -18.1f, 13.3f)
                lineTo(99.0f, 217.9f)
                lineTo(184.9f, 303.0f)
                curveToRelative(5.5f, 5.5f, 8.1f, 13.3f, 6.8f, 21.0f)
                lineTo(171.4f, 443.7f)
                lineToRelative(105.2f, -56.2f)
                curveToRelative(7.1f, -3.8f, 15.6f, -3.8f, 22.6f, 0.0f)
                lineToRelative(105.2f, 56.2f)
                lineTo(384.2f, 324.1f)
                curveToRelative(-1.3f, -7.7f, 1.2f, -15.5f, 6.8f, -21.0f)
                lineToRelative(85.9f, -85.1f)
                lineTo(358.6f, 200.5f)
                curveToRelative(-7.8f, -1.2f, -14.6f, -6.1f, -18.1f, -13.3f)
                lineTo(287.9f, 79.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
