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

public val IonIcons.CloudUploadOutline: ImageVector
    get() {
        if (_cloudUploadOutline != null) {
            return _cloudUploadOutline!!
        }
        _cloudUploadOutline = Builder(name = "CloudUploadOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 367.79f)
                horizontalLineToRelative(76.0f)
                curveToRelative(55.0f, 0.0f, 100.0f, -29.21f, 100.0f, -83.6f)
                reflectiveCurveToRelative(-53.0f, -81.47f, -96.0f, -83.6f)
                curveToRelative(-8.89f, -85.06f, -71.0f, -136.8f, -144.0f, -136.8f)
                curveToRelative(-69.0f, 0.0f, -113.44f, 45.79f, -128.0f, 91.2f)
                curveToRelative(-60.0f, 5.7f, -112.0f, 43.88f, -112.0f, 106.4f)
                reflectiveCurveToRelative(54.0f, 106.4f, 120.0f, 106.4f)
                horizontalLineToRelative(56.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 255.79f)
                lineToRelative(-64.0f, -64.0f)
                lineToRelative(-64.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.21f)
                lineTo(256.0f, 207.79f)
            }
        }
        .build()
        return _cloudUploadOutline!!
    }

private var _cloudUploadOutline: ImageVector? = null
