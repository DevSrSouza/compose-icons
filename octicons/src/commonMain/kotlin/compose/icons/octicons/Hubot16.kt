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

public val Octicons.Hubot16: ImageVector
    get() {
        if (_hubot16 != null) {
            return _hubot16!!
        }
        _hubot16 = Builder(name = "Hubot16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(14.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, -13.0f, 0.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 5.784f, 3.784f, 5.0f, 4.75f, 5.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(1.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 11.25f, 10.0f)
                horizontalLineToRelative(-6.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 8.25f)
                close()
                moveTo(4.47f, 6.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineTo(8.0f, 7.81f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.734f, 0.215f)
                lineToRelative(-0.97f, 0.97f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-0.97f, 0.97f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
                moveTo(5.5f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _hubot16!!
    }

private var _hubot16: ImageVector? = null
