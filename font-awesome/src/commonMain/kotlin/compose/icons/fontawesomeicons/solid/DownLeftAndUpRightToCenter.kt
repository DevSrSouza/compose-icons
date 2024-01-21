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

public val SolidGroup.DownLeftAndUpRightToCenter: ImageVector
    get() {
        if (_downLeftAndUpRightToCenter != null) {
            return _downLeftAndUpRightToCenter!!
        }
        _downLeftAndUpRightToCenter = Builder(name = "DownLeftAndUpRightToCenter", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.0f, 7.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-87.0f, 87.0f)
                lineToRelative(39.0f, 39.0f)
                curveToRelative(6.9f, 6.9f, 8.9f, 17.2f, 5.2f, 26.2f)
                reflectiveCurveToRelative(-12.5f, 14.8f, -22.2f, 14.8f)
                horizontalLineTo(296.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(72.0f)
                curveToRelative(0.0f, -9.7f, 5.8f, -18.5f, 14.8f, -22.2f)
                reflectiveCurveToRelative(19.3f, -1.7f, 26.2f, 5.2f)
                lineToRelative(39.0f, 39.0f)
                lineTo(439.0f, 7.0f)
                close()
                moveTo(72.0f, 272.0f)
                horizontalLineTo(216.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(440.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-39.0f, -39.0f)
                lineTo(73.0f, 505.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 473.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(87.0f, -87.0f)
                lineTo(55.0f, 313.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                reflectiveCurveToRelative(12.5f, -14.8f, 22.2f, -14.8f)
                close()
            }
        }
        .build()
        return _downLeftAndUpRightToCenter!!
    }

private var _downLeftAndUpRightToCenter: ImageVector? = null
