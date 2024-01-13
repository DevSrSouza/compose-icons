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

public val SolidGroup.Locust: ImageVector
    get() {
        if (_locust != null) {
            return _locust!!
        }
        _locust = Builder(name = "Locust", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 32.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(98.7f, 0.0f, 180.6f, 71.4f, 197.0f, 165.4f)
                curveToRelative(-9.0f, -3.5f, -18.8f, -5.4f, -29.0f, -5.4f)
                lineTo(431.8f, 240.0f)
                lineToRelative(-41.8f, -97.5f)
                curveToRelative(-3.4f, -7.9f, -10.8f, -13.4f, -19.3f, -14.4f)
                reflectiveCurveToRelative(-17.0f, 2.7f, -22.1f, 9.6f)
                lineToRelative(-40.9f, 55.5f)
                lineToRelative(-21.7f, -50.7f)
                curveToRelative(-3.3f, -7.8f, -10.5f, -13.2f, -18.9f, -14.3f)
                reflectiveCurveToRelative(-16.7f, 2.3f, -22.0f, 8.9f)
                lineToRelative(-240.0f, 304.0f)
                curveToRelative(-8.2f, 10.4f, -6.4f, 25.5f, 4.0f, 33.7f)
                reflectiveCurveToRelative(25.5f, 6.4f, 33.7f, -4.0f)
                lineToRelative(79.4f, -100.5f)
                lineToRelative(43.0f, 16.4f)
                lineToRelative(-40.5f, 55.0f)
                curveToRelative(-7.9f, 10.7f, -5.6f, 25.7f, 5.1f, 33.6f)
                reflectiveCurveToRelative(25.7f, 5.6f, 33.6f, -5.1f)
                lineTo(215.1f, 400.0f)
                horizontalLineToRelative(74.5f)
                lineToRelative(-29.3f, 42.3f)
                curveToRelative(-7.5f, 10.9f, -4.8f, 25.8f, 6.1f, 33.4f)
                reflectiveCurveToRelative(25.8f, 4.8f, 33.4f, -6.1f)
                lineTo(348.0f, 400.0f)
                horizontalLineToRelative(80.4f)
                lineToRelative(38.8f, 67.9f)
                curveToRelative(6.6f, 11.5f, 21.2f, 15.5f, 32.7f, 8.9f)
                reflectiveCurveToRelative(15.5f, -21.2f, 8.9f, -32.7f)
                lineTo(483.6f, 400.0f)
                lineTo(496.0f, 400.0f)
                curveToRelative(44.1f, 0.0f, 79.8f, -35.7f, 80.0f, -79.7f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.0f, -0.3f)
                lineTo(576.0f, 280.0f)
                curveTo(576.0f, 143.0f, 465.0f, 32.0f, 328.0f, 32.0f)
                lineTo(312.0f, 32.0f)
                close()
                moveTo(362.5f, 200.0f)
                lineToRelative(17.1f, 40.0f)
                lineTo(333.0f, 240.0f)
                lineToRelative(29.5f, -40.0f)
                close()
                moveTo(274.8f, 238.1f)
                lineToRelative(-1.4f, 1.9f)
                lineTo(225.1f, 240.0f)
                lineToRelative(32.7f, -41.5f)
                lineToRelative(16.9f, 39.5f)
                close()
                moveTo(88.8f, 240.0f)
                curveTo(57.4f, 240.0f, 32.0f, 265.4f, 32.0f, 296.8f)
                curveToRelative(0.0f, 15.5f, 6.3f, 30.0f, 16.9f, 40.4f)
                lineTo(126.7f, 240.0f)
                lineTo(88.8f, 240.0f)
                close()
                moveTo(496.0f, 288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _locust!!
    }

private var _locust: ImageVector? = null
