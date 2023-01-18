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

public val BoldGroup.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) {
            return _checkSquareOffset!!
        }
        _checkSquareOffset = Builder(name = "CheckSquareOffset", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(135.6f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(200.0f, 200.0f)
                lineTo(200.0f, 56.0f)
                lineTo(56.0f, 56.0f)
                verticalLineToRelative(87.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(32.0f, 52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 32.0f)
                lineTo(204.0f, 32.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 224.0f, 52.0f)
                close()
                moveTo(136.5f, 143.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(64.0f, 199.0f)
                lineTo(40.5f, 175.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 136.5f, 143.5f)
                close()
            }
        }
        .build()
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
