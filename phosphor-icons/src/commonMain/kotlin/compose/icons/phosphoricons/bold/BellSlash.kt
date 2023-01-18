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

public val BoldGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.9f, 207.9f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(54.0f, 64.5f)
                arcTo(84.3f, 84.3f, 0.0f, false, false, 44.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 33.4f, -6.8f, 52.1f, -12.5f, 61.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 0.0f, 20.1f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 49.0f, 204.0f)
                horizontalLineTo(84.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.6f, 0.0f)
                horizontalLineToRelative(9.1f)
                lineToRelative(18.2f, 20.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 216.9f, 207.9f)
                close()
                moveTo(68.2f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, true, 3.5f, -20.1f)
                lineTo(159.1f, 180.0f)
                horizontalLineTo(55.6f)
                curveTo(65.9f, 158.5f, 68.2f, 131.6f, 68.2f, 112.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.6f, -16.0f)
                horizontalLineToRelative(39.2f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(88.9f, 42.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.4f, -15.7f)
                arcTo(82.6f, 82.6f, 0.0f, false, true, 128.6f, 20.0f)
                curveToRelative(45.9f, 0.3f, 83.2f, 38.4f, 83.2f, 84.9f)
                verticalLineTo(112.0f)
                arcToRelative(181.6f, 181.6f, 0.0f, false, false, 3.5f, 37.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.2f, 14.2f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, -2.5f, 0.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -11.8f, -9.5f)
                arcToRelative(208.6f, 208.6f, 0.0f, false, true, -4.0f, -42.2f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -33.3f, -26.6f, -60.7f, -59.3f, -60.9f)
                horizontalLineTo(128.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -23.3f, 4.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.9f, 42.4f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
