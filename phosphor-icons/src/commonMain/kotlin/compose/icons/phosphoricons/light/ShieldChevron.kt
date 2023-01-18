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

public val LightGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 88.0f, 74.7f, 117.3f, 89.7f, 122.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 8.6f, 0.0f)
                curveToRelative(15.0f, -4.9f, 89.7f, -34.2f, 89.7f, -122.2f)
                close()
                moveTo(128.6f, 225.5f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.2f, 0.0f)
                curveToRelative(-9.4f, -3.1f, -45.0f, -16.8f, -65.9f, -51.7f)
                lineTo(128.0f, 127.3f)
                lineToRelative(66.5f, 46.5f)
                curveTo(173.6f, 208.7f, 138.0f, 222.4f, 128.6f, 225.5f)
                close()
                moveTo(200.1f, 163.1f)
                lineTo(131.4f, 115.1f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.8f, 0.0f)
                lineToRelative(-68.7f, 48.0f)
                curveToRelative(-6.0f, -13.4f, -9.9f, -29.4f, -9.9f, -48.4f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(58.7f)
                curveTo(210.0f, 133.7f, 206.1f, 149.7f, 200.1f, 163.1f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
