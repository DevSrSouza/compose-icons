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

public val LightGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 147.3f)
                lineTo(191.4f, 52.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.2f, -1.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 146.0f, 55.0f)
                lineTo(146.0f, 86.0f)
                lineTo(110.0f, 86.0f)
                lineTo(110.0f, 55.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.8f, -4.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.2f, 1.8f)
                lineTo(23.0f, 147.3f)
                arcTo(44.9f, 44.9f, 0.0f, false, false, 18.0f, 168.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 92.0f, 0.0f)
                lineTo(110.0f, 98.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(70.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 92.0f, 0.0f)
                arcTo(44.9f, 44.9f, 0.0f, false, false, 233.0f, 147.3f)
                close()
                moveTo(64.0f, 202.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -32.0f, -45.5f)
                lineToRelative(1.8f, -4.2f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 64.0f, 202.0f)
                close()
                moveTo(64.0f, 122.0f)
                arcToRelative(45.4f, 45.4f, 0.0f, false, false, -18.5f, 3.9f)
                lineTo(75.1f, 58.6f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 57.7f)
                lineTo(98.0f, 137.0f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 64.0f, 122.0f)
                close()
                moveTo(158.0f, 57.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 22.9f, 0.9f)
                lineToRelative(29.6f, 67.3f)
                arcTo(45.4f, 45.4f, 0.0f, false, false, 192.0f, 122.0f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, false, -34.0f, 15.0f)
                close()
                moveTo(192.0f, 202.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 30.2f, -49.7f)
                lineToRelative(1.8f, 4.2f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 192.0f, 202.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
