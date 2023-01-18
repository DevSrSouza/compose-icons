package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.6f, 82.1f)
                arcTo(109.1f, 109.1f, 0.0f, false, false, 128.0f, 50.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-49.7f, 0.2f, -91.8f, 34.0f, -105.2f, 80.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -0.7f, 1.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.2f, 1.6f)
                arcToRelative(113.1f, 113.1f, 0.0f, false, false, -3.5f, 28.0f)
                verticalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(160.0f)
                arcTo(109.1f, 109.1f, 0.0f, false, false, 205.6f, 82.1f)
                close()
                moveTo(226.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(115.6f)
                lineToRelative(61.0f, -79.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.5f, -7.3f)
                lineTo(100.5f, 186.0f)
                horizontalLineTo(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(161.1f)
                arcToRelative(100.7f, 100.7f, 0.0f, false, true, 2.1f, -20.6f)
                lineToRelative(24.8f, 6.7f)
                lineToRelative(1.6f, 0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.7f, -4.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, -7.3f)
                lineTo(35.3f, 129.0f)
                curveTo(47.9f, 91.9f, 81.7f, 64.7f, 122.0f, 62.2f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(62.2f)
                arcToRelative(98.2f, 98.2f, 0.0f, false, true, 87.0f, 66.7f)
                lineToRelative(-25.0f, 6.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, 7.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.7f, 4.5f)
                lineToRelative(1.6f, -0.2f)
                lineToRelative(25.0f, -6.7f)
                arcTo(104.8f, 104.8f, 0.0f, false, true, 226.0f, 160.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
