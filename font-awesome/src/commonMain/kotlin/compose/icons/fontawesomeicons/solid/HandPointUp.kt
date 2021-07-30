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

public val SolidGroup.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.652f, 0.0f)
                curveToRelative(23.625f, 0.0f, 43.826f, 20.65f, 43.826f, 44.8f)
                verticalLineToRelative(99.851f)
                curveToRelative(17.048f, -16.34f, 49.766f, -18.346f, 70.944f, 6.299f)
                curveToRelative(22.829f, -14.288f, 53.017f, -2.147f, 62.315f, 16.45f)
                curveTo(361.878f, 158.426f, 384.0f, 189.346f, 384.0f, 240.0f)
                curveToRelative(0.0f, 2.746f, -0.203f, 13.276f, -0.195f, 16.0f)
                curveToRelative(0.168f, 61.971f, -31.065f, 76.894f, -38.315f, 123.731f)
                curveTo(343.683f, 391.404f, 333.599f, 400.0f, 321.786f, 400.0f)
                lineTo(150.261f, 400.0f)
                lineToRelative(-0.001f, -0.002f)
                curveToRelative(-18.366f, -0.011f, -35.889f, -10.607f, -43.845f, -28.464f)
                curveTo(93.421f, 342.648f, 57.377f, 276.122f, 29.092f, 264.0f)
                curveTo(10.897f, 256.203f, 0.008f, 242.616f, 0.0f, 224.0f)
                curveToRelative(-0.014f, -34.222f, 35.098f, -57.752f, 66.908f, -44.119f)
                curveToRelative(8.359f, 3.583f, 16.67f, 8.312f, 24.918f, 14.153f)
                lineTo(91.826f, 44.8f)
                curveToRelative(0.0f, -23.45f, 20.543f, -44.8f, 43.826f, -44.8f)
                close()
                moveTo(136.0f, 416.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                lineTo(136.0f, 512.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(304.0f, 444.0f)
                curveToRelative(-11.046f, 0.0f, -20.0f, 8.954f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.954f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.954f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-8.954f, -20.0f, -20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
