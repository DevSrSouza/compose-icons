package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VolumeXmark: ImageVector
    get() {
        if (_volumeXmark != null) {
            return _volumeXmark!!
        }
        _volumeXmark = Builder(name = "VolumeXmark", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.1f, 34.8f)
                curveTo(312.6f, 40.0f, 320.0f, 51.4f, 320.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 12.6f, -7.4f, 24.0f, -18.9f, 29.2f)
                reflectiveCurveToRelative(-25.0f, 3.1f, -34.4f, -5.3f)
                lineTo(131.8f, 352.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(67.8f)
                lineTo(266.7f, 40.1f)
                curveToRelative(9.4f, -8.4f, 22.9f, -10.4f, 34.4f, -5.3f)
                close()
                moveTo(425.0f, 167.0f)
                lineToRelative(55.0f, 55.0f)
                lineToRelative(55.0f, -55.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-55.0f, 55.0f)
                lineToRelative(55.0f, 55.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-55.0f, -55.0f)
                lineToRelative(-55.0f, 55.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(55.0f, -55.0f)
                lineToRelative(-55.0f, -55.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _volumeXmark!!
    }

private var _volumeXmark: ImageVector? = null
