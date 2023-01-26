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

public val RoundGroup.AddHome: ImageVector
    get() {
        if (_addHome != null) {
            return _addHome!!
        }
        _addHome = Builder(name = "AddHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.53f, 11.16f)
                curveToRelative(1.23f, -0.26f, 2.4f, -0.18f, 3.47f, 0.14f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6.0f, -4.5f)
                curveToRelative(-0.71f, -0.53f, -1.69f, -0.53f, -2.4f, 0.0f)
                lineToRelative(-6.0f, 4.5f)
                curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.61f, -1.28f, -0.86f, -2.77f, -0.55f, -4.35f)
                curveTo(11.65f, 13.93f, 13.82f, 11.74f, 16.53f, 11.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(21.0f, 18.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _addHome!!
    }

private var _addHome: ImageVector? = null
