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

public val RoundGroup.Landscape: ImageVector
    get() {
        if (_landscape != null) {
            return _landscape!!
        }
        _landscape = Builder(name = "Landscape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 7.07f)
                lineTo(10.25f, 11.0f)
                lineToRelative(2.25f, 3.0f)
                curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f)
                curveToRelative(-0.44f, 0.33f, -1.07f, 0.25f, -1.4f, -0.2f)
                curveToRelative(-1.05f, -1.4f, -2.31f, -3.07f, -3.1f, -4.14f)
                curveToRelative(-0.4f, -0.53f, -1.2f, -0.53f, -1.6f, 0.0f)
                lineToRelative(-4.0f, 5.33f)
                curveToRelative(-0.49f, 0.67f, -0.02f, 1.61f, 0.8f, 1.61f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f)
                lineToRelative(-7.0f, -9.33f)
                curveToRelative(-0.4f, -0.54f, -1.2f, -0.54f, -1.6f, 0.0f)
                close()
            }
        }
        .build()
        return _landscape!!
    }

private var _landscape: ImageVector? = null
