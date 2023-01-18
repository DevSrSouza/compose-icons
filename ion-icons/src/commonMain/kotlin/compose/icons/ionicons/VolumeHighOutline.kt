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

public val IonIcons.VolumeHighOutline: ImageVector
    get() {
        if (_volumeHighOutline != null) {
            return _volumeHighOutline!!
        }
        _volumeHighOutline = Builder(name = "VolumeHighOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(126.0f, 192.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(312.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(69.65f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, 10.14f, 3.54f)
                lineToRelative(91.47f, 74.89f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 392.0f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.74f, -6.43f)
                lineToRelative(-91.47f, 74.89f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 126.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 320.0f)
                curveToRelative(9.74f, -19.38f, 16.0f, -40.84f, 16.0f, -64.0f)
                curveToRelative(0.0f, -23.48f, -6.0f, -44.42f, -16.0f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(368.0f, 368.0f)
                curveToRelative(19.48f, -33.92f, 32.0f, -64.06f, 32.0f, -112.0f)
                reflectiveCurveToRelative(-12.0f, -77.74f, -32.0f, -112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 416.0f)
                curveToRelative(30.0f, -46.0f, 48.0f, -91.43f, 48.0f, -160.0f)
                reflectiveCurveTo(446.0f, 143.0f, 416.0f, 96.0f)
            }
        }
        .build()
        return _volumeHighOutline!!
    }

private var _volumeHighOutline: ImageVector? = null
