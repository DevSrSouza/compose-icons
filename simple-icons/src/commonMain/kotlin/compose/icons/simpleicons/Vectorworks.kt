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

public val SimpleIcons.Vectorworks: ImageVector
    get() {
        if (_vectorworks != null) {
            return _vectorworks!!
        }
        _vectorworks = Builder(name = "Vectorworks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.4f, 0.0f, 0.0f, 5.4f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.725f)
                curveToRelative(-5.925f, 0.0f, -10.725f, -4.8f, -10.725f, -10.725f)
                reflectiveCurveTo(6.075f, 1.275f, 12.0f, 1.275f)
                reflectiveCurveTo(22.725f, 6.075f, 22.725f, 12.0f)
                reflectiveCurveTo(17.925f, 22.725f, 12.0f, 22.725f)
                close()
                moveTo(8.775f, 7.5f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.15f, 0.0f, -0.208f, 0.086f, -0.15f, 0.225f)
                lineToRelative(4.425f, 10.65f)
                curveToRelative(0.04f, 0.098f, 0.15f, 0.225f, 0.3f, 0.225f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.15f, 0.0f, 0.206f, -0.086f, 0.15f, -0.225f)
                lineToRelative(-4.35f, -10.8f)
                curveToRelative(-0.028f, -0.07f, -0.035f, -0.075f, -0.075f, -0.075f)
                close()
                moveTo(17.475f, 7.5f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.075f, 0.0f, -0.13f, 0.023f, -0.15f, 0.075f)
                lineTo(13.35f, 11.85f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.0f, 0.375f)
                lineToRelative(1.05f, 2.55f)
                curveToRelative(0.075f, 0.15f, 0.225f, 0.15f, 0.3f, 0.0f)
                lineToRelative(2.925f, -7.05f)
                curveToRelative(0.057f, -0.139f, 0.0f, -0.225f, -0.15f, -0.225f)
                close()
            }
        }
        .build()
        return _vectorworks!!
    }

private var _vectorworks: ImageVector? = null
