package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Sanitizer: ImageVector
    get() {
        if (_sanitizer != null) {
            return _sanitizer!!
        }
        _sanitizer = Builder(name = "Sanitizer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 6.5f)
                curveToRelative(0.0f, -0.56f, 0.67f, -1.49f, 1.11f, -2.04f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.25f, 0.77f, 0.0f)
                curveToRelative(0.44f, 0.55f, 1.11f, 1.48f, 1.11f, 2.04f)
                curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                close()
                moveTo(19.5f, 15.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.25f, -1.41f, -3.16f, -2.11f, -4.04f)
                curveToRelative(-0.2f, -0.25f, -0.57f, -0.25f, -0.77f, 0.0f)
                curveTo(18.41f, 9.34f, 17.0f, 11.25f, 17.0f, 12.5f)
                curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(13.0f, 14.45f, 12.55f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 4.0f, 7.0f, 3.55f, 7.0f, 3.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.61f, 0.0f, 1.19f, 0.11f, 1.72f, 0.31f)
                curveToRelative(0.67f, 0.25f, 0.83f, 1.13f, 0.33f, 1.64f)
                lineToRelative(0.0f, 0.0f)
                curveTo(14.77f, 4.23f, 14.36f, 4.31f, 14.0f, 4.18f)
                curveTo(13.68f, 4.06f, 13.35f, 4.0f, 13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.09f)
                curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sanitizer!!
    }

private var _sanitizer: ImageVector? = null
