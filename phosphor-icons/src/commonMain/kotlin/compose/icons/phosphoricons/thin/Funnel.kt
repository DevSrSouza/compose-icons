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

public val ThinGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 229.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-78.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -1.0f, -2.7f)
                lineTo(33.2f, 64.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.1f, -13.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 11.0f, -7.1f)
                horizontalLineTo(213.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 11.0f, 7.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.1f, 13.0f)
                lineTo(157.0f, 136.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -1.0f, 2.7f)
                verticalLineToRelative(56.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -5.3f, 10.0f)
                lineToRelative(-32.0f, 21.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 229.1f)
                close()
                moveTo(42.1f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.7f)
                lineTo(104.9f, 131.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.1f, 8.1f)
                verticalLineToRelative(78.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.1f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.1f, -0.2f)
                lineToRelative(32.0f, -21.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -3.3f)
                verticalLineTo(139.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.1f, -8.1f)
                lineToRelative(65.8f, -72.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, -6.7f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
