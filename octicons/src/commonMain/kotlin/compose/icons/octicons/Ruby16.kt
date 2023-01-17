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

public val Octicons.Ruby16: ImageVector
    get() {
        if (_ruby16 != null) {
            return _ruby16!!
        }
        _ruby16 = Builder(name = "Ruby16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.637f, 2.291f)
                arcTo(0.748f, 0.748f, 0.0f, false, true, 4.23f, 2.0f)
                horizontalLineToRelative(7.54f)
                curveToRelative(0.232f, 0.0f, 0.451f, 0.107f, 0.593f, 0.291f)
                lineToRelative(3.48f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.072f, 0.999f)
                lineToRelative(-7.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.042f, 0.0f)
                lineToRelative(-7.25f, -7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.072f, -0.999f)
                close()
                moveTo(4.598f, 3.5f)
                lineTo(1.754f, 7.177f)
                lineTo(8.0f, 13.207f)
                lineToRelative(6.246f, -6.03f)
                lineTo(11.402f, 3.5f)
                close()
            }
        }
        .build()
        return _ruby16!!
    }

private var _ruby16: ImageVector? = null
