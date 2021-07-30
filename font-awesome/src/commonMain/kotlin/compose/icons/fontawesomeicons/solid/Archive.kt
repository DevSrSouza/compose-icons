package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.0f, 160.0f)
                lineTo(32.0f, 160.0f)
                verticalLineToRelative(288.0f)
                close()
                moveTo(192.0f, 236.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(104.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                lineTo(204.0f, 256.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(480.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(512.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
