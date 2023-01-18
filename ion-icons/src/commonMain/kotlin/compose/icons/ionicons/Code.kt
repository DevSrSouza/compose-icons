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

public val IonIcons.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 389.0f)
                arcToRelative(20.91f, 20.91f, 0.0f, false, true, -13.82f, -5.2f)
                lineToRelative(-128.0f, -112.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 0.0f, -31.6f)
                lineToRelative(128.0f, -112.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 27.66f, 31.61f)
                lineTo(63.89f, 256.0f)
                lineToRelative(109.94f, 96.19f)
                arcTo(21.0f, 21.0f, 0.0f, false, true, 160.0f, 389.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 389.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -13.84f, -36.81f)
                lineTo(448.11f, 256.0f)
                lineTo(338.17f, 159.81f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 27.66f, -31.61f)
                lineToRelative(128.0f, 112.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 0.0f, 31.6f)
                lineToRelative(-128.0f, 112.0f)
                arcTo(20.89f, 20.89f, 0.0f, false, true, 352.0f, 389.0f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
