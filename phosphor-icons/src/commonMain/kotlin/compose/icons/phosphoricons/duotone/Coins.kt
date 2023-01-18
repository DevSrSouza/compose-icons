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

public val DuotoneGroup.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 120.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -16.1f, -80.0f, -36.0f)
                reflectiveCurveTo(51.8f, 48.0f, 96.0f, 48.0f)
                reflectiveCurveToRelative(80.0f, 16.1f, 80.0f, 36.0f)
                reflectiveCurveTo(140.2f, 120.0f, 96.0f, 120.0f)
                close()
                moveTo(176.0f, 96.7f)
                lineTo(176.0f, 124.0f)
                curveToRelative(0.0f, 18.0f, -29.2f, 32.9f, -67.5f, 35.6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(13.9f, 5.2f, 31.9f, 8.4f, 51.5f, 8.4f)
                curveToRelative(44.2f, 0.0f, 80.0f, -16.1f, 80.0f, -36.0f)
                curveTo(240.0f, 114.6f, 212.5f, 100.1f, 176.0f, 96.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 89.6f)
                lineTo(184.0f, 84.0f)
                curveToRelative(0.0f, -25.1f, -37.8f, -44.0f, -88.0f, -44.0f)
                reflectiveCurveTo(8.0f, 58.9f, 8.0f, 84.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 20.9f, 26.2f, 37.5f, 64.0f, 42.5f)
                lineTo(72.0f, 172.0f)
                curveToRelative(0.0f, 25.1f, 37.8f, 44.0f, 88.0f, 44.0f)
                reflectiveCurveToRelative(88.0f, -18.9f, 88.0f, -44.0f)
                lineTo(248.0f, 132.0f)
                curveTo(248.0f, 111.3f, 222.6f, 94.7f, 184.0f, 89.6f)
                close()
                moveTo(232.0f, 132.0f)
                curveToRelative(0.0f, 13.2f, -30.8f, 28.0f, -72.0f, 28.0f)
                curveToRelative(-3.7f, 0.0f, -7.4f, -0.1f, -11.1f, -0.4f)
                curveTo(170.5f, 151.8f, 184.0f, 139.0f, 184.0f, 124.0f)
                lineTo(184.0f, 105.7f)
                curveTo(213.9f, 110.2f, 232.0f, 122.3f, 232.0f, 132.0f)
                close()
                moveTo(72.0f, 150.2f)
                lineTo(72.0f, 126.5f)
                arcTo(184.0f, 184.0f, 0.0f, false, false, 96.0f, 128.0f)
                arcToRelative(184.0f, 184.0f, 0.0f, false, false, 24.0f, -1.5f)
                verticalLineToRelative(23.7f)
                arcTo(151.1f, 151.1f, 0.0f, false, true, 96.0f, 152.0f)
                arcTo(151.1f, 151.1f, 0.0f, false, true, 72.0f, 150.2f)
                close()
                moveTo(168.0f, 109.9f)
                lineTo(168.0f, 124.0f)
                curveToRelative(0.0f, 8.4f, -12.4f, 17.4f, -32.0f, 22.9f)
                lineTo(136.0f, 123.5f)
                curveTo(148.9f, 120.4f, 159.8f, 115.7f, 168.0f, 109.9f)
                close()
                moveTo(96.0f, 56.0f)
                curveToRelative(41.2f, 0.0f, 72.0f, 14.8f, 72.0f, 28.0f)
                reflectiveCurveToRelative(-30.8f, 28.0f, -72.0f, 28.0f)
                reflectiveCurveTo(24.0f, 97.2f, 24.0f, 84.0f)
                reflectiveCurveTo(54.8f, 56.0f, 96.0f, 56.0f)
                close()
                moveTo(24.0f, 124.0f)
                lineTo(24.0f, 109.9f)
                curveToRelative(8.2f, 5.8f, 19.1f, 10.5f, 32.0f, 13.6f)
                verticalLineToRelative(23.4f)
                curveTo(36.4f, 141.4f, 24.0f, 132.4f, 24.0f, 124.0f)
                close()
                moveTo(88.0f, 172.0f)
                verticalLineToRelative(-4.2f)
                lineToRelative(8.0f, 0.2f)
                quadToRelative(5.9f, 0.0f, 11.4f, -0.3f)
                curveToRelative(4.0f, 1.4f, 8.2f, 2.6f, 12.6f, 3.7f)
                verticalLineToRelative(23.5f)
                curveTo(100.4f, 189.4f, 88.0f, 180.4f, 88.0f, 172.0f)
                close()
                moveTo(136.0f, 198.2f)
                lineTo(136.0f, 174.4f)
                arcToRelative(188.4f, 188.4f, 0.0f, false, false, 24.0f, 1.6f)
                arcToRelative(184.0f, 184.0f, 0.0f, false, false, 24.0f, -1.5f)
                verticalLineToRelative(23.7f)
                arcToRelative(160.9f, 160.9f, 0.0f, false, true, -48.0f, 0.0f)
                close()
                moveTo(200.0f, 194.9f)
                lineTo(200.0f, 171.5f)
                curveToRelative(12.9f, -3.1f, 23.8f, -7.8f, 32.0f, -13.6f)
                lineTo(232.0f, 172.0f)
                curveTo(232.0f, 180.4f, 219.6f, 189.4f, 200.0f, 194.9f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
