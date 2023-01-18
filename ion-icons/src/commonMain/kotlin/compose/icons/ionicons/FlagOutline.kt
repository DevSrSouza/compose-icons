package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlagOutline: ImageVector
    get() {
        if (_flagOutline != null) {
            return _flagOutline!!
        }
        _flagOutline = Builder(name = "FlagOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 464.0f)
                verticalLineTo(68.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, -6.9f)
                curveTo(91.81f, 56.66f, 112.92f, 48.0f, 160.0f, 48.0f)
                curveToRelative(64.0f, 0.0f, 145.0f, 48.0f, 192.0f, 48.0f)
                arcToRelative(199.53f, 199.53f, 0.0f, false, false, 77.23f, -15.77f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 432.0f, 82.08f)
                verticalLineTo(301.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.39f, 3.65f)
                curveTo(421.37f, 308.7f, 392.33f, 320.0f, 352.0f, 320.0f)
                curveToRelative(-48.0f, 0.0f, -128.0f, -32.0f, -192.0f, -32.0f)
                reflectiveCurveToRelative(-80.0f, 16.0f, -80.0f, 16.0f)
            }
        }
        .build()
        return _flagOutline!!
    }

private var _flagOutline: ImageVector? = null
