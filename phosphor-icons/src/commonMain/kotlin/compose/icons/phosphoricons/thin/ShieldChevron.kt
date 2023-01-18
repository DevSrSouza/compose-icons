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

public val ThinGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 86.7f, 73.5f, 115.4f, 88.3f, 120.3f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.4f, 0.0f)
                curveToRelative(14.8f, -4.9f, 88.3f, -33.6f, 88.3f, -120.3f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(129.2f, 227.4f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -2.4f, 0.0f)
                curveToRelative(-9.7f, -3.2f, -46.8f, -17.5f, -67.9f, -54.1f)
                lineTo(128.0f, 124.9f)
                lineToRelative(69.1f, 48.4f)
                curveTo(176.0f, 209.9f, 138.9f, 224.2f, 129.2f, 227.4f)
                close()
                moveTo(212.0f, 114.7f)
                curveToRelative(0.0f, 20.4f, -4.4f, 37.4f, -11.1f, 51.4f)
                lineToRelative(-70.6f, -49.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -4.6f, 0.0f)
                lineTo(55.1f, 166.1f)
                curveToRelative(-6.7f, -14.0f, -11.1f, -31.0f, -11.1f, -51.4f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
