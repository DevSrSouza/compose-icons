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

public val IonIcons.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 287.18f)
                verticalLineTo(81.0f)
                curveToRelative(0.0f, -35.12f, -27.89f, -64.42f, -63.0f, -64.95f)
                arcToRelative(64.08f, 64.08f, 0.0f, false, false, -65.0f, 64.0f)
                verticalLineTo(287.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.18f, 6.37f)
                arcTo(113.48f, 113.48f, 0.0f, false, false, 144.0f, 384.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, 224.0f, 0.0f)
                arcToRelative(113.48f, 113.48f, 0.0f, false, false, -44.82f, -90.45f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 320.0f, 287.18f)
                close()
                moveTo(254.07f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -22.0f, -89.54f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.0f, -13.84f)
                verticalLineTo(112.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 112.0f)
                verticalLineTo(328.58f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 8.15f, 13.94f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 254.07f, 432.0f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
