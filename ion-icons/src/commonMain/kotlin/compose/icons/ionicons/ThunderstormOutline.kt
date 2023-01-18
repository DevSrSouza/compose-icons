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

public val IonIcons.ThunderstormOutline: ImageVector
    get() {
        if (_thunderstormOutline != null) {
            return _thunderstormOutline!!
        }
        _thunderstormOutline = Builder(name = "ThunderstormOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 352.0f)
                lineTo(96.0f, 400.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 432.0f)
                lineTo(120.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 352.0f)
                lineTo(376.0f, 400.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 432.0f)
                lineTo(400.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 304.0f)
                lineToRelative(-16.0f, 96.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(80.0f, -112.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(16.0f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(404.33f, 152.89f)
                horizontalLineTo(392.2f)
                curveTo(384.71f, 84.85f, 326.14f, 32.0f, 256.0f, 32.0f)
                arcToRelative(136.39f, 136.39f, 0.0f, false, false, -128.63f, 90.67f)
                horizontalLineTo(122.8f)
                curveToRelative(-49.94f, 0.0f, -90.8f, 40.8f, -90.8f, 90.66f)
                horizontalLineToRelative(0.0f)
                curveTo(32.0f, 263.2f, 72.86f, 304.0f, 122.8f, 304.0f)
                horizontalLineTo(404.33f)
                curveTo(446.0f, 304.0f, 480.0f, 270.0f, 480.0f, 228.44f)
                horizontalLineToRelative(0.0f)
                curveTo(480.0f, 186.89f, 446.0f, 152.89f, 404.33f, 152.89f)
                close()
            }
        }
        .build()
        return _thunderstormOutline!!
    }

private var _thunderstormOutline: ImageVector? = null
