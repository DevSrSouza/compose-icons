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

public val BaselineGroup.NoMeals: ImageVector
    get() {
        if (_noMeals != null) {
            return _noMeals!!
        }
        _noMeals = Builder(name = "NoMeals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.76f, 2.24f, -4.0f, 5.0f, -4.0f)
                verticalLineToRelative(16.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(10.02f, 12.85f)
                curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineTo(5.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(6.17f, 9.0f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.17f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.17f)
                lineToRelative(1.85f, 1.85f)
                curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _noMeals!!
    }

private var _noMeals: ImageVector? = null
