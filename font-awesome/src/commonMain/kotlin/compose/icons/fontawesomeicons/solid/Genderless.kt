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

public val SolidGroup.Genderless: ImageVector
    get() {
        if (_genderless != null) {
            return _genderless!!
        }
        _genderless = Builder(name = "Genderless", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 368.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, -50.1f, -112.0f, -112.0f)
                reflectiveCurveToRelative(50.1f, -112.0f, 112.0f, -112.0f)
                reflectiveCurveToRelative(112.0f, 50.1f, 112.0f, 112.0f)
                reflectiveCurveToRelative(-50.1f, 112.0f, -112.0f, 112.0f)
                close()
                moveTo(192.0f, 432.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, -78.8f, 176.0f, -176.0f)
                reflectiveCurveToRelative(-78.8f, -176.0f, -176.0f, -176.0f)
                reflectiveCurveTo(16.0f, 158.8f, 16.0f, 256.0f)
                reflectiveCurveToRelative(78.8f, 176.0f, 176.0f, 176.0f)
                close()
            }
        }
        .build()
        return _genderless!!
    }

private var _genderless: ImageVector? = null
