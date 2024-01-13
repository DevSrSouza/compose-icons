package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Boehringeringelheim: ImageVector
    get() {
        if (_boehringeringelheim != null) {
            return _boehringeringelheim!!
        }
        _boehringeringelheim = Builder(name = "Boehringeringelheim", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.41f, 22.03f)
                curveToRelative(-1.72f, -1.24f, -2.63f, -2.15f, -3.49f, -3.46f)
                arcTo(12.185f, 12.185f, 0.0f, false, true, 0.0f, 12.03f)
                curveTo(0.0f, 5.38f, 5.36f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.73f, -0.93f, 5.46f, -2.58f, 7.48f)
                curveToRelative(-0.68f, 0.86f, -1.26f, 1.36f, -2.83f, 2.55f)
                verticalLineToRelative(-7.02f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(4.8f)
                curveToRelative(0.88f, -1.04f, 1.31f, -1.67f, 1.74f, -2.43f)
                curveToRelative(0.88f, -1.57f, 1.36f, -3.51f, 1.36f, -5.38f)
                curveToRelative(0.0f, -6.06f, -4.88f, -10.99f, -10.89f, -10.99f)
                reflectiveCurveTo(1.11f, 5.94f, 1.11f, 12.08f)
                curveToRelative(0.0f, 2.8f, 0.99f, 5.28f, 3.08f, 7.73f)
                verticalLineToRelative(-4.8f)
                lineTo(5.4f, 15.01f)
                verticalLineToRelative(7.02f)
                close()
                moveTo(7.78f, 23.24f)
                curveToRelative(-0.23f, -0.05f, -0.76f, -0.3f, -1.19f, -0.53f)
                lineTo(6.59f, 15.0f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(8.24f)
                close()
                moveTo(15.01f, 6.32f)
                lineTo(12.0f, 4.0f)
                lineTo(8.99f, 6.32f)
                lineToRelative(-0.66f, -0.86f)
                lineToRelative(3.66f, -2.86f)
                lineToRelative(3.66f, 2.86f)
                lineToRelative(-0.66f, 0.86f)
                close()
                moveTo(10.18f, 23.88f)
                curveToRelative(-0.43f, -0.08f, -0.45f, -0.08f, -0.61f, -0.13f)
                curveToRelative(-0.13f, -0.02f, -0.18f, -0.02f, -0.58f, -0.13f)
                lineTo(8.99f, 7.2f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(16.67f)
                close()
                moveTo(12.58f, 23.98f)
                curveToRelative(-0.18f, 0.02f, -0.23f, 0.02f, -0.48f, 0.02f)
                curveToRelative(-0.38f, 0.0f, -0.51f, 0.0f, -0.71f, -0.02f)
                lineTo(11.39f, 7.2f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(16.78f)
                close()
                moveTo(14.98f, 23.6f)
                curveToRelative(-0.38f, 0.13f, -0.71f, 0.2f, -1.19f, 0.3f)
                lineTo(13.79f, 7.2f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(16.4f)
                close()
                moveTo(17.41f, 22.72f)
                curveToRelative(-0.38f, 0.18f, -0.61f, 0.28f, -1.21f, 0.56f)
                verticalLineToRelative(-8.27f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(7.71f)
                close()
            }
        }
        .build()
        return _boehringeringelheim!!
    }

private var _boehringeringelheim: ImageVector? = null
