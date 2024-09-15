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

public val SolidGroup.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 192.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 424.23f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(279.77f)
                horizontalLineTo(20.0f)
                curveToRelative(-11.05f, 0.0f, -20.0f, -8.95f, -20.0f, -20.0f)
                verticalLineTo(212.0f)
                curveToRelative(0.0f, -11.05f, 8.95f, -20.0f, 20.0f, -20.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(11.05f, 0.0f, 20.0f, 8.95f, 20.0f, 20.0f)
                verticalLineToRelative(212.23f)
                horizontalLineToRelative(20.0f)
                curveToRelative(11.05f, 0.0f, 20.0f, 8.95f, 20.0f, 20.0f)
                verticalLineTo(492.0f)
                curveToRelative(0.0f, 11.05f, -8.95f, 20.0f, -20.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveToRelative(-11.05f, 0.0f, -20.0f, -8.95f, -20.0f, -20.0f)
                verticalLineToRelative(-47.77f)
                curveToRelative(0.0f, -11.05f, 8.95f, -20.0f, 20.0f, -20.0f)
                close()
                moveTo(96.0f, 0.0f)
                curveTo(56.24f, 0.0f, 24.0f, 32.24f, 24.0f, 72.0f)
                reflectiveCurveToRelative(32.24f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.24f, 72.0f, -72.0f)
                reflectiveCurveTo(135.76f, 0.0f, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
