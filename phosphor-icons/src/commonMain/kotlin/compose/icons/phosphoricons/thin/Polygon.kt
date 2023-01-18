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

public val ThinGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.8f, 52.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -5.9f, 8.7f)
                lineToRelative(-34.5f, -9.5f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -47.6f, -23.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -3.5f, 35.4f)
                lineTo(57.9f, 98.5f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -37.7f, 1.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(75.3f, 55.2f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, 4.9f, 33.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, -39.6f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -6.8f, -5.0f)
                lineToRelative(29.6f, -83.7f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 5.4f, 0.5f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 19.8f, -8.2f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 227.8f, 52.2f)
                close()
                moveTo(105.9f, 33.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 0.0f, 28.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 105.9f, 33.9f)
                close()
                moveTo(25.9f, 134.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 0.0f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 0.0f, 28.2f)
                close()
                moveTo(174.1f, 222.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                close()
                moveTo(165.4f, 180.5f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -25.2f, 7.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(64.7f, 133.2f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, false, -1.4f, -28.8f)
                lineToRelative(38.8f, -34.9f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 43.6f, -10.4f)
                lineToRelative(34.5f, 9.5f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 8.0f, 23.2f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, 6.8f, 5.0f)
                close()
                moveTo(222.1f, 86.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
