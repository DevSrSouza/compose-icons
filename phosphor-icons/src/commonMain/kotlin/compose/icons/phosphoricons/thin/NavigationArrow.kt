package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.5f, 226.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -11.3f, -8.1f)
                lineTo(33.6f, 48.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 48.9f, 33.6f)
                lineTo(218.2f, 92.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.4f, 22.8f)
                lineToRelative(-76.6f, 23.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.6f, 2.6f)
                lineTo(115.0f, 217.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -11.2f, 8.4f)
                close()
                moveTo(44.9f, 40.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.9f, 4.2f)
                horizontalLineToRelative(0.0f)
                lineTo(99.8f, 215.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.8f, 2.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.8f, -2.8f)
                lineToRelative(23.5f, -76.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 8.0f, -8.0f)
                lineToRelative(76.5f, -23.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.9f, -3.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.7f, -3.8f)
                lineTo(46.3f, 41.2f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 44.9f, 40.9f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
