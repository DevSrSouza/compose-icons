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

public val Octicons.Ruby24: ImageVector
    get() {
        if (_ruby24 != null) {
            return _ruby24!!
        }
        _ruby24 = Builder(name = "Ruby24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.873f, 3.26f)
                arcTo(0.748f, 0.748f, 0.0f, false, true, 6.44f, 3.0f)
                horizontalLineToRelative(11.31f)
                curveToRelative(0.223f, 0.0f, 0.434f, 0.099f, 0.576f, 0.27f)
                lineToRelative(5.0f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.028f, 0.992f)
                lineToRelative(-10.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.096f, 0.0f)
                lineToRelative(-10.75f, -11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.02f, -1.003f)
                lineToRelative(5.19f, -6.0f)
                close()
                moveTo(6.783f, 4.5f)
                lineTo(2.258f, 9.73f)
                lineTo(12.0f, 20.153f)
                lineToRelative(9.75f, -10.43f)
                lineTo(17.399f, 4.5f)
                close()
            }
        }
        .build()
        return _ruby24!!
    }

private var _ruby24: ImageVector? = null
