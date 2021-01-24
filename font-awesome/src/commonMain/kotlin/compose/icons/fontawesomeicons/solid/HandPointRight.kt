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

public val SolidGroup.HandPointRight: ImageVector
    get() {
        if (_handPointRight != null) {
            return _handPointRight!!
        }
        _handPointRight = Builder(name = "HandPointRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 199.652f)
                curveToRelative(0.0f, 23.625f, -20.65f, 43.826f, -44.8f, 43.826f)
                horizontalLineToRelative(-99.851f)
                curveToRelative(16.34f, 17.048f, 18.346f, 49.766f, -6.299f, 70.944f)
                curveToRelative(14.288f, 22.829f, 2.147f, 53.017f, -16.45f, 62.315f)
                curveTo(353.574f, 425.878f, 322.654f, 448.0f, 272.0f, 448.0f)
                curveToRelative(-2.746f, 0.0f, -13.276f, -0.203f, -16.0f, -0.195f)
                curveToRelative(-61.971f, 0.168f, -76.894f, -31.065f, -123.731f, -38.315f)
                curveTo(120.596f, 407.683f, 112.0f, 397.599f, 112.0f, 385.786f)
                verticalLineTo(214.261f)
                lineToRelative(0.002f, -0.001f)
                curveToRelative(0.011f, -18.366f, 10.607f, -35.889f, 28.464f, -43.845f)
                curveToRelative(28.886f, -12.994f, 95.413f, -49.038f, 107.534f, -77.323f)
                curveToRelative(7.797f, -18.194f, 21.384f, -29.084f, 40.0f, -29.092f)
                curveToRelative(34.222f, -0.014f, 57.752f, 35.098f, 44.119f, 66.908f)
                curveToRelative(-3.583f, 8.359f, -8.312f, 16.67f, -14.153f, 24.918f)
                horizontalLineTo(467.2f)
                curveToRelative(23.45f, 0.0f, 44.8f, 20.543f, 44.8f, 43.826f)
                close()
                moveTo(96.0f, 200.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                verticalLineTo(200.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                close()
                moveTo(68.0f, 368.0f)
                curveToRelative(0.0f, -11.046f, -8.954f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.954f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.954f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.954f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointRight!!
    }

private var _handPointRight: ImageVector? = null
