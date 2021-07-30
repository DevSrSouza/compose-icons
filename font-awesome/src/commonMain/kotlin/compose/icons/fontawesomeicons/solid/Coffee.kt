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

public val SolidGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 384.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(70.6f, 0.0f, 128.0f, -57.4f, 128.0f, -128.0f)
                reflectiveCurveTo(582.6f, 32.0f, 512.0f, 32.0f)
                lineTo(120.0f, 32.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(232.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                close()
                moveTo(512.0f, 96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineToRelative(-32.0f)
                lineTo(480.0f, 96.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(559.7f, 480.0f)
                lineTo(48.3f, 480.0f)
                curveToRelative(-47.6f, 0.0f, -61.0f, -64.0f, -36.0f, -64.0f)
                horizontalLineToRelative(583.3f)
                curveToRelative(25.0f, 0.0f, 11.8f, 64.0f, -35.9f, 64.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
