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

public val BoldGroup.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) {
            return _bracketsAngle!!
        }
        _bracketsAngle = Builder(name = "BracketsAngle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.1f, 46.4f)
                lineTo(38.2f, 128.0f)
                lineToRelative(51.9f, 81.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.7f, 16.5f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 80.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.1f, -5.6f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, -12.8f)
                lineToRelative(56.0f, -88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 90.1f, 46.4f)
                close()
                moveTo(242.1f, 121.6f)
                lineTo(186.1f, 33.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.2f, 12.8f)
                lineTo(217.8f, 128.0f)
                lineToRelative(-51.9f, 81.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.7f, 16.5f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 176.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.1f, -5.6f)
                lineToRelative(56.0f, -88.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 242.1f, 121.6f)
                close()
            }
        }
        .build()
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
