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

public val IonIcons.GolfOutline: ImageVector
    get() {
        if (_golfOutline != null) {
            return _golfOutline!!
        }
        _golfOutline = Builder(name = "GolfOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 400.0f)
                lineToRelative(0.0f, -368.0f)
                lineToRelative(176.0f, 80.0f)
                lineToRelative(-176.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 336.0f)
                curveToRelative(-87.0f, 0.0f, -175.3f, 43.2f, -191.64f, 124.74f)
                curveTo(62.39f, 470.57f, 68.57f, 480.0f, 80.0f, 480.0f)
                horizontalLineTo(432.0f)
                curveToRelative(11.44f, 0.0f, 17.62f, -9.43f, 15.65f, -19.26f)
                curveTo(431.3f, 379.2f, 343.0f, 336.0f, 256.0f, 336.0f)
                close()
            }
        }
        .build()
        return _golfOutline!!
    }

private var _golfOutline: ImageVector? = null
