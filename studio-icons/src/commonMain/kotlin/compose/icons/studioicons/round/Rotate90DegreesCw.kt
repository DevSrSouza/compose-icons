package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Rotate90DegreesCw: ImageVector
    get() {
        if (_rotate90DegreesCw != null) {
            return _rotate90DegreesCw!!
        }
        _rotate90DegreesCw = Builder(name = "Rotate90DegreesCw", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.86f, 18.46f)
                curveToRelative(2.65f, 3.45f, 7.11f, 4.37f, 10.74f, 2.79f)
                curveToRelative(0.61f, -0.27f, 0.74f, -1.09f, 0.27f, -1.56f)
                lineToRelative(-0.05f, -0.05f)
                curveToRelative(-0.29f, -0.29f, -0.72f, -0.35f, -1.1f, -0.19f)
                curveToRelative(-2.96f, 1.24f, -6.59f, 0.37f, -8.58f, -2.62f)
                curveToRelative(-1.58f, -2.37f, -1.55f, -5.37f, 0.05f, -7.73f)
                curveTo(6.6f, 7.03f, 8.8f, 6.03f, 11.0f, 6.03f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.86f, 0.36f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(-2.8f, -2.79f)
                curveTo(11.54f, 1.54f, 11.0f, 1.76f, 11.0f, 2.21f)
                verticalLineToRelative(1.8f)
                curveToRelative(-2.76f, 0.0f, -5.52f, 1.25f, -7.34f, 3.78f)
                curveTo(1.38f, 10.96f, 1.46f, 15.37f, 3.86f, 18.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7f, 7.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-4.59f, 4.58f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(17.7f, 7.71f)
                close()
            }
        }
        .build()
        return _rotate90DegreesCw!!
    }

private var _rotate90DegreesCw: ImageVector? = null
