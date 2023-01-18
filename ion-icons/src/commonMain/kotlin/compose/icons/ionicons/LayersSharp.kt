package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LayersSharp: ImageVector
    get() {
        if (_layersSharp != null) {
            return _layersSharp!!
        }
        _layersSharp = Builder(name = "LayersSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 150.0f)
                lineToRelative(-224.0f, -102.0f)
                lineToRelative(-224.0f, 102.0f)
                lineToRelative(224.0f, 104.0f)
                lineToRelative(224.0f, -104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.71f, 392.95f)
                lineToRelative(-144.81f, -66.2f)
                lineToRelative(-78.9f, 35.25f)
                lineToRelative(224.0f, 102.0f)
                lineToRelative(224.0f, -102.0f)
                lineToRelative(-78.69f, -35.3f)
                lineToRelative(-145.6f, 66.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                lineToRelative(-75.53f, -33.53f)
                lineTo(256.1f, 290.6f)
                lineTo(107.33f, 222.43f)
                lineTo(32.0f, 256.0f)
                lineTo(256.0f, 358.0f)
                lineTo(480.0f, 256.0f)
                reflectiveCurveTo(480.0f, 256.0f, 480.0f, 256.0f)
                close()
            }
        }
        .build()
        return _layersSharp!!
    }

private var _layersSharp: ImageVector? = null
