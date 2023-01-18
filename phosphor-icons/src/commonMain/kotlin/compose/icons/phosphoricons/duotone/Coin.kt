package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 104.0f)
                curveToRelative(0.0f, 24.0f, -40.0f, 48.0f, -104.0f, 48.0f)
                reflectiveCurveTo(24.0f, 128.0f, 24.0f, 104.0f)
                reflectiveCurveTo(64.0f, 56.0f, 128.0f, 56.0f)
                reflectiveCurveTo(232.0f, 80.0f, 232.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.6f, 63.8f)
                curveTo(186.8f, 53.5f, 159.3f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(69.2f, 53.5f, 48.4f, 63.8f)
                reflectiveCurveTo(16.0f, 88.8f, 16.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 15.2f, 11.8f, 29.9f, 32.4f, 40.2f)
                reflectiveCurveTo(96.7f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(58.8f, -5.5f, 79.6f, -15.8f)
                reflectiveCurveTo(240.0f, 167.2f, 240.0f, 152.0f)
                lineTo(240.0f, 104.0f)
                curveTo(240.0f, 88.8f, 228.2f, 74.1f, 207.6f, 63.8f)
                close()
                moveTo(128.0f, 64.0f)
                curveToRelative(62.6f, 0.0f, 96.0f, 23.2f, 96.0f, 40.0f)
                curveToRelative(0.0f, 9.9f, -11.7f, 22.2f, -34.4f, 30.5f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(-15.5f, 5.6f, -36.0f, 9.4f, -61.3f, 9.4f)
                reflectiveCurveToRelative(-45.8f, -3.8f, -61.3f, -9.4f)
                horizontalLineToRelative(-0.3f)
                curveTo(43.7f, 126.2f, 32.0f, 113.9f, 32.0f, 104.0f)
                curveTo(32.0f, 87.2f, 65.4f, 64.0f, 128.0f, 64.0f)
                close()
                moveTo(120.0f, 159.9f)
                verticalLineToRelative(32.0f)
                curveToRelative(-19.0f, -0.7f, -35.0f, -3.5f, -48.0f, -7.5f)
                lineTo(72.0f, 153.0f)
                curveTo(86.3f, 157.0f, 102.5f, 159.3f, 120.0f, 159.9f)
                close()
                moveTo(136.0f, 159.9f)
                curveToRelative(17.5f, -0.6f, 33.7f, -2.9f, 48.0f, -6.9f)
                verticalLineToRelative(31.4f)
                curveToRelative(-13.0f, 4.0f, -29.0f, 6.8f, -48.0f, 7.5f)
                close()
                moveTo(32.0f, 152.0f)
                lineTo(32.0f, 133.5f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, false, 16.4f, 10.7f)
                lineToRelative(7.6f, 3.4f)
                lineTo(56.0f, 178.0f)
                curveTo(40.2f, 170.2f, 32.0f, 160.3f, 32.0f, 152.0f)
                close()
                moveTo(200.0f, 178.0f)
                lineTo(200.0f, 147.6f)
                lineToRelative(7.6f, -3.4f)
                arcTo(84.5f, 84.5f, 0.0f, false, false, 224.0f, 133.5f)
                lineTo(224.0f, 152.0f)
                curveTo(224.0f, 160.3f, 215.8f, 170.2f, 200.0f, 178.0f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
