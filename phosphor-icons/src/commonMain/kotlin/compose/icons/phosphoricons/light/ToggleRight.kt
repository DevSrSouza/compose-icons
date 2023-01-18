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

public val LightGroup.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = Builder(name = "ToggleRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 58.0f)
                lineTo(80.0f, 58.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 0.0f, 140.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 0.0f, -140.0f)
                close()
                moveTo(176.0f, 186.0f)
                lineTo(80.0f, 186.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 80.0f, 70.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 0.0f, 116.0f)
                close()
                moveTo(176.0f, 90.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 176.0f, 90.0f)
                close()
                moveTo(176.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 176.0f, 154.0f)
                close()
            }
        }
        .build()
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
