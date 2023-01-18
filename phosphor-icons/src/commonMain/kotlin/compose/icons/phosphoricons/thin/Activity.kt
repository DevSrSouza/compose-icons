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

public val ThinGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 212.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.5f, -2.6f)
                lineTo(95.7f, 50.4f)
                lineTo(59.6f, 129.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 56.0f, 132.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(53.4f)
                lineToRelative(39.0f, -85.7f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 96.1f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.6f, 2.6f)
                lineToRelative(60.8f, 159.5f)
                lineToRelative(35.9f, -71.9f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 200.0f, 124.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(202.5f)
                lineToRelative(-38.9f, 77.8f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 160.0f, 212.0f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
