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

public val ThinGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 144.0f)
                lineTo(124.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(233.3f, 210.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 216.0f, 220.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -17.3f, -30.0f)
                lineToRelative(88.0f, -152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.6f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 233.3f, 210.0f)
                close()
                moveTo(226.4f, 194.0f)
                lineTo(138.4f, 42.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.8f, 0.0f)
                lineToRelative(-88.0f, 152.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 40.0f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.4f, -6.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 226.4f, 194.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
