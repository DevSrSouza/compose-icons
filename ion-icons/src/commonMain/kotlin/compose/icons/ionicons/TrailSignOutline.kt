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

public val IonIcons.TrailSignOutline: ImageVector
    get() {
        if (_trailSignOutline != null) {
            return _trailSignOutline!!
        }
        _trailSignOutline = Builder(name = "TrailSignOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 400.0f)
                lineTo(256.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 208.0f)
                lineTo(256.0f, 272.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                lineTo(256.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 208.0f)
                horizontalLineTo(102.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -4.69f)
                lineTo(32.0f, 144.0f)
                lineTo(91.31f, 84.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 102.63f, 80.0f)
                horizontalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 400.0f)
                horizontalLineTo(409.37f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.32f, -4.69f)
                lineTo(480.0f, 336.0f)
                lineToRelative(-59.31f, -59.31f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 409.37f, 272.0f)
                horizontalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 400.0f)
                close()
            }
        }
        .build()
        return _trailSignOutline!!
    }

private var _trailSignOutline: ImageVector? = null
