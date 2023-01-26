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

public val TwotoneGroup.RawOn: ImageVector
    get() {
        if (_rawOn != null) {
            return _rawOn!!
        }
        _rawOn = Builder(name = "RawOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2.0f)
                horizontalLineTo(8.0f)
                lineToRelative(-0.9f, -2.1f)
                curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f)
                verticalLineToRelative(-1.0f)
                curveTo(8.0f, 9.7f, 7.3f, 9.0f, 6.5f, 9.0f)
                close()
                moveTo(6.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 9.0f)
                lineToRelative(-1.5f, 6.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.38f, -1.5f)
                horizontalLineToRelative(1.75f)
                lineToRelative(0.37f, 1.5f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-1.5f, -6.0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(11.0f, 12.0f)
                lineToRelative(0.25f, -1.0f)
                horizontalLineToRelative(0.5f)
                lineTo(12.0f, 12.0f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.98f, 9.0f)
                lineToRelative(-0.74f, 3.0f)
                lineToRelative(-0.74f, -3.0f)
                lineToRelative(-1.52f, 0.0f)
                lineToRelative(-0.74f, 3.0f)
                lineToRelative(-0.74f, -3.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(1.5f, 6.0f)
                lineToRelative(1.48f, 0.0f)
                lineToRelative(0.76f, -3.04f)
                lineToRelative(0.76f, 3.04f)
                lineToRelative(1.48f, 0.0f)
                lineToRelative(1.5f, -6.0f)
                close()
            }
        }
        .build()
        return _rawOn!!
    }

private var _rawOn: ImageVector? = null
