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

public val RegularGroup.StarHalfStroke: ImageVector
    get() {
        if (_starHalfStroke != null) {
            return _starHalfStroke!!
        }
        _starHalfStroke = Builder(name = "StarHalfStroke", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.5f, 13.5f)
                curveTo(305.5f, 5.2f, 297.1f, 0.0f, 287.9f, 0.0f)
                reflectiveCurveToRelative(-17.6f, 5.2f, -21.6f, 13.5f)
                lineTo(197.7f, 154.8f)
                lineTo(44.5f, 177.5f)
                curveToRelative(-9.0f, 1.3f, -16.5f, 7.6f, -19.3f, 16.3f)
                reflectiveCurveToRelative(-0.5f, 18.1f, 5.9f, 24.5f)
                lineTo(142.2f, 328.4f)
                lineTo(116.0f, 483.9f)
                curveToRelative(-1.5f, 9.0f, 2.2f, 18.1f, 9.7f, 23.5f)
                reflectiveCurveToRelative(17.3f, 6.0f, 25.3f, 1.7f)
                lineToRelative(137.0f, -73.2f)
                lineToRelative(137.0f, 73.2f)
                curveToRelative(8.1f, 4.3f, 17.9f, 3.7f, 25.3f, -1.7f)
                reflectiveCurveToRelative(11.2f, -14.5f, 9.7f, -23.5f)
                lineTo(433.6f, 328.4f)
                lineTo(544.8f, 218.2f)
                curveToRelative(6.5f, -6.4f, 8.7f, -15.9f, 5.9f, -24.5f)
                reflectiveCurveToRelative(-10.3f, -14.9f, -19.3f, -16.3f)
                lineTo(378.1f, 154.8f)
                lineTo(309.5f, 13.5f)
                close()
                moveTo(288.0f, 384.7f)
                verticalLineTo(79.1f)
                lineToRelative(52.5f, 108.1f)
                curveToRelative(3.5f, 7.1f, 10.2f, 12.1f, 18.1f, 13.3f)
                lineToRelative(118.3f, 17.5f)
                lineTo(391.0f, 303.0f)
                curveToRelative(-5.5f, 5.5f, -8.1f, 13.3f, -6.8f, 21.0f)
                lineToRelative(20.2f, 119.6f)
                lineTo(299.2f, 387.5f)
                curveToRelative(-3.5f, -1.9f, -7.4f, -2.8f, -11.2f, -2.8f)
                close()
            }
        }
        .build()
        return _starHalfStroke!!
    }

private var _starHalfStroke: ImageVector? = null
