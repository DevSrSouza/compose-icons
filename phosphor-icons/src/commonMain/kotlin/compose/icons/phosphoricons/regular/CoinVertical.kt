package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.5f, 56.1f)
                curveTo(186.4f, 35.4f, 169.9f, 24.0f, 152.0f, 24.0f)
                lineTo(104.0f, 24.0f)
                curveTo(86.1f, 24.0f, 69.6f, 35.4f, 57.5f, 56.1f)
                reflectiveCurveTo(40.0f, 101.0f, 40.0f, 128.0f)
                reflectiveCurveToRelative(6.2f, 52.6f, 17.5f, 71.9f)
                reflectiveCurveTo(86.1f, 232.0f, 104.0f, 232.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.9f, 0.0f, 34.4f, -11.4f, 46.5f, -32.1f)
                reflectiveCurveTo(216.0f, 155.0f, 216.0f, 128.0f)
                reflectiveCurveTo(209.8f, 75.4f, 198.5f, 56.1f)
                close()
                moveTo(199.8f, 120.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-0.8f, -17.2f, -4.1f, -33.7f, -9.7f, -48.0f)
                horizontalLineToRelative(30.6f)
                curveTo(194.8f, 85.4f, 198.9f, 102.0f, 199.8f, 120.0f)
                close()
                moveTo(179.2f, 56.0f)
                lineTo(150.5f, 56.0f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, false, -12.0f, -16.0f)
                lineTo(152.0f, 40.0f)
                curveTo(162.0f, 40.0f, 171.4f, 46.0f, 179.2f, 56.0f)
                close()
                moveTo(56.0f, 128.0f)
                curveToRelative(0.0f, -47.7f, 22.0f, -88.0f, 48.0f, -88.0f)
                reflectiveCurveToRelative(48.0f, 40.3f, 48.0f, 88.0f)
                reflectiveCurveToRelative(-22.0f, 88.0f, -48.0f, 88.0f)
                reflectiveCurveTo(56.0f, 175.7f, 56.0f, 128.0f)
                close()
                moveTo(152.0f, 216.0f)
                lineTo(138.5f, 216.0f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, false, 12.0f, -16.0f)
                horizontalLineToRelative(28.7f)
                curveTo(171.4f, 210.0f, 162.0f, 216.0f, 152.0f, 216.0f)
                close()
                moveTo(188.7f, 184.0f)
                lineTo(158.1f, 184.0f)
                curveToRelative(5.6f, -14.3f, 8.9f, -30.8f, 9.7f, -48.0f)
                horizontalLineToRelative(32.0f)
                curveTo(198.9f, 154.0f, 194.8f, 170.6f, 188.7f, 184.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
