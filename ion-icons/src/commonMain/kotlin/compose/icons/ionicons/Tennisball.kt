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

public val IonIcons.Tennisball: ImageVector
    get() {
        if (_tennisball != null) {
            return _tennisball!!
        }
        _tennisball = Builder(name = "Tennisball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                arcToRelative(192.55f, 192.55f, 0.0f, false, false, 32.0f, -2.68f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 258.68f, 32.0f)
                arcTo(192.55f, 192.55f, 0.0f, false, false, 256.0f, 64.0f)
                curveTo(256.0f, 169.87f, 342.13f, 256.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.35f, 480.0f)
                curveToRelative(0.94f, -5.67f, 1.65f, -11.4f, 2.09f, -17.18f)
                curveToRelative(0.37f, -4.88f, 0.56f, -9.86f, 0.56f, -14.79f)
                curveToRelative(0.0f, -105.87f, -86.13f, -192.0f, -192.0f, -192.0f)
                arcToRelative(192.55f, 192.55f, 0.0f, false, false, -32.0f, 2.68f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 253.35f, 480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.61f, 222.39f)
                arcTo(222.53f, 222.53f, 0.0f, false, true, 224.0f, 64.0f)
                arcToRelative(226.07f, 226.07f, 0.0f, false, true, 2.0f, -30.0f)
                arcTo(224.1f, 224.1f, 0.0f, false, false, 34.0f, 226.0f)
                arcToRelative(226.07f, 226.07f, 0.0f, false, true, 30.0f, -2.0f)
                arcToRelative(222.53f, 222.53f, 0.0f, false, true, 158.39f, 65.61f)
                arcTo(222.53f, 222.53f, 0.0f, false, true, 288.0f, 448.0f)
                curveToRelative(0.0f, 5.74f, -0.22f, 11.53f, -0.65f, 17.22f)
                quadToRelative(-0.5f, 6.42f, -1.36f, 12.79f)
                arcTo(224.12f, 224.12f, 0.0f, false, false, 478.0f, 286.0f)
                arcToRelative(226.07f, 226.07f, 0.0f, false, true, -30.0f, 2.0f)
                arcTo(222.53f, 222.53f, 0.0f, false, true, 289.61f, 222.39f)
                close()
            }
        }
        .build()
        return _tennisball!!
    }

private var _tennisball: ImageVector? = null
