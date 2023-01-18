package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 230.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 87.3f, 28.1f)
                lineToRelative(144.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 0.0f, 23.8f)
                lineToRelative(-144.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 80.0f, 230.0f)
                close()
                moveTo(80.0f, 38.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.0f, 0.3f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 78.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.0f, 1.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(144.0f, -88.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.0f, -3.4f)
                lineTo(81.0f, 38.3f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 80.0f, 38.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
