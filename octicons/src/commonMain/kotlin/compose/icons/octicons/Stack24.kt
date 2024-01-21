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

public val Octicons.Stack24: ImageVector
    get() {
        if (_stack24 != null) {
            return _stack24!!
        }
        _stack24 = Builder(name = "Stack24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.063f, 1.456f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, 1.874f, 0.0f)
                lineToRelative(8.383f, 5.316f)
                arcToRelative(1.751f, 1.751f, 0.0f, false, true, 0.0f, 2.956f)
                lineToRelative(-8.383f, 5.316f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, -1.874f, 0.0f)
                lineTo(2.68f, 9.728f)
                arcToRelative(1.751f, 1.751f, 0.0f, false, true, 0.0f, -2.956f)
                close()
                moveTo(12.134f, 2.723f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.268f, 0.0f)
                lineTo(3.483f, 8.039f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.422f)
                lineToRelative(8.383f, 5.316f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.268f, 0.0f)
                lineToRelative(8.383f, -5.316f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.867f, 12.324f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.035f, -0.232f)
                lineToRelative(8.964f, 5.685f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.268f, 0.0f)
                lineToRelative(8.964f, -5.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.804f, 1.267f)
                lineToRelative(-8.965f, 5.685f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, -1.874f, 0.0f)
                lineToRelative(-8.965f, -5.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.231f, -1.035f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.867f, 16.324f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.035f, -0.232f)
                lineToRelative(8.964f, 5.685f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.268f, 0.0f)
                lineToRelative(8.964f, -5.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.804f, 1.267f)
                lineToRelative(-8.965f, 5.685f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, -1.874f, 0.0f)
                lineToRelative(-8.965f, -5.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.231f, -1.035f)
                close()
            }
        }
        .build()
        return _stack24!!
    }

private var _stack24: ImageVector? = null
