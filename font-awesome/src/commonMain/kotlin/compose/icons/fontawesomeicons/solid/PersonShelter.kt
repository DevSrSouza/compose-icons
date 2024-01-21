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

public val SolidGroup.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(271.9f, 4.2f)
                curveToRelative(-9.8f, -5.6f, -21.9f, -5.6f, -31.8f, 0.0f)
                lineToRelative(-224.0f, 128.0f)
                curveTo(6.2f, 137.9f, 0.0f, 148.5f, 0.0f, 160.0f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(64.0f, 178.6f)
                lineTo(256.0f, 68.9f)
                lineTo(448.0f, 178.6f)
                lineTo(448.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(512.0f, 160.0f)
                curveToRelative(0.0f, -11.5f, -6.2f, -22.1f, -16.1f, -27.8f)
                lineToRelative(-224.0f, -128.0f)
                close()
                moveTo(256.0f, 208.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(248.0f, 488.0f)
                lineTo(248.0f, 400.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(312.0f, 313.5f)
                lineToRelative(26.9f, 49.9f)
                curveToRelative(6.3f, 11.7f, 20.8f, 16.0f, 32.5f, 9.8f)
                reflectiveCurveToRelative(16.0f, -20.8f, 9.8f, -32.5f)
                lineToRelative(-37.9f, -70.3f)
                curveToRelative(-15.3f, -28.5f, -45.1f, -46.3f, -77.5f, -46.3f)
                lineTo(246.2f, 224.1f)
                curveToRelative(-32.4f, 0.0f, -62.1f, 17.8f, -77.5f, 46.3f)
                lineToRelative(-37.9f, 70.3f)
                curveToRelative(-6.3f, 11.7f, -1.9f, 26.2f, 9.8f, 32.5f)
                reflectiveCurveToRelative(26.2f, 1.9f, 32.5f, -9.8f)
                lineTo(200.0f, 313.5f)
                lineTo(200.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
