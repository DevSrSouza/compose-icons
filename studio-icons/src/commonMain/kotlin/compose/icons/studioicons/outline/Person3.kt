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

public val OutlineGroup.Person3: ImageVector
    get() {
        if (_person3 != null) {
            return _person3!!
        }
        _person3 = Builder(name = "Person3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 14.56f)
                curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                curveTo(7.71f, 15.73f, 9.63f, 15.0f, 12.0f, 15.0f)
                curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f)
                curveTo(17.8f, 16.5f, 18.0f, 16.84f, 18.0f, 17.22f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveToRelative(0.17f, 0.0f, 3.83f, 0.0f, 4.0f, 0.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.73f, -0.27f, -1.4f, -0.71f, -1.92f)
                curveTo(16.42f, 6.75f, 16.5f, 6.38f, 16.5f, 6.0f)
                curveToRelative(0.0f, -1.25f, -0.77f, -2.32f, -1.86f, -2.77f)
                curveTo(14.0f, 2.48f, 13.06f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, 0.48f, -2.64f, 1.23f)
                curveTo(8.27f, 3.68f, 7.5f, 4.75f, 7.5f, 6.0f)
                curveToRelative(0.0f, 0.38f, 0.08f, 0.75f, 0.21f, 1.08f)
                curveTo(7.27f, 7.6f, 7.0f, 8.27f, 7.0f, 9.0f)
                curveTo(7.0f, 10.66f, 8.34f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(9.24f, 8.37f)
                curveTo(10.11f, 7.33f, 9.5f, 6.37f, 9.5f, 6.0f)
                curveToRelative(0.0f, -0.41f, 0.24f, -0.77f, 0.62f, -0.92f)
                curveToRelative(0.29f, -0.12f, 0.55f, -0.31f, 0.75f, -0.54f)
                curveTo(11.04f, 4.33f, 11.42f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(0.96f, 0.33f, 1.13f, 0.53f)
                curveToRelative(0.2f, 0.24f, 0.46f, 0.42f, 0.75f, 0.54f)
                curveTo(14.26f, 5.23f, 14.5f, 5.59f, 14.5f, 6.0f)
                curveToRelative(0.0f, 0.37f, -0.61f, 1.33f, 0.26f, 2.37f)
                curveTo(15.34f, 9.06f, 14.8f, 10.0f, 14.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.2f, 10.0f, 8.66f, 9.06f, 9.24f, 8.37f)
                close()
            }
        }
        .build()
        return _person3!!
    }

private var _person3: ImageVector? = null
