package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -7.7f, 13.7f)
                lineToRelative(-144.0f, 87.9f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -16.1f, 0.3f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 64.0f, 216.0f)
                verticalLineTo(40.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 8.2f, -13.9f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, 16.1f, 0.3f)
                lineToRelative(144.0f, 87.9f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
