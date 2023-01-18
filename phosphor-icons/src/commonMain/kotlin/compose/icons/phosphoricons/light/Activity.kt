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

public val LightGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 214.0f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -5.3f, -3.9f)
                lineTo(95.5f, 55.6f)
                lineToRelative(-34.0f, 74.9f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 56.0f, 134.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(52.1f)
                lineTo(90.5f, 37.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.1f, 0.4f)
                lineToRelative(59.1f, 155.2f)
                lineToRelative(33.9f, -67.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 200.0f, 122.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(203.7f)
                lineToRelative(-38.3f, 76.7f)
                arcTo(6.2f, 6.2f, 0.0f, false, true, 160.0f, 214.0f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
