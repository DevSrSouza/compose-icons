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

public val FillGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.5f, 65.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -2.3f)
                lineToRelative(-34.0f, -34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.3f, -11.3f)
                lineToRelative(34.0f, 34.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 235.5f, 65.8f)
                close()
                moveTo(65.8f, 20.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.0f)
                lineToRelative(-34.0f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -2.3f)
                lineToRelative(34.0f, -34.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 65.8f, 20.5f)
                close()
                moveTo(224.0f, 125.5f)
                verticalLineToRelative(5.3f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -0.1f, 2.1f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 133.0f, 223.9f)
                horizontalLineTo(123.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 32.1f, 133.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -0.1f, -2.1f)
                verticalLineToRelative(-5.6f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 0.1f, -2.1f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 123.0f, 32.1f)
                horizontalLineToRelative(10.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 223.9f, 123.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 0.1f, 2.1f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 128.0f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
