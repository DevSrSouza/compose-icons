package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TextRotationAngleup: ImageVector
    get() {
        if (_textRotationAngleup != null) {
            return _textRotationAngleup!!
        }
        _textRotationAngleup = Builder(name = "TextRotationAngleup", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.61f, 9.85f)
                lineToRelative(0.56f, 0.56f)
                lineToRelative(-8.48f, 8.49f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(8.49f, -8.49f)
                lineToRelative(0.56f, 0.56f)
                curveToRelative(0.31f, 0.32f, 0.85f, 0.1f, 0.85f, -0.34f)
                lineTo(21.0f, 9.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.54f)
                curveToRelative(-0.44f, 0.0f, -0.66f, 0.54f, -0.35f, 0.85f)
                close()
                moveTo(8.48f, 12.75f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(1.6f, 0.67f)
                curveToRelative(0.36f, 0.15f, 0.77f, 0.07f, 1.05f, -0.21f)
                curveToRelative(0.49f, -0.49f, 0.32f, -1.31f, -0.32f, -1.57f)
                lineTo(5.26f, 4.5f)
                curveToRelative(-0.43f, -0.16f, -0.91f, -0.06f, -1.23f, 0.26f)
                curveToRelative(-0.32f, 0.32f, -0.42f, 0.8f, -0.25f, 1.23f)
                lineToRelative(3.61f, 9.09f)
                curveToRelative(0.25f, 0.64f, 1.08f, 0.81f, 1.57f, 0.32f)
                curveToRelative(0.28f, -0.28f, 0.36f, -0.69f, 0.21f, -1.05f)
                lineToRelative(-0.69f, -1.6f)
                close()
                moveTo(7.66f, 11.03f)
                lineTo(5.43f, 6.16f)
                lineToRelative(4.87f, 2.23f)
                lineToRelative(-2.64f, 2.64f)
                close()
            }
        }
        .build()
        return _textRotationAngleup!!
    }

private var _textRotationAngleup: ImageVector? = null
