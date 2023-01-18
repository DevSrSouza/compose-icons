package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.5f, 228.3f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -13.2f, -9.5f)
                lineTo(31.7f, 49.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 35.1f, 35.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 14.4f, -3.3f)
                lineTo(218.8f, 90.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -0.4f, 26.6f)
                lineToRelative(-76.6f, 23.6f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.3f, 1.3f)
                lineToRelative(-23.6f, 76.6f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, -13.1f, 9.8f)
                close()
                moveTo(44.9f, 42.9f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -1.4f, 0.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.4f, 2.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(58.6f, 169.3f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.8f, 1.4f)
                curveToRelative(0.1f, 0.0f, 0.1f, 0.0f, 0.1f, -0.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.9f, -1.4f)
                lineTo(129.0f, 138.3f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, 9.3f, -9.3f)
                lineToRelative(76.5f, -23.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 1.5f, -1.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.4f, -1.9f)
                lineTo(45.6f, 43.1f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
