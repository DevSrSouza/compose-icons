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

public val Octicons.Mention16: ImageVector
    get() {
        if (_mention16 != null) {
            return _mention16!!
        }
        _mention16 = Builder(name = "Mention16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 2.37f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, false, 6.5f, 11.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.298f)
                arcTo(7.999f, 7.999f, 0.0f, false, true, 0.989f, 4.148f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 7.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.072f, 1.475f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, -6.65f, -4.19f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                verticalLineTo(7.867f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.75f, -5.496f)
                close()
                moveTo(10.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mention16!!
    }

private var _mention16: ImageVector? = null
