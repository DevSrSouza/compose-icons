package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BowlingBallSharp: ImageVector
    get() {
        if (_bowlingBallSharp != null) {
            return _bowlingBallSharp!!
        }
        _bowlingBallSharp = Builder(name = "BowlingBallSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(286.0f, 230.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 286.0f, 230.0f)
                close()
                moveTo(294.0f, 154.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 294.0f, 154.0f)
                close()
                moveTo(362.0f, 198.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 362.0f, 198.0f)
                close()
            }
        }
        .build()
        return _bowlingBallSharp!!
    }

private var _bowlingBallSharp: ImageVector? = null
