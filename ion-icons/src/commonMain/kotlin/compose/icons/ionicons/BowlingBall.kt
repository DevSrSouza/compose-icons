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

public val IonIcons.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) {
            return _bowlingBall!!
        }
        _bowlingBall = Builder(name = "BowlingBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(288.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 288.0f, 224.0f)
                close()
                moveTo(296.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 296.0f, 152.0f)
                close()
                moveTo(360.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 360.0f, 192.0f)
                close()
            }
        }
        .build()
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
