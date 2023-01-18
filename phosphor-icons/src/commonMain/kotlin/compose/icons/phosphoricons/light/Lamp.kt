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

public val LightGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.7f, 138.5f)
                lineToRelative(-41.1f, -96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 186.7f, 34.0f)
                lineTo(69.3f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.9f, 8.5f)
                lineToRelative(-41.1f, 96.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 1.1f, 13.2f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 28.1f, 158.0f)
                lineTo(122.0f, 158.0f)
                verticalLineToRelative(52.0f)
                lineTo(96.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 158.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 158.0f)
                horizontalLineToRelative(21.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 11.7f, -6.3f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 240.7f, 138.5f)
                close()
                moveTo(229.5f, 145.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.6f, 0.9f)
                lineTo(28.1f, 146.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.6f, -0.9f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.2f, -1.9f)
                lineToRelative(41.1f, -96.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 69.3f, 46.0f)
                lineTo(186.7f, 46.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.9f, 1.2f)
                lineToRelative(41.1f, 96.0f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 229.5f, 145.1f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
