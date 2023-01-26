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

public val BaselineGroup.Emergency: ImageVector
    get() {
        if (_emergency != null) {
            return _emergency!!
        }
        _emergency = Builder(name = "Emergency", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.79f, 9.23f)
                lineToRelative(-2.0f, -3.46f)
                lineToRelative(-4.79f, 2.77f)
                lineToRelative(0.0f, -5.54f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 5.54f)
                lineToRelative(-4.79f, -2.77f)
                lineToRelative(-2.0f, 3.46f)
                lineToRelative(4.79f, 2.77f)
                lineToRelative(-4.79f, 2.77f)
                lineToRelative(2.0f, 3.46f)
                lineToRelative(4.79f, -2.77f)
                lineToRelative(0.0f, 5.54f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -5.54f)
                lineToRelative(4.79f, 2.77f)
                lineToRelative(2.0f, -3.46f)
                lineToRelative(-4.79f, -2.77f)
                close()
            }
        }
        .build()
        return _emergency!!
    }

private var _emergency: ImageVector? = null
