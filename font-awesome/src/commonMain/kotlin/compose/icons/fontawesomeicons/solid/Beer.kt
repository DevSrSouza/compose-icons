package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 96.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(320.0f, 56.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.745f, 32.0f, 0.0f, 42.745f, 0.0f, 56.0f)
                verticalLineToRelative(400.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-42.11f)
                lineToRelative(80.606f, -35.977f)
                curveTo(429.396f, 365.063f, 448.0f, 336.388f, 448.0f, 304.86f)
                lineTo(448.0f, 176.0f)
                curveToRelative(0.0f, -44.112f, -35.888f, -80.0f, -80.0f, -80.0f)
                close()
                moveTo(384.0f, 304.86f)
                arcToRelative(16.018f, 16.018f, 0.0f, false, true, -9.479f, 14.611f)
                lineTo(320.0f, 343.805f)
                lineTo(320.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineToRelative(128.86f)
                close()
                moveTo(208.0f, 384.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(192.0f, 144.0f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.164f, 16.0f, 16.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(112.0f, 384.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(96.0f, 144.0f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.164f, 16.0f, 16.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
