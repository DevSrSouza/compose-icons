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

public val BoldGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 184.0f)
                close()
                moveTo(179.5f, 164.7f)
                verticalLineToRelative(-0.4f)
                curveTo(175.6f, 151.6f, 160.2f, 128.0f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-47.6f, 23.6f, -51.4f, 36.3f)
                verticalLineToRelative(0.4f)
                horizontalLineToRelative(0.0f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 76.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.5f, 3.3f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.6f, -2.0f, 6.6f, -19.4f, 28.5f, -19.4f)
                reflectiveCurveToRelative(27.9f, 17.4f, 28.5f, 19.4f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 168.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, -0.5f, -3.3f)
                close()
                moveTo(220.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                lineTo(36.0f, 68.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 68.0f, 36.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, true, 8.0f, 1.0f)
                lineTo(76.0f, 36.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 60.8f, -14.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 180.0f, 52.0f)
                lineTo(180.0f, 81.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, true, 8.0f, -1.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 220.0f, 112.0f)
                close()
                moveTo(196.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(156.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
