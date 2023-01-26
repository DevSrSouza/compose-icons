package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.RMobiledata: ImageVector
    get() {
        if (_rMobiledata != null) {
            return _rMobiledata!!
        }
        _rMobiledata = Builder(name = "RMobiledata", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 7.2f)
                lineTo(9.0f, 10.0f)
                horizontalLineTo(7.0f)
                lineTo(5.87f, 7.33f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.13f, 0.0f, 2.0f, 0.87f, 2.0f, 2.0f)
                verticalLineToRelative(1.33f)
                curveTo(9.0f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.33f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _rMobiledata!!
    }

private var _rMobiledata: ImageVector? = null
