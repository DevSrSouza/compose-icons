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

public val IonIcons.ShareSocialSharp: ImageVector
    get() {
        if (_shareSocialSharp != null) {
            return _shareSocialSharp!!
        }
        _shareSocialSharp = Builder(name = "ShareSocialSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.0f, 324.0f)
                arcToRelative(69.78f, 69.78f, 0.0f, false, false, -48.83f, 19.91f)
                lineTo(202.0f, 272.41f)
                arcToRelative(69.68f, 69.68f, 0.0f, false, false, 0.0f, -32.82f)
                lineToRelative(127.13f, -71.5f)
                arcTo(69.76f, 69.76f, 0.0f, true, false, 308.87f, 129.0f)
                lineToRelative(-130.13f, 73.2f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, false, 0.0f, 107.56f)
                lineTo(308.87f, 383.0f)
                arcTo(70.0f, 70.0f, 0.0f, true, false, 378.0f, 324.0f)
                close()
            }
        }
        .build()
        return _shareSocialSharp!!
    }

private var _shareSocialSharp: ImageVector? = null
