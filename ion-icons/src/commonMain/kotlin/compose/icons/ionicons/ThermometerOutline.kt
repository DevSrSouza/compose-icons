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

public val IonIcons.ThermometerOutline: ImageVector
    get() {
        if (_thermometerOutline != null) {
            return _thermometerOutline!!
        }
        _thermometerOutline = Builder(name = "ThermometerOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(307.72f, 302.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.72f, -6.75f)
                verticalLineTo(80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineTo(295.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.71f, 6.74f)
                arcToRelative(97.51f, 97.51f, 0.0f, false, false, -44.19f, 86.07f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 352.0f, 384.0f)
                arcTo(97.49f, 97.49f, 0.0f, false, false, 307.72f, 302.27f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                lineTo(256.0f, 384.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 384.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
        }
        .build()
        return _thermometerOutline!!
    }

private var _thermometerOutline: ImageVector? = null
