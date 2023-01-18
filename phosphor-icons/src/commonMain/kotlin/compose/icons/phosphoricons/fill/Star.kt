package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 115.5f)
                lineToRelative(-45.2f, 37.6f)
                lineToRelative(14.3f, 58.1f)
                arcTo(16.5f, 16.5f, 0.0f, false, true, 187.3f, 232.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -8.7f, -2.6f)
                lineToRelative(-50.5f, -31.9f)
                horizontalLineToRelative(-0.2f)
                lineTo(81.0f, 227.2f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -20.1f, -0.6f)
                arcToRelative(18.5f, 18.5f, 0.0f, false, true, -7.0f, -19.6f)
                lineToRelative(13.5f, -53.1f)
                lineTo(22.0f, 115.5f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, -5.2f, -18.1f)
                arcTo(16.5f, 16.5f, 0.0f, false, true, 31.4f, 86.0f)
                lineToRelative(59.0f, -3.8f)
                lineToRelative(22.4f, -55.8f)
                arcTo(16.4f, 16.4f, 0.0f, false, true, 128.0f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 15.2f, 10.4f)
                lineToRelative(22.0f, 55.5f)
                lineTo(224.6f, 86.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 14.6f, 11.4f)
                arcTo(16.8f, 16.8f, 0.0f, false, true, 234.0f, 115.5f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
