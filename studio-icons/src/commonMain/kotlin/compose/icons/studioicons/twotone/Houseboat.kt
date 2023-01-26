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

public val TwotoneGroup.Houseboat: ImageVector
    get() {
        if (_houseboat != null) {
            return _houseboat!!
        }
        _houseboat = Builder(name = "Houseboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -4.82f)
                lineToRelative(3.0f, -2.2f)
                lineToRelative(3.0f, 2.2f)
                lineToRelative(0.0f, 4.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveTo(3.38f, 16.0f, 3.24f, 17.0f, 2.0f, 17.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f)
                reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f)
                curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.18f, 0.0f, 1.45f, 1.0f, 3.35f, 1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f)
                curveTo(14.1f, 17.0f, 13.95f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(20.34f, 11.34f)
                lineToRelative(-1.37f, 1.37f)
                curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.65f)
                lineToRelative(1.32f, 0.97f)
                lineTo(19.5f, 9.0f)
                lineTo(12.0f, 3.5f)
                lineTo(4.5f, 9.0f)
                lineToRelative(1.18f, 1.61f)
                lineTo(7.0f, 9.65f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.74f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-1.37f, -1.37f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.37f, 1.37f)
                curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f)
                horizontalLineToRelative(12.51f)
                curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(1.37f, -1.37f)
                lineTo(20.34f, 11.34f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.18f)
                lineToRelative(3.0f, -2.2f)
                lineToRelative(3.0f, 2.2f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _houseboat!!
    }

private var _houseboat: ImageVector? = null
