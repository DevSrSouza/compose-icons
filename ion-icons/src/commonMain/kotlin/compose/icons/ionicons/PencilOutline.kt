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

public val IonIcons.PencilOutline: ImageVector
    get() {
        if (_pencilOutline != null) {
            return _pencilOutline!!
        }
        _pencilOutline = Builder(name = "PencilOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(364.13f, 125.25f)
                lineToRelative(-277.13f, 277.75f)
                lineToRelative(-23.0f, 45.0f)
                lineToRelative(44.99f, -23.0f)
                lineToRelative(277.76f, -277.13f)
                lineToRelative(-22.62f, -22.62f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(420.69f, 68.69f)
                lineTo(398.07f, 91.31f)
                lineToRelative(22.62f, 22.63f)
                lineToRelative(22.62f, -22.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 420.69f, 68.69f)
                close()
            }
        }
        .build()
        return _pencilOutline!!
    }

private var _pencilOutline: ImageVector? = null
