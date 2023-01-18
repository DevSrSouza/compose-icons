package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AirplaneOutline: ImageVector
    get() {
        if (_airplaneOutline != null) {
            return _airplaneOutline!!
        }
        _airplaneOutline = Builder(name = "AirplaneOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(407.72f, 224.0f)
                curveToRelative(-3.4f, 0.0f, -14.79f, 0.1f, -18.0f, 0.3f)
                lineToRelative(-64.9f, 1.7f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, true, -1.69f, -0.9f)
                lineTo(193.55f, 67.56f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 186.89f, 64.0f)
                horizontalLineTo(160.0f)
                lineToRelative(73.0f, 161.0f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -2.26f, 3.35f)
                lineToRelative(-121.69f, 1.8f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, -6.6f, -3.1f)
                lineToRelative(-37.0f, -45.0f)
                curveToRelative(-3.0f, -3.9f, -8.62f, -6.0f, -13.51f, -6.0f)
                horizontalLineTo(33.08f)
                curveToRelative(-1.29f, 0.0f, -1.1f, 1.21f, -0.75f, 2.43f)
                lineTo(52.17f, 249.9f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 0.0f, 11.9f)
                lineTo(32.31f, 333.0f)
                curveToRelative(-0.59f, 1.95f, -0.52f, 3.0f, 1.77f, 3.0f)
                horizontalLineTo(52.0f)
                curveToRelative(8.14f, 0.0f, 9.25f, -1.06f, 13.41f, -6.3f)
                lineToRelative(37.7f, -45.7f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 6.6f, -3.1f)
                lineToRelative(120.68f, 2.7f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 2.43f, 3.74f)
                lineTo(160.0f, 448.0f)
                horizontalLineToRelative(26.64f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 6.65f, -3.55f)
                lineTo(323.14f, 287.0f)
                curveToRelative(0.39f, -0.6f, 2.0f, -0.9f, 2.69f, -0.9f)
                lineToRelative(63.9f, 1.7f)
                curveToRelative(3.3f, 0.2f, 14.59f, 0.3f, 18.0f, 0.3f)
                curveTo(452.0f, 288.1f, 480.0f, 275.93f, 480.0f, 256.0f)
                reflectiveCurveTo(452.12f, 224.0f, 407.72f, 224.0f)
                close()
            }
        }
        .build()
        return _airplaneOutline!!
    }

private var _airplaneOutline: ImageVector? = null
