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

public val IonIcons.LogoVue: ImageVector
    get() {
        if (_logoVue != null) {
            return _logoVue!!
        }
        _logoVue = Builder(name = "LogoVue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 144.03f)
                lineToRelative(-55.49f, -96.11f)
                lineToRelative(-79.43f, 0.0f)
                lineToRelative(134.92f, 233.69f)
                lineToRelative(134.92f, -233.69f)
                lineToRelative(-79.43f, 0.0f)
                lineToRelative(-55.49f, 96.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(409.4f, 47.92f)
                lineToRelative(-153.4f, 265.69f)
                lineToRelative(-153.4f, -265.69f)
                lineToRelative(-86.86f, 0.0f)
                lineToRelative(240.26f, 416.16f)
                lineToRelative(240.26f, -416.16f)
                lineToRelative(-86.86f, 0.0f)
                close()
            }
        }
        .build()
        return _logoVue!!
    }

private var _logoVue: ImageVector? = null
