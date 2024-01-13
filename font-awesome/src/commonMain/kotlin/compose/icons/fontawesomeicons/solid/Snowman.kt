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

public val SolidGroup.Snowman: ImageVector
    get() {
        if (_snowman != null) {
            return _snowman!!
        }
        _snowman = Builder(name = "Snowman", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(341.1f, 140.6f)
                curveToRelative(-2.0f, 3.9f, -1.6f, 8.6f, 1.2f, 12.0f)
                curveToRelative(7.0f, 8.5f, 12.9f, 18.1f, 17.2f, 28.4f)
                lineTo(408.0f, 160.2f)
                lineTo(408.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(19.6f)
                lineToRelative(22.5f, -9.7f)
                curveToRelative(12.2f, -5.2f, 26.3f, 0.4f, 31.5f, 12.6f)
                reflectiveCurveToRelative(-0.4f, 26.3f, -12.6f, 31.5f)
                lineToRelative(-56.0f, 24.0f)
                lineToRelative(-73.6f, 31.5f)
                curveToRelative(-0.5f, 9.5f, -2.1f, 18.6f, -4.8f, 27.3f)
                curveToRelative(-1.2f, 3.8f, -0.1f, 8.0f, 2.8f, 10.8f)
                curveTo(396.7f, 296.9f, 416.0f, 338.2f, 416.0f, 384.0f)
                curveToRelative(0.0f, 44.7f, -18.3f, 85.0f, -47.8f, 114.1f)
                curveToRelative(-9.9f, 9.7f, -23.7f, 13.9f, -37.5f, 13.9f)
                lineTo(181.3f, 512.0f)
                curveToRelative(-13.9f, 0.0f, -27.7f, -4.2f, -37.5f, -13.9f)
                curveTo(114.3f, 469.0f, 96.0f, 428.7f, 96.0f, 384.0f)
                curveToRelative(0.0f, -45.8f, 19.3f, -87.1f, 50.1f, -116.3f)
                curveToRelative(2.9f, -2.8f, 4.0f, -6.9f, 2.8f, -10.8f)
                curveToRelative(-2.7f, -8.7f, -4.3f, -17.9f, -4.8f, -27.3f)
                lineTo(70.5f, 198.1f)
                lineToRelative(-56.0f, -24.0f)
                curveTo(2.4f, 168.8f, -3.3f, 154.7f, 1.9f, 142.5f)
                reflectiveCurveToRelative(19.3f, -17.8f, 31.5f, -12.6f)
                lineTo(56.0f, 139.6f)
                lineTo(56.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(40.2f)
                lineTo(152.6f, 181.0f)
                curveToRelative(4.3f, -10.3f, 10.1f, -19.9f, 17.2f, -28.4f)
                curveToRelative(2.8f, -3.4f, 3.3f, -8.1f, 1.2f, -12.0f)
                curveTo(164.0f, 127.2f, 160.0f, 112.1f, 160.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 16.1f, -4.0f, 31.2f, -10.9f, 44.6f)
                close()
                moveTo(224.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(272.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(256.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(272.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(288.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(240.0f, 120.0f)
                verticalLineToRelative(3.2f)
                curveToRelative(0.0f, 3.2f, 0.8f, 6.3f, 2.3f, 9.0f)
                lineToRelative(9.0f, 16.9f)
                curveToRelative(0.9f, 1.7f, 2.7f, 2.8f, 4.7f, 2.8f)
                reflectiveCurveToRelative(3.8f, -1.1f, 4.7f, -2.8f)
                lineToRelative(9.0f, -16.9f)
                curveToRelative(1.5f, -2.8f, 2.3f, -5.9f, 2.3f, -9.0f)
                lineTo(272.0f, 120.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _snowman!!
    }

private var _snowman: ImageVector? = null
