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

public val BaselineGroup.LayersClear: ImageVector
    get() {
        if (_layersClear != null) {
            return _layersClear!!
        }
        _layersClear = Builder(name = "LayersClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.81f, 14.99f)
                lineToRelative(1.19f, -0.92f)
                lineToRelative(-1.43f, -1.43f)
                lineToRelative(-1.19f, 0.92f)
                lineToRelative(1.43f, 1.43f)
                close()
                moveTo(19.36f, 10.27f)
                lineTo(21.0f, 9.0f)
                lineToRelative(-9.0f, -7.0f)
                lineToRelative(-2.91f, 2.27f)
                lineToRelative(7.87f, 7.88f)
                lineToRelative(2.4f, -1.88f)
                close()
                moveTo(3.27f, 1.0f)
                lineTo(2.0f, 2.27f)
                lineToRelative(4.22f, 4.22f)
                lineTo(3.0f, 9.0f)
                lineToRelative(1.63f, 1.27f)
                lineTo(12.0f, 16.0f)
                lineToRelative(2.1f, -1.63f)
                lineToRelative(1.43f, 1.43f)
                lineTo(12.0f, 18.54f)
                lineToRelative(-7.37f, -5.73f)
                lineTo(3.0f, 14.07f)
                lineToRelative(9.0f, 7.0f)
                lineToRelative(4.95f, -3.85f)
                lineTo(20.73f, 21.0f)
                lineTo(22.0f, 19.73f)
                lineTo(3.27f, 1.0f)
                close()
            }
        }
        .build()
        return _layersClear!!
    }

private var _layersClear: ImageVector? = null
