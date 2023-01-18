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

public val ThinGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.2f, 83.5f)
                arcTo(107.0f, 107.0f, 0.0f, false, false, 128.1f, 52.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-48.9f, 0.2f, -90.4f, 33.5f, -103.4f, 78.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -0.5f, 1.1f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.1f, 1.3f)
                arcTo(106.5f, 106.5f, 0.0f, false, false, 20.0f, 161.1f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(160.0f)
                arcTo(107.3f, 107.3f, 0.0f, false, false, 204.2f, 83.5f)
                close()
                moveTo(228.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(111.6f)
                lineTo(175.0f, 105.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.3f, -4.9f)
                lineTo(101.5f, 188.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(161.1f)
                arcToRelative(102.6f, 102.6f, 0.0f, false, true, 2.6f, -23.0f)
                lineToRelative(26.8f, 7.1f)
                lineToRelative(1.1f, 0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.9f)
                lineToRelative(-26.7f, -7.2f)
                curveTo(45.3f, 90.8f, 81.3f, 61.8f, 124.0f, 60.1f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(60.1f)
                arcToRelative(99.3f, 99.3f, 0.0f, false, true, 66.6f, 29.1f)
                arcToRelative(98.2f, 98.2f, 0.0f, false, true, 24.9f, 41.1f)
                lineToRelative(-27.0f, 7.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 7.9f)
                lineToRelative(1.1f, -0.2f)
                lineToRelative(27.0f, -7.2f)
                arcToRelative(100.2f, 100.2f, 0.0f, false, true, 2.4f, 22.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
