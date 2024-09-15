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

public val SimpleIcons.Kaios: ImageVector
    get() {
        if (_kaios != null) {
            return _kaios!!
        }
        _kaios = Builder(name = "Kaios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.342f, 0.0f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, -3.647f, 3.674f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, 3.674f, 3.673f)
                arcToRelative(3.674f, 3.674f, 0.0f, true, false, -0.026f, -7.347f)
                close()
                moveTo(4.623f, 0.16f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, false, -2.747f, 2.747f)
                verticalLineToRelative(18.167f)
                arcToRelative(2.747f, 2.747f, 0.0f, true, false, 5.494f, 0.0f)
                lineTo(7.37f, 2.907f)
                arcTo(2.749f, 2.749f, 0.0f, false, false, 4.623f, 0.16f)
                close()
                moveTo(11.573f, 7.368f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, -2.237f, 4.295f)
                lineToRelative(7.811f, 11.154f)
                arcToRelative(2.729f, 2.729f, 0.0f, true, false, 4.471f, -3.131f)
                lineTo(13.806f, 8.531f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, -2.234f, -1.163f)
                close()
            }
        }
        .build()
        return _kaios!!
    }

private var _kaios: ImageVector? = null
