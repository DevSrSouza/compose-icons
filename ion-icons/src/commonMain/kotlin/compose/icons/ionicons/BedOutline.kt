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

public val IonIcons.BedOutline: ImageVector
    get() {
        if (_bedOutline != null) {
            return _bedOutline!!
        }
        _bedOutline = Builder(name = "BedOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 240.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(136.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineTo(376.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineTo(240.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 416.0f)
                verticalLineTo(304.0f)
                arcToRelative(64.19f, 64.19f, 0.0f, false, true, 64.0f, -64.0f)
                horizontalLineTo(400.0f)
                arcToRelative(64.19f, 64.19f, 0.0f, false, true, 64.0f, 64.0f)
                verticalLineTo(416.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 416.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineTo(440.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 240.0f)
                verticalLineTo(224.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 240.0f)
                verticalLineTo(224.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(16.0f)
            }
        }
        .build()
        return _bedOutline!!
    }

private var _bedOutline: ImageVector? = null
