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

public val LightGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(42.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(58.0f)
                lineTo(202.0f, 210.0f)
                lineTo(202.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(88.0f, 182.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(88.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(93.4f, 129.0f)
                lineTo(170.7f, 149.7f)
                lineTo(172.2f, 149.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.6f, -11.8f)
                lineTo(96.5f, 117.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -7.3f, 4.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 93.4f, 129.0f)
                close()
                moveTo(112.3f, 79.2f)
                lineTo(181.6f, 119.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -11.2f)
                lineToRelative(-69.3f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.2f, 2.2f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 112.3f, 79.2f)
                close()
                moveTo(200.1f, 92.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.2f, 1.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.3f, -1.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -8.5f)
                lineTo(152.0f, 27.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
