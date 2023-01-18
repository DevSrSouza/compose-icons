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

public val BoldGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.9f, 77.8f)
                arcTo(115.4f, 115.4f, 0.0f, false, false, 128.0f, 44.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-52.2f, 0.2f, -96.5f, 35.5f, -110.7f, 83.6f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 16.0f, 130.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -0.4f, 2.3f)
                arcTo(114.2f, 114.2f, 0.0f, false, false, 12.0f, 161.1f)
                verticalLineTo(184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(224.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(160.0f)
                arcTo(115.3f, 115.3f, 0.0f, false, false, 209.9f, 77.8f)
                close()
                moveTo(220.0f, 180.0f)
                horizontalLineTo(127.8f)
                lineToRelative(53.6f, -69.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.1f, -14.6f)
                lineTo(97.5f, 180.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(161.1f)
                arcToRelative(95.0f, 95.0f, 0.0f, false, true, 0.9f, -13.1f)
                lineToRelative(18.4f, 5.0f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 3.2f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.1f, -23.6f)
                lineToRelative(-18.3f, -4.9f)
                curveTo(55.8f, 95.1f, 83.2f, 73.1f, 116.0f, 68.8f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(68.8f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, 52.9f, 26.0f)
                arcToRelative(90.5f, 90.5f, 0.0f, false, true, 20.1f, 30.0f)
                lineToRelative(-18.6f, 5.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.1f, 23.6f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 3.2f, -0.4f)
                lineToRelative(18.5f, -5.0f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, true, 0.8f, 12.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
