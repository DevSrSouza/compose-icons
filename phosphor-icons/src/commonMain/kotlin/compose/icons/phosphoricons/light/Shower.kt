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

public val LightGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.0f, 228.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 70.0f, 228.0f)
                close()
                moveTo(88.0f, 190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 88.0f, 190.0f)
                close()
                moveTo(28.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 28.0f, 186.0f)
                close()
                moveTo(66.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 66.0f, 168.0f)
                close()
                moveTo(254.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(219.3f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.4f, 0.6f)
                lineTo(189.6f, 74.9f)
                lineTo(168.5f, 201.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -9.6f, 11.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -4.3f, 0.7f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -9.8f, -4.2f)
                lineToRelative(-98.1f, -98.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -3.4f, -14.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 11.0f, -9.6f)
                lineTo(181.1f, 66.4f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 9.9f, -4.1f)
                lineTo(248.0f, 34.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 40.0f)
                close()
                moveTo(176.7f, 79.3f)
                lineTo(56.3f, 99.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.6f, 1.3f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.5f, 2.1f)
                lineToRelative(98.1f, 98.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.3f, -1.6f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
