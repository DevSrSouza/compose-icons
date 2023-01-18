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

public val LightGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.9f, 83.1f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.8f, 89.8f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.8f, -89.8f)
                close()
                moveTo(30.0f, 96.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 160.5f, 82.0f)
                lineTo(160.0f, 82.0f)
                arcToRelative(77.2f, 77.2f, 0.0f, false, false, -40.4f, 11.3f)
                lineToRelative(-0.6f, 0.4f)
                arcTo(78.4f, 78.4f, 0.0f, false, false, 93.7f, 119.0f)
                lineToRelative(-0.4f, 0.6f)
                arcTo(77.2f, 77.2f, 0.0f, false, false, 82.0f, 160.0f)
                verticalLineToRelative(0.5f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 30.0f, 96.0f)
                close()
                moveTo(134.2f, 149.7f)
                lineTo(106.3f, 121.8f)
                arcToRelative(63.4f, 63.4f, 0.0f, false, true, 15.5f, -15.5f)
                lineToRelative(27.9f, 27.9f)
                arcTo(63.4f, 63.4f, 0.0f, false, true, 134.2f, 149.7f)
                close()
                moveTo(94.0f, 160.0f)
                arcToRelative(66.6f, 66.6f, 0.0f, false, true, 6.0f, -27.5f)
                lineTo(123.5f, 156.0f)
                arcTo(66.6f, 66.6f, 0.0f, false, true, 96.0f, 162.0f)
                lineTo(94.1f, 162.0f)
                arcTo(13.4f, 13.4f, 0.0f, false, true, 94.0f, 160.0f)
                close()
                moveTo(162.0f, 96.0f)
                arcToRelative(66.6f, 66.6f, 0.0f, false, true, -6.0f, 27.5f)
                lineTo(132.5f, 100.0f)
                arcTo(66.6f, 66.6f, 0.0f, false, true, 160.0f, 94.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(160.0f, 226.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, true, -64.5f, -52.0f)
                lineTo(96.0f, 174.0f)
                arcToRelative(77.2f, 77.2f, 0.0f, false, false, 40.4f, -11.3f)
                lineToRelative(0.6f, -0.4f)
                arcTo(78.4f, 78.4f, 0.0f, false, false, 162.3f, 137.0f)
                lineToRelative(0.4f, -0.6f)
                arcTo(77.2f, 77.2f, 0.0f, false, false, 174.0f, 96.0f)
                verticalLineToRelative(-0.5f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 160.0f, 226.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
