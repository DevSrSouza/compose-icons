package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoCapacitor: ImageVector
    get() {
        if (_logoCapacitor != null) {
            return _logoCapacitor!!
        }
        _logoCapacitor = Builder(name = "LogoCapacitor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 101.09f)
                lineTo(372.37f, 208.72f)
                lineTo(479.23f, 315.78f)
                lineToRelative(-69.3f, 69.3f)
                lineTo(126.71f, 101.85f)
                lineTo(196.0f, 32.54f)
                lineTo(303.07f, 139.42f)
                lineTo(410.67f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.55f, 196.0f)
                lineToRelative(69.3f, -69.31f)
                lineTo(385.07f, 409.93f)
                lineToRelative(-69.3f, 69.3f)
                lineToRelative(-107.0f, -106.87f)
                lineTo(101.08f, 480.0f)
                lineTo(32.0f, 410.67f)
                lineTo(139.42f, 303.06f)
                close()
            }
        }
        .build()
        return _logoCapacitor!!
    }

private var _logoCapacitor: ImageVector? = null
