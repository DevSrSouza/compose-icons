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

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(293.3f, 0.6f)
                curveToRelative(10.9f, 2.5f, 18.6f, 12.2f, 18.6f, 23.4f)
                verticalLineTo(408.7f)
                curveToRelative(0.0f, 8.9f, -4.9f, 17.0f, -12.7f, 21.2f)
                lineTo(151.0f, 509.1f)
                curveToRelative(-8.1f, 4.3f, -17.9f, 3.7f, -25.3f, -1.7f)
                reflectiveCurveToRelative(-11.2f, -14.5f, -9.7f, -23.5f)
                lineToRelative(26.2f, -155.6f)
                lineTo(31.1f, 218.3f)
                curveToRelative(-6.5f, -6.4f, -8.7f, -15.9f, -5.9f, -24.5f)
                reflectiveCurveToRelative(10.3f, -14.9f, 19.3f, -16.3f)
                lineToRelative(153.2f, -22.6f)
                lineTo(266.3f, 13.5f)
                curveToRelative(4.9f, -10.1f, 16.1f, -15.4f, 27.0f, -12.9f)
                close()
                moveTo(263.9f, 128.4f)
                lineToRelative(-28.6f, 58.8f)
                curveToRelative(-3.5f, 7.1f, -10.2f, 12.1f, -18.1f, 13.3f)
                lineTo(99.0f, 217.9f)
                lineTo(184.9f, 303.0f)
                curveToRelative(5.5f, 5.5f, 8.1f, 13.3f, 6.8f, 21.0f)
                lineTo(171.4f, 443.7f)
                lineToRelative(92.5f, -49.4f)
                verticalLineTo(128.4f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
