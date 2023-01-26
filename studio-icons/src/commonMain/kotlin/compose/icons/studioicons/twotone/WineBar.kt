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

public val TwotoneGroup.WineBar: ImageVector
    get() {
        if (_wineBar != null) {
            return _wineBar!!
        }
        _wineBar = Builder(name = "WineBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.86f, 0.0f, -3.41f, -1.28f, -3.86f, -3.0f)
                horizontalLineToRelative(7.72f)
                curveTo(15.41f, 11.72f, 13.86f, 13.0f, 12.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineToRelative(0.0f, 6.0f)
                curveToRelative(0.0f, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.09f)
                curveToRelative(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.86f, 0.0f, -3.41f, -1.28f, -3.86f, -3.0f)
                horizontalLineToRelative(7.72f)
                curveTo(15.41f, 11.72f, 13.86f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                lineToRelative(0.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _wineBar!!
    }

private var _wineBar: ImageVector? = null
