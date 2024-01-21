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

public val Octicons.Link16: ImageVector
    get() {
        if (_link16 != null) {
            return _link16!!
        }
        _link16 = Builder(name = "Link16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.775f, 3.275f)
                lineToRelative(1.25f, -1.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.95f, 4.95f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, 0.0f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, 2.83f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, false, -2.83f, -2.83f)
                lineToRelative(-1.25f, 1.25f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, -0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, -1.042f)
                close()
                moveTo(3.085f, 12.915f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, 2.83f, 0.0f)
                lineToRelative(1.25f, -1.25f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                lineToRelative(-1.25f, 1.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -4.95f, -4.95f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.95f, 0.0f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, -2.83f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _link16!!
    }

private var _link16: ImageVector? = null
