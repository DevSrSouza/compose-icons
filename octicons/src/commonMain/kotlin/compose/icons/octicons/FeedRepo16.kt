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

public val Octicons.FeedRepo16: ImageVector
    get() {
        if (_feedRepo16 != null) {
            return _feedRepo16!!
        }
        _feedRepo16 = Builder(name = "FeedRepo16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(5.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 5.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, 0.5f, 1.5f, 1.0f, 1.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(6.0f, 11.25f)
                verticalLineToRelative(2.514f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.426f, 0.178f)
                lineToRelative(0.898f, -0.888f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.352f, 0.0f)
                lineToRelative(0.898f, 0.888f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 9.0f, 13.764f)
                lineTo(9.0f, 11.0f)
                lineTo(6.25f, 11.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _feedRepo16!!
    }

private var _feedRepo16: ImageVector? = null
