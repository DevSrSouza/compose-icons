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

public val SimpleIcons.Jrgroup: ImageVector
    get() {
        if (_jrgroup != null) {
            return _jrgroup!!
        }
        _jrgroup = Builder(name = "Jrgroup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.955f, 13.653f)
                horizontalLineToRelative(1.089f)
                curveToRelative(2.684f, 0.0f, 2.684f, -4.123f, 2.684f, -4.123f)
                reflectiveCurveToRelative(0.0f, -4.162f, -2.684f, -4.162f)
                horizontalLineTo(9.18f)
                verticalLineToRelative(8.869f)
                curveToRelative(0.0f, 1.556f, -3.112f, 1.478f, -3.112f, 1.478f)
                reflectiveCurveToRelative(-3.073f, 0.116f, -3.073f, -1.478f)
                verticalLineToRelative(-3.423f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(4.395f)
                curveToRelative(0.0f, 3.19f, 5.68f, 3.384f, 6.107f, 3.423f)
                curveToRelative(0.428f, 0.0f, 6.107f, -0.194f, 6.107f, -3.423f)
                verticalLineTo(8.363f)
                horizontalLineToRelative(7.896f)
                curveToRelative(0.661f, 0.0f, 0.661f, 1.167f, 0.661f, 1.167f)
                reflectiveCurveToRelative(0.0f, 1.167f, -0.66f, 1.167f)
                horizontalLineToRelative(-6.069f)
                lineToRelative(5.952f, 7.702f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _jrgroup!!
    }

private var _jrgroup: ImageVector? = null
