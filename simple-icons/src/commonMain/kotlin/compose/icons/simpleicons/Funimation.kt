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

public val SimpleIcons.Funimation: ImageVector
    get() {
        if (_funimation != null) {
            return _funimation!!
        }
        _funimation = Builder(name = "Funimation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.001f, 12.001f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(7.428f, 16.06f)
                horizontalLineToRelative(9.188f)
                reflectiveCurveToRelative(-0.449f, 3.278f, -4.601f, 3.278f)
                curveToRelative(-4.15f, 0.0f, -4.587f, -3.278f, -4.587f, -3.278f)
                close()
            }
        }
        .build()
        return _funimation!!
    }

private var _funimation: ImageVector? = null
