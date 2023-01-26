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

public val TwotoneGroup.MoveToInbox: ImageVector
    get() {
        if (_moveToInbox != null) {
            return _moveToInbox!!
        }
        _moveToInbox = Builder(name = "MoveToInbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.01f, 18.0f)
                curveToRelative(-1.48f, 0.0f, -2.75f, -0.81f, -3.45f, -2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(-0.69f, 1.19f, -1.97f, 2.0f, -3.44f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(-2.55f)
                lineTo(13.45f, 6.0f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 9.0f)
                lineToRelative(4.0f, 4.0f)
                close()
                moveTo(19.0f, 3.0f)
                lineTo(4.99f, 3.0f)
                curveTo(3.88f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.88f, 2.0f, 1.99f, 2.0f)
                lineTo(19.0f, 21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.56f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2.0f, 3.45f, 2.0f)
                reflectiveCurveToRelative(2.75f, -0.81f, 3.45f, -2.0f)
                lineTo(19.0f, 16.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-4.99f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(5.0f, 14.0f)
                lineToRelative(-0.01f, -9.0f)
                lineTo(19.0f, 5.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _moveToInbox!!
    }

private var _moveToInbox: ImageVector? = null
