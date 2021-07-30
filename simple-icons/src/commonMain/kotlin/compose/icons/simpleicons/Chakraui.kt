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

public val SimpleIcons.Chakraui: ImageVector
    get() {
        if (_chakraui != null) {
            return _chakraui!!
        }
        _chakraui = Builder(name = "Chakraui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.352f, 0.0f, 0.0f, 5.352f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.352f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.352f, 12.0f, -12.0f)
                reflectiveCurveTo(18.648f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.8f, 4.333f)
                curveToRelative(0.13f, -0.004f, 0.248f, 0.136f, 0.171f, 0.278f)
                lineToRelative(-3.044f, 5.58f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, false, 0.164f, 0.276f)
                horizontalLineToRelative(5.26f)
                curveToRelative(0.17f, 0.0f, 0.252f, 0.207f, 0.128f, 0.323f)
                lineToRelative(-9.22f, 8.605f)
                curveToRelative(-0.165f, 0.154f, -0.41f, -0.063f, -0.278f, -0.246f)
                lineToRelative(4.364f, -6.021f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, false, -0.151f, -0.296f)
                lineTo(6.627f, 12.832f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.131f, -0.32f)
                lineToRelative(8.18f, -8.123f)
                arcToRelative(0.182f, 0.182f, 0.0f, false, true, 0.125f, -0.056f)
                close()
            }
        }
        .build()
        return _chakraui!!
    }

private var _chakraui: ImageVector? = null
