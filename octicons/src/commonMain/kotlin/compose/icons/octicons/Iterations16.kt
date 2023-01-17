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

public val Octicons.Iterations16: ImageVector
    get() {
        if (_iterations16 != null) {
            return _iterations16!!
        }
        _iterations16 = Builder(name = "Iterations16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 9.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, -6.25f, 6.25f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.146f)
                curveToRelative(0.0f, 0.223f, 0.27f, 0.335f, 0.427f, 0.177f)
                lineToRelative(2.896f, -2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.354f)
                lineToRelative(-2.896f, -2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.427f, 0.177f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.25f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 2.5f, 7.25f)
                close()
            }
        }
        .build()
        return _iterations16!!
    }

private var _iterations16: ImageVector? = null
