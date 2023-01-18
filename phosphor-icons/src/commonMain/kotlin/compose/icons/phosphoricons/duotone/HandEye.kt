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

public val DuotoneGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(188.0f, 92.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(168.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                lineTo(128.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                lineTo(88.0f, 68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f)
                lineTo(208.0f, 112.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 188.0f, 92.0f)
                close()
                moveTo(173.4f, 172.4f)
                curveToRelative(-5.7f, 8.8f, -20.8f, 27.6f, -45.4f, 27.6f)
                reflectiveCurveToRelative(-39.7f, -18.8f, -45.4f, -27.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, -8.8f)
                curveToRelative(5.7f, -8.8f, 20.8f, -27.6f, 45.4f, -27.6f)
                reflectiveCurveToRelative(39.7f, 18.8f, 45.4f, 27.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 173.4f, 172.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                curveToRelative(-28.7f, 0.0f, -46.0f, 21.8f, -52.1f, 31.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 17.6f)
                curveTo(82.0f, 186.2f, 99.3f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(46.0f, -21.8f, 52.1f, -31.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -17.6f)
                curveTo(174.0f, 149.8f, 156.7f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-20.8f, 0.0f, -34.0f, -16.8f, -38.7f, -24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.7f, -7.2f, 17.9f, -24.0f, 38.7f, -24.0f)
                reflectiveCurveToRelative(34.0f, 16.8f, 38.7f, 24.0f)
                curveTo(162.0f, 175.2f, 148.8f, 192.0f, 128.0f, 192.0f)
                close()
                moveTo(188.0f, 84.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -12.0f, 2.7f)
                lineTo(176.0f, 52.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -13.4f, 3.4f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 36.0f)
                verticalLineToRelative(6.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 68.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 112.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 188.0f, 84.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -144.0f, 0.0f)
                lineTo(56.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(140.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 168.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
