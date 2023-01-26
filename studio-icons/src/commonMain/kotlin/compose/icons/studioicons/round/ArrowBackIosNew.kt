package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ArrowBackIosNew: ImageVector
    get() {
        if (_arrowBackIosNew != null) {
            return _arrowBackIosNew!!
        }
        _arrowBackIosNew = Builder(name = "ArrowBackIosNew", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.88f, 2.88f)
                lineTo(16.88f, 2.88f)
                curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f)
                lineToRelative(-8.41f, 8.41f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(8.41f, 8.41f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f)
                lineTo(9.54f, 12.0f)
                lineToRelative(7.35f, -7.35f)
                curveTo(17.37f, 4.16f, 17.37f, 3.37f, 16.88f, 2.88f)
                close()
            }
        }
        .build()
        return _arrowBackIosNew!!
    }

private var _arrowBackIosNew: ImageVector? = null
