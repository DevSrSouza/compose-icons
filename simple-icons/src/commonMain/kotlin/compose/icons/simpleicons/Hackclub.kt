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

public val SimpleIcons.Hackclub: ImageVector
    get() {
        if (_hackclub != null) {
            return _hackclub!!
        }
        _hackclub = Builder(name = "Hackclub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(2.4f, 0.0f, 0.0f, 2.4f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -2.4f, 12.0f, -12.0f)
                reflectiveCurveTo(21.6f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.5f, 19.5094f)
                horizontalLineToRelative(-3.3094f)
                lineTo(13.1906f, 13.003f)
                curveToRelative(0.0f, -0.975f, -0.1875f, -1.6218f, -0.8343f, -1.6218f)
                curveToRelative(-0.7125f, 0.0f, -1.575f, 1.003f, -1.575f, 2.625f)
                verticalLineToRelative(5.503f)
                lineTo(7.5f, 19.5092f)
                lineTo(7.5f, 4.9689f)
                lineToRelative(3.2906f, -0.5625f)
                verticalLineToRelative(5.428f)
                curveToRelative(0.7125f, -0.6468f, 1.7063f, -0.928f, 2.7188f, -0.928f)
                curveToRelative(2.1562f, 0.0f, 2.9906f, 1.4156f, 2.9906f, 3.628f)
                close()
            }
        }
        .build()
        return _hackclub!!
    }

private var _hackclub: ImageVector? = null
