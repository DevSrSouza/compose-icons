package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ScubaDiving: ImageVector
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
                lineToRelative(4.53f, -1.21f)
                lineTo(12.64f, 6.0f)
                lineTo(8.11f, 7.21f)
                curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f)
                lineToRelative(0.0f, 0.0f)
                curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                close()
                moveTo(20.5f, 5.9f)
                lineTo(23.0f, 3.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-2.0f, 4.0f)
                lineToRelative(-9.48f, 2.87f)
                curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f)
                lineTo(5.24f, 18.0f)
                lineTo(2.4f, 21.8f)
                lineTo(4.0f, 23.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(1.14f, -3.14f)
                lineTo(14.0f, 14.0f)
                lineToRelative(5.0f, -3.5f)
                lineTo(20.5f, 5.9f)
                close()
            }
        }
        .build()
        return _scubaDiving!!
    }

private var _scubaDiving: ImageVector? = null
