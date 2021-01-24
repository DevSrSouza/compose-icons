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

public val SolidGroup.HandPointLeft: ImageVector
    get() {
        if (_handPointLeft != null) {
            return _handPointLeft!!
        }
        _handPointLeft = Builder(name = "HandPointLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.8f, 155.826f)
                horizontalLineToRelative(149.234f)
                curveToRelative(-5.841f, -8.248f, -10.57f, -16.558f, -14.153f, -24.918f)
                curveTo(166.248f, 99.098f, 189.778f, 63.986f, 224.0f, 64.0f)
                curveToRelative(18.616f, 0.008f, 32.203f, 10.897f, 40.0f, 29.092f)
                curveToRelative(12.122f, 28.286f, 78.648f, 64.329f, 107.534f, 77.323f)
                curveToRelative(17.857f, 7.956f, 28.453f, 25.479f, 28.464f, 43.845f)
                lineToRelative(0.002f, 0.001f)
                verticalLineToRelative(171.526f)
                curveToRelative(0.0f, 11.812f, -8.596f, 21.897f, -20.269f, 23.703f)
                curveToRelative(-46.837f, 7.25f, -61.76f, 38.483f, -123.731f, 38.315f)
                curveToRelative(-2.724f, -0.007f, -13.254f, 0.195f, -16.0f, 0.195f)
                curveToRelative(-50.654f, 0.0f, -81.574f, -22.122f, -72.6f, -71.263f)
                curveToRelative(-18.597f, -9.297f, -30.738f, -39.486f, -16.45f, -62.315f)
                curveToRelative(-24.645f, -21.177f, -22.639f, -53.896f, -6.299f, -70.944f)
                lineTo(44.8f, 243.478f)
                curveToRelative(-24.15f, 0.0f, -44.8f, -20.201f, -44.8f, -43.826f)
                curveToRelative(0.0f, -23.283f, 21.35f, -43.826f, 44.8f, -43.826f)
                close()
                moveTo(440.0f, 176.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                lineTo(416.0f, 200.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(464.0f, 388.0f)
                curveToRelative(11.046f, 0.0f, 20.0f, -8.954f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-8.954f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.954f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.954f, 20.0f, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _handPointLeft!!
    }

private var _handPointLeft: ImageVector? = null
