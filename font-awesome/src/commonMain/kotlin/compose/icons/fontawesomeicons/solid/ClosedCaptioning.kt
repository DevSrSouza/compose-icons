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

public val SolidGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineTo(512.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(576.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(200.0f, 208.0f)
                curveToRelative(14.2f, 0.0f, 27.0f, 6.1f, 35.8f, 16.0f)
                curveToRelative(8.8f, 9.9f, 24.0f, 10.7f, 33.9f, 1.9f)
                reflectiveCurveToRelative(10.7f, -24.0f, 1.9f, -33.9f)
                curveToRelative(-17.5f, -19.6f, -43.1f, -32.0f, -71.5f, -32.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(28.4f, 0.0f, 54.0f, -12.4f, 71.5f, -32.0f)
                curveToRelative(8.8f, -9.9f, 8.0f, -25.0f, -1.9f, -33.9f)
                reflectiveCurveToRelative(-25.0f, -8.0f, -33.9f, 1.9f)
                curveToRelative(-8.8f, 9.9f, -21.6f, 16.0f, -35.8f, 16.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(344.0f, 256.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                curveToRelative(14.2f, 0.0f, 27.0f, 6.1f, 35.8f, 16.0f)
                curveToRelative(8.8f, 9.9f, 24.0f, 10.7f, 33.9f, 1.9f)
                reflectiveCurveToRelative(10.7f, -24.0f, 1.9f, -33.9f)
                curveToRelative(-17.5f, -19.6f, -43.1f, -32.0f, -71.5f, -32.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(28.4f, 0.0f, 54.0f, -12.4f, 71.5f, -32.0f)
                curveToRelative(8.8f, -9.9f, 8.0f, -25.0f, -1.9f, -33.9f)
                reflectiveCurveToRelative(-25.0f, -8.0f, -33.9f, 1.9f)
                curveToRelative(-8.8f, 9.9f, -21.6f, 16.0f, -35.8f, 16.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
