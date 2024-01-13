package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Wasmer: ImageVector
    get() {
        if (_wasmer != null) {
            return _wasmer!!
        }
        _wasmer = Builder(name = "Wasmer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.111f, 3.537f)
                curveToRelative(-0.011f, 0.822f, -0.5f, 1.208f, -1.111f, 0.86f)
                curveToRelative(-0.611f, -0.353f, -1.106f, -1.307f, -1.111f, -2.146f)
                lineTo(12.0f, 0.0f)
                verticalLineToRelative(4.651f)
                lineToRelative(5.561f, 3.222f)
                lineToRelative(0.55f, 0.32f)
                verticalLineToRelative(7.763f)
                lineTo(22.0f, 18.206f)
                lineTo(22.0f, 5.794f)
                lineToRelative(-3.889f, -2.256f)
                close()
                moveTo(13.111f, 6.571f)
                curveToRelative(-0.011f, 0.822f, -0.5f, 1.208f, -1.111f, 0.86f)
                curveToRelative(-0.611f, -0.352f, -1.106f, -1.307f, -1.111f, -2.145f)
                lineToRelative(-3.89f, -2.252f)
                lineTo(6.999f, 7.41f)
                lineToRelative(5.562f, 3.222f)
                lineToRelative(0.55f, 0.32f)
                verticalLineToRelative(8.038f)
                lineTo(17.0f, 21.241f)
                lineTo(17.0f, 8.828f)
                lineTo(13.11f, 6.57f)
                close()
                moveTo(8.111f, 9.33f)
                curveToRelative(-0.011f, 0.822f, -0.5f, 1.208f, -1.111f, 0.86f)
                curveToRelative(-0.611f, -0.353f, -1.106f, -1.307f, -1.111f, -2.146f)
                lineTo(2.0f, 5.794f)
                verticalLineToRelative(12.413f)
                lineTo(12.0f, 24.0f)
                lineTo(12.0f, 11.586f)
                lineTo(8.111f, 9.33f)
                close()
            }
        }
        .build()
        return _wasmer!!
    }

private var _wasmer: ImageVector? = null
