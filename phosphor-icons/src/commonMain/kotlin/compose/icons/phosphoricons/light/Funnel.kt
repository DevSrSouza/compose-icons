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

public val LightGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 231.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -6.6f, -1.7f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 98.0f, 217.1f)
                verticalLineToRelative(-78.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.5f, -1.3f)
                lineTo(31.7f, 65.4f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -2.4f, -15.1f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 42.1f, 42.0f)
                horizontalLineTo(213.9f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 12.8f, 8.3f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -2.4f, 15.1f)
                lineToRelative(-65.8f, 72.3f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.5f, 1.4f)
                verticalLineToRelative(56.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -6.2f, 11.7f)
                lineToRelative(-32.0f, 21.3f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 112.0f, 231.1f)
                close()
                moveTo(42.1f, 54.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.8f, 1.2f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, 0.3f, 2.1f)
                lineToRelative(65.8f, 72.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 3.6f, 9.4f)
                verticalLineToRelative(78.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.1f, 1.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 2.0f, -0.1f)
                lineToRelative(32.0f, -21.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.9f, -1.7f)
                verticalLineTo(139.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 3.6f, -9.4f)
                lineToRelative(65.8f, -72.4f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, 0.3f, -2.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.8f, -1.2f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
