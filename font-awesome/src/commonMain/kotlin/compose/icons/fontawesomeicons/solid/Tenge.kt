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

public val SolidGroup.Tenge: ImageVector
    get() {
        if (_tenge != null) {
            return _tenge!!
        }
        _tenge = Builder(name = "Tenge", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 160.0f)
                lineTo(12.0f, 160.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(140.0f)
                verticalLineToRelative(228.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                lineTo(232.0f, 240.0f)
                horizontalLineToRelative(140.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(372.0f, 32.0f)
                lineTo(12.0f, 32.0f)
                curveTo(5.4f, 32.0f, 0.0f, 37.4f, 0.0f, 44.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(360.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                lineTo(384.0f, 44.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _tenge!!
    }

private var _tenge: ImageVector? = null
