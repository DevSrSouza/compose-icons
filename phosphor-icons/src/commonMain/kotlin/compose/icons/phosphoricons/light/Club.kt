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

public val LightGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 238.0f)
                lineTo(96.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -2.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -0.9f, -5.4f)
                lineTo(101.0f, 195.9f)
                arcTo(54.0f, 54.0f, 0.0f, true, true, 76.0f, 94.0f)
                horizontalLineToRelative(1.1f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 101.8f, 0.0f)
                lineTo(180.0f, 94.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, -25.0f, 101.9f)
                lineToRelative(10.7f, 34.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -0.9f, 5.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 160.0f, 238.0f)
                close()
                moveTo(104.2f, 226.0f)
                horizontalLineToRelative(47.6f)
                lineToRelative(-14.0f, -45.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 10.2f, -5.6f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 180.0f, 106.0f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, false, -9.6f, 1.1f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.4f, -0.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -3.2f, -6.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 1.0f, -2.7f)
                arcTo(41.0f, 41.0f, 0.0f, false, false, 170.0f, 76.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -84.0f, 0.0f)
                arcToRelative(42.5f, 42.5f, 0.0f, false, false, 6.2f, 22.0f)
                curveToRelative(0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.2f, 9.0f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -2.4f, -0.1f)
                arcTo(45.1f, 45.1f, 0.0f, false, false, 76.0f, 106.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 32.0f, 69.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 10.2f, 5.6f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
