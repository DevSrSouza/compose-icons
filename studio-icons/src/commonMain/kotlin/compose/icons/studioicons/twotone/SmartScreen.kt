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

public val TwotoneGroup.SmartScreen: ImageVector
    get() {
        if (_smartScreen != null) {
            return _smartScreen!!
        }
        _smartScreen = Builder(name = "SmartScreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(16.5f, 11.25f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(11.25f)
                close()
                moveTo(11.5f, 11.25f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(11.25f)
                close()
                moveTo(9.0f, 11.25f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 5.0f, 1.0f, 5.9f, 1.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveTo(23.0f, 5.9f, 22.1f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _smartScreen!!
    }

private var _smartScreen: ImageVector? = null
