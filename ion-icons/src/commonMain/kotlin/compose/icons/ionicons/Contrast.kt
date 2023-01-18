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

public val IonIcons.Contrast: ImageVector
    get() {
        if (_contrast != null) {
            return _contrast!!
        }
        _contrast = Builder(name = "Contrast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                arcTo(222.53f, 222.53f, 0.0f, false, false, 256.0f, 32.0f)
                close()
                moveTo(64.0f, 256.0f)
                curveTo(64.0f, 150.13f, 150.13f, 64.0f, 256.0f, 64.0f)
                verticalLineTo(448.0f)
                curveTo(150.13f, 448.0f, 64.0f, 361.87f, 64.0f, 256.0f)
                close()
            }
        }
        .build()
        return _contrast!!
    }

private var _contrast: ImageVector? = null
