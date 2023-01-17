package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Westerndigital: ImageVector
    get() {
        if (_westerndigital != null) {
            return _westerndigital!!
        }
        _westerndigital = Builder(name = "Westerndigital", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.494f, 4.957f)
                arcTo(1.478f, 1.478f, 0.0f, false, false, 0.0f, 6.455f)
                verticalLineToRelative(11.09f)
                arcToRelative(1.478f, 1.478f, 0.0f, false, false, 0.432f, 1.062f)
                arcToRelative(1.477f, 1.477f, 0.0f, false, false, 1.062f, 0.436f)
                horizontalLineToRelative(21.012f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, 1.384f, -0.924f)
                curveToRelative(0.075f, -0.182f, 0.112f, -0.377f, 0.11f, -0.574f)
                lineTo(24.0f, 6.455f)
                arcToRelative(1.477f, 1.477f, 0.0f, false, false, -0.432f, -1.062f)
                arcToRelative(1.478f, 1.478f, 0.0f, false, false, -1.063f, -0.436f)
                lineTo(1.496f, 4.957f)
                close()
                moveTo(3.951f, 8.244f)
                lineTo(6.09f, 8.244f)
                lineToRelative(-0.238f, 1.408f)
                lineTo(3.768f, 9.652f)
                lineToRelative(0.183f, -1.408f)
                close()
                moveTo(7.947f, 8.244f)
                lineTo(9.7f, 8.244f)
                lineToRelative(0.156f, 1.408f)
                lineTo(7.072f, 9.652f)
                lineToRelative(0.875f, -1.408f)
                close()
                moveTo(11.754f, 8.244f)
                horizontalLineToRelative(1.877f)
                lineToRelative(-0.469f, 1.408f)
                horizontalLineToRelative(-1.851f)
                lineToRelative(0.443f, -1.408f)
                close()
                moveTo(14.449f, 8.244f)
                horizontalLineToRelative(4.06f)
                curveToRelative(2.062f, 0.0f, 3.228f, 1.643f, 2.481f, 3.74f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, true, -1.924f, 2.641f)
                arcToRelative(5.628f, 5.628f, 0.0f, false, true, -3.064f, 1.13f)
                lineTo(11.94f, 15.755f)
                lineToRelative(1.7f, -5.171f)
                lineToRelative(2.75f, 0.092f)
                lineToRelative(-1.015f, 3.011f)
                curveToRelative(0.277f, 0.031f, 0.559f, 0.031f, 0.836f, 0.0f)
                arcToRelative(2.865f, 2.865f, 0.0f, false, false, 2.539f, -1.917f)
                curveToRelative(0.358f, -1.034f, -0.15f, -1.886f, -1.166f, -1.916f)
                lineTo(13.91f, 9.854f)
                lineToRelative(0.54f, -1.61f)
                close()
                moveTo(3.842f, 10.121f)
                lineToRelative(2.056f, 0.063f)
                lineToRelative(-0.357f, 2.677f)
                lineToRelative(1.31f, -2.615f)
                lineToRelative(2.98f, 0.094f)
                lineToRelative(0.269f, 2.707f)
                lineToRelative(0.834f, -2.676f)
                lineToRelative(2.054f, 0.094f)
                lineToRelative(-1.758f, 5.29f)
                lineTo(8.697f, 15.755f)
                lineToRelative(-0.445f, -4.575f)
                lineToRelative(-2.176f, 4.576f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(0.596f, -5.635f)
                close()
            }
        }
        .build()
        return _westerndigital!!
    }

private var _westerndigital: ImageVector? = null
