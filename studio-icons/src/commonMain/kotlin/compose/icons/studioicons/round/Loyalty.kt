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

public val RoundGroup.Loyalty: ImageVector
    get() {
        if (_loyalty != null) {
            return _loyalty!!
        }
        _loyalty = Builder(name = "Loyalty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.58f)
                lineToRelative(-9.0f, -9.0f)
                curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f)
                lineToRelative(9.0f, 9.0f)
                curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f)
                close()
                moveTo(5.5f, 7.0f)
                curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f)
                reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f)
                reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f)
                close()
                moveTo(17.27f, 15.27f)
                lineToRelative(-3.92f, 3.92f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(-3.92f, -3.92f)
                curveToRelative(-0.57f, -0.58f, -0.87f, -1.43f, -0.67f, -2.34f)
                curveToRelative(0.19f, -0.88f, 0.89f, -1.61f, 1.76f, -1.84f)
                curveToRelative(0.94f, -0.25f, 1.85f, 0.04f, 2.44f, 0.65f)
                lineToRelative(0.75f, 0.72f)
                lineToRelative(0.73f, -0.73f)
                curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f)
                close()
            }
        }
        .build()
        return _loyalty!!
    }

private var _loyalty: ImageVector? = null
