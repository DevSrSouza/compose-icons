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

public val TwotoneGroup.MissedVideoCall: ImageVector
    get() {
        if (_missedVideoCall != null) {
            return _missedVideoCall!!
        }
        _missedVideoCall = Builder(name = "MissedVideoCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(11.0f, 15.0f)
                lineToRelative(-3.89f, -3.89f)
                verticalLineToRelative(2.55f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.22f)
                horizontalLineToRelative(4.44f)
                verticalLineToRelative(1.11f)
                horizontalLineTo(7.89f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(2.99f, -3.01f)
                lineToRelative(0.78f, 0.79f)
                lineTo(11.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(17.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(8.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(11.0f, 13.43f)
                lineToRelative(-3.11f, -3.1f)
                horizontalLineToRelative(2.55f)
                lineTo(10.44f, 9.22f)
                lineTo(6.0f, 9.22f)
                verticalLineToRelative(4.44f)
                horizontalLineToRelative(1.11f)
                verticalLineToRelative(-2.55f)
                lineTo(11.0f, 15.0f)
                lineToRelative(3.77f, -3.79f)
                lineToRelative(-0.78f, -0.79f)
                close()
            }
        }
        .build()
        return _missedVideoCall!!
    }

private var _missedVideoCall: ImageVector? = null
