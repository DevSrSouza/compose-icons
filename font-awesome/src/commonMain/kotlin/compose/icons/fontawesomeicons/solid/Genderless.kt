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

public val SolidGroup.Genderless: ImageVector
    get() {
        if (_genderless != null) {
            return _genderless!!
        }
        _genderless = Builder(name = "Genderless", defaultWidth = 288.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 176.0f)
                curveToRelative(44.1f, 0.0f, 80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.9f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.9f, -80.0f, 80.0f, -80.0f)
                moveToRelative(0.0f, -64.0f)
                curveTo(64.5f, 112.0f, 0.0f, 176.5f, 0.0f, 256.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveToRelative(-64.5f, -144.0f, -144.0f, -144.0f)
                close()
            }
        }
        .build()
        return _genderless!!
    }

private var _genderless: ImageVector? = null
