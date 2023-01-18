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

public val LightGroup.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) {
            return _arrowsDownUp!!
        }
        _arrowsDownUp = Builder(name = "ArrowsDownUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.2f, 171.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(74.0f, 193.5f)
                lineTo(74.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(86.0f, 193.5f)
                lineToRelative(21.8f, -21.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 116.2f, 171.8f)
                close()
                moveTo(212.2f, 75.8f)
                lineTo(180.2f, 43.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, 8.4f)
                lineTo(170.0f, 62.5f)
                lineTo(170.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(182.0f, 62.5f)
                lineToRelative(21.8f, 21.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                close()
            }
        }
        .build()
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
