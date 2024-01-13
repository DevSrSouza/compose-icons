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

public val SimpleIcons.Conventionalcommits: ImageVector
    get() {
        if (_conventionalcommits != null) {
            return _conventionalcommits!!
        }
        _conventionalcommits = Builder(name = "Conventionalcommits", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.382f, 0.0f, 0.0f, 5.382f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.382f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.382f, 12.0f, -12.0f)
                reflectiveCurveTo(18.618f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.6f)
                curveToRelative(5.753f, 0.0f, 10.4f, 4.647f, 10.4f, 10.4f)
                reflectiveCurveTo(17.753f, 22.4f, 12.0f, 22.4f)
                reflectiveCurveTo(1.6f, 17.753f, 1.6f, 12.0f)
                reflectiveCurveTo(6.247f, 1.6f, 12.0f, 1.6f)
                close()
            }
        }
        .build()
        return _conventionalcommits!!
    }

private var _conventionalcommits: ImageVector? = null
