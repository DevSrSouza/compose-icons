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

public val BaselineGroup.Festival: ImageVector
    get() {
        if (_festival != null) {
            return _festival!!
        }
        _festival = Builder(name = "Festival", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.7f)
                lineToRelative(0.0f, -1.7f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(-1.0f, -1.49f)
                lineToRelative(1.0f, -1.51f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 4.7f)
                lineToRelative(-9.0f, 6.3f)
                lineToRelative(0.0f, 10.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(3.03f, -2.0f)
                lineToRelative(2.97f, 2.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
        }
        .build()
        return _festival!!
    }

private var _festival: ImageVector? = null
