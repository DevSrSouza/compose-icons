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

public val ThinGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.2f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.8f, 44.0f)
                lineToRelative(19.6f, 111.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 4.6f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.3f)
                lineTo(172.6f, 44.0f)
                lineTo(91.2f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 87.2f, 40.0f)
                close()
                moveTo(210.7f, 219.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.7f, -0.3f)
                lineTo(169.9f, 180.0f)
                lineTo(132.0f, 180.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(52.6f, 172.0f)
                lineTo(70.5f, 70.7f)
                lineTo(45.0f, 42.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.4f)
                lineToRelative(160.0f, 176.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 210.7f, 219.0f)
                close()
                moveTo(162.6f, 172.0f)
                lineTo(77.3f, 78.2f)
                lineTo(60.8f, 172.0f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
