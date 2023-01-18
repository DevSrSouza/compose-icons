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

public val ThinGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 244.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -1.8f, -0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, -4.3f)
                lineToRelative(15.3f, -76.7f)
                lineTo(46.6f, 139.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.5f, -2.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 1.0f, -3.7f)
                lineToRelative(112.0f, -120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.8f, 3.6f)
                lineTo(148.6f, 93.4f)
                lineToRelative(60.8f, 22.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.5f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 3.6f)
                lineToRelative(-112.0f, 120.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 96.0f, 244.0f)
                close()
                moveTo(55.0f, 134.3f)
                lineToRelative(58.4f, 21.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.5f, 4.6f)
                lineTo(102.7f, 227.0f)
                lineTo(201.0f, 121.6f)
                lineTo(142.6f, 99.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.5f, -4.5f)
                lineTo(153.3f, 29.0f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
