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

public val TwotoneGroup.WbIridescent: ImageVector
    get() {
        if (_wbIridescent != null) {
            return _wbIridescent!!
        }
        _wbIridescent = Builder(name = "WbIridescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.25f, 5.39f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.24f, 18.71f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.8f, -1.79f)
                close()
                moveTo(5.34f, 6.805f)
                lineToRelative(-1.788f, -1.79f)
                lineTo(4.96f, 3.61f)
                lineToRelative(1.788f, 1.788f)
                close()
                moveTo(3.55f, 19.08f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _wbIridescent!!
    }

private var _wbIridescent: ImageVector? = null
