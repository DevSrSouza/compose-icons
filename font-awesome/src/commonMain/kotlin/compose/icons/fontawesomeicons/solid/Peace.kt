package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 445.3f)
                lineTo(224.0f, 323.5f)
                lineToRelative(-94.3f, 77.1f)
                curveToRelative(26.1f, 22.8f, 58.5f, 38.7f, 94.3f, 44.7f)
                close()
                moveTo(89.2f, 351.1f)
                lineTo(224.0f, 240.8f)
                lineTo(224.0f, 66.7f)
                curveTo(133.2f, 81.9f, 64.0f, 160.9f, 64.0f, 256.0f)
                curveToRelative(0.0f, 34.6f, 9.2f, 67.1f, 25.2f, 95.1f)
                close()
                moveTo(382.3f, 400.6f)
                lineTo(288.0f, 323.5f)
                lineTo(288.0f, 445.3f)
                curveToRelative(35.7f, -6.0f, 68.1f, -21.9f, 94.3f, -44.7f)
                close()
                moveTo(422.9f, 351.1f)
                curveToRelative(16.0f, -28.0f, 25.2f, -60.5f, 25.2f, -95.1f)
                curveToRelative(0.0f, -95.1f, -69.2f, -174.1f, -160.0f, -189.3f)
                lineTo(288.1f, 240.8f)
                lineTo(422.8f, 351.1f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
