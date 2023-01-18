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

public val RemixIcons.ChatSettingsLine: ImageVector
    get() {
        if (_chatSettingsLine != null) {
            return _chatSettingsLine!!
        }
        _chatSettingsLine = Builder(name = "ChatSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(13.385f)
                lineTo(5.763f, 17.0f)
                lineTo(12.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(14.145f, 19.071f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, 0.0f, -2.142f)
                lineToRelative(-0.975f, -0.563f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(0.976f, 0.563f)
                arcTo(3.996f, 3.996f, 0.0f, false, true, 17.0f, 14.126f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.126f)
                curveToRelative(0.715f, 0.184f, 1.353f, 0.56f, 1.854f, 1.071f)
                lineToRelative(0.976f, -0.563f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-0.975f, 0.563f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, 0.0f, 2.142f)
                lineToRelative(0.975f, 0.563f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-0.976f, -0.563f)
                curveToRelative(-0.501f, 0.51f, -1.14f, 0.887f, -1.854f, 1.071f)
                lineTo(19.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.126f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, true, -1.854f, -1.071f)
                lineToRelative(-0.976f, 0.563f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(0.975f, -0.563f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _chatSettingsLine!!
    }

private var _chatSettingsLine: ImageVector? = null
