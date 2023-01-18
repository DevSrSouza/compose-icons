package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ShirtOutline: ImageVector
    get() {
        if (_shirtOutline != null) {
            return _shirtOutline!!
        }
        _shirtOutline = Builder(name = "ShirtOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(314.56f, 48.0f)
                reflectiveCurveTo(291.78f, 56.0f, 256.0f, 56.0f)
                reflectiveCurveToRelative(-58.56f, -8.0f, -58.56f, -8.0f)
                arcToRelative(31.94f, 31.94f, 0.0f, false, false, -10.57f, 1.8f)
                lineTo(32.0f, 104.0f)
                lineToRelative(16.63f, 88.0f)
                lineToRelative(48.88f, 5.52f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 118.8f, 222.1f)
                lineTo(112.0f, 464.0f)
                horizontalLineTo(400.0f)
                lineToRelative(-6.8f, -241.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 21.29f, -24.58f)
                lineTo(463.37f, 192.0f)
                lineTo(480.0f, 104.0f)
                lineTo(325.13f, 49.8f)
                arcTo(31.94f, 31.94f, 0.0f, false, false, 314.56f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(333.31f, 52.66f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -154.62f, 0.0f)
            }
        }
        .build()
        return _shirtOutline!!
    }

private var _shirtOutline: ImageVector? = null
