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

public val ThinGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, -44.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-0.5f, 0.0f, -53.6f, -0.5f, -104.3f, -43.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 42.2f)
                verticalLineTo(197.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.9f, 10.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 5.1f, 1.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 7.7f, -2.8f)
                curveToRelative(42.6f, -35.7f, 87.0f, -41.8f, 100.3f, -42.8f)
                verticalLineToRelative(39.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 5.3f, 10.0f)
                lineToRelative(11.0f, 7.3f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.7f, 2.0f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, 4.3f, -0.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.3f, -8.2f)
                lineToRelative(12.6f, -50.1f)
                arcTo(44.2f, 44.2f, 0.0f, false, false, 236.0f, 120.0f)
                close()
                moveTo(42.6f, 200.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.3f, 0.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.3f, -3.6f)
                verticalLineTo(42.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.3f, -3.6f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.8f, -0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, 0.9f)
                curveTo(87.9f, 77.2f, 134.3f, 83.0f, 148.0f, 83.8f)
                verticalLineToRelative(72.4f)
                curveTo(134.3f, 157.0f, 87.9f, 162.8f, 42.6f, 200.9f)
                close()
                moveTo(174.9f, 212.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.5f, 2.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.6f, -0.4f)
                lineToRelative(-11.0f, -7.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.8f, -3.3f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(30.9f)
                close()
                moveTo(192.0f, 156.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
