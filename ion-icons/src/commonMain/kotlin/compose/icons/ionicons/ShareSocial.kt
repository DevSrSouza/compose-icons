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

public val IonIcons.ShareSocial: ImageVector
    get() {
        if (_shareSocial != null) {
            return _shareSocial!!
        }
        _shareSocial = Builder(name = "ShareSocial", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 336.0f)
                arcToRelative(63.78f, 63.78f, 0.0f, false, false, -46.12f, 19.7f)
                lineToRelative(-148.0f, -83.27f)
                arcToRelative(63.85f, 63.85f, 0.0f, false, false, 0.0f, -32.86f)
                lineToRelative(148.0f, -83.27f)
                arcToRelative(63.8f, 63.8f, 0.0f, true, false, -15.73f, -27.87f)
                lineToRelative(-148.0f, 83.27f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 88.6f)
                lineToRelative(148.0f, 83.27f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 384.0f, 336.0f)
                close()
            }
        }
        .build()
        return _shareSocial!!
    }

private var _shareSocial: ImageVector? = null
