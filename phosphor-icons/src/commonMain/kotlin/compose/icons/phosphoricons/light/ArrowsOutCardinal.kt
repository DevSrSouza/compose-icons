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

public val LightGroup.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) {
            return _arrowsOutCardinal!!
        }
        _arrowsOutCardinal = Builder(name = "ArrowsOutCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.5f, 199.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, 8.5f)
                lineToRelative(-28.3f, 28.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineTo(95.5f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineToRelative(18.0f, 18.0f)
                lineTo(122.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(57.5f)
                lineToRelative(18.0f, -18.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 160.5f, 199.5f)
                close()
                moveTo(104.0f, 56.5f)
                lineToRelative(18.0f, -18.0f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 38.5f)
                lineToRelative(18.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 1.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, -1.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, -8.5f)
                lineTo(132.2f, 19.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineTo(95.5f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.5f, 8.5f)
                close()
                moveTo(38.5f, 134.0f)
                lineTo(96.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(38.5f, 122.0f)
                lineToRelative(18.0f, -18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 95.5f)
                lineTo(19.8f, 123.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineTo(48.0f, 160.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 1.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, -1.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, -8.5f)
                close()
                moveTo(236.2f, 123.8f)
                lineTo(208.0f, 95.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 8.5f)
                lineToRelative(18.0f, 18.0f)
                lineTo(160.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(57.5f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, 1.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, -1.8f)
                lineToRelative(28.2f, -28.3f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 236.2f, 123.8f)
                close()
            }
        }
        .build()
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
