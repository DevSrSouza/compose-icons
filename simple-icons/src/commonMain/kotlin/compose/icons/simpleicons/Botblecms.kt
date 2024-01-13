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

public val SimpleIcons.Botblecms: ImageVector
    get() {
        if (_botblecms != null) {
            return _botblecms!!
        }
        _botblecms = Builder(name = "Botblecms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.371f)
                curveToRelative(-1.613f, 0.0f, -3.09f, 0.54f, -4.3f, 1.426f)
                lineTo(7.7f, 0.0f)
                reflectiveCurveTo(5.624f, 0.434f, 4.686f, 1.313f)
                lineToRelative(0.036f, 15.742f)
                curveTo(4.918f, 20.918f, 8.086f, 24.0f, 12.0f, 24.0f)
                curveToRelative(0.547f, 0.0f, 1.074f, -0.07f, 1.59f, -0.184f)
                verticalLineToRelative(-3.105f)
                arcToRelative(4.318f, 4.318f, 0.0f, false, true, -1.59f, 0.312f)
                arcToRelative(4.336f, 4.336f, 0.0f, false, true, 0.0f, -8.671f)
                arcToRelative(4.321f, 4.321f, 0.0f, false, true, 4.313f, 4.109f)
                lineToRelative(0.09f, 6.031f)
                curveToRelative(1.757f, -1.332f, 2.91f, -3.426f, 2.91f, -5.805f)
                arcTo(7.315f, 7.315f, 0.0f, false, false, 12.0f, 9.372f)
                close()
                moveTo(13.523f, 16.883f)
                curveToRelative(0.0f, 0.84f, -0.683f, 1.523f, -1.523f, 1.523f)
                arcToRelative(1.525f, 1.525f, 0.0f, false, true, 0.0f, -3.05f)
                curveToRelative(0.84f, 0.0f, 1.523f, 0.683f, 1.523f, 1.527f)
                close()
            }
        }
        .build()
        return _botblecms!!
    }

private var _botblecms: ImageVector? = null
