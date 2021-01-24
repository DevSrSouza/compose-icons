package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 273.0f)
                lineToRelative(-136.0f, 136.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(96.4f, -96.4f)
                lineToRelative(-96.4f, -96.4f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(54.3f, 103.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(136.0f, 136.0f)
                curveToRelative(9.5f, 9.4f, 9.5f, 24.6f, 0.1f, 34.0f)
                close()
                moveTo(416.3f, 239.0f)
                lineToRelative(-136.0f, -136.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(96.4f, 96.4f)
                lineToRelative(-96.4f, 96.4f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(136.0f, -136.0f)
                curveToRelative(9.4f, -9.2f, 9.4f, -24.4f, 0.0f, -33.8f)
                close()
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
