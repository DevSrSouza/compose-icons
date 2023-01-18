package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HeadsetOutline: ImageVector
    get() {
        if (_headsetOutline != null) {
            return _headsetOutline!!
        }
        _headsetOutline = Builder(name = "HeadsetOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(83.0f, 384.0f)
                curveToRelative(-13.0f, -33.0f, -35.0f, -93.37f, -35.0f, -128.0f)
                curveTo(48.0f, 141.12f, 149.33f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.12f, 208.0f, 208.0f)
                curveToRelative(0.0f, 34.63f, -23.0f, 97.0f, -35.0f, 128.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(108.39f, 270.13f)
                lineToRelative(-13.69f, 8.0f)
                horizontalLineToRelative(0.0f)
                curveTo(64.47f, 295.83f, 63.0f, 350.54f, 91.32f, 400.33f)
                reflectiveCurveToRelative(75.87f, 75.81f, 106.1f, 58.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(13.69f, -8.0f)
                arcToRelative(16.16f, 16.16f, 0.0f, false, false, 5.78f, -21.87f)
                lineTo(130.0f, 276.0f)
                arcTo(15.74f, 15.74f, 0.0f, false, false, 108.39f, 270.13f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(403.61f, 270.13f)
                lineToRelative(13.69f, 8.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(30.23f, 17.69f, 31.74f, 72.4f, 3.38f, 122.19f)
                reflectiveCurveToRelative(-75.87f, 75.81f, -106.1f, 58.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-13.69f, -8.0f)
                arcToRelative(16.16f, 16.16f, 0.0f, false, true, -5.78f, -21.87f)
                lineTo(382.0f, 276.0f)
                arcTo(15.74f, 15.74f, 0.0f, false, true, 403.61f, 270.13f)
                close()
            }
        }
        .build()
        return _headsetOutline!!
    }

private var _headsetOutline: ImageVector? = null
