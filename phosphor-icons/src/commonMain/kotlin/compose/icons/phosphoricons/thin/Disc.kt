package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 57.7f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcToRelative(100.2f, 100.2f, 0.0f, true, false, 0.7f, 0.7f)
                close()
                moveTo(163.8f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -7.7f, -18.5f)
                lineToRelative(39.7f, -39.6f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 219.9f, 124.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 190.1f, 60.2f)
                lineTo(150.5f, 99.9f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 163.8f, 132.0f)
                horizontalLineToRelative(56.1f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
