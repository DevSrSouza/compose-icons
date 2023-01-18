package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RoadMapFill: ImageVector
    get() {
        if (_roadMapFill != null) {
            return _roadMapFill!!
        }
        _roadMapFill = Builder(name = "RoadMapFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 11.95f)
                arcToRelative(6.996f, 6.996f, 0.0f, false, false, 1.858f, -6.582f)
                lineToRelative(2.495f, -1.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.697f, 0.46f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-7.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-6.303f, 2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.697f, -0.46f)
                lineTo(2.0f, 7.0f)
                lineToRelative(3.129f, -1.341f)
                arcToRelative(6.993f, 6.993f, 0.0f, false, false, 1.921f, 6.29f)
                lineTo(12.0f, 16.9f)
                lineToRelative(4.95f, -4.95f)
                close()
                moveTo(15.536f, 10.536f)
                lineTo(12.0f, 14.07f)
                lineToRelative(-3.536f, -3.535f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.072f, 0.0f)
                close()
            }
        }
        .build()
        return _roadMapFill!!
    }

private var _roadMapFill: ImageVector? = null
