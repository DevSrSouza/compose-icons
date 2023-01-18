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

public val IonIcons.LayersOutline: ImageVector
    get() {
        if (_layersOutline != null) {
            return _layersOutline!!
        }
        _layersOutline = Builder(name = "LayersOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(434.8f, 137.65f)
                lineTo(285.44f, 69.55f)
                curveToRelative(-16.19f, -7.4f, -42.69f, -7.4f, -58.88f, 0.0f)
                lineTo(77.3f, 137.65f)
                curveToRelative(-17.6f, 8.0f, -17.6f, 21.09f, 0.0f, 29.09f)
                lineToRelative(148.0f, 67.5f)
                curveToRelative(16.89f, 7.7f, 44.69f, 7.7f, 61.58f, 0.0f)
                lineToRelative(148.0f, -67.5f)
                curveTo(452.4f, 158.74f, 452.4f, 145.64f, 434.8f, 137.65f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 308.52f)
                lineTo(77.3f, 345.63f)
                curveToRelative(-17.6f, 8.0f, -17.6f, 21.1f, 0.0f, 29.1f)
                lineToRelative(148.0f, 67.5f)
                curveToRelative(16.89f, 7.69f, 44.69f, 7.69f, 61.58f, 0.0f)
                lineToRelative(148.0f, -67.5f)
                curveToRelative(17.6f, -8.0f, 17.6f, -21.1f, 0.0f, -29.1f)
                lineToRelative(-79.94f, -38.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 204.48f)
                lineTo(77.2f, 241.64f)
                curveToRelative(-17.6f, 8.0f, -17.6f, 21.1f, 0.0f, 29.1f)
                lineToRelative(148.0f, 67.49f)
                curveToRelative(16.89f, 7.7f, 44.69f, 7.7f, 61.58f, 0.0f)
                lineToRelative(148.0f, -67.49f)
                curveToRelative(17.7f, -8.0f, 17.7f, -21.1f, 0.1f, -29.1f)
                lineTo(352.0f, 204.48f)
            }
        }
        .build()
        return _layersOutline!!
    }

private var _layersOutline: ImageVector? = null
