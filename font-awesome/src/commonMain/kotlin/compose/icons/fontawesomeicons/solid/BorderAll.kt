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

public val SolidGroup.BorderAll: ImageVector
    get() {
        if (_borderAll != null) {
            return _borderAll!!
        }
        _borderAll = Builder(name = "BorderAll", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                verticalLineToRelative(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(448.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                close()
                moveTo(384.0f, 96.0f)
                verticalLineToRelative(128.0f)
                lineTo(256.0f, 224.0f)
                lineTo(256.0f, 96.0f)
                close()
                moveTo(192.0f, 96.0f)
                verticalLineToRelative(128.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 96.0f)
                close()
                moveTo(64.0f, 416.0f)
                lineTo(64.0f, 288.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(256.0f, 416.0f)
                lineTo(256.0f, 288.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                close()
            }
        }
        .build()
        return _borderAll!!
    }

private var _borderAll: ImageVector? = null
