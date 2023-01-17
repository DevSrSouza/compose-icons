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

public val Octicons.People16: ImageVector
    get() {
        if (_people16 != null) {
            return _people16!!
        }
        _people16 = Builder(name = "People16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 5.898f, 2.549f)
                arcToRelative(5.508f, 5.508f, 0.0f, false, true, 3.034f, 4.084f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.482f, 0.235f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.9f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.482f, -0.236f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 3.102f, 8.05f)
                arcTo(3.493f, 3.493f, 0.0f, false, true, 2.0f, 5.5f)
                close()
                moveTo(11.0f, 4.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, 2.22f, 5.018f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 2.56f, 3.012f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.885f, 0.954f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.549f, -0.514f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, -2.522f, -2.372f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.574f, -0.73f)
                verticalLineToRelative(-0.352f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.416f, -0.672f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.0f, 4.0f)
                close()
                moveTo(5.5f, 3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, 3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.5f, 3.5f)
                close()
            }
        }
        .build()
        return _people16!!
    }

private var _people16: ImageVector? = null
