package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) {
            return _bracketsAngle!!
        }
        _bracketsAngle = Builder(name = "BracketsAngle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.4f, 42.1f)
                lineTo(28.7f, 128.0f)
                lineToRelative(54.7f, 85.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 220.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.4f, -1.9f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.2f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.8f, 4.2f)
                close()
                moveTo(235.4f, 125.9f)
                lineTo(179.4f, 37.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.8f, 4.2f)
                lineTo(227.3f, 128.0f)
                lineToRelative(-54.7f, 85.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 220.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.4f, -1.9f)
                lineToRelative(56.0f, -88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.4f, 125.9f)
                close()
            }
        }
        .build()
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
