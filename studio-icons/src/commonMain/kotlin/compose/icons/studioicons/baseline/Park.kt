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

public val BaselineGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(-7.0f, -10.0f)
                lineToRelative(-6.95f, 10.0f)
                lineToRelative(1.95f, 0.0f)
                lineToRelative(-3.9f, 6.0f)
                lineToRelative(6.92f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(3.96f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(7.02f, 0.0f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
