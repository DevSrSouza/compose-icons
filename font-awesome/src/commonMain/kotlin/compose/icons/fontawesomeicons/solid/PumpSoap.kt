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

public val SolidGroup.PumpSoap: ImageVector
    get() {
        if (_pumpSoap != null) {
            return _pumpSoap!!
        }
        _pumpSoap = Builder(name = "PumpSoap", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(60.1f)
                curveToRelative(4.2f, 0.0f, 8.3f, 1.7f, 11.3f, 4.7f)
                lineToRelative(33.9f, 33.9f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(372.7f, 55.4f)
                curveToRelative(-15.0f, -15.0f, -35.4f, -23.4f, -56.6f, -23.4f)
                horizontalLineTo(256.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(117.4f, 160.0f)
                curveToRelative(-33.3f, 0.0f, -61.0f, 25.5f, -63.8f, 58.7f)
                lineTo(35.0f, 442.7f)
                curveTo(31.9f, 480.0f, 61.3f, 512.0f, 98.8f, 512.0f)
                horizontalLineTo(285.2f)
                curveToRelative(37.4f, 0.0f, 66.9f, -32.0f, 63.8f, -69.3f)
                lineToRelative(-18.7f, -224.0f)
                curveToRelative(-2.8f, -33.2f, -30.5f, -58.7f, -63.8f, -58.7f)
                horizontalLineTo(117.4f)
                close()
                moveTo(256.0f, 360.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 56.0f, -64.0f, 56.0f)
                reflectiveCurveToRelative(-64.0f, -20.7f, -64.0f, -56.0f)
                curveToRelative(0.0f, -32.5f, 37.0f, -80.9f, 50.9f, -97.9f)
                curveToRelative(3.2f, -3.9f, 8.1f, -6.1f, 13.1f, -6.1f)
                reflectiveCurveToRelative(9.9f, 2.2f, 13.1f, 6.1f)
                curveTo(219.0f, 279.1f, 256.0f, 327.5f, 256.0f, 360.0f)
                close()
            }
        }
        .build()
        return _pumpSoap!!
    }

private var _pumpSoap: ImageVector? = null
