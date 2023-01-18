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

public val IonIcons.BookOutline: ImageVector
    get() {
        if (_bookOutline != null) {
            return _bookOutline!!
        }
        _bookOutline = Builder(name = "BookOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                curveToRelative(16.0f, -63.16f, 76.43f, -95.41f, 208.0f, -96.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                curveToRelative(-128.0f, 0.0f, -177.45f, 25.81f, -208.0f, 64.0f)
                curveToRelative(-30.37f, -38.0f, -80.0f, -64.0f, -208.0f, -64.0f)
                curveToRelative(-9.88f, 0.0f, -16.0f, -8.05f, -16.0f, -17.93f)
                verticalLineTo(80.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, true, 48.0f, 64.0f)
                curveTo(179.57f, 64.59f, 240.0f, 96.84f, 256.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                lineTo(256.0f, 448.0f)
            }
        }
        .build()
        return _bookOutline!!
    }

private var _bookOutline: ImageVector? = null
