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

public val SimpleIcons.Mongodb: ImageVector
    get() {
        if (_mongodb != null) {
            return _mongodb!!
        }
        _mongodb = Builder(name = "Mongodb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.193f, 9.555f)
                curveToRelative(-1.264f, -5.58f, -4.252f, -7.414f, -4.573f, -8.115f)
                curveToRelative(-0.28f, -0.394f, -0.53f, -0.954f, -0.735f, -1.44f)
                curveToRelative(-0.036f, 0.495f, -0.055f, 0.685f, -0.523f, 1.184f)
                curveToRelative(-0.723f, 0.566f, -4.438f, 3.682f, -4.74f, 10.02f)
                curveToRelative(-0.282f, 5.912f, 4.27f, 9.435f, 4.888f, 9.884f)
                lineToRelative(0.07f, 0.05f)
                arcTo(73.49f, 73.49f, 0.0f, false, true, 11.91f, 24.0f)
                horizontalLineToRelative(0.481f)
                curveToRelative(0.114f, -1.032f, 0.284f, -2.056f, 0.51f, -3.07f)
                curveToRelative(0.417f, -0.296f, 0.604f, -0.463f, 0.85f, -0.693f)
                arcToRelative(11.342f, 11.342f, 0.0f, false, false, 3.639f, -8.464f)
                curveToRelative(0.01f, -0.814f, -0.103f, -1.662f, -0.197f, -2.218f)
                close()
                moveTo(11.857f, 17.75f)
                reflectiveCurveToRelative(0.0f, -8.291f, 0.275f, -8.29f)
                curveToRelative(0.213f, 0.0f, 0.49f, 10.695f, 0.49f, 10.695f)
                curveToRelative(-0.381f, -0.045f, -0.765f, -1.76f, -0.765f, -2.405f)
                close()
            }
        }
        .build()
        return _mongodb!!
    }

private var _mongodb: ImageVector? = null
