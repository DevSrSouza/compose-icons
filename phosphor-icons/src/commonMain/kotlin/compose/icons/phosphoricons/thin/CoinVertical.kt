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

public val ThinGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.1f, 58.1f)
                curveTo(183.7f, 38.7f, 168.4f, 28.0f, 152.0f, 28.0f)
                lineTo(104.0f, 28.0f)
                curveTo(87.6f, 28.0f, 72.3f, 38.7f, 60.9f, 58.1f)
                reflectiveCurveTo(44.0f, 101.7f, 44.0f, 128.0f)
                reflectiveCurveToRelative(6.0f, 51.2f, 16.9f, 69.9f)
                reflectiveCurveTo(87.6f, 228.0f, 104.0f, 228.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(16.4f, 0.0f, 31.7f, -10.7f, 43.1f, -30.1f)
                reflectiveCurveTo(212.0f, 154.3f, 212.0f, 128.0f)
                reflectiveCurveTo(206.0f, 76.8f, 195.1f, 58.1f)
                close()
                moveTo(203.9f, 124.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-0.4f, -20.5f, -4.6f, -39.9f, -11.8f, -56.0f)
                horizontalLineToRelative(39.2f)
                curveTo(199.0f, 83.7f, 203.4f, 103.2f, 203.9f, 124.0f)
                close()
                moveTo(152.0f, 36.0f)
                curveToRelative(12.9f, 0.0f, 25.2f, 8.5f, 34.8f, 24.0f)
                lineTo(148.1f, 60.0f)
                lineToRelative(-1.0f, -1.9f)
                curveToRelative(-5.6f, -9.6f, -12.2f, -17.0f, -19.3f, -22.1f)
                close()
                moveTo(67.9f, 193.9f)
                curveTo(57.6f, 176.3f, 52.0f, 152.9f, 52.0f, 128.0f)
                reflectiveCurveToRelative(5.6f, -48.3f, 15.9f, -65.9f)
                reflectiveCurveTo(90.5f, 36.0f, 104.0f, 36.0f)
                reflectiveCurveToRelative(26.3f, 9.3f, 36.1f, 26.1f)
                reflectiveCurveTo(156.0f, 103.1f, 156.0f, 128.0f)
                reflectiveCurveToRelative(-5.6f, 48.3f, -15.9f, 65.9f)
                reflectiveCurveTo(117.5f, 220.0f, 104.0f, 220.0f)
                reflectiveCurveTo(77.7f, 210.7f, 67.9f, 193.9f)
                close()
                moveTo(152.0f, 220.0f)
                lineTo(127.8f, 220.0f)
                curveToRelative(7.1f, -5.1f, 13.7f, -12.5f, 19.3f, -22.1f)
                lineToRelative(1.0f, -1.9f)
                horizontalLineToRelative(38.7f)
                curveTo(177.2f, 211.5f, 164.9f, 220.0f, 152.0f, 220.0f)
                close()
                moveTo(191.3f, 188.0f)
                lineTo(152.1f, 188.0f)
                curveToRelative(7.2f, -16.1f, 11.4f, -35.5f, 11.8f, -56.0f)
                horizontalLineToRelative(40.0f)
                curveTo(203.4f, 152.8f, 199.0f, 172.3f, 191.3f, 188.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
