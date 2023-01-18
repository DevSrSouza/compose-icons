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

public val LightGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 18.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 82.0f, 96.0f)
                arcToRelative(77.2f, 77.2f, 0.0f, false, false, 4.2f, 25.3f)
                lineTo(27.8f, 179.8f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 26.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(72.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(78.0f, 206.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(102.0f, 182.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 4.2f, -1.8f)
                lineToRelative(10.5f, -10.4f)
                arcTo(77.2f, 77.2f, 0.0f, false, false, 160.0f, 174.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 0.0f, -156.0f)
                close()
                moveTo(160.0f, 162.0f)
                arcToRelative(65.4f, 65.4f, 0.0f, false, true, -24.4f, -4.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -6.7f, 1.3f)
                lineTo(117.5f, 170.0f)
                lineTo(96.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(72.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(38.0f, 218.0f)
                lineTo(38.0f, 186.5f)
                lineToRelative(59.4f, -59.4f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 1.3f, -6.7f)
                arcTo(65.4f, 65.4f, 0.0f, false, true, 94.0f, 96.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f)
                close()
                moveTo(190.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
