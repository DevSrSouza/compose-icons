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

public val RoundGroup.NoCrash: ImageVector
    get() {
        if (_noCrash != null) {
            return _noCrash!!
        }
        _noCrash = Builder(name = "NoCrash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                lineToRelative(-1.97f, -5.67f)
                curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f)
                horizontalLineToRelative(-11.0f)
                curveTo(5.84f, 8.0f, 5.29f, 8.42f, 5.08f, 9.01f)
                lineToRelative(-1.97f, 5.67f)
                curveTo(3.04f, 14.89f, 3.0f, 15.11f, 3.0f, 15.34f)
                verticalLineToRelative(7.16f)
                curveTo(3.0f, 23.33f, 3.68f, 24.0f, 4.5f, 24.0f)
                reflectiveCurveTo(6.0f, 23.33f, 6.0f, 22.5f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveTo(18.0f, 23.33f, 18.67f, 24.0f, 19.5f, 24.0f)
                close()
                moveTo(6.85f, 10.0f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3.0f)
                horizontalLineTo(5.81f)
                lineTo(6.85f, 10.0f)
                close()
                moveTo(6.0f, 17.5f)
                curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f)
                reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f)
                reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f)
                reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f)
                close()
                moveTo(16.24f, 0.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-3.54f, 3.54f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(9.88f, 4.24f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(12.0f, 3.54f)
                lineToRelative(2.83f, -2.83f)
                curveTo(15.22f, 0.32f, 15.85f, 0.32f, 16.24f, 0.71f)
                close()
            }
        }
        .build()
        return _noCrash!!
    }

private var _noCrash: ImageVector? = null
