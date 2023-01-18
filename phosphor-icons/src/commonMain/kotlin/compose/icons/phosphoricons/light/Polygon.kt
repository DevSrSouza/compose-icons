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

public val LightGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.2f, 50.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(29.8f, 29.8f, 0.0f, false, false, -5.6f, 7.7f)
                lineToRelative(-31.3f, -8.6f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, -8.7f, -23.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -4.7f, 36.4f)
                lineTo(57.8f, 95.9f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -39.0f, 2.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcTo(29.6f, 29.6f, 0.0f, false, false, 40.0f, 150.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 20.2f, -7.8f)
                lineToRelative(72.5f, 53.3f)
                arcToRelative(30.2f, 30.2f, 0.0f, false, false, 6.1f, 33.7f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 42.4f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.4f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, false, -5.8f, -4.5f)
                lineToRelative(28.5f, -80.6f)
                arcToRelative(27.3f, 27.3f, 0.0f, false, false, 4.1f, 0.3f)
                arcToRelative(29.6f, 29.6f, 0.0f, false, false, 21.2f, -8.8f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 229.2f, 50.8f)
                close()
                moveTo(107.3f, 35.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, 25.4f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 107.3f, 35.3f)
                close()
                moveTo(27.3f, 132.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, 25.4f)
                close()
                moveTo(172.7f, 220.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 25.4f)
                close()
                moveTo(164.1f, 178.3f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, -24.3f, 7.5f)
                lineTo(67.3f, 132.5f)
                arcToRelative(30.5f, 30.5f, 0.0f, false, false, -1.4f, -27.7f)
                lineToRelative(36.3f, -32.7f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 44.6f, -10.6f)
                lineToRelative(31.3f, 8.6f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, 8.7f, 23.1f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, false, 5.8f, 4.5f)
                close()
                moveTo(220.7f, 84.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 25.4f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
