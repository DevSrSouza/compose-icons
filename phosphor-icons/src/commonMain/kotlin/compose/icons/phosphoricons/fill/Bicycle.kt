package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.5f, 164.7f)
                lineToRelative(27.8f, -38.2f)
                arcTo(47.9f, 47.9f, 0.0f, true, true, 48.0f, 112.0f)
                arcToRelative(46.6f, 46.6f, 0.0f, false, true, 21.4f, 5.1f)
                lineTo(41.5f, 155.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, 11.2f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 48.0f, 168.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 54.5f, 164.7f)
                close()
                moveTo(165.9f, 72.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(152.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.9f, 4.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 0.0f, 8.0f)
                lineToRelative(11.6f, 20.0f)
                horizontalLineTo(99.3f)
                lineTo(82.9f, 60.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 76.0f, 56.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(71.4f)
                lineTo(85.1f, 95.5f)
                lineTo(69.4f, 117.1f)
                arcToRelative(48.1f, 48.1f, 0.0f, false, true, 12.9f, 9.4f)
                lineToRelative(11.6f, -15.9f)
                lineTo(125.1f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.8f, -8.0f)
                lineToRelative(-30.3f, -52.0f)
                horizontalLineToRelative(57.5f)
                lineToRelative(11.2f, 19.2f)
                arcToRelative(46.5f, 46.5f, 0.0f, false, true, 13.8f, -8.1f)
                close()
                moveTo(208.0f, 112.0f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, false, -16.9f, 3.1f)
                lineTo(214.9f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.8f, 8.0f)
                lineToRelative(-23.8f, -40.8f)
                arcTo(47.9f, 47.9f, 0.0f, true, false, 208.0f, 112.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
