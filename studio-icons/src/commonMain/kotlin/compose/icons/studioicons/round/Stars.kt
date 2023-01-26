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

public val RoundGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f)
                close()
                moveTo(15.22f, 17.39f)
                lineTo(12.0f, 15.45f)
                lineToRelative(-3.22f, 1.94f)
                curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f)
                lineToRelative(0.85f, -3.66f)
                lineToRelative(-2.83f, -2.45f)
                curveToRelative(-0.33f, -0.29f, -0.15f, -0.84f, 0.29f, -0.88f)
                lineToRelative(3.74f, -0.32f)
                lineToRelative(1.46f, -3.45f)
                curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0.0f)
                lineToRelative(1.46f, 3.44f)
                lineToRelative(3.74f, 0.32f)
                curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f)
                lineToRelative(-2.83f, 2.45f)
                lineToRelative(0.85f, 3.67f)
                curveToRelative(0.1f, 0.43f, -0.36f, 0.77f, -0.74f, 0.54f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
