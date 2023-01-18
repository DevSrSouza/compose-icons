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

public val IonIcons.BeakerOutline: ImageVector
    get() {
        if (_beakerOutline != null) {
            return _beakerOutline!!
        }
        _beakerOutline = Builder(name = "BeakerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(445.2f, 48.05f)
                lineTo(398.0f, 48.0f)
                horizontalLineTo(128.0f)
                curveTo(73.7f, 48.0f, 64.0f, 83.7f, 64.0f, 96.0f)
                curveToRelative(30.3f, 4.2f, 48.0f, 8.0f, 48.0f, 40.0f)
                verticalLineTo(400.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 176.0f, 464.0f)
                horizontalLineTo(368.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -19.0f, 11.5f, -38.35f, 12.6f, -40.0f)
                curveToRelative(1.2f, -1.9f, 3.4f, -4.4f, 3.4f, -5.5f)
                reflectiveCurveTo(447.7f, 48.05f, 445.2f, 48.05f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 176.0f)
                lineTo(432.0f, 176.0f)
            }
        }
        .build()
        return _beakerOutline!!
    }

private var _beakerOutline: ImageVector? = null
