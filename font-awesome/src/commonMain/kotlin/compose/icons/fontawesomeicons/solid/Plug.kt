package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(368.0f, 160.0f)
                lineTo(16.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(32.0f, 224.0f)
                verticalLineToRelative(32.0f)
                arcTo(160.07f, 160.07f, 0.0f, false, false, 160.0f, 412.8f)
                lineTo(160.0f, 512.0f)
                horizontalLineToRelative(64.0f)
                lineTo(224.0f, 412.8f)
                arcTo(160.07f, 160.07f, 0.0f, false, false, 352.0f, 256.0f)
                lineTo(352.0f, 224.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(384.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 160.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
