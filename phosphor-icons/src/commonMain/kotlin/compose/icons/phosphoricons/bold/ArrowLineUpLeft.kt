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

public val BoldGroup.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) {
            return _arrowLineUpLeft!!
        }
        _arrowLineUpLeft = Builder(name = "ArrowLineUpLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 156.0f)
                lineTo(52.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 44.0f)
                lineTo(164.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(93.0f, 68.0f)
                lineToRelative(91.5f, 91.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(76.0f, 85.0f)
                verticalLineToRelative(71.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(216.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
