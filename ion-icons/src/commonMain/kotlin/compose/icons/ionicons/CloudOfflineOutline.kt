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

public val IonIcons.CloudOfflineOutline: ImageVector
    get() {
        if (_cloudOfflineOutline != null) {
            return _cloudOfflineOutline!!
        }
        _cloudOfflineOutline = Builder(name = "CloudOfflineOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(93.72f, 183.25f)
                curveTo(49.49f, 198.05f, 16.0f, 233.1f, 16.0f, 288.0f)
                curveToRelative(0.0f, 66.0f, 54.0f, 112.0f, 120.0f, 112.0f)
                horizontalLineTo(320.37f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(467.82f, 377.74f)
                curveTo(485.24f, 363.3f, 496.0f, 341.61f, 496.0f, 312.0f)
                curveToRelative(0.0f, -59.82f, -53.0f, -85.76f, -96.0f, -88.0f)
                curveToRelative(-8.89f, -89.54f, -71.0f, -144.0f, -144.0f, -144.0f)
                curveToRelative(-26.16f, 0.0f, -48.79f, 6.93f, -67.6f, 18.14f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 448.0f)
                lineTo(64.0f, 64.0f)
            }
        }
        .build()
        return _cloudOfflineOutline!!
    }

private var _cloudOfflineOutline: ImageVector? = null
