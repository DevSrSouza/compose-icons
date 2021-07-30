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

public val SolidGroup.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 544.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 544.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 479.98f)
                lineTo(99.92f, 512.0f)
                lineToRelative(35.45f, -35.45f)
                lineToRelative(-67.04f, -67.04f)
                lineTo(0.0f, 479.98f)
                close()
                moveTo(124.61f, 239.97f)
                arcToRelative(36.592f, 36.592f, 0.0f, false, false, -10.79f, 38.1f)
                lineToRelative(13.05f, 42.83f)
                lineToRelative(-50.93f, 50.94f)
                lineToRelative(96.23f, 96.23f)
                lineToRelative(50.86f, -50.86f)
                lineToRelative(42.74f, 13.08f)
                curveToRelative(13.73f, 4.2f, 28.65f, -0.01f, 38.15f, -10.78f)
                lineToRelative(35.55f, -41.64f)
                lineToRelative(-173.34f, -173.34f)
                lineToRelative(-41.52f, 35.44f)
                close()
                moveTo(527.92f, 79.27f)
                lineToRelative(-63.2f, -63.2f)
                curveToRelative(-20.49f, -20.49f, -53.38f, -21.52f, -75.12f, -2.35f)
                lineTo(190.55f, 183.68f)
                lineToRelative(169.77f, 169.78f)
                lineTo(530.27f, 154.4f)
                curveToRelative(19.18f, -21.74f, 18.15f, -54.63f, -2.35f, -75.13f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
