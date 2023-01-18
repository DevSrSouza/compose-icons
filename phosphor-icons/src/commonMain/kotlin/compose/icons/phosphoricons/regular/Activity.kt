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

public val RegularGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 216.0f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.1f, -5.2f)
                lineTo(95.3f, 60.8f)
                lineToRelative(-32.0f, 70.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 136.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(50.8f)
                lineTo(88.7f, 36.7f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 96.3f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.2f, 5.2f)
                lineTo(161.0f, 188.1f)
                lineToRelative(31.8f, -63.7f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 200.0f, 120.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(204.9f)
                lineToRelative(-37.7f, 75.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 160.0f, 216.0f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
