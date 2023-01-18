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

public val IonIcons.SparklesSharp: ImageVector
    get() {
        if (_sparklesSharp != null) {
            return _sparklesSharp!!
        }
        _sparklesSharp = Builder(name = "SparklesSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 512.0f)
                lineTo(155.62f, 372.38f)
                lineTo(16.0f, 320.0f)
                lineToRelative(139.62f, -52.38f)
                lineTo(208.0f, 128.0f)
                lineToRelative(52.38f, 139.62f)
                lineTo(400.0f, 320.0f)
                lineTo(260.38f, 372.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 176.0f)
                lineTo(64.43f, 111.57f)
                lineTo(0.0f, 88.0f)
                lineTo(64.43f, 64.43f)
                lineTo(88.0f, 0.0f)
                lineToRelative(23.57f, 64.43f)
                lineTo(176.0f, 88.0f)
                lineToRelative(-64.43f, 23.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 256.0f)
                lineToRelative(-31.11f, -80.89f)
                lineTo(288.0f, 144.0f)
                lineToRelative(80.89f, -31.11f)
                lineTo(400.0f, 32.0f)
                lineToRelative(31.11f, 80.89f)
                lineTo(512.0f, 144.0f)
                lineToRelative(-80.89f, 31.11f)
                close()
            }
        }
        .build()
        return _sparklesSharp!!
    }

private var _sparklesSharp: ImageVector? = null
