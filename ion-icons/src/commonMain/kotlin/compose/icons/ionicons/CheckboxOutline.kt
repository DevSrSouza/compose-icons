package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CheckboxOutline: ImageVector
    get() {
        if (_checkboxOutline != null) {
            return _checkboxOutline!!
        }
        _checkboxOutline = Builder(name = "CheckboxOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 176.0f)
                lineToRelative(-134.4f, 160.0f)
                lineToRelative(-57.6f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 64.0f)
                lineTo(400.0f, 64.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 448.0f, 112.0f)
                lineTo(448.0f, 400.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 400.0f, 448.0f)
                lineTo(112.0f, 448.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 64.0f, 400.0f)
                lineTo(64.0f, 112.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 112.0f, 64.0f)
                close()
            }
        }
        .build()
        return _checkboxOutline!!
    }

private var _checkboxOutline: ImageVector? = null
