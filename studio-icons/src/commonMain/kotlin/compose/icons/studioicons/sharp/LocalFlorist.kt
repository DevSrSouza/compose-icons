package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LocalFlorist: ImageVector
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
                curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
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
                moveTo(3.0f, 13.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _localFlorist!!
    }

private var _localFlorist: ImageVector? = null
