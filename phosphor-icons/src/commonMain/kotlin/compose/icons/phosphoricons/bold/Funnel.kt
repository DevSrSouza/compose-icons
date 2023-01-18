package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 237.1f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, -9.4f, -2.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 92.0f, 217.1f)
                verticalLineTo(140.6f)
                lineTo(27.3f, 69.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 42.1f, 36.0f)
                horizontalLineTo(213.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 14.8f, 33.5f)
                lineTo(164.0f, 140.6f)
                verticalLineToRelative(55.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -8.9f, 16.7f)
                lineToRelative(-32.0f, 21.3f)
                arcTo(20.4f, 20.4f, 0.0f, false, true, 112.0f, 237.1f)
                close()
                moveTo(51.1f, 60.0f)
                lineToRelative(59.7f, 65.6f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 5.2f, 13.5f)
                verticalLineToRelative(70.5f)
                lineToRelative(24.0f, -16.0f)
                verticalLineTo(139.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 5.2f, -13.5f)
                lineTo(204.9f, 60.0f)
                close()
                moveTo(93.0f, 141.8f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(213.9f, 60.0f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
