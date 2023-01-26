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

public val SharpGroup.LayersClear: ImageVector
    get() {
        if (_layersClear != null) {
            return _layersClear!!
        }
        _layersClear = Builder(name = "LayersClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                lineToRelative(-9.0f, -7.0f)
                lineToRelative(-2.59f, 2.02f)
                lineToRelative(7.87f, 7.87f)
                close()
                moveTo(21.0f, 14.07f)
                lineToRelative(-1.63f, -1.27f)
                lineToRelative(-0.67f, 0.52f)
                lineToRelative(1.43f, 1.43f)
                close()
                moveTo(3.41f, 0.86f)
                lineTo(2.0f, 2.27f)
                lineToRelative(4.22f, 4.22f)
                lineTo(3.0f, 9.0f)
                lineToRelative(9.0f, 7.0f)
                lineToRelative(2.1f, -1.63f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-3.53f, 2.75f)
                lineToRelative(-7.37f, -5.73f)
                lineTo(3.0f, 14.07f)
                lineToRelative(9.0f, 7.0f)
                lineToRelative(4.95f, -3.85f)
                lineTo(20.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _layersClear!!
    }

private var _layersClear: ImageVector? = null
