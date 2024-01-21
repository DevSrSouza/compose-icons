package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LayerGroup: ImageVector
    get() {
        if (_layerGroup != null) {
            return _layerGroup!!
        }
        _layerGroup = Builder(name = "LayerGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.5f, 5.2f)
                curveToRelative(14.9f, -6.9f, 32.1f, -6.9f, 47.0f, 0.0f)
                lineToRelative(218.6f, 101.0f)
                curveToRelative(8.5f, 3.9f, 13.9f, 12.4f, 13.9f, 21.8f)
                reflectiveCurveToRelative(-5.4f, 17.9f, -13.9f, 21.8f)
                lineToRelative(-218.6f, 101.0f)
                curveToRelative(-14.9f, 6.9f, -32.1f, 6.9f, -47.0f, 0.0f)
                lineTo(45.9f, 149.8f)
                curveTo(37.4f, 145.8f, 32.0f, 137.3f, 32.0f, 128.0f)
                reflectiveCurveToRelative(5.4f, -17.9f, 13.9f, -21.8f)
                lineTo(264.5f, 5.2f)
                close()
                moveTo(476.9f, 209.6f)
                lineToRelative(53.2f, 24.6f)
                curveToRelative(8.5f, 3.9f, 13.9f, 12.4f, 13.9f, 21.8f)
                reflectiveCurveToRelative(-5.4f, 17.9f, -13.9f, 21.8f)
                lineToRelative(-218.6f, 101.0f)
                curveToRelative(-14.9f, 6.9f, -32.1f, 6.9f, -47.0f, 0.0f)
                lineTo(45.9f, 277.8f)
                curveTo(37.4f, 273.8f, 32.0f, 265.3f, 32.0f, 256.0f)
                reflectiveCurveToRelative(5.4f, -17.9f, 13.9f, -21.8f)
                lineToRelative(53.2f, -24.6f)
                lineToRelative(152.0f, 70.2f)
                curveToRelative(23.4f, 10.8f, 50.4f, 10.8f, 73.8f, 0.0f)
                lineToRelative(152.0f, -70.2f)
                close()
                moveTo(324.9f, 407.8f)
                lineToRelative(152.0f, -70.2f)
                lineToRelative(53.2f, 24.6f)
                curveToRelative(8.5f, 3.9f, 13.9f, 12.4f, 13.9f, 21.8f)
                reflectiveCurveToRelative(-5.4f, 17.9f, -13.9f, 21.8f)
                lineToRelative(-218.6f, 101.0f)
                curveToRelative(-14.9f, 6.9f, -32.1f, 6.9f, -47.0f, 0.0f)
                lineTo(45.9f, 405.8f)
                curveTo(37.4f, 401.8f, 32.0f, 393.3f, 32.0f, 384.0f)
                reflectiveCurveToRelative(5.4f, -17.9f, 13.9f, -21.8f)
                lineToRelative(53.2f, -24.6f)
                lineToRelative(152.0f, 70.2f)
                curveToRelative(23.4f, 10.8f, 50.4f, 10.8f, 73.8f, 0.0f)
                close()
            }
        }
        .build()
        return _layerGroup!!
    }

private var _layerGroup: ImageVector? = null
