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

public val IonIcons.CheckmarkDoneCircle: ImageVector
    get() {
        if (_checkmarkDoneCircle != null) {
            return _checkmarkDoneCircle!!
        }
        _checkmarkDoneCircle = Builder(name = "CheckmarkDoneCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.9f, 48.0f)
                curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48.0f, 258.9f)
                curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464.0f)
                curveToRelative(117.0f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
                curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48.0f)
                close()
                moveTo(242.11f, 240.47f)
                lineToRelative(51.55f, -59.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.1f, 21.06f)
                lineToRelative(-51.55f, 59.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -24.1f, -21.06f)
                close()
                moveTo(203.25f, 331.32f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-47.95f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.64f, -22.62f)
                lineToRelative(48.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 203.25f, 331.32f)
                close()
                moveTo(380.05f, 202.53f)
                lineTo(268.17f, 330.53f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.66f, 336.0f)
                horizontalLineToRelative(-0.54f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -4.69f)
                lineToRelative(-47.94f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.64f, -22.62f)
                lineToRelative(29.8f, 29.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.68f, -0.39f)
                lineToRelative(95.0f, -108.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.1f, 21.06f)
                close()
            }
        }
        .build()
        return _checkmarkDoneCircle!!
    }

private var _checkmarkDoneCircle: ImageVector? = null
