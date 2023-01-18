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

public val LightGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(38.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(192.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 216.0f)
                close()
                moveTo(229.0f, 107.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 0.5f, -1.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.3f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -2.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.3f, -1.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, -0.5f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.8f, -0.9f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(209.5f, 98.0f)
                lineTo(168.0f, 98.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -98.8f, 76.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 7.3f)
                lineToRelative(1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, -4.5f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 168.0f, 110.0f)
                horizontalLineToRelative(41.5f)
                lineToRelative(-37.7f, 37.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(48.0f, -48.0f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 229.0f, 107.3f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
