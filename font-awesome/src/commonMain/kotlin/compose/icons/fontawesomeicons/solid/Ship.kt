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

public val SolidGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineTo(240.0f)
                lineToRelative(44.4f, 14.8f)
                curveToRelative(23.1f, 7.7f, 29.5f, 37.5f, 11.5f, 53.9f)
                lineToRelative(-101.0f, 92.6f)
                curveToRelative(-16.2f, 9.4f, -34.7f, 15.1f, -50.9f, 15.1f)
                curveToRelative(-19.6f, 0.0f, -40.8f, -7.7f, -59.2f, -20.3f)
                curveToRelative(-22.1f, -15.5f, -51.6f, -15.5f, -73.7f, 0.0f)
                curveToRelative(-17.1f, 11.8f, -38.0f, 20.3f, -59.2f, 20.3f)
                curveToRelative(-16.2f, 0.0f, -34.7f, -5.7f, -50.9f, -15.1f)
                lineToRelative(-101.0f, -92.6f)
                curveToRelative(-18.0f, -16.5f, -11.6f, -46.2f, 11.5f, -53.9f)
                lineTo(96.0f, 240.0f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(160.0f, 218.7f)
                lineToRelative(107.8f, -35.9f)
                curveToRelative(13.1f, -4.4f, 27.3f, -4.4f, 40.5f, 0.0f)
                lineTo(416.0f, 218.7f)
                verticalLineTo(128.0f)
                horizontalLineTo(160.0f)
                verticalLineToRelative(90.7f)
                close()
                moveTo(306.5f, 421.9f)
                curveTo(329.0f, 437.4f, 356.5f, 448.0f, 384.0f, 448.0f)
                curveToRelative(26.9f, 0.0f, 55.4f, -10.8f, 77.4f, -26.1f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(11.9f, -8.5f, 28.1f, -7.8f, 39.2f, 1.7f)
                curveToRelative(14.4f, 11.9f, 32.5f, 21.0f, 50.6f, 25.2f)
                curveToRelative(17.2f, 4.0f, 27.9f, 21.2f, 23.9f, 38.4f)
                reflectiveCurveToRelative(-21.2f, 27.9f, -38.4f, 23.9f)
                curveToRelative(-24.5f, -5.7f, -44.9f, -16.5f, -58.2f, -25.0f)
                curveTo(449.5f, 501.7f, 417.0f, 512.0f, 384.0f, 512.0f)
                curveToRelative(-31.9f, 0.0f, -60.6f, -9.9f, -80.4f, -18.9f)
                curveToRelative(-5.8f, -2.7f, -11.1f, -5.3f, -15.6f, -7.7f)
                curveToRelative(-4.5f, 2.4f, -9.7f, 5.1f, -15.6f, 7.7f)
                curveToRelative(-19.8f, 9.0f, -48.5f, 18.9f, -80.4f, 18.9f)
                curveToRelative(-33.0f, 0.0f, -65.5f, -10.3f, -94.5f, -25.8f)
                curveToRelative(-13.4f, 8.4f, -33.7f, 19.3f, -58.2f, 25.0f)
                curveToRelative(-17.2f, 4.0f, -34.4f, -6.7f, -38.4f, -23.9f)
                reflectiveCurveToRelative(6.7f, -34.4f, 23.9f, -38.4f)
                curveToRelative(18.1f, -4.2f, 36.2f, -13.3f, 50.6f, -25.2f)
                curveToRelative(11.1f, -9.4f, 27.3f, -10.1f, 39.2f, -1.7f)
                lineToRelative(0.0f, 0.0f)
                curveTo(136.7f, 437.2f, 165.1f, 448.0f, 192.0f, 448.0f)
                curveToRelative(27.5f, 0.0f, 55.0f, -10.6f, 77.5f, -26.1f)
                curveToRelative(11.1f, -7.9f, 25.9f, -7.9f, 37.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null
