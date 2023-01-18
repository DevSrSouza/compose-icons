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

public val LightGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 88.0f, 74.7f, 117.3f, 89.7f, 122.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 8.6f, 0.0f)
                curveToRelative(15.0f, -4.9f, 89.7f, -34.2f, 89.7f, -122.2f)
                close()
                moveTo(128.6f, 225.5f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.2f, 0.0f)
                curveTo(113.8f, 221.0f, 46.0f, 194.5f, 46.0f, 114.7f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(58.7f)
                curveTo(210.0f, 194.5f, 142.2f, 221.0f, 128.6f, 225.5f)
                close()
                moveTo(176.3f, 99.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -0.2f, 8.4f)
                lineToRelative(-58.6f, 56.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.2f, 1.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.1f, -1.7f)
                lineToRelative(-29.3f, -28.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.2f, -8.6f)
                lineToRelative(25.2f, 24.0f)
                lineToRelative(54.6f, -52.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 176.3f, 99.9f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
