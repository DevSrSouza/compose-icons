package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Resolving: ImageVector
    get() {
        if (_resolving != null) {
            return _resolving!!
        }
        _resolving = Builder(name = "Resolving", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(9.857f, 3.0f, 4.7113f, 7.2884f, 3.3613f, 13.0254f)
                lineTo(3.377f, 13.0195f)
                lineTo(14.9355f, 9.6895f)
                curveTo(16.7445f, 9.1625f, 17.7564f, 9.0847f, 19.0684f, 9.2637f)
                curveTo(20.9564f, 9.5817f, 21.8128f, 10.5645f, 22.2598f, 12.1445f)
                lineTo(22.8242f, 14.1133f)
                curveTo(23.2512f, 15.5743f, 22.8757f, 16.7462f, 21.5938f, 17.9492f)
                curveTo(20.5898f, 18.8532f, 19.9726f, 19.2207f, 18.3926f, 19.6777f)
                lineTo(13.5723f, 21.0586f)
                lineTo(25.0508f, 22.4707f)
                lineTo(25.5566f, 24.248f)
                lineTo(23.0527f, 24.9453f)
                lineTo(8.1172f, 23.0059f)
                lineTo(9.2871f, 27.1113f)
                curveTo(11.2491f, 28.3023f, 13.542f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(18.0391f, 11.7305f)
                curveTo(17.5036f, 11.7246f, 16.7655f, 11.8602f, 15.7305f, 12.1602f)
                lineTo(5.8691f, 14.9902f)
                lineTo(7.3691f, 20.1602f)
                lineTo(17.7402f, 17.1602f)
                curveTo(20.1502f, 16.4702f, 20.3408f, 15.9306f, 20.0508f, 14.8906f)
                lineTo(19.4609f, 12.8301f)
                curveTo(19.2609f, 12.1426f, 18.9314f, 11.7402f, 18.0391f, 11.7305f)
                close()
                moveTo(3.0078f, 16.1328f)
                curveTo(3.0328f, 18.5808f, 3.7423f, 20.8625f, 4.9473f, 22.8105f)
                lineTo(3.0078f, 16.1328f)
                close()
            }
        }
        .build()
        return _resolving!!
    }

private var _resolving: ImageVector? = null
