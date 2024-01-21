package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mermaid: ImageVector
    get() {
        if (_mermaid != null) {
            return _mermaid!!
        }
        _mermaid = Builder(name = "Mermaid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 2.115f)
                arcTo(12.223f, 12.223f, 0.0f, false, false, 12.0f, 10.149f)
                arcTo(12.223f, 12.223f, 0.0f, false, false, 0.01f, 2.115f)
                arcToRelative(12.23f, 12.23f, 0.0f, false, false, 5.32f, 10.604f)
                arcToRelative(6.562f, 6.562f, 0.0f, false, true, 2.845f, 5.423f)
                verticalLineToRelative(3.754f)
                horizontalLineToRelative(7.65f)
                verticalLineToRelative(-3.754f)
                arcToRelative(6.561f, 6.561f, 0.0f, false, true, 2.844f, -5.423f)
                arcToRelative(12.223f, 12.223f, 0.0f, false, false, 5.32f, -10.604f)
                close()
            }
        }
        .build()
        return _mermaid!!
    }

private var _mermaid: ImageVector? = null
