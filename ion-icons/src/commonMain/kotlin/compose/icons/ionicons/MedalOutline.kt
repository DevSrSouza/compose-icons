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

public val IonIcons.MedalOutline: ImageVector
    get() {
        if (_medalOutline != null) {
            return _medalOutline!!
        }
        _medalOutline = Builder(name = "MedalOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                moveToRelative(-112.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, -224.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(147.0f, 323.0f)
                lineTo(41.84f, 159.32f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -1.7f, -31.61f)
                lineToRelative(31.0f, -62.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 99.78f, 48.0f)
                horizontalLineTo(412.22f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 28.62f, 17.69f)
                lineToRelative(31.0f, 62.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -1.7f, 31.61f)
                lineTo(365.0f, 323.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(371.0f, 144.0f)
                lineTo(37.0f, 144.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(428.74f, 52.6f)
                lineTo(305.0f, 250.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(140.55f, 144.0f)
                lineTo(207.0f, 250.0f)
            }
        }
        .build()
        return _medalOutline!!
    }

private var _medalOutline: ImageVector? = null
