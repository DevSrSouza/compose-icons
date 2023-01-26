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

public val TwotoneGroup.FilterFrames: ImageVector
    get() {
        if (_filterFrames != null) {
            return _filterFrames!!
        }
        _filterFrames = Builder(name = "FilterFrames", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(4.52f)
                lineToRelative(3.52f, -3.5f)
                lineTo(15.52f, 6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _filterFrames!!
    }

private var _filterFrames: ImageVector? = null