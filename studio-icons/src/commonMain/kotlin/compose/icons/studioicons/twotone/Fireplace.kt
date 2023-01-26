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

public val TwotoneGroup.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.23f)
                curveToRelative(-0.75f, -0.93f, -1.2f, -2.04f, -1.23f, -3.0f)
                curveToRelative(-0.02f, -0.53f, -0.73f, -4.43f, 6.0f, -8.0f)
                curveToRelative(0.0f, 0.0f, -0.8f, 2.61f, 2.15f, 4.63f)
                curveTo(15.91f, 12.15f, 17.0f, 13.11f, 17.0f, 15.0f)
                curveToRelative(0.0f, 1.13f, -0.39f, 2.16f, -1.02f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 12.46f)
                curveToRelative(-0.15f, 0.42f, -0.15f, 0.82f, -0.08f, 1.28f)
                curveToRelative(0.1f, 0.55f, 0.33f, 1.04f, 0.2f, 1.6f)
                curveToRelative(-0.13f, 0.59f, -0.77f, 1.38f, -1.53f, 1.63f)
                curveToRelative(1.28f, 1.05f, 3.2f, 0.37f, 3.39f, -1.32f)
                curveTo(14.16f, 14.11f, 12.55f, 13.67f, 12.01f, 12.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.58f, 0.0f, -2.97f, -1.88f, -3.0f, -3.06f)
                curveToRelative(0.0f, -0.05f, -0.01f, -0.13f, -0.01f, -0.22f)
                curveToRelative(-0.13f, -1.73f, 1.0f, -3.2f, 2.47f, -4.37f)
                curveToRelative(0.47f, 1.01f, 1.27f, 2.03f, 2.57f, 2.92f)
                curveTo(14.61f, 13.69f, 15.0f, 14.13f, 15.0f, 15.0f)
                curveTo(15.0f, 16.65f, 13.65f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3.0f)
                curveToRelative(0.0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f)
                curveTo(12.2f, 9.61f, 13.0f, 7.0f, 13.0f, 7.0f)
                curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6.0f, 8.0f)
                curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
