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

public val ThinGroup.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) {
            return _slidersHorizontal!!
        }
        _slidersHorizontal = Builder(name = "SlidersHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 88.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(84.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(220.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(191.7f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -47.4f, 0.0f)
                lineTo(40.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(144.3f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.4f, 0.0f)
                lineTo(216.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 172.0f)
                close()
                moveTo(184.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 172.0f)
                close()
                moveTo(80.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.7f, -4.0f)
                lineTo(216.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(127.7f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 84.0f)
                close()
                moveTo(88.0f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 84.0f)
                close()
            }
        }
        .build()
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
