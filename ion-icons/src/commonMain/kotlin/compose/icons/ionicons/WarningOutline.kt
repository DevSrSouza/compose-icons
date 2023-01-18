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

public val IonIcons.WarningOutline: ImageVector
    get() {
        if (_warningOutline != null) {
            return _warningOutline!!
        }
        _warningOutline = Builder(name = "WarningOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(85.57f, 446.25f)
                horizontalLineTo(426.43f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 28.17f, -47.17f)
                lineTo(284.18f, 82.58f)
                curveToRelative(-12.09f, -22.44f, -44.27f, -22.44f, -56.36f, 0.0f)
                lineTo(57.4f, 399.08f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 85.57f, 446.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(250.26f, 195.39f)
                lineToRelative(5.74f, 122.0f)
                lineToRelative(5.73f, -121.95f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, false, -5.79f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 250.26f, 195.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 397.25f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 256.0f, 397.25f)
                close()
            }
        }
        .build()
        return _warningOutline!!
    }

private var _warningOutline: ImageVector? = null
