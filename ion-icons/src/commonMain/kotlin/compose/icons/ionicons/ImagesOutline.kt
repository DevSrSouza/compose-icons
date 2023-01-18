package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ImagesOutline: ImageVector
    get() {
        if (_imagesOutline != null) {
            return _imagesOutline!!
        }
        _imagesOutline = Builder(name = "ImagesOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 112.0f)
                verticalLineTo(96.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, -48.0f, -48.0f)
                horizontalLineTo(64.0f)
                arcTo(48.14f, 48.14f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineTo(352.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(141.99f, 128.0f)
                lineTo(450.01f, 128.0f)
                arcTo(45.99f, 45.99f, 0.0f, false, true, 496.0f, 173.99f)
                lineTo(496.0f, 418.01f)
                arcTo(45.99f, 45.99f, 0.0f, false, true, 450.01f, 464.0f)
                lineTo(141.99f, 464.0f)
                arcTo(45.99f, 45.99f, 0.0f, false, true, 96.0f, 418.01f)
                lineTo(96.0f, 173.99f)
                arcTo(45.99f, 45.99f, 0.0f, false, true, 141.99f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(342.15f, 219.64f)
                arcToRelative(30.77f, 30.55f, 0.0f, true, false, 61.54f, 0.0f)
                arcToRelative(30.77f, 30.55f, 0.0f, true, false, -61.54f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(342.15f, 372.17f)
                lineTo(255.0f, 285.78f)
                arcToRelative(30.93f, 30.93f, 0.0f, false, false, -42.18f, -1.21f)
                lineTo(96.0f, 387.64f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(265.23f, 464.0f)
                lineTo(383.82f, 346.27f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, 41.46f, -1.87f)
                lineTo(496.0f, 402.91f)
            }
        }
        .build()
        return _imagesOutline!!
    }

private var _imagesOutline: ImageVector? = null
