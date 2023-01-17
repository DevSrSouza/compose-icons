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

public val SolidGroup.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 256.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(41.0f, 0.0f, 78.3f, 15.4f, 106.7f, 40.7f)
                curveToRelative(13.2f, 11.8f, 33.4f, 10.7f, 45.2f, -2.5f)
                reflectiveCurveToRelative(10.7f, -33.4f, -2.5f, -45.2f)
                curveToRelative(-39.6f, -35.5f, -92.0f, -57.0f, -149.3f, -57.0f)
                curveTo(132.3f, 32.0f, 32.0f, 132.3f, 32.0f, 256.0f)
                reflectiveCurveToRelative(100.3f, 224.0f, 224.0f, 224.0f)
                curveToRelative(57.4f, 0.0f, 109.7f, -21.6f, 149.3f, -57.0f)
                curveToRelative(13.2f, -11.8f, 14.3f, -32.0f, 2.5f, -45.2f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -45.2f, -2.5f)
                curveTo(334.3f, 400.6f, 297.0f, 416.0f, 256.0f, 416.0f)
                verticalLineTo(320.0f)
                verticalLineToRelative(-8.7f)
                curveToRelative(0.0f, -12.8f, 10.4f, -23.3f, 23.3f, -23.3f)
                curveToRelative(4.6f, 0.0f, 9.1f, 1.4f, 12.9f, 3.9f)
                lineToRelative(10.1f, 6.7f)
                curveToRelative(14.7f, 9.8f, 34.6f, 5.8f, 44.4f, -8.9f)
                reflectiveCurveToRelative(5.8f, -34.6f, -8.9f, -44.4f)
                lineToRelative(-10.1f, -6.7f)
                curveToRelative(-14.3f, -9.6f, -31.2f, -14.7f, -48.4f, -14.7f)
                curveToRelative(-12.4f, 0.0f, -24.2f, 2.6f, -34.9f, 7.3f)
                curveToRelative(-5.5f, -4.5f, -12.6f, -7.3f, -20.3f, -7.3f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(55.3f)
                verticalLineTo(320.0f)
                verticalLineToRelative(82.7f)
                curveTo(135.5f, 378.0f, 96.0f, 321.6f, 96.0f, 256.0f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
