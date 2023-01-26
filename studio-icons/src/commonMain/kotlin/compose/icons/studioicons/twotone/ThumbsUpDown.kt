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

public val TwotoneGroup.ThumbsUpDown: ImageVector
    get() {
        if (_thumbsUpDown != null) {
            return _thumbsUpDown!!
        }
        _thumbsUpDown = Builder(name = "ThumbsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.82f, 5.0f)
                lineToRelative(0.66f, -3.18f)
                lineToRelative(0.02f, -0.23f)
                curveToRelative(0.0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f)
                lineTo(5.38f, 0.0f)
                lineTo(0.44f, 4.94f)
                curveTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.62f, 0.0f, 1.15f, -0.38f, 1.38f, -0.91f)
                lineToRelative(2.26f, -5.29f)
                curveToRelative(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(10.0f, 7.13f)
                lineTo(7.92f, 12.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 6.21f)
                lineToRelative(1.93f, -1.93f)
                lineTo(3.36f, 7.0f)
                lineTo(10.0f, 7.0f)
                verticalLineToRelative(0.13f)
                close()
                moveTo(22.5f, 10.0f)
                horizontalLineToRelative(-6.75f)
                curveToRelative(-0.62f, 0.0f, -1.15f, 0.38f, -1.38f, 0.91f)
                lineToRelative(-2.26f, 5.29f)
                curveToRelative(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f)
                lineTo(12.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.18f)
                lineToRelative(-0.66f, 3.18f)
                lineToRelative(-0.02f, 0.24f)
                curveToRelative(0.0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f)
                lineToRelative(0.79f, 0.78f)
                lineToRelative(4.94f, -4.94f)
                curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 17.79f)
                lineToRelative(-1.93f, 1.93f)
                lineToRelative(0.57f, -2.72f)
                lineTo(14.0f, 17.0f)
                verticalLineToRelative(-0.13f)
                lineTo(16.08f, 12.0f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(5.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.93f, 4.28f)
                lineTo(2.0f, 6.21f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(5.92f)
                lineTo(10.0f, 7.13f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.36f)
                close()
                moveTo(14.0f, 16.87f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(6.64f)
                lineToRelative(-0.57f, 2.72f)
                lineTo(22.0f, 17.79f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-5.92f)
                close()
            }
        }
        .build()
        return _thumbsUpDown!!
    }

private var _thumbsUpDown: ImageVector? = null
