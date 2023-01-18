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

public val RegularGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.1f, 110.6f)
                lineTo(208.0f, 106.2f)
                verticalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(50.2f)
                lineToRelative(-13.1f, 4.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.8f)
                verticalLineTo(160.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.3f, 2.2f)
                curveToRelative(15.7f, 55.0f, 86.1f, 74.0f, 100.1f, 77.2f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 7.2f, 0.0f)
                curveToRelative(14.0f, -3.2f, 84.4f, -22.2f, 100.1f, -77.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.3f, -2.2f)
                verticalLineTo(125.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 221.1f, 110.6f)
                close()
                moveTo(64.0f, 56.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(44.9f)
                lineTo(133.1f, 81.3f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -4.6f, -0.8f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -4.6f, 0.8f)
                lineTo(64.0f, 100.9f)
                close()
                moveTo(216.0f, 158.8f)
                curveToRelative(-5.8f, 19.0f, -20.5f, 35.2f, -43.9f, 48.1f)
                arcTo(184.7f, 184.7f, 0.0f, false, true, 128.0f, 223.8f)
                arcToRelative(184.7f, 184.7f, 0.0f, false, true, -44.1f, -16.9f)
                curveTo(60.5f, 194.0f, 45.8f, 177.8f, 40.0f, 158.8f)
                verticalLineToRelative(-33.0f)
                lineToRelative(18.4f, -6.2f)
                horizontalLineToRelative(0.0f)
                lineTo(120.0f, 99.1f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(99.1f)
                lineToRelative(61.6f, 20.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(18.4f, 6.2f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
