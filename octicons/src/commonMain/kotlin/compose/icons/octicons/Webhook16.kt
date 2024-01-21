package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Webhook16: ImageVector
    get() {
        if (_webhook16 != null) {
            return _webhook16!!
        }
        _webhook16 = Builder(name = "Webhook16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 4.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, false, -6.14f, 2.889f)
                lineToRelative(-2.272f, 4.258f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.324f, 0.706f)
                lineTo(7.0f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.309f, -1.015f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 5.5f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.364f, 3.607f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, 0.257f)
                lineToRelative(2.608f, 4.349f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, -0.628f, 6.785f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.752f, -1.299f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, -0.033f, -3.88f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.03f, -0.256f)
                lineTo(7.107f, 4.636f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.257f, -1.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9f, 8.776f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.625f, 9.8f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 6.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.751f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(7.425f)
                arcToRelative(3.751f, 3.751f, 0.0f, true, true, -5.55f, -3.998f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.024f, 0.274f)
                close()
            }
        }
        .build()
        return _webhook16!!
    }

private var _webhook16: ImageVector? = null
