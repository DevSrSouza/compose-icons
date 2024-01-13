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

public val SolidGroup.Drum: ImageVector
    get() {
        if (_drum != null) {
            return _drum!!
        }
        _drum = Builder(name = "Drum", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.2f, 76.1f)
                curveToRelative(11.1f, -7.3f, 14.2f, -22.1f, 6.9f, -33.2f)
                reflectiveCurveToRelative(-22.1f, -14.2f, -33.2f, -6.9f)
                lineTo(370.2f, 104.5f)
                curveTo(335.8f, 98.7f, 297.0f, 96.0f, 256.0f, 96.0f)
                curveTo(114.6f, 96.0f, 0.0f, 128.0f, 0.0f, 208.0f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, 31.3f, 27.4f, 58.8f, 72.0f, 78.7f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(463.4f)
                curveToRelative(33.0f, 8.9f, 71.1f, 14.5f, 112.0f, 16.1f)
                verticalLineTo(376.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(479.5f)
                curveToRelative(40.9f, -1.6f, 79.0f, -7.2f, 112.0f, -16.1f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(446.7f)
                curveToRelative(44.6f, -19.9f, 72.0f, -47.4f, 72.0f, -78.7f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -41.1f, -30.2f, -69.5f, -78.8f, -87.4f)
                lineToRelative(67.9f, -44.5f)
                close()
                moveTo(307.4f, 145.6f)
                lineToRelative(-64.6f, 42.3f)
                curveToRelative(-11.1f, 7.3f, -14.2f, 22.1f, -6.9f, 33.2f)
                reflectiveCurveToRelative(22.1f, 14.2f, 33.2f, 6.9f)
                lineToRelative(111.1f, -72.8f)
                curveToRelative(14.7f, 3.2f, 27.9f, 7.0f, 39.4f, 11.5f)
                curveTo(458.4f, 181.8f, 464.0f, 197.4f, 464.0f, 208.0f)
                curveToRelative(0.0f, 0.8f, -2.7f, 17.2f, -46.0f, 35.9f)
                curveTo(379.1f, 260.7f, 322.0f, 272.0f, 256.0f, 272.0f)
                reflectiveCurveToRelative(-123.1f, -11.3f, -162.0f, -28.1f)
                curveTo(50.7f, 225.2f, 48.0f, 208.8f, 48.0f, 208.0f)
                curveToRelative(0.0f, -10.6f, 5.6f, -26.2f, 44.4f, -41.3f)
                curveTo(130.6f, 151.9f, 187.8f, 144.0f, 256.0f, 144.0f)
                curveToRelative(18.0f, 0.0f, 35.1f, 0.5f, 51.4f, 1.6f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
