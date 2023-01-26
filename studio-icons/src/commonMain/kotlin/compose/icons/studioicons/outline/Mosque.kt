package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f)
                curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.95f, -0.66f, -1.74f, -1.55f, -1.94f)
                curveTo(17.79f, 8.48f, 18.0f, 7.81f, 18.0f, 7.09f)
                curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f)
                lineTo(12.0f, 1.0f)
                lineTo(7.74f, 3.84f)
                curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f)
                curveToRelative(0.0f, 0.72f, 0.21f, 1.39f, 0.55f, 1.96f)
                curveTo(5.66f, 9.26f, 5.0f, 10.05f, 5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.72f)
                curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f)
                curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(8.72f)
                curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f)
                close()
                moveTo(8.85f, 5.5f)
                lineTo(12.0f, 3.4f)
                lineToRelative(3.15f, 2.1f)
                curveTo(15.68f, 5.86f, 16.0f, 6.45f, 16.0f, 7.09f)
                curveTo(16.0f, 8.14f, 15.14f, 9.0f, 14.09f, 9.0f)
                horizontalLineTo(9.91f)
                curveTo(8.86f, 9.0f, 8.0f, 8.14f, 8.0f, 7.09f)
                curveTo(8.0f, 6.45f, 8.32f, 5.86f, 8.85f, 5.5f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
