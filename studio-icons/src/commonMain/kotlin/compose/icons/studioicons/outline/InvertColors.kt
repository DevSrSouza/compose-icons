package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.InvertColors: ImageVector
    get() {
        if (_invertColors != null) {
            return _invertColors!!
        }
        _invertColors = Builder(name = "InvertColors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.81f)
                lineTo(12.0f, 19.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f)
                curveToRelative(0.0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f)
                lineTo(12.0f, 4.81f)
                moveTo(12.0f, 2.0f)
                lineTo(6.35f, 7.56f)
                lineToRelative(0.0f, 0.0f)
                curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f)
                curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f)
                curveToRelative(0.0f, -2.17f, -0.9f, -4.14f, -2.35f, -5.57f)
                lineToRelative(0.0f, 0.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _invertColors!!
    }

private var _invertColors: ImageVector? = null
