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

public val FillGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 180.0f)
                close()
                moveTo(60.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 216.0f)
                close()
                moveTo(28.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 184.0f)
                close()
                moveTo(88.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 188.0f)
                close()
                moveTo(248.0f, 32.0f)
                lineTo(219.3f, 32.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 208.0f, 36.7f)
                lineTo(180.2f, 64.5f)
                lineTo(54.0f, 85.6f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 41.4f, 96.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 3.9f, 16.1f)
                lineToRelative(98.1f, 98.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.2f, 4.7f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 4.9f, -0.8f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 170.4f, 202.0f)
                lineTo(191.5f, 75.8f)
                horizontalLineToRelative(0.0f)
                lineTo(219.3f, 48.0f)
                lineTo(248.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
