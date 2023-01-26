package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.VideoCameraFront: ImageVector
    get() {
        if (_videoCameraFront != null) {
            return _videoCameraFront!!
        }
        _videoCameraFront = Builder(name = "VideoCameraFront", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.48f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.48f)
                lineToRelative(4.0f, 3.98f)
                verticalLineToRelative(-11.0f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveTo(8.9f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.57f)
                curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                curveTo(8.07f, 13.21f, 9.01f, 13.0f, 10.0f, 13.0f)
                curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f)
                curveTo(13.52f, 13.9f, 14.0f, 14.62f, 14.0f, 15.43f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _videoCameraFront!!
    }

private var _videoCameraFront: ImageVector? = null
