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

public val SimpleIcons.Crehana: ImageVector
    get() {
        if (_crehana != null) {
            return _crehana!!
        }
        _crehana = Builder(name = "Crehana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.371f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.626f, 5.371f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.374f, 12.0f, -12.0f)
                curveTo(24.0f, 5.371f, 18.626f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.94f, 9.843f)
                verticalLineToRelative(7.915f)
                horizontalLineToRelative(-3.957f)
                verticalLineToRelative(-3.892f)
                horizontalLineToRelative(-3.895f)
                verticalLineToRelative(3.83f)
                horizontalLineTo(6.13f)
                verticalLineToRelative(-3.957f)
                horizontalLineToRelative(3.833f)
                verticalLineTo(9.843f)
                horizontalLineTo(6.06f)
                verticalLineTo(5.948f)
                horizontalLineToRelative(3.957f)
                verticalLineToRelative(3.895f)
                horizontalLineToRelative(3.965f)
                verticalLineTo(5.948f)
                horizontalLineToRelative(3.957f)
                verticalLineTo(9.843f)
                close()
            }
        }
        .build()
        return _crehana!!
    }

private var _crehana: ImageVector? = null
