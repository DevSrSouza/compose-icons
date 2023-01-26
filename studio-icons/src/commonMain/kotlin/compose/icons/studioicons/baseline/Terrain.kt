package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Terrain: ImageVector
    get() {
        if (_terrain != null) {
            return _terrain!!
        }
        _terrain = Builder(name = "Terrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineToRelative(-3.75f, 5.0f)
                lineToRelative(2.85f, 3.8f)
                lineToRelative(-1.6f, 1.2f)
                curveTo(9.81f, 13.75f, 7.0f, 10.0f, 7.0f, 10.0f)
                lineToRelative(-6.0f, 8.0f)
                horizontalLineToRelative(22.0f)
                lineTo(14.0f, 6.0f)
                close()
            }
        }
        .build()
        return _terrain!!
    }

private var _terrain: ImageVector? = null
