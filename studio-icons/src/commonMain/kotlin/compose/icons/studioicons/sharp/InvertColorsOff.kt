package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.InvertColorsOff: ImageVector
    get() {
        if (_invertColorsOff != null) {
            return _invertColorsOff!!
        }
        _invertColorsOff = Builder(name = "InvertColorsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(4.2f, 4.2f)
                curveToRelative(-1.0f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f)
                curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveToRelative(1.75f, 0.0f, 3.36f, -0.56f, 4.67f, -1.5f)
                lineToRelative(3.1f, 3.1f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f)
                curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f)
                lineTo(12.0f, 14.83f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.38f, 5.56f)
                lineTo(12.0f, 2.0f)
                lineToRelative(5.65f, 5.56f)
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
