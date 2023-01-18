package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                lineTo(200.0f, 208.0f)
                lineTo(200.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(88.0f, 184.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(92.9f, 130.9f)
                lineTo(170.2f, 151.6f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.0f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.1f, -15.7f)
                lineTo(97.0f, 115.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.1f, 15.4f)
                close()
                moveTo(111.3f, 80.9f)
                lineTo(180.6f, 120.9f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 6.9f, -4.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.9f, -10.9f)
                lineToRelative(-69.3f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.8f)
                close()
                moveTo(198.7f, 94.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 2.3f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 210.0f, 94.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineTo(153.4f, 26.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.3f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
