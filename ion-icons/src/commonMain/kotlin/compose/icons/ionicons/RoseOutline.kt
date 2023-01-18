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

public val IonIcons.RoseOutline: ImageVector
    get() {
        if (_roseOutline != null) {
            return _roseOutline!!
        }
        _roseOutline = Builder(name = "RoseOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 128.0f)
                curveToRelative(-18.9f, 4.25f, -36.8f, 8.94f, -53.7f, 13.95f)
                curveToRelative(-40.5f, 12.0f, -75.5f, 27.15f, -105.4f, 41.65f)
                curveToRelative(-19.3f, 9.37f, -26.2f, 13.51f, -51.5f, 28.23f)
                curveTo(147.0f, 245.52f, 112.0f, 289.23f, 112.0f, 354.64f)
                curveTo(112.0f, 428.55f, 167.6f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveToRelative(144.0f, -55.81f, 144.0f, -129.72f)
                reflectiveCurveTo(339.0f, 225.24f, 416.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(264.0f, 180.19f)
                curveToRelative(-19.69f, -27.0f, -38.2f, -38.69f, -52.7f, -46.59f)
                curveTo(162.6f, 107.1f, 96.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(41.5f, 43.7f, 37.2f, 90.1f, 32.0f, 128.0f)
                curveToRelative(0.0f, 0.0f, -3.87f, 32.88f, 1.91f, 58.41f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(372.0f, 139.15f)
                curveTo(356.55f, 102.6f, 336.0f, 64.0f, 336.0f, 64.0f)
                reflectiveCurveToRelative(-63.32f, 0.0f, -135.69f, 64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(253.48f, 87.57f)
                curveTo(221.25f, 45.81f, 176.0f, 32.0f, 176.0f, 32.0f)
                curveToRelative(-15.3f, 20.8f, -28.79f, 51.58f, -34.87f, 74.17f)
            }
        }
        .build()
        return _roseOutline!!
    }

private var _roseOutline: ImageVector? = null
