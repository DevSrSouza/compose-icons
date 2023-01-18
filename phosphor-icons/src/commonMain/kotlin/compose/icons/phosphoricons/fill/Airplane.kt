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

public val FillGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.2f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -2.9f, 6.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.6f, 1.6f)
                lineToRelative(-70.5f, -14.0f)
                verticalLineToRelative(26.9f)
                lineToRelative(13.5f, 13.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 176.0f, 208.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.5f, 6.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 168.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, -0.6f)
                lineToRelative(-37.0f, -14.8f)
                lineTo(91.0f, 239.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.5f, -0.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 80.0f, 232.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 2.3f, -5.7f)
                lineTo(96.0f, 188.7f)
                verticalLineTo(161.8f)
                lineToRelative(-70.4f, 14.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 16.0f, 168.0f)
                verticalLineTo(136.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 4.4f, -7.2f)
                lineTo(96.0f, 91.0f)
                verticalLineTo(48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineTo(91.0f)
                lineToRelative(75.6f, 37.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 240.2f, 136.0f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
