package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MedicalOutline: ImageVector
    get() {
        if (_medicalOutline != null) {
            return _medicalOutline!!
        }
        _medicalOutline = Builder(name = "MedicalOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(429.93f, 174.27f)
                lineToRelative(-16.47f, -28.59f)
                arcToRelative(15.49f, 15.49f, 0.0f, false, false, -21.15f, -5.7f)
                lineToRelative(-98.39f, 57.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -3.5f)
                lineTo(288.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineToRelative(0.07f, 113.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 3.5f)
                lineToRelative(-98.39f, -57.0f)
                arcToRelative(15.49f, 15.49f, 0.0f, false, false, -21.15f, 5.7f)
                lineTo(82.07f, 174.37f)
                arcToRelative(15.42f, 15.42f, 0.0f, false, false, 5.69f, 21.1f)
                lineToRelative(98.49f, 57.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.9f)
                lineTo(87.76f, 316.53f)
                arcToRelative(15.54f, 15.54f, 0.0f, false, false, -5.69f, 21.1f)
                lineToRelative(16.47f, 28.59f)
                arcToRelative(15.49f, 15.49f, 0.0f, false, false, 21.15f, 5.7f)
                lineToRelative(98.39f, -57.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, 3.5f)
                lineTo(224.0f, 432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineToRelative(-0.07f, -113.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -3.5f)
                lineToRelative(98.39f, 57.0f)
                arcToRelative(15.49f, 15.49f, 0.0f, false, false, 21.15f, -5.7f)
                lineToRelative(16.47f, -28.59f)
                arcToRelative(15.42f, 15.42f, 0.0f, false, false, -5.69f, -21.1f)
                lineToRelative(-98.49f, -57.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.9f)
                lineToRelative(98.49f, -57.08f)
                arcTo(15.51f, 15.51f, 0.0f, false, false, 429.93f, 174.27f)
                close()
            }
        }
        .build()
        return _medicalOutline!!
    }

private var _medicalOutline: ImageVector? = null
