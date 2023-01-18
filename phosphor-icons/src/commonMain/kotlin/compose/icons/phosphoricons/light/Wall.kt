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

public val LightGroup.Wall: ImageVector
    get() {
        if (_wall != null) {
            return _wall!!
        }
        _wall = Builder(name = "Wall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(86.0f, 146.0f)
                lineTo(86.0f, 110.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(38.0f, 146.0f)
                lineTo(38.0f, 110.0f)
                lineTo(74.0f, 110.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(182.0f, 110.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                lineTo(182.0f, 146.0f)
                close()
                moveTo(218.0f, 98.0f)
                lineTo(134.0f, 98.0f)
                lineTo(134.0f, 62.0f)
                horizontalLineToRelative(84.0f)
                close()
                moveTo(122.0f, 62.0f)
                lineTo(122.0f, 98.0f)
                lineTo(38.0f, 98.0f)
                lineTo(38.0f, 62.0f)
                close()
                moveTo(38.0f, 158.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(36.0f)
                lineTo(38.0f, 194.0f)
                close()
                moveTo(134.0f, 194.0f)
                lineTo(134.0f, 158.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _wall!!
    }

private var _wall: ImageVector? = null
