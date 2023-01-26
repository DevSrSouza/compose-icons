package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PestControl: ImageVector
    get() {
        if (_pestControl != null) {
            return _pestControl!!
        }
        _pestControl = Builder(name = "PestControl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.07f)
                curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f)
                lineToRelative(2.58f, -1.49f)
                lineToRelative(-1.0f, -1.73f)
                lineTo(16.92f, 10.0f)
                curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f)
                curveToRelative(0.1f, -0.56f, 0.2f, -1.69f, -0.58f, -2.89f)
                lineTo(17.0f, 4.17f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f)
                lineTo(8.41f, 2.76f)
                lineTo(7.0f, 4.17f)
                lineToRelative(1.65f, 1.65f)
                curveToRelative(-0.78f, 1.2f, -0.68f, 2.34f, -0.58f, 2.89f)
                curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f)
                lineTo(4.71f, 8.63f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(2.58f, 1.49f)
                curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.07f)
                curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f)
                lineToRelative(-2.58f, 1.49f)
                lineToRelative(1.0f, 1.73f)
                lineTo(7.08f, 18.0f)
                curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f)
                reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f)
                lineToRelative(2.37f, 1.37f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-2.58f, -1.49f)
                curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.88f, 0.0f, 1.62f, 0.57f, 1.88f, 1.36f)
                curveTo(13.29f, 7.13f, 12.66f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(-1.29f, 0.13f, -1.88f, 0.36f)
                curveTo(10.38f, 6.57f, 11.12f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -2.24f, -4.0f, -5.0f)
                reflectiveCurveToRelative(1.79f, -5.0f, 4.0f, -5.0f)
                reflectiveCurveToRelative(4.0f, 2.24f, 4.0f, 5.0f)
                reflectiveCurveTo(14.21f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _pestControl!!
    }

private var _pestControl: ImageVector? = null
