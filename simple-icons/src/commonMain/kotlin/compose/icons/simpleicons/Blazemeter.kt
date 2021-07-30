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

public val SimpleIcons.Blazemeter: ImageVector
    get() {
        if (_blazemeter != null) {
            return _blazemeter!!
        }
        _blazemeter = Builder(name = "Blazemeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.04f, 17.135f)
                curveToRelative(-0.256f, 0.0f, -0.352f, -0.128f, -0.32f, -0.352f)
                lineToRelative(1.696f, -9.566f)
                curveToRelative(0.032f, -0.224f, 0.16f, -0.352f, 0.416f, -0.352f)
                horizontalLineToRelative(3.584f)
                curveToRelative(2.4f, 0.0f, 3.584f, 0.736f, 3.584f, 2.24f)
                curveToRelative(0.0f, 0.607f, -0.16f, 1.151f, -0.48f, 1.6f)
                curveToRelative(-0.32f, 0.48f, -0.768f, 0.8f, -1.344f, 0.991f)
                curveToRelative(0.384f, 0.096f, 0.736f, 0.32f, 0.96f, 0.672f)
                curveToRelative(0.256f, 0.32f, 0.384f, 0.768f, 0.384f, 1.28f)
                curveToRelative(0.0f, 1.215f, -0.416f, 2.08f, -1.248f, 2.655f)
                curveToRelative(-0.832f, 0.544f, -1.952f, 0.832f, -3.328f, 0.832f)
                lineTo(15.04f, 17.135f)
                close()
                moveTo(19.008f, 15.471f)
                curveToRelative(1.664f, 0.0f, 2.496f, -0.608f, 2.496f, -1.823f)
                curveToRelative(0.0f, -0.384f, -0.16f, -0.64f, -0.448f, -0.832f)
                curveToRelative(-0.288f, -0.192f, -0.8f, -0.256f, -1.472f, -0.256f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(-0.512f, 2.88f)
                horizontalLineToRelative(2.016f)
                verticalLineToRelative(0.031f)
                close()
                moveTo(19.776f, 11.088f)
                curveToRelative(1.472f, 0.0f, 2.176f, -0.544f, 2.176f, -1.663f)
                curveToRelative(0.0f, -0.352f, -0.128f, -0.576f, -0.416f, -0.736f)
                curveToRelative(-0.288f, -0.16f, -0.736f, -0.224f, -1.344f, -0.224f)
                horizontalLineToRelative(-1.984f)
                lineToRelative(-0.48f, 2.623f)
                horizontalLineToRelative(2.048f)
                close()
                moveTo(12.896f, 10.832f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.608f, -0.608f)
                lineTo(0.608f, 10.224f)
                arcToRelative(0.608f, 0.608f, 0.0f, true, false, 0.0f, 1.216f)
                horizontalLineToRelative(11.648f)
                curveToRelative(0.352f, 0.0f, 0.64f, -0.256f, 0.64f, -0.608f)
                close()
                moveTo(14.24f, 8.657f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.608f, -0.608f)
                lineTo(6.464f, 8.049f)
                arcToRelative(0.608f, 0.608f, 0.0f, true, false, 0.0f, 1.216f)
                horizontalLineToRelative(7.168f)
                curveToRelative(0.32f, 0.0f, 0.608f, -0.256f, 0.608f, -0.608f)
                close()
                moveTo(11.776f, 15.311f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.608f, -0.608f)
                lineTo(8.256f, 14.703f)
                arcToRelative(0.608f, 0.608f, 0.0f, true, false, 0.0f, 1.216f)
                horizontalLineToRelative(2.912f)
                curveToRelative(0.32f, 0.0f, 0.608f, -0.256f, 0.608f, -0.608f)
                close()
                moveTo(10.912f, 13.04f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.608f, -0.608f)
                lineTo(3.2f, 12.432f)
                arcToRelative(0.608f, 0.608f, 0.0f, true, false, 0.0f, 1.216f)
                horizontalLineToRelative(7.104f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, 0.608f, -0.608f)
                close()
            }
        }
        .build()
        return _blazemeter!!
    }

private var _blazemeter: ImageVector? = null
