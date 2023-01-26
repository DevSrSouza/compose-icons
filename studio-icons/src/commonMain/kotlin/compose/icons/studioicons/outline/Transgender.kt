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

public val OutlineGroup.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(10.07f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(16.53f, 8.38f)
                lineToRelative(3.97f, -3.96f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(14.23f, 6.36f, 13.16f, 6.0f, 12.0f, 6.0f)
                curveToRelative(-1.16f, 0.0f, -2.23f, 0.36f, -3.11f, 0.97f)
                lineTo(8.24f, 6.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(8.24f, 3.49f)
                lineTo(6.82f, 4.9f)
                lineTo(4.92f, 3.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.42f)
                lineToRelative(1.91f, 1.9f)
                lineTo(3.99f, 7.74f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.65f, 0.65f)
                curveTo(6.86f, 9.27f, 6.5f, 10.34f, 6.5f, 11.5f)
                curveToRelative(0.0f, 2.7f, 1.94f, 4.94f, 4.5f, 5.41f)
                lineTo(11.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.0f, -2.09f)
                curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.41f)
                curveTo(17.5f, 10.34f, 17.14f, 9.27f, 16.53f, 8.38f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
