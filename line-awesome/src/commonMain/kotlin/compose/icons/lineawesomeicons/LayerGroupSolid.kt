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
                moveTo(16.0f, 5.938f)
                lineTo(15.625f, 6.063f)
                lineTo(5.625f, 10.063f)
                lineTo(3.313f, 11.0f)
                lineTo(5.625f, 11.938f)
                lineTo(9.531f, 13.5f)
                lineTo(5.625f, 15.063f)
                lineTo(3.313f, 16.0f)
                lineTo(5.625f, 16.938f)
                lineTo(9.531f, 18.5f)
                lineTo(5.625f, 20.063f)
                lineTo(3.313f, 21.0f)
                lineTo(5.625f, 21.938f)
                lineTo(15.625f, 25.938f)
                lineTo(16.0f, 26.063f)
                lineTo(16.375f, 25.938f)
                lineTo(26.375f, 21.938f)
                lineTo(28.688f, 21.0f)
                lineTo(26.375f, 20.063f)
                lineTo(22.469f, 18.5f)
                lineTo(26.375f, 16.938f)
                lineTo(28.688f, 16.0f)
                lineTo(26.375f, 15.063f)
                lineTo(22.469f, 13.5f)
                lineTo(26.375f, 11.938f)
                lineTo(28.688f, 11.0f)
                lineTo(26.375f, 10.063f)
                lineTo(16.375f, 6.063f)
                close()
                moveTo(16.0f, 8.094f)
                lineTo(23.281f, 11.0f)
                lineTo(16.0f, 13.906f)
                lineTo(8.719f, 11.0f)
                close()
                moveTo(12.25f, 14.594f)
                lineTo(15.625f, 15.938f)
                lineTo(16.0f, 16.063f)
                lineTo(16.375f, 15.938f)
                lineTo(19.75f, 14.594f)
                lineTo(23.281f, 16.0f)
                lineTo(16.0f, 18.906f)
                lineTo(8.719f, 16.0f)
                close()
                moveTo(12.25f, 19.594f)
                lineTo(15.625f, 20.938f)
                lineTo(16.0f, 21.063f)
                lineTo(16.375f, 20.938f)
                lineTo(19.75f, 19.594f)
                lineTo(23.281f, 21.0f)
                lineTo(16.0f, 23.906f)
                lineTo(8.719f, 21.0f)
                close()
            }
        }
        .build()
        return _layerGroupSolid!!
    }

private var _layerGroupSolid: ImageVector? = null
