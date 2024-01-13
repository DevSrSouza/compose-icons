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

public val SolidGroup.UpRightAndDownLeftFromCenter: ImageVector
    get() {
        if (_upRightAndDownLeftFromCenter != null) {
            return _upRightAndDownLeftFromCenter!!
        }
        _upRightAndDownLeftFromCenter = Builder(name = "UpRightAndDownLeftFromCenter", defaultWidth
                = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 0.0f)
                horizontalLineTo(488.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(168.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-39.0f, -39.0f)
                lineToRelative(-87.0f, 87.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(87.0f, -87.0f)
                lineTo(327.0f, 41.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                reflectiveCurveTo(334.3f, 0.0f, 344.0f, 0.0f)
                close()
                moveTo(168.0f, 512.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, -9.7f, 5.8f, -18.5f, 14.8f, -22.2f)
                reflectiveCurveToRelative(19.3f, -1.7f, 26.2f, 5.2f)
                lineToRelative(39.0f, 39.0f)
                lineToRelative(87.0f, -87.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-87.0f, 87.0f)
                lineToRelative(39.0f, 39.0f)
                curveToRelative(6.9f, 6.9f, 8.9f, 17.2f, 5.2f, 26.2f)
                reflectiveCurveToRelative(-12.5f, 14.8f, -22.2f, 14.8f)
                close()
            }
        }
        .build()
        return _upRightAndDownLeftFromCenter!!
    }

private var _upRightAndDownLeftFromCenter: ImageVector? = null
