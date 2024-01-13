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

public val SolidGroup.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 48.0f)
                verticalLineTo(384.0f)
                curveToRelative(-63.1f, 22.5f, -82.3f, 32.0f, -119.5f, 32.0f)
                curveToRelative(-62.8f, 0.0f, -86.6f, -32.0f, -149.3f, -32.0f)
                curveToRelative(-20.6f, 0.0f, -36.6f, 3.6f, -51.2f, 8.2f)
                verticalLineToRelative(-64.0f)
                curveToRelative(14.6f, -4.6f, 30.6f, -8.2f, 51.2f, -8.2f)
                curveToRelative(62.7f, 0.0f, 86.5f, 32.0f, 149.3f, 32.0f)
                curveToRelative(20.4f, 0.0f, 35.6f, -3.0f, 55.5f, -9.3f)
                verticalLineToRelative(-208.0f)
                curveToRelative(-19.9f, 6.3f, -35.1f, 9.3f, -55.5f, 9.3f)
                curveToRelative(-62.8f, 0.0f, -86.6f, -32.0f, -149.3f, -32.0f)
                curveToRelative(-50.8f, 0.0f, -74.9f, 20.6f, -115.2f, 28.7f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(76.7f)
                curveToRelative(40.3f, -8.0f, 64.4f, -28.7f, 115.2f, -28.7f)
                curveToRelative(62.7f, 0.0f, 86.5f, 32.0f, 149.3f, 32.0f)
                curveToRelative(37.1f, 0.0f, 56.4f, -9.5f, 119.5f, -32.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
