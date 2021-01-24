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

public val SolidGroup.HandPointDown: ImageVector
    get() {
        if (_handPointDown != null) {
            return _handPointDown!!
        }
        _handPointDown = Builder(name = "HandPointDown", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.826f, 467.2f)
                lineTo(91.826f, 317.966f)
                curveToRelative(-8.248f, 5.841f, -16.558f, 10.57f, -24.918f, 14.153f)
                curveTo(35.098f, 345.752f, -0.014f, 322.222f, 0.0f, 288.0f)
                curveToRelative(0.008f, -18.616f, 10.897f, -32.203f, 29.092f, -40.0f)
                curveToRelative(28.286f, -12.122f, 64.329f, -78.648f, 77.323f, -107.534f)
                curveToRelative(7.956f, -17.857f, 25.479f, -28.453f, 43.845f, -28.464f)
                lineToRelative(0.001f, -0.002f)
                horizontalLineToRelative(171.526f)
                curveToRelative(11.812f, 0.0f, 21.897f, 8.596f, 23.703f, 20.269f)
                curveToRelative(7.25f, 46.837f, 38.483f, 61.76f, 38.315f, 123.731f)
                curveToRelative(-0.007f, 2.724f, 0.195f, 13.254f, 0.195f, 16.0f)
                curveToRelative(0.0f, 50.654f, -22.122f, 81.574f, -71.263f, 72.6f)
                curveToRelative(-9.297f, 18.597f, -39.486f, 30.738f, -62.315f, 16.45f)
                curveToRelative(-21.177f, 24.645f, -53.896f, 22.639f, -70.944f, 6.299f)
                lineTo(179.478f, 467.2f)
                curveToRelative(0.0f, 24.15f, -20.201f, 44.8f, -43.826f, 44.8f)
                curveToRelative(-23.283f, 0.0f, -43.826f, -21.35f, -43.826f, -44.8f)
                close()
                moveTo(112.0f, 72.0f)
                lineTo(112.0f, 24.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                lineTo(136.0f, 96.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                close()
                moveTo(324.0f, 48.0f)
                curveToRelative(0.0f, -11.046f, -8.954f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.954f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.954f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.954f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointDown!!
    }

private var _handPointDown: ImageVector? = null
