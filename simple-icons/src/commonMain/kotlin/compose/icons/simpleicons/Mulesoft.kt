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

public val SimpleIcons.Mulesoft: ImageVector
    get() {
        if (_mulesoft != null) {
            return _mulesoft!!
        }
        _mulesoft = Builder(name = "Mulesoft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.055f)
                curveToRelative(6.045f, 0.0f, 10.945f, 4.9f, 10.945f, 10.945f)
                reflectiveCurveTo(18.045f, 22.945f, 12.0f, 22.945f)
                reflectiveCurveTo(1.055f, 18.045f, 1.055f, 12.0f)
                curveToRelative(0.0f, -6.044f, 4.9f, -10.945f, 10.945f, -10.945f)
                close()
                moveTo(7.33f, 4.364f)
                reflectiveCurveToRelative(-2.993f, 1.647f, -3.96f, 5.25f)
                curveToRelative(-0.647f, 2.224f, -0.39f, 4.702f, 0.903f, 6.914f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, false, 3.95f, 3.596f)
                lineToRelative(0.802f, -3.062f)
                curveToRelative(-1.801f, -0.85f, -3.11f, -2.571f, -3.11f, -4.79f)
                arcToRelative(5.647f, 5.647f, 0.0f, false, true, 0.943f, -3.141f)
                lineToRelative(3.752f, 5.866f)
                horizontalLineToRelative(2.792f)
                lineToRelative(3.753f, -5.866f)
                arcToRelative(5.647f, 5.647f, 0.0f, false, true, 0.943f, 3.14f)
                curveToRelative(0.0f, 2.22f, -1.308f, 3.94f, -3.109f, 4.791f)
                lineToRelative(0.802f, 3.062f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, false, 3.948f, -3.594f)
                curveToRelative(1.294f, -2.213f, 1.551f, -4.692f, 0.904f, -6.916f)
                lineToRelative(0.002f, 0.003f)
                curveToRelative(-0.966f, -3.603f, -3.96f, -5.251f, -3.96f, -5.251f)
                lineToRelative(-0.336f, 0.527f)
                lineToRelative(-4.341f, 6.797f)
                horizontalLineToRelative(-0.003f)
                lineTo(7.656f, 4.876f)
                close()
            }
        }
        .build()
        return _mulesoft!!
    }

private var _mulesoft: ImageVector? = null
