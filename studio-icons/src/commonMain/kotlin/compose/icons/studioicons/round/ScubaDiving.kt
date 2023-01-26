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

public val RoundGroup.ScubaDiving: ImageVector
    get() {
        if (_scubaDiving != null) {
            return _scubaDiving!!
        }
        _scubaDiving = Builder(name = "ScubaDiving", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 13.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f)
                close()
                moveTo(8.89f, 10.11f)
                lineToRelative(3.56f, -0.95f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.22f)
                lineTo(12.9f, 6.97f)
                curveToRelative(-0.14f, -0.53f, -0.69f, -0.85f, -1.22f, -0.71f)
                lineTo(8.11f, 7.21f)
                curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f)
                lineToRelative(0.0f, 0.0f)
                curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                close()
                moveTo(22.52f, 2.52f)
                curveToRelative(-0.29f, -0.29f, -0.75f, -0.29f, -1.04f, 0.0f)
                lineTo(19.0f, 5.0f)
                lineToRelative(-2.0f, 4.0f)
                lineToRelative(-9.48f, 2.87f)
                curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f)
                lineTo(5.24f, 18.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                lineTo(7.0f, 19.0f)
                lineToRelative(1.14f, -3.14f)
                lineToRelative(5.57f, -1.77f)
                curveToRelative(0.19f, -0.06f, 0.38f, -0.15f, 0.54f, -0.27f)
                lineToRelative(4.2f, -2.94f)
                curveToRelative(0.36f, -0.25f, 0.62f, -0.61f, 0.75f, -1.02f)
                lineTo(20.5f, 5.9f)
                lineToRelative(2.06f, -2.38f)
                curveTo(22.81f, 3.22f, 22.79f, 2.79f, 22.52f, 2.52f)
                close()
            }
        }
        .build()
        return _scubaDiving!!
    }

private var _scubaDiving: ImageVector? = null
