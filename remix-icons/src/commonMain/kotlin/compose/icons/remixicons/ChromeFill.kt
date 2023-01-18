package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ChromeFill: ImageVector
    get() {
        if (_chromeFill != null) {
            return _chromeFill!!
        }
        _chromeFill = Builder(name = "ChromeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.827f, 21.763f)
                curveTo(5.35f, 20.771f, 2.0f, 16.777f, 2.0f, 12.0f)
                curveToRelative(0.0f, -1.822f, 0.487f, -3.53f, 1.339f, -5.002f)
                lineToRelative(4.283f, 7.419f)
                arcToRelative(4.999f, 4.999f, 0.0f, false, false, 4.976f, 2.548f)
                lineToRelative(-2.77f, 4.798f)
                close()
                moveTo(12.0f, 22.0f)
                lineToRelative(4.287f, -7.425f)
                arcTo(4.977f, 4.977f, 0.0f, false, false, 17.0f, 12.0f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, false, -1.0f, -3.0f)
                horizontalLineToRelative(5.542f)
                curveToRelative(0.298f, 0.947f, 0.458f, 1.955f, 0.458f, 3.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(14.572f, 13.545f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, true, -5.17f, -0.045f)
                lineToRelative(-0.029f, -0.05f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 5.225f, 0.05f)
                lineToRelative(-0.026f, 0.045f)
                close()
                moveTo(4.632f, 5.239f)
                arcTo(9.974f, 9.974f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(9.996f, 9.996f, 0.0f, false, true, 8.662f, 5.0f)
                lineTo(12.0f, 7.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -4.599f, 3.035f)
                lineTo(4.632f, 5.239f)
                close()
            }
        }
        .build()
        return _chromeFill!!
    }

private var _chromeFill: ImageVector? = null
