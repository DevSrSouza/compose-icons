package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Goal16: ImageVector
    get() {
        if (_goal16 != null) {
            return _goal16!!
        }
        _goal16 = Builder(name = "Goal16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.637f, 2.363f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(1.676f, 0.335f)
                curveToRelative(0.09f, 0.018f, 0.164f, 0.084f, 0.19f, 0.173f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.062f, 0.249f)
                lineToRelative(-1.373f, 1.374f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, true, -0.619f, 0.256f)
                horizontalLineTo(12.31f)
                lineTo(9.45f, 7.611f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 8.0f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 1.889f, -1.449f)
                lineToRelative(2.861f, -2.862f)
                verticalLineTo(2.552f)
                curveToRelative(0.0f, -0.232f, 0.092f, -0.455f, 0.256f, -0.619f)
                lineTo(12.88f, 0.559f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.249f, -0.062f)
                curveToRelative(0.089f, 0.026f, 0.155f, 0.1f, 0.173f, 0.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.769f, -1.656f)
                arcToRelative(0.751f, 0.751f, 0.0f, true, true, 1.442f, -0.413f)
                arcToRelative(7.502f, 7.502f, 0.0f, false, true, -12.513f, 7.371f)
                arcTo(7.501f, 7.501f, 0.0f, false, true, 10.069f, 0.789f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.413f, 1.442f)
                arcTo(6.001f, 6.001f, 0.0f, false, false, 2.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, false, 4.699f, 2.476f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.28f, -2.827f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 1.045f, -0.782f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.445f, 0.61f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 8.516f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.17f, 1.49f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _goal16!!
    }

private var _goal16: ImageVector? = null
