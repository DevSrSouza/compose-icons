package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Barbell: ImageVector
    get() {
        if (_barbell != null) {
            return _barbell!!
        }
        _barbell = Builder(name = "Barbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.0f, 176.0f)
                arcToRelative(29.94f, 29.94f, 0.0f, false, false, -25.32f, 12.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.64f, -1.14f)
                verticalLineTo(150.71f)
                curveToRelative(0.0f, -20.75f, -16.34f, -38.21f, -37.08f, -38.7f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 362.0f, 150.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(150.71f)
                curveToRelative(0.0f, -20.75f, -16.34f, -38.21f, -37.08f, -38.7f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 74.0f, 150.0f)
                verticalLineToRelative(37.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.64f, 1.14f)
                arcTo(29.94f, 29.94f, 0.0f, false, false, 45.0f, 176.0f)
                curveToRelative(-16.3f, 0.51f, -29.0f, 14.31f, -29.0f, 30.62f)
                verticalLineToRelative(98.72f)
                curveToRelative(0.0f, 16.31f, 12.74f, 30.11f, 29.0f, 30.62f)
                arcToRelative(29.94f, 29.94f, 0.0f, false, false, 25.32f, -12.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 74.0f, 324.62f)
                verticalLineToRelative(36.67f)
                curveTo(74.0f, 382.0f, 90.34f, 399.5f, 111.08f, 400.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 150.0f, 362.0f)
                verticalLineTo(280.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(360.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(81.29f)
                curveToRelative(0.0f, 20.75f, 16.34f, 38.21f, 37.08f, 38.7f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 438.0f, 362.0f)
                verticalLineTo(324.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.64f, -1.14f)
                arcTo(29.94f, 29.94f, 0.0f, false, false, 467.0f, 336.0f)
                curveToRelative(16.3f, -0.51f, 29.0f, -14.31f, 29.0f, -30.62f)
                verticalLineTo(206.64f)
                curveTo(496.0f, 190.33f, 483.26f, 176.53f, 467.0f, 176.0f)
                close()
            }
        }
        .build()
        return _barbell!!
    }

private var _barbell: ImageVector? = null
