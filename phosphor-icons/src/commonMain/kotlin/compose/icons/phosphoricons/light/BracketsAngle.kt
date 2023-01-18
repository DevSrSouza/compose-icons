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

public val LightGroup.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) {
            return _bracketsAngle!!
        }
        _bracketsAngle = Builder(name = "BracketsAngle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.1f, 43.2f)
                lineTo(31.1f, 128.0f)
                lineToRelative(54.0f, 84.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -1.9f, 8.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.2f, 0.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.1f, -2.8f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -6.4f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.2f, 6.4f)
                close()
                moveTo(237.1f, 124.8f)
                lineTo(181.1f, 36.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.2f, 6.4f)
                lineToRelative(54.0f, 84.8f)
                lineToRelative(-54.0f, 84.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.9f, 8.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.2f, 0.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.1f, -2.8f)
                lineToRelative(56.0f, -88.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 237.1f, 124.8f)
                close()
            }
        }
        .build()
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
