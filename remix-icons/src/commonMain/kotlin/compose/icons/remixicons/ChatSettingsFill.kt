package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ChatSettingsFill: ImageVector
    get() {
        if (_chatSettingsFill != null) {
            return _chatSettingsFill!!
        }
        _chatSettingsFill = Builder(name = "ChatSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.455f, 19.0f)
                close()
                moveTo(8.145f, 12.071f)
                lineToRelative(-0.975f, 0.563f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(0.976f, -0.563f)
                curveToRelative(0.501f, 0.51f, 1.14f, 0.887f, 1.854f, 1.071f)
                lineTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.126f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, false, 1.854f, -1.071f)
                lineToRelative(0.976f, 0.563f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(-0.975f, -0.563f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, 0.0f, -2.142f)
                lineToRelative(0.975f, -0.563f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(-0.976f, 0.563f)
                arcTo(3.996f, 3.996f, 0.0f, false, false, 13.0f, 7.126f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.126f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, false, -1.854f, 1.071f)
                lineToRelative(-0.976f, -0.563f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(0.975f, 0.563f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, 0.0f, 2.142f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _chatSettingsFill!!
    }

private var _chatSettingsFill: ImageVector? = null
