package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 368.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(72.5f, -54.4f)
                curveToRelative(8.3f, -6.2f, 18.4f, -9.6f, 28.8f, -9.6f)
                lineTo(448.0f, 368.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(464.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(64.0f, 48.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(48.0f, 352.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(208.0f, 492.0f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-5.1f, 3.8f)
                lineToRelative(-17.1f, 12.8f)
                curveToRelative(-4.8f, 3.6f, -11.3f, 4.2f, -16.8f, 1.5f)
                reflectiveCurveToRelative(-8.8f, -8.2f, -8.8f, -14.3f)
                lineTo(160.0f, 474.7f)
                verticalLineToRelative(-6.4f)
                lineTo(160.0f, 468.0f)
                verticalLineToRelative(-4.0f)
                lineTo(160.0f, 416.0f)
                lineTo(112.0f, 416.0f)
                lineTo(64.0f, 416.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(448.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(512.0f, 352.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(309.3f, 416.0f)
                lineTo(208.0f, 492.0f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
