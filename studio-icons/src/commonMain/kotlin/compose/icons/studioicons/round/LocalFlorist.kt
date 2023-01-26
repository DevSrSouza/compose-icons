package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LocalFlorist: ImageVector
    get() {
        if (_localFlorist != null) {
            return _localFlorist!!
        }
        _localFlorist = Builder(name = "LocalFlorist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(4.56f, 0.0f, 8.33f, -3.4f, 8.92f, -7.8f)
                curveToRelative(0.09f, -0.64f, -0.48f, -1.21f, -1.12f, -1.12f)
                curveToRelative(-4.4f, 0.59f, -7.8f, 4.36f, -7.8f, 8.92f)
                close()
                moveTo(5.6f, 10.25f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.53f, 0.0f, 1.01f, -0.16f, 1.42f, -0.44f)
                lineToRelative(-0.02f, 0.19f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                lineToRelative(-0.02f, -0.19f)
                curveToRelative(0.4f, 0.28f, 0.89f, 0.44f, 1.42f, 0.44f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.0f, -0.59f, -1.85f, -1.43f, -2.25f)
                curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.53f, 0.0f, -1.01f, 0.16f, -1.42f, 0.44f)
                lineToRelative(0.02f, -0.19f)
                curveTo(14.5f, 2.12f, 13.38f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f)
                lineToRelative(0.02f, 0.19f)
                curveToRelative(-0.4f, -0.28f, -0.89f, -0.44f, -1.42f, -0.44f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.0f, 0.59f, 1.85f, 1.43f, 2.25f)
                curveToRelative(-0.84f, 0.4f, -1.43f, 1.25f, -1.43f, 2.25f)
                close()
                moveTo(12.0f, 5.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(9.5f, 9.38f, 9.5f, 8.0f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(3.08f, 14.2f)
                curveTo(3.67f, 18.6f, 7.44f, 22.0f, 12.0f, 22.0f)
                curveToRelative(0.0f, -4.56f, -3.4f, -8.33f, -7.8f, -8.92f)
                curveToRelative(-0.64f, -0.09f, -1.21f, 0.48f, -1.12f, 1.12f)
                close()
            }
        }
        .build()
        return _localFlorist!!
    }

private var _localFlorist: ImageVector? = null
