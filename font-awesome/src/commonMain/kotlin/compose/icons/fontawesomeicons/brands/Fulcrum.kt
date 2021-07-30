package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Fulcrum: ImageVector
    get() {
        if (_fulcrum != null) {
            return _fulcrum!!
        }
        _fulcrum = Builder(name = "Fulcrum", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.75f, 164.14f)
                lineToRelative(-35.38f, 43.55f)
                lineTo(25.0f, 164.14f)
                lineToRelative(35.38f, -43.55f)
                close()
                moveTo(144.23f, 0.0f)
                lineToRelative(-20.54f, 198.18f)
                lineTo(72.72f, 256.0f)
                lineToRelative(51.0f, 57.82f)
                lineTo(144.23f, 512.0f)
                lineTo(144.23f, 300.89f)
                lineTo(103.15f, 256.0f)
                lineToRelative(41.08f, -44.89f)
                close()
                moveTo(223.9f, 164.14f)
                lineToRelative(35.38f, 43.55f)
                lineToRelative(35.38f, -43.55f)
                lineToRelative(-35.38f, -43.55f)
                close()
                moveTo(175.42f, 211.14f)
                lineTo(216.5f, 256.0f)
                lineToRelative(-41.08f, 44.89f)
                lineTo(175.42f, 512.0f)
                lineTo(196.0f, 313.82f)
                lineTo(247.0f, 256.0f)
                lineToRelative(-51.0f, -57.82f)
                lineTo(175.42f, 0.0f)
                close()
            }
        }
        .build()
        return _fulcrum!!
    }

private var _fulcrum: ImageVector? = null
