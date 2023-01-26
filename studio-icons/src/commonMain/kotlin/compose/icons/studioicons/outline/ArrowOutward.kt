package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ArrowOutward: ImageVector
    get() {
        if (_arrowOutward != null) {
            return _arrowOutward!!
        }
        _arrowOutward = Builder(name = "ArrowOutward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(8.59f, 0.0f)
                lineToRelative(-9.59f, 9.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(9.59f, -9.59f)
                lineToRelative(0.0f, 8.59f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _arrowOutward!!
    }

private var _arrowOutward: ImageVector? = null
