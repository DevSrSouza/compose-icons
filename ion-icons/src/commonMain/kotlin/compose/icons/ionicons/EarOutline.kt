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

public val IonIcons.EarOutline: ImageVector
    get() {
        if (_earOutline != null) {
            return _earOutline!!
        }
        _earOutline = Builder(name = "EarOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(335.72f, 330.76f)
                curveTo(381.73f, 299.5f, 416.0f, 251.34f, 416.0f, 192.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, false, false, -320.0f, 0.0f)
                verticalLineTo(398.57f)
                curveTo(96.0f, 442.83f, 131.74f, 480.0f, 176.0f, 480.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(44.26f, 0.0f, 66.83f, -25.94f, 77.29f, -40.0f)
                curveTo(268.06f, 420.19f, 295.0f, 358.44f, 335.72f, 330.76f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 304.0f)
                verticalLineTo(184.0f)
                curveToRelative(0.0f, -48.4f, 43.2f, -88.0f, 96.0f, -88.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(52.8f, 0.0f, 96.0f, 39.6f, 96.0f, 88.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 239.0f)
                curveToRelative(25.0f, -18.0f, 79.82f, -15.0f, 79.82f, -15.0f)
                curveToRelative(26.0f, 0.0f, 41.17f, 29.42f, 26.0f, 50.6f)
                curveToRelative(0.0f, 0.0f, -36.86f, 42.4f, -41.86f, 61.4f)
            }
        }
        .build()
        return _earOutline!!
    }

private var _earOutline: ImageVector? = null
