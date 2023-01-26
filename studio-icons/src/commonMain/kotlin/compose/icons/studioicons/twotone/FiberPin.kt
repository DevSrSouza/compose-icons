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

public val TwotoneGroup.FiberPin: ImageVector
    get() {
        if (_fiberPin != null) {
            return _fiberPin!!
        }
        _fiberPin = Builder(name = "FiberPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.62f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.74f, 0.0f, 1.31f, -0.57f, 1.31f, -1.31f)
                verticalLineToRelative(-0.88f)
                curveToRelative(0.0f, -0.74f, -0.57f, -1.31f, -1.31f, -1.31f)
                lineTo(5.0f, 9.37f)
                verticalLineToRelative(5.25f)
                close()
                moveTo(6.31f, 10.69f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(0.88f)
                lineTo(6.31f, 11.57f)
                verticalLineToRelative(-0.88f)
                close()
                moveTo(11.34f, 9.38f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(-1.31f)
                close()
                moveTo(14.62f, 14.62f)
                horizontalLineToRelative(1.1f)
                verticalLineToRelative(-3.06f)
                lineToRelative(2.23f, 3.06f)
                lineTo(19.0f, 14.62f)
                lineTo(19.0f, 9.38f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(3.06f)
                lineToRelative(-2.19f, -3.06f)
                horizontalLineToRelative(-1.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _fiberPin!!
    }

private var _fiberPin: ImageVector? = null
