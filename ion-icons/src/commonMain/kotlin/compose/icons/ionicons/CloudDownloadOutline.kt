package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CloudDownloadOutline: ImageVector
    get() {
        if (_cloudDownloadOutline != null) {
            return _cloudDownloadOutline!!
        }
        _cloudDownloadOutline = Builder(name = "CloudDownloadOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 336.0f)
                horizontalLineToRelative(76.0f)
                curveToRelative(55.0f, 0.0f, 100.0f, -21.21f, 100.0f, -75.6f)
                reflectiveCurveToRelative(-53.0f, -73.47f, -96.0f, -75.6f)
                curveTo(391.11f, 99.74f, 329.0f, 48.0f, 256.0f, 48.0f)
                curveToRelative(-69.0f, 0.0f, -113.44f, 45.79f, -128.0f, 91.2f)
                curveToRelative(-60.0f, 5.7f, -112.0f, 35.88f, -112.0f, 98.4f)
                reflectiveCurveTo(70.0f, 336.0f, 136.0f, 336.0f)
                horizontalLineToRelative(56.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 400.1f)
                lineToRelative(64.0f, 63.9f)
                lineToRelative(64.0f, -63.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 224.0f)
                lineTo(256.0f, 448.03f)
            }
        }
        .build()
        return _cloudDownloadOutline!!
    }

private var _cloudDownloadOutline: ImageVector? = null
