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

public val RoundGroup.Swipe: ImageVector
    get() {
        if (_swipe != null) {
            return _swipe!!
        }
        _swipe = Builder(name = "Swipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.15f, 2.85f)
                lineToRelative(-1.02f, 1.02f)
                curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f)
                lineTo(2.85f, 2.85f)
                curveTo(2.54f, 2.54f, 2.0f, 2.76f, 2.0f, 3.21f)
                verticalLineTo(6.5f)
                curveTo(2.0f, 6.78f, 2.22f, 7.0f, 2.5f, 7.0f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(4.93f, 4.93f)
                curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f)
                reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f)
                lineToRelative(-1.22f, 1.22f)
                curveTo(17.54f, 6.46f, 17.76f, 7.0f, 18.21f, 7.0f)
                horizontalLineToRelative(3.29f)
                curveTo(21.78f, 7.0f, 22.0f, 6.78f, 22.0f, 6.5f)
                verticalLineTo(3.21f)
                curveTo(22.0f, 2.76f, 21.46f, 2.54f, 21.15f, 2.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.71f)
                curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-6.0f)
                curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f)
                verticalLineToRelative(10.74f)
                lineToRelative(-3.44f, -0.72f)
                curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0.01f, 1.58f)
                lineToRelative(4.01f, 4.01f)
                curveTo(9.92f, 22.79f, 10.43f, 23.0f, 10.96f, 23.0f)
                horizontalLineToRelative(6.41f)
                curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f)
                lineToRelative(0.63f, -4.46f)
                curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f)
                lineTo(14.5f, 12.71f)
                close()
            }
        }
        .build()
        return _swipe!!
    }

private var _swipe: ImageVector? = null
