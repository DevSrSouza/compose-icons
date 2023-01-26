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

public val TwotoneGroup.FiberDvr: ImageVector
    get() {
        if (_fiberDvr != null) {
            return _fiberDvr!!
        }
        _fiberDvr = Builder(name = "FiberDvr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.56f)
                verticalLineToRelative(-0.89f)
                curveToRelative(0.0f, -0.76f, -0.58f, -1.33f, -1.33f, -1.33f)
                horizontalLineToRelative(-3.11f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(1.02f)
                lineToRelative(0.76f, 1.78f)
                lineTo(20.0f, 14.67f)
                lineToRelative(-0.8f, -1.87f)
                curveToRelative(0.44f, -0.22f, 0.8f, -0.71f, 0.8f, -1.24f)
                close()
                moveTo(18.67f, 11.56f)
                horizontalLineToRelative(-1.78f)
                verticalLineToRelative(-0.89f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(0.89f)
                close()
                moveTo(7.11f, 9.33f)
                lineTo(4.0f, 9.33f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(3.11f)
                curveToRelative(0.76f, 0.0f, 1.33f, -0.58f, 1.33f, -1.33f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0.0f, -0.75f, -0.57f, -1.33f, -1.33f, -1.33f)
                close()
                moveTo(7.11f, 13.33f)
                lineTo(5.33f, 13.33f)
                verticalLineToRelative(-2.67f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(2.67f)
                close()
                moveTo(14.11f, 9.33f)
                horizontalLineToRelative(-1.34f)
                lineToRelative(-0.89f, 3.05f)
                lineTo(11.0f, 9.33f)
                lineTo(9.66f, 9.33f)
                lineToRelative(1.56f, 5.34f)
                horizontalLineToRelative(1.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _fiberDvr!!
    }

private var _fiberDvr: ImageVector? = null
