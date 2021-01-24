package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 192.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 432.0f)
                curveToRelative(0.0f, 44.112f, -35.888f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.888f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.888f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.888f, 80.0f, 80.0f)
                close()
                moveTo(25.26f, 25.199f)
                lineToRelative(13.6f, 272.0f)
                curveTo(39.499f, 309.972f, 50.041f, 320.0f, 62.83f, 320.0f)
                horizontalLineToRelative(66.34f)
                curveToRelative(12.789f, 0.0f, 23.331f, -10.028f, 23.97f, -22.801f)
                lineToRelative(13.6f, -272.0f)
                curveTo(167.425f, 11.49f, 156.496f, 0.0f, 142.77f, 0.0f)
                horizontalLineTo(49.23f)
                curveTo(35.504f, 0.0f, 24.575f, 11.49f, 25.26f, 25.199f)
                close()
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
