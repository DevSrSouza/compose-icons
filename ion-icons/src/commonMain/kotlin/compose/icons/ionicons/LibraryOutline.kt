package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LibraryOutline: ImageVector
    get() {
        if (_libraryOutline != null) {
            return _libraryOutline!!
        }
        _libraryOutline = Builder(name = "LibraryOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 112.0f)
                lineTo(96.0f, 448.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 448.0f)
                lineTo(32.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 224.0f)
                lineTo(240.0f, 224.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 400.0f)
                lineTo(240.0f, 400.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 160.0f)
                lineTo(224.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 176.0f)
                lineTo(240.0f, 448.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 464.0f)
                lineTo(128.0f, 464.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 448.0f)
                lineTo(112.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(272.0f, 48.0f)
                lineTo(336.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 352.0f, 64.0f)
                lineTo(352.0f, 448.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 336.0f, 464.0f)
                lineTo(272.0f, 464.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 448.0f)
                lineTo(256.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(422.46f, 96.11f)
                lineToRelative(-40.4f, 4.25f)
                curveToRelative(-11.12f, 1.17f, -19.18f, 11.57f, -17.93f, 23.1f)
                lineToRelative(34.92f, 321.59f)
                curveToRelative(1.26f, 11.53f, 11.37f, 20.0f, 22.49f, 18.84f)
                lineToRelative(40.4f, -4.25f)
                curveToRelative(11.12f, -1.17f, 19.18f, -11.57f, 17.93f, -23.1f)
                lineTo(445.0f, 115.0f)
                curveTo(443.69f, 103.42f, 433.58f, 94.94f, 422.46f, 96.11f)
                close()
            }
        }
        .build()
        return _libraryOutline!!
    }

private var _libraryOutline: ImageVector? = null
