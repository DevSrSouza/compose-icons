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

public val SolidGroup.Male: ImageVector
    get() {
        if (_male != null) {
            return _male!!
        }
        _male = Builder(name = "Male", defaultWidth = 192.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.654f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.654f, -64.0f, -64.0f)
                reflectiveCurveTo(60.654f, 0.0f, 96.0f, 0.0f)
                moveToRelative(48.0f, 144.0f)
                horizontalLineToRelative(-11.36f)
                curveToRelative(-22.711f, 10.443f, -49.59f, 10.894f, -73.28f, 0.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _male!!
    }

private var _male: ImageVector? = null
