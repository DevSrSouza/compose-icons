package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 20.0f)
                lineTo(104.0f, 20.0f)
                curveTo(65.9f, 20.0f, 36.0f, 67.4f, 36.0f, 128.0f)
                reflectiveCurveToRelative(29.9f, 108.0f, 68.0f, 108.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(38.1f, 0.0f, 68.0f, -47.4f, 68.0f, -108.0f)
                reflectiveCurveTo(190.1f, 20.0f, 152.0f, 20.0f)
                close()
                moveTo(166.3f, 172.0f)
                arcToRelative(167.0f, 167.0f, 0.0f, false, false, 5.3f, -32.0f)
                horizontalLineToRelative(23.9f)
                arcToRelative(133.5f, 133.5f, 0.0f, false, true, -6.3f, 32.0f)
                close()
                moveTo(171.6f, 116.0f)
                arcToRelative(167.0f, 167.0f, 0.0f, false, false, -5.3f, -32.0f)
                horizontalLineToRelative(22.9f)
                arcToRelative(133.5f, 133.5f, 0.0f, false, true, 6.3f, 32.0f)
                close()
                moveTo(177.2f, 60.0f)
                horizontalLineToRelative(-20.0f)
                arcToRelative(101.0f, 101.0f, 0.0f, false, false, -10.0f, -16.0f)
                lineTo(152.0f, 44.0f)
                curveTo(157.4f, 44.0f, 167.3f, 46.2f, 177.2f, 60.0f)
                close()
                moveTo(74.8f, 189.8f)
                curveTo(65.2f, 173.5f, 60.0f, 151.6f, 60.0f, 128.0f)
                reflectiveCurveToRelative(5.2f, -45.5f, 14.8f, -61.8f)
                curveTo(86.0f, 46.9f, 97.9f, 44.0f, 104.0f, 44.0f)
                reflectiveCurveToRelative(18.0f, 2.9f, 29.2f, 22.2f)
                arcToRelative(99.1f, 99.1f, 0.0f, false, true, 5.2f, 10.3f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, 0.3f)
                curveToRelative(6.2f, 14.7f, 9.5f, 32.4f, 9.5f, 51.2f)
                reflectiveCurveToRelative(-3.3f, 36.5f, -9.5f, 51.2f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, 0.3f)
                arcToRelative(99.1f, 99.1f, 0.0f, false, true, -5.2f, 10.3f)
                curveTo(122.0f, 209.1f, 110.1f, 212.0f, 104.0f, 212.0f)
                reflectiveCurveTo(86.0f, 209.1f, 74.8f, 189.8f)
                close()
                moveTo(152.0f, 212.0f)
                horizontalLineToRelative(-4.8f)
                arcToRelative(101.0f, 101.0f, 0.0f, false, false, 10.0f, -16.0f)
                horizontalLineToRelative(20.0f)
                curveTo(167.3f, 209.8f, 157.4f, 212.0f, 152.0f, 212.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
