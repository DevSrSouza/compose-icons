package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SportsMotorsports: ImageVector
    get() {
        if (_sportsMotorsports != null) {
            return _sportsMotorsports!!
        }
        _sportsMotorsports = Builder(name = "SportsMotorsports", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.56f, 6.0f)
                curveToRelative(-0.15f, 0.0f, -0.29f, 0.0f, -0.44f, 0.01f)
                curveToRelative(-1.45f, 0.1f, -2.72f, 0.43f, -3.82f, 0.99f)
                lineToRelative(2.5f, 1.06f)
                curveToRelative(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f)
                curveToRelative(0.0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f)
                horizontalLineTo(4.24f)
                curveTo(4.01f, 16.28f, 4.0f, 17.19f, 4.0f, 17.2f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.68f, 0.0f, 3.3f, -0.71f, 4.44f, -1.96f)
                curveToRelative(1.15f, -1.27f, 1.7f, -2.91f, 1.54f, -4.63f)
                curveTo(19.69f, 8.37f, 16.87f, 6.0f, 13.56f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.96f, 11.22f)
                curveTo(21.57f, 7.01f, 17.76f, 4.0f, 13.56f, 4.0f)
                curveToRelative(-0.19f, 0.0f, -0.38f, 0.01f, -0.57f, 0.02f)
                curveTo(2.0f, 4.74f, 2.0f, 17.2f, 2.0f, 17.2f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f)
                close()
                moveTo(5.26f, 11.56f)
                curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f)
                lineToRelative(3.62f, 1.53f)
                curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f)
                curveToRelative(0.0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f)
                horizontalLineTo(4.72f)
                curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f)
                close()
                moveTo(18.44f, 16.04f)
                curveTo(17.3f, 17.29f, 15.68f, 18.0f, 14.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0.0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f)
                horizontalLineToRelative(6.15f)
                curveToRelative(1.99f, 0.0f, 3.61f, -1.62f, 3.61f, -3.61f)
                curveToRelative(0.0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f)
                lineTo(9.3f, 7.01f)
                curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f)
                curveTo(13.27f, 6.0f, 13.42f, 6.0f, 13.56f, 6.0f)
                curveToRelative(3.31f, 0.0f, 6.13f, 2.37f, 6.41f, 5.41f)
                curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f)
                close()
            }
        }
        .build()
        return _sportsMotorsports!!
    }

private var _sportsMotorsports: ImageVector? = null
