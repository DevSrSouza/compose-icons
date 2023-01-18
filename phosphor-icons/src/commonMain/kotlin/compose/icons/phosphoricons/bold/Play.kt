package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 236.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, -9.8f, -2.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 60.0f, 216.0f)
                verticalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 90.4f, 22.9f)
                lineToRelative(144.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 34.2f)
                lineToRelative(-144.0f, 88.0f)
                arcTo(20.4f, 20.4f, 0.0f, false, true, 80.0f, 236.0f)
                close()
                moveTo(84.0f, 47.1f)
                verticalLineTo(208.9f)
                lineTo(216.3f, 128.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
