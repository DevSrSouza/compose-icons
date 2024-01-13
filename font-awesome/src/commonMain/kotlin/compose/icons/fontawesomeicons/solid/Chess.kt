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

public val SolidGroup.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(112.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(112.0f, 96.0f)
                lineTo(60.2f, 96.0f)
                curveTo(49.1f, 96.0f, 40.0f, 105.1f, 40.0f, 116.2f)
                curveToRelative(0.0f, 2.5f, 0.5f, 4.9f, 1.3f, 7.3f)
                lineTo(73.8f, 208.0f)
                lineTo(72.0f, 208.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(60.0f, 384.0f)
                lineTo(196.0f, 384.0f)
                lineTo(180.0f, 256.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(32.5f, -84.5f)
                curveToRelative(0.9f, -2.3f, 1.3f, -4.8f, 1.3f, -7.3f)
                curveToRelative(0.0f, -11.2f, -9.1f, -20.2f, -20.2f, -20.2f)
                lineTo(144.0f, 96.0f)
                lineTo(144.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(144.0f, 32.0f)
                lineTo(144.0f, 16.0f)
                close()
                moveTo(48.0f, 416.0f)
                lineTo(4.8f, 473.6f)
                curveTo(1.7f, 477.8f, 0.0f, 482.8f, 0.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(232.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -5.2f, -1.7f, -10.2f, -4.8f, -14.4f)
                lineTo(208.0f, 416.0f)
                lineTo(48.0f, 416.0f)
                close()
                moveTo(336.0f, 416.0f)
                lineToRelative(-43.2f, 57.6f)
                curveToRelative(-3.1f, 4.2f, -4.8f, 9.2f, -4.8f, 14.4f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(488.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -5.2f, -1.7f, -10.2f, -4.8f, -14.4f)
                lineTo(464.0f, 416.0f)
                lineTo(336.0f, 416.0f)
                close()
                moveTo(304.0f, 208.0f)
                verticalLineToRelative(51.9f)
                curveToRelative(0.0f, 7.8f, 2.8f, 15.3f, 8.0f, 21.1f)
                lineTo(339.2f, 312.0f)
                lineTo(337.0f, 384.0f)
                lineTo(462.5f, 384.0f)
                lineToRelative(-3.3f, -72.0f)
                lineToRelative(28.3f, -30.8f)
                curveToRelative(5.4f, -5.9f, 8.5f, -13.6f, 8.5f, -21.7f)
                lineTo(496.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(464.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(424.0f, 224.0f)
                lineTo(424.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(392.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(352.0f, 224.0f)
                lineTo(352.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(320.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(384.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                lineTo(384.0f, 336.0f)
                lineTo(384.0f, 304.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
