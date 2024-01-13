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

public val RegularGroup.Bell: ImageVector
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
                verticalLineToRelative(25.4f)
                curveToRelative(0.0f, 45.4f, -15.5f, 89.5f, -43.8f, 124.9f)
                lineTo(5.3f, 377.0f)
                curveToRelative(-5.8f, 7.2f, -6.9f, 17.1f, -2.9f, 25.4f)
                reflectiveCurveTo(14.8f, 416.0f, 24.0f, 416.0f)
                lineTo(424.0f, 416.0f)
                curveToRelative(9.2f, 0.0f, 17.6f, -5.3f, 21.6f, -13.6f)
                reflectiveCurveToRelative(2.9f, -18.2f, -2.9f, -25.4f)
                lineToRelative(-14.9f, -18.6f)
                curveTo(399.5f, 322.9f, 384.0f, 278.8f, 384.0f, 233.4f)
                lineTo(384.0f, 208.0f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                lineTo(256.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(224.0f, 96.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, 50.1f, 112.0f, 112.0f)
                verticalLineToRelative(25.4f)
                curveToRelative(0.0f, 47.9f, 13.9f, 94.6f, 39.7f, 134.6f)
                lineTo(72.3f, 368.0f)
                curveTo(98.1f, 328.0f, 112.0f, 281.3f, 112.0f, 233.4f)
                lineTo(112.0f, 208.0f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                close()
                moveTo(288.0f, 448.0f)
                lineTo(224.0f, 448.0f)
                lineTo(160.0f, 448.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                reflectiveCurveToRelative(18.7f, -28.3f, 18.7f, -45.3f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
