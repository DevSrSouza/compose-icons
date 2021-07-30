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

public val SolidGroup.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 224.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-72.0f)
                curveTo(376.0f, 68.2f, 307.8f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(72.0f, 68.2f, 72.0f, 152.0f)
                verticalLineToRelative(72.0f)
                lineTo(48.0f, 224.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 272.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(296.0f, 224.0f)
                lineTo(152.0f, 224.0f)
                verticalLineToRelative(-72.0f)
                curveToRelative(0.0f, -39.7f, 32.3f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.3f, 72.0f, 72.0f)
                verticalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
