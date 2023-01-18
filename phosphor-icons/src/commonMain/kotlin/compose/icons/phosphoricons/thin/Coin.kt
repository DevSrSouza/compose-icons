package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.8f, 67.4f)
                curveTo(185.9f, 57.5f, 158.3f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveTo(70.1f, 57.5f, 50.2f, 67.4f)
                reflectiveCurveTo(20.0f, 90.4f, 20.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.6f, 11.0f, 27.0f, 30.2f, 36.6f)
                arcToRelative(124.2f, 124.2f, 0.0f, false, false, 12.2f, 5.2f)
                horizontalLineToRelative(0.3f)
                curveTo(81.0f, 200.4f, 103.6f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(47.0f, -3.6f, 65.3f, -10.1f)
                horizontalLineToRelative(0.3f)
                arcToRelative(124.2f, 124.2f, 0.0f, false, false, 12.2f, -5.2f)
                curveTo(225.0f, 179.0f, 236.0f, 165.6f, 236.0f, 152.0f)
                lineTo(236.0f, 104.0f)
                curveTo(236.0f, 90.4f, 225.0f, 77.0f, 205.8f, 67.4f)
                close()
                moveTo(128.0f, 60.0f)
                curveToRelative(61.8f, 0.0f, 100.0f, 22.8f, 100.0f, 44.0f)
                reflectiveCurveToRelative(-38.2f, 44.0f, -100.0f, 44.0f)
                reflectiveCurveTo(28.0f, 125.2f, 28.0f, 104.0f)
                reflectiveCurveTo(66.2f, 60.0f, 128.0f, 60.0f)
                close()
                moveTo(124.0f, 156.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(-22.0f, -0.4f, -40.9f, -3.7f, -56.0f, -8.8f)
                lineTo(68.0f, 147.6f)
                curveTo(84.2f, 152.7f, 103.4f, 155.6f, 124.0f, 156.0f)
                close()
                moveTo(132.0f, 156.0f)
                curveToRelative(20.6f, -0.4f, 39.8f, -3.3f, 56.0f, -8.4f)
                verticalLineToRelative(39.6f)
                curveToRelative(-15.1f, 5.1f, -34.0f, 8.4f, -56.0f, 8.8f)
                close()
                moveTo(28.0f, 152.0f)
                lineTo(28.0f, 123.9f)
                curveToRelative(5.2f, 6.2f, 12.7f, 11.9f, 22.2f, 16.7f)
                curveToRelative(3.1f, 1.5f, 6.4f, 2.9f, 9.8f, 4.3f)
                verticalLineToRelative(39.3f)
                curveTo(39.5f, 175.7f, 28.0f, 163.6f, 28.0f, 152.0f)
                close()
                moveTo(228.0f, 152.0f)
                curveToRelative(0.0f, 11.6f, -11.5f, 23.7f, -32.0f, 32.2f)
                lineTo(196.0f, 144.9f)
                curveToRelative(3.4f, -1.4f, 6.7f, -2.8f, 9.8f, -4.3f)
                curveToRelative(9.5f, -4.8f, 17.0f, -10.5f, 22.2f, -16.7f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
