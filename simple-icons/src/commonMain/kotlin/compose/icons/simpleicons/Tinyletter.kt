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

public val SimpleIcons.Tinyletter: ImageVector
    get() {
        if (_tinyletter != null) {
            return _tinyletter!!
        }
        _tinyletter = Builder(name = "Tinyletter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.069f, 18.202f)
                horizontalLineToRelative(-4.913f)
                verticalLineToRelative(3.207f)
                lineToRelative(-4.22f, -3.207f)
                lineTo(4.93f, 18.202f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, true, -0.643f, -0.642f)
                verticalLineToRelative(-1.69f)
                lineToRelative(3.987f, -3.028f)
                lineTo(12.0f, 15.672f)
                lineToRelative(3.725f, -2.83f)
                lineToRelative(3.987f, 3.03f)
                verticalLineToRelative(1.688f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, true, -0.643f, 0.642f)
                close()
                moveTo(7.213f, 12.035f)
                lineToRelative(-2.925f, 2.222f)
                lineTo(4.288f, 9.813f)
                close()
                moveTo(19.712f, 9.813f)
                verticalLineToRelative(4.444f)
                lineToRelative(-2.925f, -2.222f)
                close()
                moveTo(4.932f, 5.61f)
                horizontalLineToRelative(2.735f)
                lineTo(12.0f, 9.128f)
                lineToRelative(4.338f, -3.518f)
                horizontalLineToRelative(2.73f)
                curveToRelative(0.355f, 0.0f, 0.644f, 0.288f, 0.644f, 0.642f)
                verticalLineToRelative(1.946f)
                lineTo(12.0f, 14.058f)
                lineToRelative(-7.712f, -5.86f)
                lineTo(4.288f, 6.252f)
                curveToRelative(0.0f, -0.354f, 0.289f, -0.642f, 0.643f, -0.642f)
                close()
                moveTo(8.339f, 1.838f)
                curveToRelative(0.356f, -0.356f, 0.83f, -0.553f, 1.335f, -0.553f)
                curveToRelative(0.504f, 0.0f, 0.978f, 0.197f, 1.334f, 0.553f)
                lineTo(12.0f, 2.83f)
                lineToRelative(0.992f, -0.992f)
                curveToRelative(0.356f, -0.356f, 0.83f, -0.553f, 1.334f, -0.553f)
                curveToRelative(0.505f, 0.0f, 0.979f, 0.197f, 1.335f, 0.553f)
                curveToRelative(0.357f, 0.357f, 0.553f, 0.83f, 0.553f, 1.335f)
                curveToRelative(0.0f, 0.494f, -0.188f, 0.959f, -0.53f, 1.313f)
                lineTo(12.0f, 7.473f)
                lineTo(8.317f, 4.486f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 0.022f, -2.648f)
                close()
                moveTo(19.069f, 4.324f)
                horizontalLineToRelative(-1.787f)
                arcTo(3.167f, 3.167f, 0.0f, false, false, 16.57f, 0.93f)
                curveTo(15.97f, 0.33f, 15.174f, 0.0f, 14.326f, 0.0f)
                curveToRelative(-0.847f, 0.0f, -1.644f, 0.33f, -2.243f, 0.93f)
                lineTo(12.0f, 1.011f)
                lineTo(11.917f, 0.93f)
                curveTo(11.317f, 0.33f, 10.521f, 0.0f, 9.674f, 0.0f)
                curveTo(8.826f, 0.0f, 8.029f, 0.33f, 7.43f, 0.93f)
                arcToRelative(3.176f, 3.176f, 0.0f, false, false, -0.711f, 3.394f)
                lineTo(4.93f, 4.324f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.928f, 1.928f)
                lineTo(3.002f, 17.56f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 1.928f, 1.928f)
                horizontalLineToRelative(4.572f)
                lineTo(15.44f, 24.0f)
                verticalLineToRelative(-4.512f)
                horizontalLineToRelative(3.628f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 1.928f, -1.928f)
                lineTo(20.996f, 6.252f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.928f, -1.928f)
            }
        }
        .build()
        return _tinyletter!!
    }

private var _tinyletter: ImageVector? = null
