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

public val OutlineGroup.BusAlert: ImageVector
    get() {
        if (_busAlert != null) {
            return _busAlert!!
        }
        _busAlert = Builder(name = "BusAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(7.29f)
                curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f)
                horizontalLineTo(4.43f)
                curveToRelative(0.83f, -0.71f, 2.98f, -1.09f, 6.65f, -0.98f)
                curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f)
                curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.95f, 0.38f, 1.81f, 1.0f, 2.44f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0.62f, -0.63f, 1.0f, -1.49f, 1.0f, -2.44f)
                verticalLineTo(13.0f)
                curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f)
                close()
                moveTo(18.5f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _busAlert!!
    }

private var _busAlert: ImageVector? = null
