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

public val OutlineGroup.Earbuds: ImageVector
    get() {
        if (_earbuds != null) {
            return _earbuds!!
        }
        _earbuds = Builder(name = "Earbuds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(0.83f)
                curveTo(7.44f, 9.0f, 8.89f, 7.82f, 9.0f, 6.21f)
                curveToRelative(0.12f, -1.69f, -1.16f, -3.1f, -2.8f, -3.21f)
                curveTo(4.44f, 2.89f, 3.0f, 4.42f, 3.0f, 6.19f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-0.83f)
                curveToRelative(-1.61f, 0.0f, -3.06f, 1.18f, -3.17f, 2.79f)
                curveToRelative(-0.12f, 1.69f, 1.16f, 3.1f, 2.8f, 3.21f)
                curveToRelative(1.76f, 0.12f, 3.2f, -1.42f, 3.2f, -3.18f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 5.24f, 18.76f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(6.55f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(19.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _earbuds!!
    }

private var _earbuds: ImageVector? = null
