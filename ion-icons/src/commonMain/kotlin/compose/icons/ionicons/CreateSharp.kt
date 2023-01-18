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

public val IonIcons.CreateSharp: ImageVector
    get() {
        if (_createSharp != null) {
            return _createSharp!!
        }
        _createSharp = Builder(name = "CreateSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.37f, 49.2f)
                arcToRelative(22.07f, 22.07f, 0.0f, false, false, -31.88f, -0.76f)
                lineTo(414.18f, 66.69f)
                lineToRelative(31.18f, 31.1f)
                lineToRelative(18.0f, -17.91f)
                arcTo(22.16f, 22.16f, 0.0f, false, false, 464.37f, 49.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.76f, 336.0f)
                lineToRelative(-13.27f, 0.0f)
                lineToRelative(-31.49f, 0.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(0.0f, -31.49f)
                lineToRelative(0.0f, -13.27f)
                lineToRelative(9.4f, -9.38f)
                lineToRelative(138.14f, -137.86f)
                lineToRelative(-275.54f, 0.0f)
                lineToRelative(0.0f, 352.0f)
                lineToRelative(352.0f, 0.0f)
                lineToRelative(0.0f, -275.54f)
                lineToRelative(-137.86f, 138.14f)
                lineToRelative(-9.38f, 9.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 143.16f)
                lineToRelative(32.79f, -32.86f)
                lineToRelative(-31.09f, -31.09f)
                lineToRelative(-32.85f, 32.79f)
                lineToRelative(31.15f, 0.0f)
                lineToRelative(0.0f, 31.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 304.0f)
                lineToRelative(31.49f, 0.0f)
                lineToRelative(160.51f, -160.84f)
                lineToRelative(0.0f, -31.16f)
                lineToRelative(-31.15f, 0.0f)
                lineToRelative(-160.85f, 160.51f)
                lineToRelative(0.0f, 31.49f)
                close()
            }
        }
        .build()
        return _createSharp!!
    }

private var _createSharp: ImageVector? = null
