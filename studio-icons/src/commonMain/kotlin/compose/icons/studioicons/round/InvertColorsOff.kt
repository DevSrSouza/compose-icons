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

public val RoundGroup.InvertColorsOff: ImageVector
    get() {
        if (_invertColorsOff != null) {
            return _invertColorsOff!!
        }
        _invertColorsOff = Builder(name = "InvertColorsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(-1.0f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f)
                curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveToRelative(1.75f, 0.0f, 3.36f, -0.56f, 4.67f, -1.5f)
                lineToRelative(2.4f, 2.4f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f)
                curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f)
                lineTo(12.0f, 14.83f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.38f, 5.56f)
                lineToRelative(2.91f, -2.87f)
                curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0.0f)
                lineToRelative(4.95f, 4.87f)
                lineToRelative(0.0f, 0.0f)
                curveTo(19.1f, 8.99f, 20.0f, 10.96f, 20.0f, 13.13f)
                curveToRelative(0.0f, 1.18f, -0.27f, 2.29f, -0.74f, 3.3f)
                lineTo(12.0f, 9.17f)
                verticalLineTo(4.81f)
                lineTo(9.8f, 6.97f)
                lineTo(8.38f, 5.56f)
                close()
            }
        }
        .build()
        return _invertColorsOff!!
    }

private var _invertColorsOff: ImageVector? = null
