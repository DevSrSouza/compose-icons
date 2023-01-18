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

public val BoldGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(52.0f)
                lineTo(196.0f, 204.0f)
                lineTo(196.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(88.0f, 184.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(96.2f, 113.5f)
                lineTo(171.4f, 140.9f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 4.1f, 0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.1f, -23.3f)
                lineTo(104.4f, 91.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -8.2f, 22.5f)
                close()
                moveTo(128.0f, 50.1f)
                lineToRelative(61.3f, 51.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.7f, 2.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 9.2f, -4.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.5f, -16.9f)
                lineTo(143.4f, 31.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 50.1f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
