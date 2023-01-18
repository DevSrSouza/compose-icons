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

public val LightGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.6f, 78.1f)
                lineTo(177.9f, 25.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(25.4f, 158.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(52.7f, 52.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(230.6f, 97.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                close()
                moveTo(222.1f, 89.4f)
                horizontalLineToRelative(0.0f)
                lineTo(89.4f, 222.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(33.9f, 169.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineTo(60.0f, 140.5f)
                lineToRelative(27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineTo(68.5f, 132.0f)
                lineTo(96.0f, 104.5f)
                lineToRelative(27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(104.5f, 96.0f)
                lineTo(132.0f, 68.5f)
                lineToRelative(27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(140.5f, 60.0f)
                lineToRelative(26.1f, -26.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(52.7f, 52.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
