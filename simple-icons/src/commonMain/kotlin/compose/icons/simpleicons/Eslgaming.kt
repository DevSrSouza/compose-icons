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

public val SimpleIcons.Eslgaming: ImageVector
    get() {
        if (_eslgaming != null) {
            return _eslgaming!!
        }
        _eslgaming = Builder(name = "Eslgaming", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.455f, 2.163f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, 5.789f, 2.222f)
                lineTo(4.384f, 18.244f)
                arcToRelative(9.862f, 9.862f, 0.0f, false, true, -1.06f, -1.582f)
                close()
                moveTo(19.646f, 5.795f)
                arcToRelative(9.802f, 9.802f, 0.0f, false, true, 2.192f, 5.806f)
                lineToRelative(-14.45f, 9.1f)
                arcToRelative(9.834f, 9.834f, 0.0f, false, true, -1.592f, -1.055f)
                close()
                moveTo(21.625f, 14.087f)
                curveToRelative(-0.888f, 4.45f, -5.619f, 8.892f, -11.9f, 7.494f)
                close()
            }
        }
        .build()
        return _eslgaming!!
    }

private var _eslgaming: ImageVector? = null
