package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.86f, 384.0f)
                horizontalLineTo(64.14f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 16.0f, 335.86f)
                verticalLineTo(128.14f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 64.14f, 80.0f)
                horizontalLineTo(447.86f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 496.0f, 128.14f)
                verticalLineTo(335.86f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 447.86f, 384.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 416.0f)
                lineTo(384.0f, 416.0f)
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
