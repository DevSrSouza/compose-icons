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

public val SolidGroup.ColonSign: ImageVector
    get() {
        if (_colonSign != null) {
            return _colonSign!!
        }
        _colonSign = Builder(name = "ColonSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.0f, 39.8f)
                curveToRelative(4.3f, -17.1f, -6.1f, -34.5f, -23.3f, -38.8f)
                reflectiveCurveTo(197.2f, 7.1f, 193.0f, 24.2f)
                lineTo(181.9f, 68.6f)
                curveTo(96.1f, 87.8f, 32.0f, 164.4f, 32.0f, 256.0f)
                curveToRelative(0.0f, 58.1f, 25.8f, 110.2f, 66.7f, 145.4f)
                lineTo(81.0f, 472.2f)
                curveToRelative(-4.3f, 17.1f, 6.1f, 34.5f, 23.3f, 38.8f)
                reflectiveCurveToRelative(34.5f, -6.1f, 38.8f, -23.3f)
                lineToRelative(13.0f, -52.1f)
                curveToRelative(9.0f, 3.4f, 18.4f, 6.2f, 28.0f, 8.2f)
                lineTo(177.0f, 472.2f)
                curveToRelative(-4.3f, 17.1f, 6.1f, 34.5f, 23.3f, 38.8f)
                reflectiveCurveToRelative(34.5f, -6.1f, 38.8f, -23.3f)
                lineToRelative(10.4f, -41.4f)
                curveToRelative(33.4f, -4.4f, 64.1f, -17.4f, 89.8f, -36.7f)
                curveToRelative(14.1f, -10.6f, 17.0f, -30.7f, 6.4f, -44.8f)
                reflectiveCurveToRelative(-30.7f, -17.0f, -44.8f, -6.4f)
                curveToRelative(-10.2f, 7.7f, -21.7f, 13.9f, -34.0f, 18.3f)
                lineTo(321.0f, 160.0f)
                curveToRelative(9.4f, -0.3f, 18.5f, -4.7f, 24.6f, -12.8f)
                curveToRelative(10.6f, -14.1f, 7.8f, -34.2f, -6.4f, -44.8f)
                curveToRelative(-1.1f, -0.8f, -2.2f, -1.6f, -3.3f, -2.4f)
                lineTo(351.0f, 39.8f)
                curveToRelative(4.3f, -17.1f, -6.1f, -34.5f, -23.3f, -38.8f)
                reflectiveCurveTo(293.2f, 7.1f, 289.0f, 24.2f)
                lineTo(277.2f, 71.5f)
                curveToRelative(-9.3f, -2.7f, -18.8f, -4.6f, -28.6f, -5.9f)
                lineTo(255.0f, 39.8f)
                close()
                moveTo(163.2f, 143.3f)
                lineTo(117.3f, 326.8f)
                curveTo(103.9f, 306.5f, 96.0f, 282.2f, 96.0f, 256.0f)
                curveToRelative(0.0f, -48.7f, 27.2f, -91.0f, 67.2f, -112.7f)
                close()
                moveTo(171.8f, 372.8f)
                lineToRelative(61.1f, -244.6f)
                curveToRelative(9.9f, 0.7f, 19.5f, 2.5f, 28.7f, 5.3f)
                lineToRelative(-62.0f, 248.1f)
                curveToRelative(-9.7f, -1.9f, -19.0f, -4.8f, -27.8f, -8.8f)
                close()
            }
        }
        .build()
        return _colonSign!!
    }

private var _colonSign: ImageVector? = null
