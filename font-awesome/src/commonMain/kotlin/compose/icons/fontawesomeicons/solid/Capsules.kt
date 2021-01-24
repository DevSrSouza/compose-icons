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

public val SolidGroup.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(555.3f, 300.1f)
                lineTo(424.2f, 112.8f)
                curveTo(401.9f, 81.0f, 366.4f, 64.0f, 330.4f, 64.0f)
                curveToRelative(-22.6f, 0.0f, -45.5f, 6.7f, -65.5f, 20.7f)
                curveToRelative(-19.7f, 13.8f, -33.7f, 32.8f, -41.5f, 53.8f)
                curveTo(220.5f, 79.2f, 172.0f, 32.0f, 112.0f, 32.0f)
                curveTo(50.1f, 32.0f, 0.0f, 82.1f, 0.0f, 144.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                lineTo(224.0f, 218.9f)
                curveToRelative(3.3f, 8.6f, 7.3f, 17.1f, 12.8f, 25.0f)
                lineTo(368.0f, 431.2f)
                curveToRelative(22.2f, 31.8f, 57.7f, 48.8f, 93.8f, 48.8f)
                curveToRelative(22.7f, 0.0f, 45.5f, -6.7f, 65.5f, -20.7f)
                curveToRelative(51.7f, -36.2f, 64.2f, -107.5f, 28.0f, -159.2f)
                close()
                moveTo(160.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                lineTo(64.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(112.0f)
                close()
                moveTo(354.8f, 300.9f)
                lineToRelative(-65.6f, -93.7f)
                curveToRelative(-7.7f, -11.0f, -10.7f, -24.4f, -8.3f, -37.6f)
                curveToRelative(2.3f, -13.2f, 9.7f, -24.8f, 20.7f, -32.5f)
                curveToRelative(8.5f, -6.0f, 18.5f, -9.1f, 28.8f, -9.1f)
                curveToRelative(16.5f, 0.0f, 31.9f, 8.0f, 41.3f, 21.5f)
                lineToRelative(65.6f, 93.7f)
                lineToRelative(-82.5f, 57.7f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
