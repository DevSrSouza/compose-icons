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

public val RemixIcons.RoadMapLine: ImageVector
    get() {
        if (_roadMapLine != null) {
            return _roadMapLine!!
        }
        _roadMapLine = Builder(name = "RoadMapLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.143f)
                verticalLineToRelative(12.824f)
                lineToRelative(5.065f, -2.17f)
                lineToRelative(6.0f, 3.0f)
                lineTo(20.0f, 17.68f)
                lineTo(20.0f, 4.857f)
                lineToRelative(1.303f, -0.558f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.697f, 0.46f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-7.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-6.303f, 2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.697f, -0.46f)
                lineTo(2.0f, 7.0f)
                lineToRelative(2.0f, -0.857f)
                close()
                moveTo(16.243f, 11.243f)
                lineTo(12.0f, 15.485f)
                lineToRelative(-4.243f, -4.242f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.486f, 0.0f)
                close()
                moveTo(12.0f, 12.657f)
                lineToRelative(2.828f, -2.829f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.656f, 0.0f)
                lineTo(12.0f, 12.657f)
                close()
            }
        }
        .build()
        return _roadMapLine!!
    }

private var _roadMapLine: ImageVector? = null
