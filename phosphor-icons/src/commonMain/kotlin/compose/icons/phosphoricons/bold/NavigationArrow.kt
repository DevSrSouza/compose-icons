package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.5f, 234.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -18.8f, -13.5f)
                lineTo(26.1f, 51.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, 4.7f, -20.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 51.5f, 26.0f)
                lineTo(220.8f, 84.7f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 13.5f, 19.2f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -14.2f, 18.8f)
                lineToRelative(-74.5f, 22.9f)
                lineToRelative(-22.9f, 74.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -18.8f, 14.1f)
                close()
                moveTo(107.3f, 212.9f)
                close()
                moveTo(51.4f, 51.4f)
                lineToRelative(51.9f, 150.0f)
                lineToRelative(20.0f, -64.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 13.2f, -13.2f)
                lineToRelative(64.9f, -20.0f)
                close()
                moveTo(48.7f, 43.6f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
