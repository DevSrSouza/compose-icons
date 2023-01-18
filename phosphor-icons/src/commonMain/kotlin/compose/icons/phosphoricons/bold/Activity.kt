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

public val BoldGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 220.0f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.6f, -7.7f)
                lineTo(95.0f, 71.1f)
                lineTo(66.9f, 133.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 140.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(48.3f)
                lineTo(85.1f, 35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.1f, 0.7f)
                lineToRelative(54.3f, 142.5f)
                lineToRelative(27.8f, -55.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 200.0f, 116.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(207.4f)
                lineToRelative(-36.7f, 73.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 160.0f, 220.0f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
