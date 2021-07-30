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

public val LineAwesomeIcons.LayerGroupSolid: ImageVector
    get() {
        if (_layerGroupSolid != null) {
            return _layerGroupSolid!!
        }
        _layerGroupSolid = Builder(name = "LayerGroupSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.9375f)
                lineTo(15.625f, 6.0625f)
                lineTo(5.625f, 10.0625f)
                lineTo(3.3125f, 11.0f)
                lineTo(5.625f, 11.9375f)
                lineTo(9.5313f, 13.5f)
                lineTo(5.625f, 15.0625f)
                lineTo(3.3125f, 16.0f)
                lineTo(5.625f, 16.9375f)
                lineTo(9.5313f, 18.5f)
                lineTo(5.625f, 20.0625f)
                lineTo(3.3125f, 21.0f)
                lineTo(5.625f, 21.9375f)
                lineTo(15.625f, 25.9375f)
                lineTo(16.0f, 26.0625f)
                lineTo(16.375f, 25.9375f)
                lineTo(26.375f, 21.9375f)
                lineTo(28.6875f, 21.0f)
                lineTo(26.375f, 20.0625f)
                lineTo(22.4688f, 18.5f)
                lineTo(26.375f, 16.9375f)
                lineTo(28.6875f, 16.0f)
                lineTo(26.375f, 15.0625f)
                lineTo(22.4688f, 13.5f)
                lineTo(26.375f, 11.9375f)
                lineTo(28.6875f, 11.0f)
                lineTo(26.375f, 10.0625f)
                lineTo(16.375f, 6.0625f)
                close()
                moveTo(16.0f, 8.0938f)
                lineTo(23.2813f, 11.0f)
                lineTo(16.0f, 13.9063f)
                lineTo(8.7188f, 11.0f)
                close()
                moveTo(12.25f, 14.5938f)
                lineTo(15.625f, 15.9375f)
                lineTo(16.0f, 16.0625f)
                lineTo(16.375f, 15.9375f)
                lineTo(19.75f, 14.5938f)
                lineTo(23.2813f, 16.0f)
                lineTo(16.0f, 18.9063f)
                lineTo(8.7188f, 16.0f)
                close()
                moveTo(12.25f, 19.5938f)
                lineTo(15.625f, 20.9375f)
                lineTo(16.0f, 21.0625f)
                lineTo(16.375f, 20.9375f)
                lineTo(19.75f, 19.5938f)
                lineTo(23.2813f, 21.0f)
                lineTo(16.0f, 23.9063f)
                lineTo(8.7188f, 21.0f)
                close()
            }
        }
        .build()
        return _layerGroupSolid!!
    }

private var _layerGroupSolid: ImageVector? = null
