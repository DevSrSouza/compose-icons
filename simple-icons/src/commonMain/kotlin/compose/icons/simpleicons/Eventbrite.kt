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

public val SimpleIcons.Eventbrite: ImageVector
    get() {
        if (_eventbrite != null) {
            return _eventbrite!!
        }
        _eventbrite = Builder(name = "Eventbrite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.542f, 5.81f)
                curveToRelative(2.653f, -0.6f, 5.3f, 0.487f, 6.775f, 2.54f)
                lineTo(5.591f, 11.0f)
                curveToRelative(0.405f, -2.479f, 2.298f, -4.591f, 4.951f, -5.19f)
                close()
                moveTo(17.382f, 15.556f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -3.919f, 2.634f)
                curveToRelative(-2.67f, 0.604f, -5.335f, -0.501f, -6.804f, -2.582f)
                lineToRelative(11.763f, -2.657f)
                lineToRelative(1.915f, -0.433f)
                lineTo(24.0f, 11.691f)
                arcToRelative(11.57f, 11.57f, 0.0f, false, false, -0.305f, -2.333f)
                curveTo(22.205f, 3.04f, 15.76f, -0.9f, 9.303f, 0.558f)
                curveTo(2.846f, 2.017f, -1.18f, 8.322f, 0.31f, 14.642f)
                curveToRelative(1.491f, 6.319f, 7.935f, 10.259f, 14.392f, 8.8f)
                curveToRelative(3.805f, -0.86f, 6.765f, -3.402f, 8.25f, -6.638f)
                close()
            }
        }
        .build()
        return _eventbrite!!
    }

private var _eventbrite: ImageVector? = null
