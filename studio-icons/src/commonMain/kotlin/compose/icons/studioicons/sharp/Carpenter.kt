package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Carpenter: ImageVector
    get() {
        if (_carpenter != null) {
            return _carpenter!!
        }
        _carpenter = Builder(name = "Carpenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.5f)
                lineTo(3.11f, 5.39f)
                lineToRelative(8.13f, 11.67f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(7.07f, -7.07f)
                lineTo(7.0f, 1.5f)
                close()
                moveTo(12.66f, 18.47f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.24f, 4.24f)
                lineTo(12.66f, 18.47f)
                close()
            }
        }
        .build()
        return _carpenter!!
    }

private var _carpenter: ImageVector? = null
