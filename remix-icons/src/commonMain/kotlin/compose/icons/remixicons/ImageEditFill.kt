package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ImageEditFill: ImageVector
    get() {
        if (_imageEditFill != null) {
            return _imageEditFill!!
        }
        _imageEditFill = Builder(name = "ImageEditFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.757f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(8.1f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.328f, 4.329f)
                lineToRelative(-1.327f, 1.327f)
                lineToRelative(-0.006f, 4.239f)
                lineToRelative(4.246f, 0.006f)
                lineToRelative(1.33f, -1.33f)
                lineTo(18.899f, 19.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(-2.758f)
                lineToRelative(2.0f, -2.0f)
                lineTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(21.778f, 7.808f)
                lineToRelative(1.414f, 1.414f)
                lineTo(15.414f, 17.0f)
                lineToRelative(-1.416f, -0.002f)
                lineToRelative(0.002f, -1.412f)
                lineToRelative(7.778f, -7.778f)
                close()
                moveTo(15.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(14.0f, 9.328f, 14.0f, 8.5f)
                reflectiveCurveTo(14.672f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return _imageEditFill!!
    }

private var _imageEditFill: ImageVector? = null
