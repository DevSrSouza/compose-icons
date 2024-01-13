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

public val Octicons.Dot24: ImageVector
    get() {
        if (_dot24 != null) {
            return _dot24!!
        }
        _dot24 = Builder(name = "Dot24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, 9.0f)
                close()
            }
        }
        .build()
        return _dot24!!
    }

private var _dot24: ImageVector? = null
