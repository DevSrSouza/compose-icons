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

public val SolidGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 96.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineTo(64.0f, 256.0f)
                horizontalLineToRelative(96.0f)
                lineTo(160.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(0.0f, 144.0f)
                curveTo(0.0f, 82.1f, 50.1f, 32.0f, 112.0f, 32.0f)
                reflectiveCurveToRelative(112.0f, 50.1f, 112.0f, 112.0f)
                lineTo(224.0f, 368.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                reflectiveCurveTo(0.0f, 429.9f, 0.0f, 368.0f)
                lineTo(0.0f, 144.0f)
                close()
                moveTo(554.9f, 399.4f)
                curveToRelative(-7.1f, 12.3f, -23.7f, 13.1f, -33.8f, 3.1f)
                lineTo(333.5f, 214.9f)
                curveToRelative(-10.0f, -10.0f, -9.3f, -26.7f, 3.1f, -33.8f)
                curveTo(360.0f, 167.7f, 387.1f, 160.0f, 416.0f, 160.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, 71.6f, 160.0f, 160.0f)
                curveToRelative(0.0f, 28.9f, -7.7f, 56.0f, -21.1f, 79.4f)
                close()
                moveTo(495.4f, 458.9f)
                curveTo(472.0f, 472.3f, 444.9f, 480.0f, 416.0f, 480.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                curveToRelative(0.0f, -28.9f, 7.7f, -56.0f, 21.1f, -79.4f)
                curveToRelative(7.1f, -12.3f, 23.7f, -13.1f, 33.8f, -3.1f)
                lineTo(498.5f, 425.1f)
                curveToRelative(10.0f, 10.0f, 9.3f, 26.7f, -3.1f, 33.8f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
