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

public val SimpleIcons.Sensu: ImageVector
    get() {
        if (_sensu != null) {
            return _sensu!!
        }
        _sensu = Builder(name = "Sensu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineTo(12.0f, 0.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(12.0f, -12.0f)
                close()
                moveTo(12.0f, 3.197f)
                lineToRelative(4.418f, 4.418f)
                curveToRelative(-1.445f, -0.386f, -2.93f, -0.586f, -4.418f, -0.586f)
                reflectiveCurveToRelative(-2.974f, 0.199f, -4.418f, 0.588f)
                lineTo(12.0f, 3.196f)
                close()
                moveTo(8.069f, 16.87f)
                curveToRelative(1.19f, -0.658f, 2.534f, -1.008f, 3.931f, -1.008f)
                reflectiveCurveToRelative(2.741f, 0.35f, 3.931f, 1.008f)
                lineTo(12.0f, 20.804f)
                lineTo(8.069f, 16.87f)
                close()
                moveTo(17.578f, 15.223f)
                curveToRelative(-1.697f, -1.08f, -3.636f, -1.622f, -5.578f, -1.622f)
                reflectiveCurveToRelative(-3.881f, 0.542f, -5.578f, 1.622f)
                lineToRelative(-3.103f, -3.101f)
                curveTo(5.822f, 10.284f, 8.834f, 9.29f, 12.0f, 9.29f)
                reflectiveCurveToRelative(6.178f, 0.994f, 8.681f, 2.832f)
                lineToRelative(-3.103f, 3.101f)
                close()
            }
        }
        .build()
        return _sensu!!
    }

private var _sensu: ImageVector? = null
