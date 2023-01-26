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

public val OutlineGroup.Swipe: ImageVector
    get() {
        if (_swipe != null) {
            return _swipe!!
        }
        _swipe = Builder(name = "Swipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 2.0f)
                verticalLineToRelative(2.02f)
                curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(5.82f, 2.13f, 3.5f, 4.02f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(4.09f)
                curveToRelative(2.11f, -1.86f, 4.88f, -3.0f, 7.91f, -3.0f)
                reflectiveCurveToRelative(5.79f, 1.14f, 7.91f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.89f, 13.77f)
                lineToRelative(-3.8f, -1.67f)
                curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f)
                horizontalLineTo(14.0f)
                lineToRelative(0.0f, -4.37f)
                curveToRelative(0.0f, -1.32f, -0.96f, -2.5f, -2.27f, -2.62f)
                curveTo(10.25f, 4.88f, 9.0f, 6.05f, 9.0f, 7.5f)
                verticalLineToRelative(8.15f)
                lineToRelative(-1.87f, -0.4f)
                curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f)
                lineTo(4.0f, 17.22f)
                lineToRelative(5.12f, 5.19f)
                curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f)
                lineToRelative(0.92f, -5.44f)
                curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f)
                close()
                moveTo(18.0f, 15.56f)
                lineTo(17.08f, 21.0f)
                horizontalLineToRelative(-6.55f)
                lineToRelative(-3.7f, -3.78f)
                lineTo(11.0f, 18.11f)
                verticalLineTo(7.5f)
                curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f)
                verticalLineToRelative(6.18f)
                horizontalLineToRelative(1.76f)
                lineTo(18.0f, 15.56f)
                close()
            }
        }
        .build()
        return _swipe!!
    }

private var _swipe: ImageVector? = null
