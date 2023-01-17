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

public val Octicons.PersonAdd16: ImageVector
    get() {
        if (_personAdd16 != null) {
            return _personAdd16!!
        }
        _personAdd16 = Builder(name = "PersonAdd16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9f, 8.548f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(5.528f, 5.528f, 0.0f, false, true, 3.1f, 4.659f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.498f, 0.086f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 5.5f, 9.5f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -4.001f, 3.793f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.498f, -0.085f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, 3.1f, -4.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.799f, 0.0f)
                close()
                moveTo(13.25f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(5.5f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, 3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.5f, 4.0f)
                close()
            }
        }
        .build()
        return _personAdd16!!
    }

private var _personAdd16: ImageVector? = null
