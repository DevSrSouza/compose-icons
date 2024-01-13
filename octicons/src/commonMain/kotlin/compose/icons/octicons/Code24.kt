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

public val Octicons.Code24: ImageVector
    get() {
        if (_code24 != null) {
            return _code24!!
        }
        _code24 = Builder(name = "Code24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.22f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(6.5f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineTo(21.19f, 12.0f)
                lineToRelative(-5.97f, -5.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(8.78f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(2.81f, 12.0f)
                lineToRelative(5.97f, 5.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-6.5f, -6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _code24!!
    }

private var _code24: ImageVector? = null
