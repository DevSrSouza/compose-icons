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

public val BoldGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.2f, 52.6f)
                lineToRelative(-0.8f, -1.0f)
                lineToRelative(-1.0f, -0.8f)
                arcToRelative(108.2f, 108.2f, 0.0f, true, false, 1.8f, 1.8f)
                close()
                moveTo(170.3f, 116.0f)
                arcToRelative(38.9f, 38.9f, 0.0f, false, false, -3.9f, -9.4f)
                lineToRelative(28.8f, -28.9f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 211.1f, 116.0f)
                close()
                moveTo(148.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 148.0f, 128.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, -168.0f)
                arcToRelative(83.1f, 83.1f, 0.0f, false, true, 50.3f, 16.8f)
                lineTo(149.4f, 89.6f)
                arcTo(42.9f, 42.9f, 0.0f, false, false, 128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 42.3f, 56.0f)
                horizontalLineToRelative(40.8f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
