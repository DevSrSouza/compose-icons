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

public val TwotoneGroup.FiberNew: ImageVector
    get() {
        if (_fiberNew != null) {
            return _fiberNew!!
        }
        _fiberNew = Builder(name = "FiberNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.12f, 14.47f)
                lineTo(9.12f, 9.53f)
                lineTo(8.09f, 9.53f)
                verticalLineToRelative(2.88f)
                lineTo(6.03f, 9.53f)
                lineTo(5.0f, 9.53f)
                verticalLineToRelative(4.94f)
                horizontalLineToRelative(1.03f)
                verticalLineToRelative(-2.88f)
                lineToRelative(2.1f, 2.88f)
                close()
                moveTo(13.24f, 10.57f)
                lineTo(13.24f, 9.53f)
                horizontalLineToRelative(-3.3f)
                verticalLineToRelative(4.94f)
                horizontalLineToRelative(3.3f)
                verticalLineToRelative(-1.03f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(-0.91f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(-1.04f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(-0.92f)
                close()
                moveTo(14.06f, 9.53f)
                verticalLineToRelative(4.12f)
                curveToRelative(0.0f, 0.45f, 0.37f, 0.82f, 0.82f, 0.82f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.45f, 0.0f, 0.82f, -0.37f, 0.82f, -0.82f)
                lineTo(18.99f, 9.53f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-0.92f)
                verticalLineToRelative(-2.89f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-0.93f)
                lineTo(15.08f, 9.53f)
                horizontalLineToRelative(-1.02f)
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
        return _fiberNew!!
    }

private var _fiberNew: ImageVector? = null
