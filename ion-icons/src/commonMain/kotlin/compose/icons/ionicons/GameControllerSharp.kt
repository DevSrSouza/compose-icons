package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GameControllerSharp: ImageVector
    get() {
        if (_gameControllerSharp != null) {
            return _gameControllerSharp!!
        }
        _gameControllerSharp = Builder(name = "GameControllerSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.07f, 356.88f)
                lineTo(439.0f, 151.0f)
                curveToRelative(-8.86f, -40.35f, -23.0f, -71.0f, -88.0f, -71.0f)
                lineTo(145.0f, 80.0f)
                curveToRelative(-66.0f, 0.0f, -79.14f, 30.65f, -88.0f, 71.0f)
                lineTo(18.0f, 356.88f)
                curveTo(11.0f, 391.0f, 22.43f, 418.13f, 51.37f, 428.69f)
                reflectiveCurveTo(103.0f, 423.0f, 119.18f, 391.3f)
                lineToRelative(15.42f, -30.52f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 148.88f, 352.0f)
                lineTo(347.16f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 14.28f, 8.78f)
                lineToRelative(15.42f, 30.52f)
                curveToRelative(16.14f, 31.7f, 38.88f, 48.0f, 67.81f, 37.39f)
                reflectiveCurveTo(485.0f, 391.0f, 478.07f, 356.88f)
                close()
                moveTo(224.0f, 240.0f)
                lineTo(176.0f, 240.0f)
                verticalLineToRelative(48.0f)
                lineTo(144.0f, 288.0f)
                lineTo(144.0f, 240.0f)
                lineTo(96.0f, 240.0f)
                lineTo(96.0f, 208.0f)
                horizontalLineToRelative(48.0f)
                lineTo(144.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(292.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 292.0f, 244.0f)
                close()
                moveTo(336.0f, 288.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 336.0f, 288.0f)
                close()
                moveTo(336.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 336.0f, 200.0f)
                close()
                moveTo(380.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 380.0f, 244.0f)
                close()
            }
        }
        .build()
        return _gameControllerSharp!!
    }

private var _gameControllerSharp: ImageVector? = null
