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

public val IonIcons.MedalSharp: ImageVector
    get() {
        if (_medalSharp != null) {
            return _medalSharp!!
        }
        _medalSharp = Builder(name = "MedalSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 32.0f)
                lineToRelative(-64.0f, 128.0f)
                lineToRelative(289.11f, 0.0f)
                lineToRelative(80.22f, -128.0f)
                lineToRelative(-305.33f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 144.0f)
                lineTo(424.0f, 32.0f)
                lineTo(298.0f, 231.08f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -84.0f, 0.0f)
                lineTo(189.53f, 192.0f)
                horizontalLineTo(43.82f)
                lineToRelative(86.66f, 134.89f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 251.0f, 0.0f)
                close()
                moveTo(256.0f, 422.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, true, 70.0f, -70.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, true, 256.0f, 422.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _medalSharp!!
    }

private var _medalSharp: ImageVector? = null
