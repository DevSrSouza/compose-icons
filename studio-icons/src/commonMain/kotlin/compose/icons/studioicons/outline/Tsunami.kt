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

public val OutlineGroup.Tsunami: ImageVector
    get() {
        if (_tsunami != null) {
            return _tsunami!!
        }
        _tsunami = Builder(name = "Tsunami", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.67f, 17.63f)
                curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0.0f)
                curveToRelative(-0.66f, 0.49f, -2.92f, 2.76f, -6.67f, 0.0f)
                curveTo(3.43f, 19.03f, 2.65f, 19.0f, 2.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.16f, 0.0f, 2.3f, -0.32f, 3.33f, -0.93f)
                curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f)
                curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f)
                curveTo(19.7f, 20.68f, 20.84f, 21.0f, 22.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                curveTo(21.34f, 19.0f, 20.5f, 18.98f, 18.67f, 17.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.33f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.67f)
                curveTo(17.5f, 10.0f, 16.0f, 8.5f, 16.0f, 6.67f)
                curveToRelative(0.0f, -1.02f, 0.38f, -1.74f, 1.09f, -3.34f)
                curveTo(15.72f, 3.12f, 15.09f, 3.0f, 14.0f, 3.0f)
                curveTo(7.36f, 3.0f, 2.15f, 8.03f, 2.01f, 14.5f)
                curveToRelative(0.0f, 0.0f, -0.01f, 2.0f, -0.01f, 2.0f)
                curveToRelative(1.16f, 0.0f, 2.3f, -0.32f, 3.33f, -0.93f)
                curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f)
                curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f)
                curveToRelative(1.03f, 0.61f, 2.17f, 0.93f, 3.33f, 0.93f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.66f, 0.0f, -1.5f, -0.02f, -3.33f, -1.37f)
                curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0.0f)
                curveToRelative(-0.9f, 0.67f, -0.54f, 0.41f, -0.91f, 0.63f)
                curveTo(10.39f, 12.82f, 10.0f, 11.7f, 10.0f, 10.5f)
                curveToRelative(0.0f, -2.58f, 1.77f, -4.74f, 4.21f, -5.33f)
                curveTo(14.08f, 5.68f, 14.0f, 6.19f, 14.0f, 6.67f)
                curveTo(14.0f, 9.61f, 16.39f, 12.0f, 19.33f, 12.0f)
                close()
                moveTo(5.33f, 13.13f)
                curveToRelative(-0.62f, 0.46f, -0.82f, 0.63f, -1.3f, 0.87f)
                curveToRelative(0.27f, -3.53f, 2.38f, -6.48f, 5.43f, -7.96f)
                curveTo(8.54f, 7.29f, 8.0f, 8.83f, 8.0f, 10.5f)
                curveToRelative(0.0f, 1.42f, 0.4f, 2.77f, 1.13f, 3.95f)
                curveTo(8.41f, 14.52f, 7.34f, 14.6f, 5.33f, 13.13f)
                close()
            }
        }
        .build()
        return _tsunami!!
    }

private var _tsunami: ImageVector? = null
