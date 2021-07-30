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

public val SimpleIcons.Ello: ImageVector
    get() {
        if (_ello != null) {
            return _ello!!
        }
        _ello = Builder(name = "Ello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.377f, 0.0f, 0.0f, 5.377f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.377f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.377f, 12.0f, -12.0f)
                reflectiveCurveTo(18.623f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.96f, 13.8f)
                curveToRelative(-0.8f, 3.16f, -3.68f, 5.4f, -6.96f, 5.4f)
                reflectiveCurveToRelative(-6.16f, -2.24f, -6.96f, -5.4f)
                curveToRelative(-0.08f, -0.36f, 0.12f, -0.76f, 0.48f, -0.84f)
                reflectiveCurveToRelative(0.76f, 0.12f, 0.84f, 0.48f)
                curveToRelative(0.68f, 2.56f, 3.0f, 4.36f, 5.64f, 4.36f)
                curveToRelative(2.64f, 0.0f, 4.96f, -1.8f, 5.64f, -4.36f)
                curveToRelative(0.08f, -0.36f, 0.48f, -0.6f, 0.84f, -0.48f)
                curveToRelative(0.36f, 0.08f, 0.6f, 0.48f, 0.48f, 0.84f)
                close()
            }
        }
        .build()
        return _ello!!
    }

private var _ello: ImageVector? = null
