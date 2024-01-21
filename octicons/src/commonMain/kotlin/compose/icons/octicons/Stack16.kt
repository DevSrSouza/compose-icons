package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Stack16: ImageVector
    get() {
        if (_stack16 != null) {
            return _stack16!!
        }
        _stack16 = Builder(name = "Stack16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.122f, 0.392f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.756f, 0.0f)
                lineToRelative(5.003f, 2.902f)
                curveToRelative(0.83f, 0.481f, 0.83f, 1.68f, 0.0f, 2.162f)
                lineTo(8.878f, 8.358f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.756f, 0.0f)
                lineTo(2.119f, 5.456f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 0.0f, -2.162f)
                close()
                moveTo(8.125f, 1.69f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.25f, 0.0f)
                lineToRelative(-4.63f, 2.685f)
                lineToRelative(4.63f, 2.685f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.25f, 0.0f)
                lineToRelative(4.63f, -2.685f)
                close()
                moveTo(1.601f, 7.789f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.025f, -0.273f)
                lineToRelative(5.249f, 3.044f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.25f, 0.0f)
                lineToRelative(5.249f, -3.044f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.752f, 1.298f)
                lineToRelative(-5.248f, 3.044f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.756f, 0.0f)
                lineTo(1.874f, 8.814f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.6f, 7.789f)
                close()
                moveTo(1.601f, 11.289f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.025f, -0.273f)
                lineToRelative(5.249f, 3.044f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.25f, 0.0f)
                lineToRelative(5.249f, -3.044f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.752f, 1.298f)
                lineToRelative(-5.248f, 3.044f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.756f, 0.0f)
                lineToRelative(-5.248f, -3.044f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.273f, -1.025f)
                close()
            }
        }
        .build()
        return _stack16!!
    }

private var _stack16: ImageVector? = null
