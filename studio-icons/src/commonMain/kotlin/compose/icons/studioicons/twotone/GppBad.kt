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

public val TwotoneGroup.GppBad: ImageVector
    get() {
        if (_gppBad != null) {
            return _gppBad!!
        }
        _gppBad = Builder(name = "GppBad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(6.09f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(18.0f, 11.09f)
                curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f)
                curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f)
                verticalLineToRelative(-4.7f)
                lineToRelative(6.0f, -2.25f)
                lineToRelative(6.0f, 2.25f)
                verticalLineTo(11.09f)
                close()
                moveTo(9.91f, 8.5f)
                lineTo(8.5f, 9.91f)
                lineTo(10.59f, 12.0f)
                lineTo(8.5f, 14.09f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 13.42f)
                lineToRelative(2.09f, 2.08f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.42f, 12.0f)
                lineToRelative(2.08f, -2.09f)
                lineTo(14.09f, 8.5f)
                lineTo(12.0f, 10.59f)
                lineTo(9.91f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.39f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f)
                curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f)
                verticalLineToRelative(-4.7f)
                lineToRelative(-6.0f, -2.25f)
                lineTo(6.0f, 6.39f)
                close()
                moveTo(15.5f, 9.91f)
                lineTo(13.42f, 12.0f)
                lineToRelative(2.08f, 2.09f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 13.42f)
                lineTo(9.91f, 15.5f)
                lineTo(8.5f, 14.09f)
                lineTo(10.59f, 12.0f)
                lineTo(8.5f, 9.91f)
                lineTo(9.91f, 8.5f)
                lineTo(12.0f, 10.59f)
                lineToRelative(2.09f, -2.09f)
                lineTo(15.5f, 9.91f)
                close()
            }
        }
        .build()
        return _gppBad!!
    }

private var _gppBad: ImageVector? = null
