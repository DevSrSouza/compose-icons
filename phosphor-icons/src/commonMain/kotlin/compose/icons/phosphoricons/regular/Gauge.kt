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

public val RegularGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.1f, 80.7f)
                arcTo(111.3f, 111.3f, 0.0f, false, false, 128.0f, 48.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-50.6f, 0.2f, -93.4f, 34.5f, -107.0f, 81.2f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, false, -0.8f, 1.8f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.2f, 1.8f)
                arcTo(110.9f, 110.9f, 0.0f, false, false, 16.0f, 161.1f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(160.0f)
                arcTo(111.2f, 111.2f, 0.0f, false, false, 207.1f, 80.7f)
                close()
                moveTo(224.0f, 184.0f)
                horizontalLineTo(119.7f)
                lineToRelative(58.5f, -76.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 165.5f, 98.0f)
                lineToRelative(-66.0f, 86.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(161.1f)
                arcTo(98.3f, 98.3f, 0.0f, false, true, 33.7f, 143.0f)
                lineToRelative(22.7f, 6.1f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 2.1f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, -15.8f)
                lineToRelative(-22.6f, -6.0f)
                curveTo(50.6f, 93.0f, 82.2f, 67.5f, 120.0f, 64.3f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(64.3f)
                arcTo(95.6f, 95.6f, 0.0f, false, true, 195.8f, 92.0f)
                arcToRelative(96.9f, 96.9f, 0.0f, false, true, 22.6f, 35.5f)
                lineToRelative(-22.9f, 6.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, 15.8f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 2.1f, -0.3f)
                lineToRelative(22.9f, -6.1f)
                arcToRelative(95.1f, 95.1f, 0.0f, false, true, 1.5f, 17.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
