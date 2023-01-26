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

public val BaselineGroup.Wash: ImageVector
    get() {
        if (_wash != null) {
            return _wash!!
        }
        _wash = Builder(name = "Wash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.0f)
                curveTo(19.88f, 8.0f, 21.0f, 6.88f, 21.0f, 5.5f)
                curveTo(21.0f, 3.83f, 18.5f, 1.0f, 18.5f, 1.0f)
                reflectiveCurveTo(16.0f, 3.83f, 16.0f, 5.5f)
                curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f)
                curveTo(15.0f, 6.66f, 13.5f, 5.0f, 13.5f, 5.0f)
                reflectiveCurveTo(12.0f, 6.66f, 12.0f, 7.5f)
                curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f)
                close()
                moveTo(9.12f, 5.0f)
                lineToRelative(-7.18f, 6.79f)
                curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.25f)
                horizontalLineTo(12.0f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveTo(19.44f, 10.0f, 18.75f, 10.0f)
                horizontalLineTo(8.86f)
                curveToRelative(0.64f, -1.11f, 1.48f, -2.58f, 1.49f, -2.61f)
                curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f)
                curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                curveTo(10.22f, 6.12f, 9.12f, 5.0f, 9.12f, 5.0f)
                lineTo(9.12f, 5.0f)
                close()
            }
        }
        .build()
        return _wash!!
    }

private var _wash: ImageVector? = null
