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

public val SimpleIcons.Bosch: ImageVector
    get() {
        if (_bosch != null) {
            return _bosch!!
        }
        _bosch = Builder(name = "Bosch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveTo(23.996f, 5.374f, 18.626f, 0.004f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.88f)
                curveTo(5.991f, 22.88f, 1.12f, 18.009f, 1.12f, 12.0f)
                reflectiveCurveTo(5.991f, 1.12f, 12.0f, 1.12f)
                reflectiveCurveTo(22.88f, 5.991f, 22.88f, 12.0f)
                curveToRelative(-0.006f, 6.006f, -4.874f, 10.874f, -10.88f, 10.88f)
                close()
                moveTo(16.954f, 4.506f)
                horizontalLineToRelative(-0.821f)
                verticalLineToRelative(4.108f)
                horizontalLineToRelative(-8.24f)
                lineTo(7.893f, 4.506f)
                horizontalLineToRelative(-0.847f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, false, 0.0f, 14.988f)
                horizontalLineToRelative(0.846f)
                verticalLineToRelative(-4.108f)
                horizontalLineToRelative(8.24f)
                verticalLineToRelative(4.108f)
                horizontalLineToRelative(0.822f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, false, 0.0f, -14.988f)
                close()
                moveTo(6.747f, 17.876f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, true, 0.0f, -11.752f)
                verticalLineToRelative(11.752f)
                close()
                moveTo(16.133f, 14.241f)
                horizontalLineToRelative(-8.24f)
                lineTo(7.893f, 9.734f)
                horizontalLineToRelative(8.24f)
                verticalLineToRelative(4.507f)
                close()
                moveTo(17.253f, 17.851f)
                lineTo(17.253f, 6.124f)
                arcToRelative(7.882f, 7.882f, 0.0f, false, true, 0.0f, 11.727f)
                close()
            }
        }
        .build()
        return _bosch!!
    }

private var _bosch: ImageVector? = null
