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

public val IonIcons.BarbellOutline: ImageVector
    get() {
        if (_barbellOutline != null) {
            return _barbellOutline!!
        }
        _barbellOutline = Builder(name = "BarbellOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                lineTo(464.0f, 256.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 128.0f)
                lineTo(400.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 144.0f)
                lineTo(416.0f, 368.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 400.0f, 384.0f)
                lineTo(400.0f, 384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 384.0f, 368.0f)
                lineTo(384.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 400.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 128.0f)
                lineTo(112.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                lineTo(128.0f, 368.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 384.0f)
                lineTo(112.0f, 384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 368.0f)
                lineTo(96.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 192.0f)
                lineTo(40.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 200.0f)
                lineTo(48.0f, 312.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 320.0f)
                lineTo(40.0f, 320.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 312.0f)
                lineTo(32.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(472.0f, 192.0f)
                lineTo(472.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 480.0f, 200.0f)
                lineTo(480.0f, 312.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 472.0f, 320.0f)
                lineTo(472.0f, 320.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 464.0f, 312.0f)
                lineTo(464.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 472.0f, 192.0f)
                close()
            }
        }
        .build()
        return _barbellOutline!!
    }

private var _barbellOutline: ImageVector? = null
