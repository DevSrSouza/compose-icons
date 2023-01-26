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

public val RoundGroup.NoMeals: ImageVector
    get() {
        if (_noMeals != null) {
            return _noMeals!!
        }
        _noMeals = Builder(name = "NoMeals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.49f, 1.6f, -3.32f, 3.76f, -3.85f)
                curveTo(20.39f, 2.0f, 21.0f, 2.48f, 21.0f, 3.13f)
                verticalLineTo(18.17f)
                close()
                moveTo(21.19f, 22.61f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-9.76f, -9.76f)
                curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(18.38f, 18.38f)
                curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f)
                close()
                moveTo(6.17f, 9.0f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.17f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.17f)
                lineToRelative(1.85f, 1.85f)
                curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(7.0f, 2.45f, 7.0f, 3.0f)
                verticalLineToRelative(1.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _noMeals!!
    }

private var _noMeals: ImageVector? = null
