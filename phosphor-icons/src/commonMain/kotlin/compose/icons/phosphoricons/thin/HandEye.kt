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

public val ThinGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 132.0f)
                curveToRelative(-26.7f, 0.0f, -43.0f, 20.6f, -48.8f, 29.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, 13.2f)
                curveTo(85.0f, 183.4f, 101.3f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(43.0f, -20.6f, 48.8f, -29.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -13.2f)
                curveTo(171.0f, 152.6f, 154.7f, 132.0f, 128.0f, 132.0f)
                close()
                moveTo(170.0f, 170.2f)
                curveToRelative(-5.0f, 7.8f, -19.2f, 25.8f, -42.0f, 25.8f)
                reflectiveCurveToRelative(-37.0f, -18.0f, -42.0f, -25.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -4.4f)
                curveToRelative(5.0f, -7.8f, 19.2f, -25.8f, 42.0f, -25.8f)
                reflectiveCurveToRelative(37.0f, 18.0f, 42.0f, 25.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 170.0f, 170.2f)
                close()
                moveTo(188.0f, 88.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -16.0f, 6.1f)
                lineTo(172.0f, 52.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, -24.0f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, -16.1f, 6.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 84.0f, 36.0f)
                lineTo(84.0f, 50.1f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 44.0f, 68.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                lineTo(212.0f, 112.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 188.0f, 88.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -152.0f, 0.0f)
                lineTo(52.0f, 68.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(92.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 168.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
