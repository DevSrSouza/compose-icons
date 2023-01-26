package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Rotate90DegreesCw: ImageVector
    get() {
        if (_rotate90DegreesCw != null) {
            return _rotate90DegreesCw!!
        }
        _rotate90DegreesCw = Builder(name = "Rotate90DegreesCw", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 19.37f)
                curveToRelative(3.03f, 3.03f, 7.67f, 3.44f, 11.15f, 1.25f)
                lineToRelative(-1.46f, -1.46f)
                curveToRelative(-2.66f, 1.43f, -6.04f, 1.03f, -8.28f, -1.21f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0.0f, -9.9f)
                curveTo(7.42f, 6.69f, 9.21f, 6.03f, 11.0f, 6.03f)
                verticalLineTo(9.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.01f)
                curveToRelative(-2.3f, 0.0f, -4.61f, 0.87f, -6.36f, 2.63f)
                curveTo(1.12f, 10.15f, 1.12f, 15.85f, 4.64f, 19.37f)
                close()
                moveTo(11.0f, 13.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(11.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rotate90DegreesCw!!
    }

private var _rotate90DegreesCw: ImageVector? = null
