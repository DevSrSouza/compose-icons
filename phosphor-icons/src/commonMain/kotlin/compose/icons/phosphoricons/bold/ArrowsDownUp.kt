package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) {
            return _arrowsDownUp!!
        }
        _arrowsDownUp = Builder(name = "ArrowsDownUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.5f, 167.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(68.0f, 179.0f)
                lineTo(68.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(92.0f, 179.0f)
                lineToRelative(11.5f, -11.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.5f, 167.5f)
                close()
                moveTo(216.5f, 71.5f)
                lineTo(184.5f, 39.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineTo(164.0f, 77.0f)
                lineTo(164.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 77.0f)
                lineToRelative(11.5f, 11.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.5f, 71.5f)
                close()
            }
        }
        .build()
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
