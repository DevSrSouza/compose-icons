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

public val BoldGroup.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) {
            return _checkSquare!!
        }
        _checkSquare = Builder(name = "CheckSquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.7f, 140.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.6f, -17.4f)
                lineToRelative(21.0f, 20.1f)
                lineToRelative(50.4f, -48.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.6f, 17.4f)
                lineToRelative(-58.7f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.3f, 3.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.3f, -3.3f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                close()
            }
        }
        .build()
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
