package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ServerOutline: ImageVector
    get() {
        if (_serverOutline != null) {
            return _serverOutline!!
        }
        _serverOutline = Builder(name = "ServerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 128.0f)
                arcToRelative(192.0f, 80.0f, 0.0f, true, false, 384.0f, 0.0f)
                arcToRelative(192.0f, 80.0f, 0.0f, true, false, -384.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 214.0f)
                curveToRelative(0.0f, 44.18f, -86.0f, 80.0f, -192.0f, 80.0f)
                reflectiveCurveTo(64.0f, 258.18f, 64.0f, 214.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 300.0f)
                curveToRelative(0.0f, 44.18f, -86.0f, 80.0f, -192.0f, 80.0f)
                reflectiveCurveTo(64.0f, 344.18f, 64.0f, 300.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 127.24f)
                verticalLineTo(384.76f)
                curveTo(64.0f, 428.52f, 150.0f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(192.0f, -35.48f, 192.0f, -79.24f)
                verticalLineTo(127.24f)
            }
        }
        .build()
        return _serverOutline!!
    }

private var _serverOutline: ImageVector? = null
