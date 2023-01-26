package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.LineAxis: ImageVector
    get() {
        if (_lineAxis != null) {
            return _lineAxis!!
        }
        _lineAxis = Builder(name = "LineAxis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.43f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.03f, 4.53f)
                lineToRelative(-7.06f, -6.55f)
                lineToRelative(-7.5f, 7.51f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(6.14f, -6.15f)
                lineToRelative(5.59f, 5.18f)
                lineToRelative(-1.73f, 1.95f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-7.5f, 7.51f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(6.0f, -6.01f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(3.19f, -3.59f)
                lineToRelative(3.9f, 3.61f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.98f, -3.7f)
                close()
            }
        }
        .build()
        return _lineAxis!!
    }

private var _lineAxis: ImageVector? = null
